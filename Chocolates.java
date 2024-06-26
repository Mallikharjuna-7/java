public class Chocolates {

        public static void main(String args[]){

                String[] chocolates_name = {"Five Star","Dairy Milk","Much","Kit Kat"};
                int[] cost = {10,50,10,20};
                float[] calories = {449.00f,534.00f,414.00f,501.00f};

                        System.out.println("Chocolate Names:");
                for (int index = 0; index < chocolates_name.length; index++){
                        System.out.println(chocolates_name[index]);
                }
                        System.out.println("Chocolate Cost:");
                for (int index = 0; index < cost.length; index++){
                        System.out.println("Cost:"+cost[index]);
                }
                        System.out.println("Calories:");
                for (int index = 0; index < calories.length; index++){
                        System.out.println(calories[index]);
                }
        }
}