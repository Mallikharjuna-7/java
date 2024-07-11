public class Tubelight{

        public static void details(){
        System.out.println("Tubelight Details:");
        }
        public static void details(String manufacture){
        System.out.println("Tubelight Manufacturer:"+manufacture);
        }
        public static void details(String manufacture, String color){
        System.out.println("Tubelight Manufacturer:"+manufacture);
        System.out.println("Color"+color);
        }
        public static void details(String manufacture, String color,int length){
        System.out.println("Tubelight Manufacturer:"+manufacture);
        System.out.println("Color"+color);
        System.out.println("Length"+length+"ft");
        }
        public static void details(String manufacture, String color,int length,int watts){
        System.out.println("Tubelight Manufacturer:"+manufacture);
        System.out.println("Color"+color);
        System.out.println("Length"+length+"ft");
        System.out.println("Watts:"+watts+"w");
        }
        public static void details(String manufacture, String color,int length,int watts,int price){
        System.out.println("Tubelight Manufacturer:"+manufacture);
        System.out.println("Color"+color);
        System.out.println("Length"+length+"ft");
        System.out.println("Watts:"+watts+"w");
        System.out.println("Price:"+price);
        }
}