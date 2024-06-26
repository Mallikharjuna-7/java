public class Car {

        public static void main(String args[]){

                String[] car_names = {"Rolls Royce","Jaguar","Buggati","Range Rover"};
                int[] car_mileage = {10,20,9,15};
                int[] car_number = {9999,6969,7777,4444};

                        System.out.println("Car Names:");
                for (int index = 0; index < car_names.length; index++){
                        System.out.println(car_names[index]);
                }
                        System.out.println("Car Mileage:");
                for (int index = 0; index < car_mileage.length; index++){
                        System.out.println("Mileage:"+car_mileage[index]);
                }
                        System.out.println("Car Number:");
                for (int index = 0; index < car_number.length; index++){
                        System.out.println("No:"+car_number[index]);
                }
        }
}