package com.example.borgerkong;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;




public class FoodDatabase {




    public static Food getFoodById (int foodId) {return foods.get(foodId);}


    public static ArrayList<Food> getAllFood(){
       return new ArrayList<Food>((List) Arrays.asList(foods.values().toArray()));
    }

    private static final HashMap<Integer, Food> foods = new HashMap<>();


    static {
        foods.put(1, new Food(
             1,
                "Big Mac",
                6.15,
                "It starts with two 100% Aussie beef patties. Then comes the delicious combination of crisp iceberg lettuce, melting signature cheese, onions and pickles, between a toasted sesame seed bun. And don't forget the McDonald's special sauce!",
                        R.drawable.image1







        ));
        foods.put(2, new Food(
                2,
                "McChicken",
                6.15,
                "It's the simple things that matter. Like our quality chicken breast, cooked in a seasoned tempura coating. Topped with fresh, Australian-grown lettuce and our exceptional McChicken sauce, between a sesame seed bun, it's hard to beat a classic.",
                R.drawable.image2







        ));

        foods.put(3, new Food(
                3,
                "Sausage Mcmuffin",
                3.70,
                "The Sausage McMuffin®is a delectable sausage breakfast sandwich made with a warm, freshly toasted English muffin, topped with savory hot sausage and a slice of melty American cheese.",
                R.drawable.image3







        ));

        foods.put(4, new Food(
                4,
                "Filet-o-Fish",
                5.25,
                "Dive in and enjoy our Filet-o-Fish. Sourced for its succulent and fresh flavour, we cook tender portions of fish and enhance their great taste with zesty tartar sauce and cheese.",
                R.drawable.image4







        ));

        foods.put(5, new Food(
                5,
                "Hash brown",
                2.15,
                "Get 'em hot. A crunchy, golden brown crust with steaming, fluffy potato inside.",
                R.drawable.image5







        ));

        foods.put(6, new Food(
                6,
                "Classic Angus Burger",
                8.00,
                "100% Aussie Angus beef, classic cheese, tomato, onions and pickles with mustard and mayo",
                R.drawable.image6







        ));

        foods.put(7, new Food(
                7,
                "Fries",
                2.25,
                "Get them while they're hot. Our legendary, super-tasty French fries are the perfect side to any meal. We only use the highest quality potatoes to create those delicious strands of crispy fluffiness that you love, now fried in a superior and healthier blend including canola and sunflower oils.",
                R.drawable.image7







        ));

        foods.put(8, new Food(
                8,
                "Chicken McNuggets",
                9.95,
                "Everything's better when it's bite-sized. Like our nuggets made with tender juicy 100% Aussie Chicken McNuggets in a crisp tempura coating, with no artificial colours, flavours or preservatives!",
                R.drawable.image8







        ));

        foods.put(9, new Food(
                9,
                "Chicken Caesar Salad",
                10.10,
                "Chicken, lettuce, bacon, shaved parmesan and your choice of creamy Caesar dressing.",
                R.drawable.image9







        ));

        foods.put(10, new Food(
                10,
                "McFlurry® with OREOS",
                4.95,
                "Delicious pieces of crunchy OREO cookie pieces, on top our creamy soft serve.",
                R.drawable.image10







        ));

        foods.put(11, new Food(
                11,
                "Coca Cola",
                2.00,
                "There's nothing like it with the famous,\n" +
                        "thirst-quenching taste.",
                R.drawable.image11







        ));

        foods.put(12, new Food(
                12,
                "Soft Serve Cone",
                2.50,
                "Our signature soft serve, layered on a crispy cone for one very cool price.",
                R.drawable.image12







        ));

        foods.put(13, new Food(
                13,
                "Apple Slices",
                2.00,
                "Fruit made easy. Snack on these crisp apple slices, cut from delicious apples picked from Australian orchards. Sliced, washed and ready to eat.",
                R.drawable.image13







        ));

        foods.put(14, new Food(
                14,
                "Frozen Coke",
                1.00,
                "Break the heat. Thirst-quenching Coke made extra cold and extra refreshing.",
                R.drawable.image14







        ));

        foods.put(15, new Food(
                15,
                "Sweet 'n' Sour Sauce",
                0.50,
                "Enjoy the taste of apricot or peach blended with spicy flavours including Worcestershire, vinegar, teriyaki sauce and mustard.",
                R.drawable.image15







        ));





    }



}
