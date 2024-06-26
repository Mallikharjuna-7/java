public class Tiffin {

        public static void main(String args[]){

                String[] tiffins = {"Idly","Vada","Upma","Dosa"};
                int[] cost = {30,30,20,40};
                byte[] qantity = {4,3,1,2};

                        System.out.println("Tiffin Names:");
                for (int index = 0; index < tiffins.length; index++){
                        System.out.println(tiffins[index]);
                }
                        System.out.println("Tiffins Cost:");
                for (int index = 0; index < cost.length; index++){
                        System.out.println("Cost:"+cost[index]);
                }
                        System.out.println("Qantity:");
                for (int index = 0; index < qantity.length; index++){
                        System.out.println(qantity[index]);
                }
        }
}