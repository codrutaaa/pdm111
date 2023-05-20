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
                "1. Set oven to 350F.\n" +
                        "2. Heat a grill pan over medium high heat.\n 3. Brush chicken breasts lightly with olive oil and rub both sides with a light coating of the mint & lemon Rub, minced garlic, and oregano.\n4. Add a pinch of salt and pepper.\n" +
                        "5. Grill the chicken for about 2-3 minutes per side, or until you get nice grill marks.\n 6. Transfer the chicken to a baking sheet and bake for an additional 10-12 minutes, or until the chicken is cooked through and registers 165F in the center.\n7. Set aside.\n" +
                        "8. Put the lettuce in a large salad bowl.\n" +
                        "9. Put the onions, cucumbers, tomatoes, olives, and cheese in a separate bowl.\n 10. Toss with enough of the dressing to moisten.\n 11. Add this mixture to the salad bowl with the lettuce.\n 12. Add the grilled chicken and drizzle with more dressing just before serving.\n" +
                        "13. Whisk everything together and taste to adjust any of the ingredients.\n",R.drawable.greek_salad, "Not recommened for vegetarians")); //asociez reteta cu imaginea corespunzatoare

        recipes1.add(new Recipes(
                "Caesar Salad",
                "2 heads of romaine lettuce\n" +
                        "1 cup croutons\n" +
                        "1/2 cup grated Parmesan cheese\n" +
                        "For the dressing:\n" +
                        "1/2 cup mayonnaise\n" +
                        "2 tablespoons lemon juice\n" +
                        "1 tablespoon Dijon mustard\n" +
                        "2 cloves garlic, minced\n" +
                        "1/4 cup grated Parmesan cheese\n" +
                        "1/4 cup olive oil\n" +
                        "Salt and pepper to taste\n",
                "Method",
                "1. Wash and dry the romaine lettuce heads. Tear the leaves into bite-sized pieces and place them in a large salad bowl.\n" +
                        "2. In a small bowl, whisk together the mayonnaise, lemon juice, Dijon mustard, minced garlic, grated Parmesan cheese, olive oil, salt, and pepper to make the dressing.\n" +
                        "3. Pour the dressing over the lettuce and toss to coat the leaves evenly.\n" +
                        "4. Add the croutons and grated Parmesan cheese to the salad and toss again.\n" +
                        "5. Serve the Caesar salad immediately as a side dish or add grilled chicken or shrimp to make it a main course.\n",
                R.drawable.caesar, "Not recommended for individuals with egg or dairy allergies")); //asociez reteta cu imaginea corespunzatoare

        recipes1.add(new Recipes(
                "Roasted Vegetable Quinoa Salad",
                "1 cup quinoa\n" +
                        "2 cups water or vegetable broth\n" +
                        "2 cups mixed vegetables (such as bell peppers, zucchini, eggplant, cherry tomatoes)\n" +
                        "2 tablespoons olive oil\n" +
                        "1 teaspoon dried herbs (such as thyme, rosemary, or oregano)\n" +
                        "Salt and pepper to taste\n" +
                        "Juice of 1 lemon\n" +
                        "2 tablespoons balsamic vinegar\n" +
                        "1/4 cup chopped fresh parsley\n" +
                        "1/4 cup crumbled feta cheese (optional)\n",
                "Method",
                "1. Preheat the oven to 425°F (220°C).\n" +
                        "2. Rinse the quinoa under cold water and drain well.\n" +
                        "3. In a medium saucepan, bring the water or vegetable broth to a boil.\n" +
                        "4. Add the quinoa and reduce the heat to low.\n" +
                        "5. Cover and simmer for about 15-20 minutes, or until the quinoa is tender and the liquid is absorbed.\n" +
                        "6. Meanwhile, prepare the vegetables by chopping them into bite-sized pieces.\n" +
                        "7. Place the vegetables on a baking sheet and drizzle with olive oil.\n" +
                        "8. Sprinkle with dried herbs, salt, and pepper.\n" +
                        "9. Toss to coat evenly.\n" +
                        "10. Roast the vegetables in the preheated oven for about 20-25 minutes, or until they are tender and slightly caramelized.\n" +
                        "11. In a large bowl, combine the cooked quinoa and roasted vegetables.\n" +
                        "12. Add the lemon juice, balsamic vinegar, and chopped parsley.\n" +
                        "13. Toss everything together until well combined.\n" +
                        "14. Season with additional salt and pepper if needed.\n" +
                        "15. Sprinkle with crumbled feta cheese if desired.\n" +
                        "16. Serve the salad warm or chilled.\n",
                R.drawable.roasted_vegetable_quinoa_salad, "Suitable for vegetarians")); //asociez reteta cu imaginea corespunzatoare
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


        recipes1.add(new Recipes("Dosa",
                "3 cups rice \n" +
                        "1 cup urad daal (split, skinless black gram)\n" +
                        "3/4 teaspoon fenugreek seeds\n" +
                        "Salt (to taste)\n" +
                        "Vegetable / canola / sunflower cooking oil\n",
                "Method",
                "1. Wash the rice and urad daal well.\n2. Add the fenugreek seeds to the mix and fill enough water in the rice-daal bowl to cover them about 2-inch deep.\n3. Soak overnight.\n" +
                        "4. Put some cooking oil in a small bowl and keep ready.\n5. You will also need a bowl of ice cold water, a large, flat nonstick pan, 2 sheets of paper towel, a ladle, a spatula, and a basting brush.\n" +
                        "6. When the upper surface begins to look cooked (it will no longer look soft or runny), flip the dosa.\n7. By this time, ideally, the surface that was underneath should be light golden in color.\n8. Cook for 1 minute after flipping.\n" +
                        "9. The dosa is almost done.\n10. Fold it in half and allow to cook for 30 seconds more.",R.drawable.dosa1, "Not recommened for vegetarians"));//asociez reteta cu imaginea corespunzatoare

        recipes1.add(new Recipes("Pasta",
                "1 tsp oil\n" +
                        "1 tsp butter\n" +
                        "2 clove garlic, finely chopped\n" +
                        "1 inch ginger, finely chopped\n" +
                        "½ onion, finely chopped\n" +
                        "1 cup tomato pulp\n" +
                        "¼ tsp turmeric / haldi\n" +
                        "½ tsp kashmiri red chilli powder\n" +
                        "2 tbsp tomato sauce\n" +
                        "½ tsp garam masala\n",
                "Method",
                "1. firstly, saute 1 inch ginger and 2 clove garlic in 1 tsp oil and 1 tsp butter.\n" +
                        "2. further saute ½ onion till they turn soft.\n" +
                        "3. additionally add 1 cup tomato pulp and saute well.\n" +
                        "4. keep stirring till the tomato pulp thickens.\n" +
                        "5. now add ¼ tsp turmeric, ½ tsp chilli powder, ½ tsp garam masala and ½ tsp salt.\n" +
                        "6. saute till the spices gets cooked completely.\n" +
                        "7. now add 2 tbsp corn, ¼ capsicum, ¼ carrot, 2 tbsp peas and 7 florets broccoli. saute for a minute.\n" +
                        "8. add in 3 tbsp water and mix well.\n" +
                        "9. cover and simmer for 5 minutes.\n" +
                        "10. now add in 2 tbsp tomato sauce and ½ tsp mixed herbs. mix well.\n" +
                        "11. add in cooked pasta and mix gently till the sauce gets coated well.\n" +
                        "12. finally, serve masala pasta indian style hot topped with cheese if required.\n",R.drawable.pasta1, "Not recommened for vegetarians or people with gluten intolerance"));//asociez reteta cu imaginea corespunzatoare
        recipes1.add(new Recipes(
                "Spaghetti Carbonara",
                "8 ounces spaghetti\n" +
                        "4 slices bacon, diced\n" +
                        "2 cloves garlic, minced\n" +
                        "2 large eggs\n" +
                        "1/2 cup grated Parmesan cheese\n" +
                        "Salt and pepper to taste\n" +
                        "Chopped fresh parsley for garnish\n",
                "Method",
                "1. Cook the spaghetti according to the package instructions until al dente. Drain and set aside.\n" +
                        "2. In a large skillet, cook the bacon over medium heat until crispy. Remove the bacon from the skillet and set aside, leaving the bacon drippings in the skillet.\n" +
                        "3. In the same skillet, add the minced garlic and sauté for about 1 minute, or until fragrant.\n" +
                        "4. In a small bowl, whisk together the eggs and grated Parmesan cheese until well combined.\n" +
                        "5. Reduce the heat to low and add the cooked spaghetti to the skillet with the garlic. Toss to coat the spaghetti with the bacon drippings.\n" +
                        "6. Remove the skillet from the heat and quickly pour in the egg and Parmesan mixture. Toss the spaghetti continuously to coat it with the sauce and cook the eggs without scrambling.\n" +
                        "7. The heat from the spaghetti will cook the eggs and create a creamy sauce. If the sauce is too thick, you can add a little pasta cooking water to thin it out.\n" +
                        "8. Season with salt and pepper to taste.\n" +
                        "9. Serve the spaghetti carbonara immediately, garnished with chopped fresh parsley.\n",
                R.drawable.spaghetti_carbonara, "Not recommended for vegetarians")); //asociez reteta cu imaginea corespunzatoare
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
                "Method",
                "1. Grease a large bowl with cooking spray and set aside.\n2. In a small, microwave-safe bowl or glass measuring cup, add milk.\n4. Microwave until lukewarm, 40 seconds.\n5. Add a teaspoon of sugar and stir to dissolve, then sprinkle over yeast and let sit until frothy, about 8 minutes.\n" +
                        "6. Make glaze: In a large bowl, whisk together milk, powdered sugar, and vanilla until smooth.\n7. Set aside.\n" +
                        "8. Line a large baking sheet with paper towels.\n9. In a large dutch oven over medium heat, heat 2'' oil to 350°.\n10. Cook doughnuts, in batches, until deeply golden on both sides, about 1 minute per side.\n11. Holes will cook even faster!\n" +
                        "12. Transfer doughnuts to paper towel-lined baking sheet to drain and cool slightly.\n13. Dip into glaze, then place onto a cooling rack (or eat immediately!)",R.drawable.donut1, "Not recommened for diabetics, people with lactose intolerance, lactose allergy or egg allergy"));//asociez reteta cu imaginea corespunzatoare

        recipes1.add(new Recipes("Pancake",
                "1 1/4 cups milk\n" +
                        "1 egg\n" +
                        "3 tablespoons butter melted\n" +
                        "1 1/2 cups all-purpose flour\n" +
                        "3 1/2 teaspoons baking powder\n" +
                        "1 teaspoon salt\n" +
                        "1 tablespoon white sugar\n",
                "Method",
                "1. In a large bowl, sift together the flour, baking powder, salt and sugar.\n2. Make a well in the center and pour in the milk, egg and melted butter; mix until smooth.\n" +
                        "3. Heat a lightly oiled griddle or frying pan over medium high heat.\n4. Pour or scoop the batter onto the griddle, using approximately 1/4 cup for each pancake.\n5. Brown on both sides and serve hot.",R.drawable.pancakes, "Not recommened for diabetics, people with lactose intolerance, lactose allergy or egg allergy"));//asociez reteta cu imaginea corespunzatoare


        recipes1.add(new Recipes("Cheesecake",
                "Light digestive biscuits, crushed 175g\n" +
                        "Baking spread or butter, melted 75g\n" +
                        "Carnation Light Condensed Milk 400g\n" +
                        "Tub light cream cheese 300g\n" +
                        "Lemons, juiced 2 pieces\n" +
                        "Mixed summer berries, to decorate 200g\n" +
                        "20cm (8 inch) loose-bottomed cake tin\n","Method",
                "1. Tip the crumbs into a bowl, add the melted baking spread and mix in.\n2. Spoon the crumbs into the tin and press down.\n3. Chill for 10 minutes.\n" +
                        "4. Pour the condensed milk into a large bowl.\n5. Add the light cheese and whisk together.\n6. Mix in the lemon juice (watch it thicken!).\n7. Pour into the tin. Chill for 2-4 hours or until set.\n" +
                        "8. To serve, take the cheesecake out of the tin and place onto a plate.", R.drawable.cheesecake, "Not recommened for diabetics, people with lactose intolerance, lactose allergy or egg allergy"));//asociez reteta cu imaginea corespunzatoare
        recipes1.add(new Recipes(
                "Chocolate Chip Cookies",
                "1 cup (2 sticks) unsalted butter, softened\n" +
                        "1 cup granulated sugar\n" +
                        "1 cup packed brown sugar\n" +
                        "2 large eggs\n" +
                        "1 teaspoon vanilla extract\n" +
                        "3 cups all-purpose flour\n" +
                        "1 teaspoon baking soda\n" +
                        "1/2 teaspoon salt\n" +
                        "2 cups chocolate chips\n",
                "Method",
                "1. Preheat the oven to 375°F (190°C) and line a baking sheet with parchment paper.\n" +
                        "2. In a large mixing bowl, cream together the softened butter, granulated sugar, and brown sugar until light and fluffy.\n" +
                        "3. Add the eggs one at a time, beating well after each addition. Stir in the vanilla extract.\n" +
                        "4. In a separate bowl, whisk together the all-purpose flour, baking soda, and salt. Gradually add the dry ingredients to the wet ingredients, mixing until just combined.\n" +
                        "5. Fold in the chocolate chips until evenly distributed throughout the dough.\n" +
                        "6. Drop rounded tablespoonfuls of dough onto the prepared baking sheet, spacing them about 2 inches apart.\n" +
                        "7. Bake in the preheated oven for 9-11 minutes, or until the edges are golden brown.\n" +
                        "8. Remove from the oven and let the cookies cool on the baking sheet for a few minutes, then transfer them to a wire rack to cool completely.\n" +
                        "9. Enjoy the delicious homemade chocolate chip cookies!\n",
                R.drawable.chocolate_chip_cookies, "")); //asociez reteta cu imaginea corespunzatoare

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
