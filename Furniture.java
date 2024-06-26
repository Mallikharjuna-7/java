public class Furniture {

        public static void main(String args[]){

                String[] furnitures = {"Table","Bed","Chair","Sofa"};
                long[] cost = {10000L,40000L,5000L,25000L};
                byte[] qantity = {2,1,4,6};

                        System.out.println("Furniture Names:");
                for (int index = 0; index < furnitures.length; index++){
                        System.out.println(furnitures[index]);
                }
                        System.out.println("Furniture Cost:");
                for (int index = 0; index < cost.length; index++){
                        System.out.println("Cost:"+cost[index]);
                }
                        System.out.println("Qantity:");
                for (int index = 0; index < qantity.length; index++){
                        System.out.println(qantity[index]);
                }
        }
}