public class Watch {

        static String brand;
        static String model;
        static double screenSize;
        static int ramSize;
        static int storageCapacity; 
        static String color;
        static double weight;
        static boolean hasHeartRateMonitor;
        static boolean hasGPS;
        static double price; 

        public static void main(String[] args){
        Watch.brand = "Boat";
        Watch.model = "Strom 2";
        Watch.screenSize = 1.78;
        Watch.ramSize = 1;
        Watch.storageCapacity = 32;
        Watch.color = "Blue";
        Watch.weight = 36.7;
        Watch.hasHeartRateMonitor = true;
        Watch.hasGPS = true;
        Watch.price = 2999.00;

        System.out.println("Brand:"+brand);
        System.out.println("Model:"+model);
        System.out.println("Screen Size:"+screenSize+"inches");
        System.out.println("RAM Size:"+ramSize+"GB");
        System.out.println("Storage Capacity:"+storageCapacity+"GB");
        System.out.println("Color:"+color);
        System.out.println("Weight:"+weight+"grams");
        System.out.println("Heart Rate Monitor:"+hasHeartRateMonitor);
        System.out.println("GPS:"+hasGPS);
        System.out.println("Price:"+price);
        }
}