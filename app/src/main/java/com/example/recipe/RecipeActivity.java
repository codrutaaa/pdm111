package com.example.recipe;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class RecipeActivity extends AppCompatActivity {

    private TextView mRecipeName;
    private TextView mRecipeIngredients;
    private TextView mRecipeMethodTitle;
    private TextView mRecipe;
    private TextView mNotRecommended;
    private EditText mUsernameEditText;
    private EditText mReviewEditText;
    private LinearLayout mReviewsLayout;
    private String mCurrentRecipeName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        // Inițializarea obiectelor de tip TextView din layout
        mRecipeName = findViewById(R.id.text_recipe);
        mRecipeIngredients = findViewById(R.id.ingredients);
        mRecipeMethodTitle = findViewById(R.id.method);
        mRecipe = findViewById(R.id.recipe);
        mNotRecommended = findViewById(R.id.aboutB);
        mUsernameEditText = findViewById(R.id.editText_username);
        mReviewEditText = findViewById(R.id.editText_review);
        mReviewsLayout = findViewById(R.id.reviews_layout);

        // Extrage datele trimise prin intent și setează textul în TextView-urile corespunzătoare
        Intent intent = getIntent();
        String title = intent.getStringExtra("RecipeName");
        String ingredients = intent.getStringExtra("RecipeIngredients");
        String methodTitle = intent.getStringExtra("RecipeMethodTitle");
        String recipe = intent.getStringExtra("Recipe");
        String notRecommended = intent.getStringExtra("NotRecommended");

        mRecipeName.setText(title);
        mRecipeIngredients.setText(ingredients);
        mRecipeMethodTitle.setText(methodTitle);
        mRecipe.setText(recipe);
        mNotRecommended.setText(notRecommended);

        mCurrentRecipeName = title;

        Button saveReviewButton = findViewById(R.id.button_save_review);
        saveReviewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = mUsernameEditText.getText().toString();
                if (username.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Introduceți un nume de utilizator", Toast.LENGTH_SHORT).show();
                } else {
                    String reviewText = mReviewEditText.getText().toString();
                    saveReviewToFile(mCurrentRecipeName, username, reviewText);
                    mReviewEditText.setText("");
                    Toast.makeText(getApplicationContext(), "Review-ul a fost salvat", Toast.LENGTH_SHORT).show();
                    displayReviews();
                }
            }
        });

        // Inițializare TextView pentru afișarea recenziilor
        displayReviews();
    }

    private void saveReviewToFile(String recipeName, String username, String reviewText) {
        try {
            // Deschide fișierul pentru scriere
            FileOutputStream fileOutputStream = openFileOutput(recipeName + "_" + username + "_review.txt", Context.MODE_APPEND);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

            // Scrie review-ul în fișier
            bufferedWriter.write(reviewText);
            bufferedWriter.newLine(); // Adaugă o linie nouă după fiecare review

            // Închide fișierul
            bufferedWriter.close();
            outputStreamWriter.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(getApplicationContext(), "Eroare la salvarea review-ului", Toast.LENGTH_SHORT).show();
        }
    }

    private void displayReviews() {
        mReviewsLayout.removeAllViews();

        // Obține lista de fișiere din directorul de fișiere interne
        File[] reviewFiles = getFilesDir().listFiles();

        if (reviewFiles != null) {
            for (File file : reviewFiles) {
                if (file.isFile()) {
                    String fileName = file.getName();
                    if (fileName.endsWith(".txt")) {
                        String[] parts = fileName.split("_");
                        if (parts.length >= 3) {
                            String recipeName = parts[0];
                            String username = parts[1];
                            String review = readReviewFromFile(file);
                            if (recipeName.equals(mCurrentRecipeName)) {
                                addReviewTextView(username, review, 20);
                            }
                        }
                    }
                }
            }
        }
    }

    private String readReviewFromFile(File file) {
        StringBuilder review = new StringBuilder();
        try {
            // Deschide fișierul pentru citire
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                review.append(line).append("\n");
            }

            // Închide fișierul
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(getApplicationContext(), "Eroare la citirea review-urilor", Toast.LENGTH_SHORT).show();
        }
        return review.toString();
    }

    private void addReviewTextView(String username, String review, float textSize) {
        TextView textView = new TextView(this);
        textView.setText(username + ":\n" + review);
        textView.setTextSize(textSize);
        mReviewsLayout.addView(textView);
    }

}
