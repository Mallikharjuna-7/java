public class Vegitables {

        public static void main(String args[]){

                String[] vegitables_names = {"Brinjal","Onion","Tomato","Potato"};
                int[] prices = {50,30,60,40};
                String[] vegitables_have = {"Vitamins","Proteins","Minerals","Chemicals"};

                        System.out.println("Vegitables Names:");
                for (int index=0; index < vegitables_names.length; index++){
                        System.out.println(" "+vegitables_names[index]);
                }
                        System.out.println("vegitables Prices:");
                for (int index=0; index < prices.length; index++){
                        System.out.println("Price:"+prices[index]);
                }
                        System.out.println("Vegitables have:");
                for (int index=0; index < vegitables_have.length; index++){
                        System.out.println(" "+vegitables_have[index]);
                }
        }
}