package com.example.recipe;

public class Recipes {

    private String RecipeName;
    private String RecipeIngredients;
    private String RecipeMethodTitle;
    private String Recipe;
    private int Thumbnail;


    // Constructorul clasei Recipes.
    // Primește numele, ingredinetele, titlul metodei de preparare, textul complet al metodei și
    // ID-ul resursei de imagine pentru miniatura rețetei.
    public Recipes(String name, String recipeIngredients, String recipeMethodTitle,String recipe, int thumbnail){

        RecipeName = name;
        RecipeIngredients = recipeIngredients;
        RecipeMethodTitle = recipeMethodTitle;
        Recipe = recipe;
        Thumbnail = thumbnail;

    }

    // Metoda publică care returnează numele rețetei.
    public  String getRecipeName(){

        return RecipeName;
    }

    // Metoda publică care returnează ingredientele rețetei.
    public String getRecipeIngredients(){
        return RecipeIngredients;
    }

    // Metoda publică care returnează titlul metodei de preparare a rețetei.
    public String getRecipeMethodTitle(){
        return RecipeMethodTitle;
    }

    // Metoda publică care returnează textul complet al metodei de preparare a rețetei.
    public String getRecipe(){
        return Recipe;
    }

    // Metoda publică care returnează ID-ul resursei de imagine pentru miniatura rețetei.
    public int getThumbnail(){
        return Thumbnail;
    }
}
