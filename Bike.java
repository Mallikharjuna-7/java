public class Bike {

        public static void main(String args[]){

                String[] bike_names = {"Triumph","Royal Enfield","Duke","Pulser"};
                int[] bike_mileage = {20,40,35,50};
                int[] bike_cc = {900,450,200,120};

                        System.out.println("Bike Names:");
                for (int index = 0; index < bike_names.length; index++){
                        System.out.println(bike_names[index]);
                }
                        System.out.println("Bike Mileage:");
                for (int index = 0; index < bike_mileage.length; index++){
                        System.out.println("Mileage:"+bike_mileage[index]);
                }
                        System.out.println("Bike CC:");
                for (int index = 0; index < bike_cc.length; index++){
                        System.out.println("CC:"+bike_cc[index]);
                }
        }
}