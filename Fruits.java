public class Fruits {

        public static void main(String args[]){

                String[] fruit_names = {"Apple","Watermelon","Mango","Banana"};
                int[] prices = {100,30,150,50};
                int[] calories = {51,30,60,89};

                        System.out.println("Fruit Names:");
                for (int index=0; index < fruit_names.length; index++){
                        System.out.println("Tv Brand:"+fruit_names[index]);
                }
                        System.out.println("Fruit Prices:");
                for (int index=0; index < prices.length; index++){
                        System.out.println("Price:"+prices[index]);
                }
                        System.out.println("Calories in Fruits:");
                for (int index=0; index < calories.length; index++){
                        System.out.println("Calories:"+calories[index]);
                }
        }
}