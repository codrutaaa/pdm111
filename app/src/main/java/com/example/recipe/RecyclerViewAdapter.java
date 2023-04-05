package com.example.recipe;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyHolder> {

    // variabila pentru contextul aplicatiei
    private Context mContext;

    // lista de obiecte Recipes pentru afisare in RecyclerView
    private List<Recipes> mData;

    public RecyclerViewAdapter(Context mContext, List<Recipes> mData){
        this.mContext = mContext;
        this.mData = mData;
    }


    // Metoda pentru a crea ViewHolder-ul, care se va ocupa de afisarea unei celule din RecyclerView
    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view ;
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);// obtinem LayoutInflater-ul pentru a putea inflata layout-ul din cardview_recipe
        view = layoutInflater.inflate(R.layout.cardview_recipe,viewGroup,false);// inflam layout-ul cu cardview_recipe.xml
        return  new MyHolder(view);
    }

    // Metoda pentru a afișa datele din lista în holder-ul dat ca parametru
    @Override
    public void onBindViewHolder(@NonNull final MyHolder myHolder, @SuppressLint("RecyclerView") final int i) {
        // setam titlul retetei si imaginea de thumbnail corespunzatoare
        myHolder.recipeTitle.setText(mData.get(i).getRecipeName());
        myHolder.img_recipe_thumbnail.setImageResource(mData.get(i).getThumbnail());
        // adaugam un listener pentru a redirectiona utilizatorul catre activitatea RecipeActivity
        myHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,RecipeActivity.class);
                // adaugam datele necesare pentru afisarea retetei in activitatea RecipeActivity
                intent.putExtra("RecipeName",mData.get(i).getRecipeName());
                intent.putExtra("RecipeIngredients",mData.get(i).getRecipeIngredients());
                intent.putExtra("RecipeMethodTitle",mData.get(i).getRecipeMethodTitle());
                intent.putExtra("Recipe",mData.get(i).getRecipe());
                intent.putExtra("Thumbnail",mData.get(i).getThumbnail());
                // pornim activitatea RecipeActivity
                mContext.startActivity(intent);
            }
        });
    }

    // Metoda pentru a returna numarul de elemente din lista de obiecte Recipes
    @Override
    public int getItemCount() {
        return mData.size();
    }

    // Clasa ViewHolder pentru a tine referinta la componentele din celula RecyclerView
    public class MyHolder extends RecyclerView.ViewHolder {

        TextView recipeTitle;// textul cu titlul retetei
        CardView cardView;// cardview-ul pentru afisarea unei celule din RecyclerView
        ImageView img_recipe_thumbnail;// imaginea de thumbnail pentru reteta

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            recipeTitle = (TextView)itemView.findViewById(R.id.recipe_text);// gasim referinta pentru textul cu titlul retetei
            img_recipe_thumbnail = (ImageView)itemView.findViewById(R.id.recipe_img_id);// gasim referinta pentru imaginea de thumbnail a retetei
            cardView = (CardView)itemView.findViewById(R.id.cardview_id);// gasim referinta pentru cardview-ul folosit pentru afisarea unei celule din RecyclerView


        }
    }
}
