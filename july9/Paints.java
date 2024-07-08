public class Paints {

        public static void aboutPaints(){
        String company_name = "Asian Paints";
        System.out.println("Paint Company:"+company_name);
        }
        public static void aboutPaints(String color){
        System.out.println("Paint Color:"+color);
        }
        public static String aboutPaints(int color_code){
        System.out.println("Color Code:"+color_code);
        return "Royal Shine paint is Good";
        }
        public static String aboutPaints(int price, String litres){
        System.out.println("Paint Bucket Price:"+price);
        System.out.println("Paint Bucket Size:"+litres);
        return "Asian Waterproof paints";
        }
}