public class Laptop{

        public static void specifications(){
        System.out.println("Laptop Specifications:");
        }
        public static void specifications(String manufacture){
        System.out.println("Laptop Manufacturer:"+manufacture);
        }
        public static void specifications(String manufacture, String model){
        System.out.println("Laptop Manufacturer:"+manufacture);
        System.out.println("Model"+model);
        }
        public static void specifications(String manufacture, String model,int ram){
        System.out.println("Laptop Manufacturer:"+manufacture);
        System.out.println("Model"+model);
        System.out.println("Ram"+ram+"GB");
        }
        public static void specifications(String manufacture, String model,int ram,int storage){
        System.out.println("Laptop Manufacturer:"+manufacture);
        System.out.println("Model"+model);
        System.out.println("Ram"+ram+"GB");
        System.out.println("Storage:"+storage+"TB");
        }
        public static void specifications(String manufacture, String model,int ram,int storage,int price){
        System.out.println("Laptop Manufacturer:"+manufacture);
        System.out.println("Model"+model);
        System.out.println("Ram"+ram+"GB");
        System.out.println("Storage:"+storage+"TB");
        System.out.println("Price:"+price);
        }
}