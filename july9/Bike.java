public class Bike {

        public static void bikeDetails(){
        String bike_company = "Pulser";
        System.out.println("Bike Brand:"+bike_company);
        }
        public static void bikeDetails(String bike_model){
        System.out.println("Bike Model:"+bike_model);
        }
        public static String bikeDetails(int cc){
        System.out.println("Bike CC:"+cc+"CC");
        return "2024 Launched";
        }
        public static String bikeDetails(int price, String color){
        System.out.println("Bike Price:"+price);
        System.out.println("Bike Color:"+color);
        return "No cost EMI available for 12Months";
        }
}