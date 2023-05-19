package com.example.recipe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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
    private TextView mNotRecommened;
    private TextView mTextViewReviews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        // Initialize the TextView objects from the layout
        mRecipeName = findViewById(R.id.text_recipe);
        mRecipeIngredients = findViewById(R.id.ingredients);
        mRecipeMethodTitle = findViewById(R.id.method);
        mRecipe = findViewById(R.id.recipe);
        mNotRecommened = findViewById(R.id.aboutB);
        mTextViewReviews = findViewById(R.id.textView_reviews); // Added TextView for displaying reviews

        // Extract the data sent through the intent and set the text in the corresponding TextViews
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("RecipeName");
        String Ingredients = intent.getExtras().getString("RecipeIngredients");
        String MethodTitle = intent.getExtras().getString("RecipeMethodTitle");
        String Recipe = intent.getExtras().getString("Recipe");
        String NotRecommened = intent.getExtras().getString("NotRecommended");

        mRecipeName.setText(Title);
        mRecipeIngredients.setText(Ingredients);
        mRecipeMethodTitle.setText(MethodTitle);
        mRecipe.setText(Recipe);
        mNotRecommened.setText(NotRecommened);

        Button saveReviewButton = findViewById(R.id.button_save_review);
        saveReviewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editTextReview = findViewById(R.id.editText_review);
                String reviewText = editTextReview.getText().toString();
                saveReviewToFile(reviewText);
                editTextReview.setText("");
                Toast.makeText(getApplicationContext(), "Review-ul a fost salvat", Toast.LENGTH_SHORT).show();
                displayReviews();
            }
        });

        displayReviews(); // Display saved reviews
    }

    private void saveReviewToFile(String reviewText) {
        try {
            FileOutputStream fileOutputStream = openFileOutput("reviews.txt", MODE_APPEND);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

            bufferedWriter.write(reviewText);
            bufferedWriter.newLine();

            bufferedWriter.close();
            outputStreamWriter.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(getApplicationContext(), "Eroare la salvarea review-ului", Toast.LENGTH_SHORT).show();
        }
    }

    private void displayReviews() {
        StringBuilder reviews = new StringBuilder();
        try {
            File file = new File(getFilesDir(), "reviews.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                reviews.append(line).append("\n");
            }

            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(getApplicationContext(), "Eroare la citirea review-urilor", Toast.LENGTH_SHORT).show();
        }
        mTextViewReviews.setText(reviews.toString());
    }
}
