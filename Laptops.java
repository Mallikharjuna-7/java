public class Laptops {

        public static void main(String args[]){

                String[] laptop_brands = {"Apple","HP","Dell","Lenovo"};
                long[] prices = {90000L,124000L,450000L,250000L};
                String[] generations = {"i3 11th Gen","i5 12th Gen","i7 13th Gen","i9 14th Gen"};

                        System.out.println("Laptop Brand Names:");
                for (int index=0; index < laptop_brands.length; index++){
                        System.out.println(laptop_brands[index]);
                }
                        System.out.println("Laptop Prices:");
                for (int index=0; index < prices.length; index++){
                        System.out.println("Price:"+prices[index]);
                }
                        System.out.println("Laptop Generations:");
                for (int index=0; index < generations.length; index++){
                        System.out.println(generations[index]);
                }
        }
}