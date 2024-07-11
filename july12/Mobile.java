public class Mobile{

        public static void features(){
        System.out.println("Mobile Features:");
        }
        public static void features(String manufacture){
        System.out.println("Mobile Manufacturer:"+manufacture);
        }
        public static void features(String manufacture, String model){
        System.out.println("Mobile Manufacturer:"+manufacture);
        System.out.println("Model"+model);
        }
        public static void features(String manufacture, String model,int ram){
        System.out.println("Mobile Manufacturer:"+manufacture);
        System.out.println("Model"+model);
        System.out.println("Ram"+ram+"GB");
        }
        public static void features(String manufacture, String model,int ram,int storage){
        System.out.println("Mobile Manufacturer:"+manufacture);
        System.out.println("Model"+model);
        System.out.println("Ram"+ram+"GB");
        System.out.println("Storage:"+storage+"GB");
        }
        public static void features(String manufacture, String model,int ram,int storage,int price){
        System.out.println("Mobile Manufacturer:"+manufacture);
        System.out.println("Model"+model);
        System.out.println("Ram"+ram+"GB");
        System.out.println("Storage:"+storage+"GB");
        System.out.println("Price:"+price);
        }
}