package com.example.recipe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // Creez un obiect RecyclerView cu numele "myrecyclerView"
    RecyclerView myrecyclerView;

    // Creeaza un obiect RecyclerViewAdapter cu numele "myAdapter" care foloseste activitatea curenta si lista de retete "recipes1"
    RecyclerViewAdapter myAdapter;

    // Creeaza o noua lista de obiecte Recipes cu numele "recipes1"
    List<Recipes> recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipes1 = new ArrayList<>();

        //Adaugam prima reteta la lista
        recipes1.add(new Recipes(
                "Greek Salad",
                "2 thin skinless boneless chicken breasts\n" +
                "mint & lemon rub\n" +
                "dried oregano\n" +
                "dried minced garlic\n" +
                "salt and fresh cracked black pepper\n" +
                "a small head of romaine lettuce, washed, dried, and chopped\n" +
                "¼ red onion, thinly sliced\n" +
                "2 small Persian cucumbers, sliced\n" +
                "2 cups chopped tomatoes\n" +
                "1 cup kalamata olives\n"+
                "1 cup crumbled or cubed feta cheese\n" +
                "juice of 1 1/2 to 2 lemons, add more or less to taste\n" +
                "1/2 tsp Greek herb blend\n" +
                "pinch of salt and pepper to taste\n",
                "Method",
                "Set oven to 350F.\n" +
                        "Heat a grill pan over medium high heat. Brush chicken breasts lightly with olive oil and rub both sides with a light coating of the mint & lemon Rub, minced garlic, and oregano. Add a pinch of salt and pepper.\n" +
                        "Grill the chicken for about 2-3 minutes per side, or until you get nice grill marks. Transfer the chicken to a baking sheet and bake for an additional 10-12 minutes, or until the chicken is cooked through and registers 165F in the center. Set aside.\n" +
                        "Put the lettuce in a large salad bowl.\n" +
                        "Put the onions, cucumbers, tomatoes, olives, and cheese in a separate bowl. Toss with enough of the dressing to moisten. Add this mixture to the salad bowl with the lettuce. Add the grilled chicken and drizzle with more dressing just before serving.\n" +
                        "Whisk everything together and taste to adjust any of the ingredients.\n",R.drawable.greek_salad, "Not recommened for vegetarians")); //asociez reteta cu imaginea corespunzatoare

        recipes1.add(new Recipes("Chicken Roll",
                "6 boneless skinless chicken breast halves (8 ounces each)\n" +
                        "6 slices fully cooked ham\n" +
                        "6 slices Swiss cheese\n" +
                        "1/4 cup all-purpose flour\n" +
                        "1/4 cup grated Parmesan cheese\n" +
                        "1/2 teaspoon rubbed sage\n" +
                        "1/4 teaspoon paprika\n" +
                        "1/4 teaspoon pepper\n" +
                        "1/4 cup canola oil\n" +
                        "1 can (10-3/4 ounces) condensed cream of chicken soup, undiluted\n" +
                        "1/2 cup chicken broth\n" +
                        "Chopped fresh parsley, optional\n",
                "Method",
                "1. Preheat the oven to 350°F.\n" +
                        "2. Pound chicken to 1/4-in. thickness. Top each with a ham slice and cheese slice; roll up tightly and tuck in ends.\n" +
                        "3. In a shallow bowl, mix flour, Parmesan cheese, sage, paprika and pepper. Coat chicken in flour mixture.\n" +
                        "4. In a large skillet, heat oil over medium heat. Brown chicken on all sides; transfer to a greased 11x7-in. baking dish.\n" +
                        "5. In a small bowl, whisk soup and broth until smooth; pour over chicken. Bake, uncovered, 30-35 minutes or until chicken is no longer pink and a thermometer inserted in chicken reads 165°F. If desired, sprinkle with parsley.\n",
                R.drawable.chicken_roll, "Not recommened for vegetarians"));//asociez reteta cu imaginea corespunzatoare

        recipes1.add(new Recipes("Donuts",
                "1 c. whole milk\n" +
                "1/4 c. plus 1 tsp. granulated sugar, divided\n" +
                "1 packet (or 2 1/4 tsp.) active dry yeast\n" +
                "4 c. all-purpose flour, plus more if needed\n" +
                "1/2 tsp. kosher salt\n" +
                "6 tbsp. melted butter\n" +
                "2 large eggs\n" +
                "1/2 tsp. pure vanilla extract\n" +
                "Canola or vegetable oil, for frying\n",
                "Method","\n" +
                "Grease a large bowl with cooking spray and set aside. In a small, microwave-safe bowl or glass measuring cup, add milk. Microwave until lukewarm, 40 seconds. Add a teaspoon of sugar and stir to dissolve, then sprinkle over yeast and let sit until frothy, about 8 minutes.\n" +
                "Make glaze: In a large bowl, whisk together milk, powdered sugar, and vanilla until smooth. Set aside.\n" +
                "Line a large baking sheet with paper towels. In a large dutch oven over medium heat, heat 2'' oil to 350°. Cook doughnuts, in batches, until deeply golden on both sides, about 1 minute per side. Holes will cook even faster!\n" +
                "Transfer doughnuts to paper towel-lined baking sheet to drain and cool slightly. Dip into glaze, then place onto a cooling rack (or eat immediately!)",R.drawable.donut1, "Not recommened for vegetarians"));//asociez reteta cu imaginea corespunzatoare

        recipes1.add(new Recipes("Dosa",
                "3 cups rice \n" +
                "1 cup urad daal (split, skinless black gram)\n" +
                "3/4 teaspoon fenugreek seeds\n" +
                "Salt (to taste)\n" +
                "Vegetable / canola / sunflower cooking oil\n",
                "Method",
                "Wash the rice and urad daal well. Add the fenugreek seeds to the mix and fill enough water in the rice-daal bowl to cover them about 2-inch deep. Soak overnight.\n" +
                        "Put some cooking oil in a small bowl and keep ready. You will also need a bowl of ice cold water, a large, flat nonstick pan, 2 sheets of paper towel, a ladle, a spatula, and a basting brush.\n" +
                        "When the upper surface begins to look cooked (it will no longer look soft or runny), flip the dosa. By this time, ideally, the surface that was underneath should be light golden in color. Cook for 1 minute after flipping.\n" +
                        "The dosa is almost done. Fold it in half and allow to cook for 30 seconds more.",R.drawable.dosa1, "Not recommened for vegetarians"));//asociez reteta cu imaginea corespunzatoare

        recipes1.add(new Recipes("Pancake",
                "1 1/4 cups milk" +
                "1 egg" +
                "3 tablespoons butter melted" +
                "1 1/2 cups all-purpose flour" +
                "3 1/2 teaspoons baking powder" +
                "1 teaspoon salt" +
                "1 tablespoon white sugar",
                "Method",
                "In a large bowl, sift together the flour, baking powder, salt and sugar. Make a well in the center and pour in the milk, egg and melted butter; mix until smooth." +
                        "Heat a lightly oiled griddle or frying pan over medium high heat. Pour or scoop the batter onto the griddle, using approximately 1/4 cup for each pancake. Brown on both sides and serve hot.",R.drawable.pancakes, "Not recommened for vegetarians"));//asociez reteta cu imaginea corespunzatoare

        recipes1.add(new Recipes("Pasta",
                "1 tsp oil" +
                "1 tsp butter" +
                "2 clove garlic, finely chopped" +
                "1 inch ginger, finely chopped" +
                "½ onion, finely chopped" +
                "1 cup tomato pulp" +
                "¼ tsp turmeric / haldi" +
                "½ tsp kashmiri red chilli powder" +
                "2 tbsp tomato sauce" +
                "½ tsp garam masala",
                "Method",
                "firstly, saute 1 inch ginger and 2 clove garlic in 1 tsp oil and 1 tsp butter." +
                        "further saute ½ onion till they turn soft." +
                        "additionally add 1 cup tomato pulp and saute well." +
                        "keep stirring till the tomato pulp thickens." +
                        "now add ¼ tsp turmeric, ½ tsp chilli powder, ½ tsp garam masala and ½ tsp salt." +
                        "saute till the spices gets cooked completely." +
                        "now add 2 tbsp corn, ¼ capsicum, ¼ carrot, 2 tbsp peas and 7 florets broccoli. saute for a minute." +
                        "add in 3 tbsp water and mix well." +
                        "cover and simmer for 5 minutes." +
                        "now add in 2 tbsp tomato sauce and ½ tsp mixed herbs. mix well." +
                        "add in cooked pasta and mix gently till the sauce gets coated well." +
                        "finally, serve masala pasta indian style hot topped with cheese if required.",R.drawable.pasta1, "Not recommened for vegetarians"));//asociez reteta cu imaginea corespunzatoare

        recipes1.add(new Recipes("Cheesecake",
                "Light digestive biscuits, crushed 175g" +
                "Baking spread or butter, melted 75g" +
                "Carnation Light Condensed Milk 400g" +
                "Tub light cream cheese 300g" +
                "Lemons, juiced 2 pieces" +
                "Mixed summer berries, to decorate 200g" +
                "20cm (8 inch) loose-bottomed cake tin","Method",
                "Tip the crumbs into a bowl, add the melted baking spread and mix in. Spoon the crumbs into the tin and press down. Chill for 10 minutes." +
                        "Pour the condensed milk into a large bowl. Add the light cheese and whisk together. Mix in the lemon juice (watch it thicken!). Pour into the tin. Chill for 2-4 hours or until set." +
                        "To serve, take the cheesecake out of the tin and place onto a plate. Decorate the cheesecake with the berries in the style of a Union Jack before serving.", R.drawable.cheesecake, "Not recommened for vegetarians"));//asociez reteta cu imaginea corespunzatoare


        // Se initializeaza un obiect de tip RecyclerView si se asociaza cu elementul din layout-ul xml cu id-ul "recyclerView_id"
        myrecyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);

        // Se creaza un obiect de tip RecyclerViewAdapter si i se transmit contextul activitatii curente si o lista de obiecte de tip Recipe
        myAdapter = new RecyclerViewAdapter(this,recipes1);

        // Se seteaza modul de afisare al elementelor din RecyclerView (pt a afisa grid-ul), prin intermediul unui obiect de tip GridLayoutManager cu 1 coloana
        myrecyclerView.setLayoutManager(new GridLayoutManager(this,1));

        // Se seteaza adapterul pentru RecyclerView cu obiectul de tip RecyclerViewAdapter creat anterior
        myrecyclerView.setAdapter(myAdapter);



    }

}
