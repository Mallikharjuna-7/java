public class Shopping {

        public static void shopping_type(String type){
                System.out.println("Shopping Type:"+type); 
        }
        public static void total_price(double price, double gst){
                System.out.println("Price:"+price);
                System.out.println("GST:"+gst);
                double totalPrice = price*gst+price; 
                System.out.println("Total Price:"+totalPrice);
        }
        public static void shopped_item(String item, String type){
                System.out.println("Shopped Item:"+item); 
                System.out.println("Shopping Type:"+type);
        }
        public static void shopping_details(String type, String item, double price){
                System.out.println("Shopping Type:"+type); 
                System.out.println("Shopped Item:"+item);
                System.out.println("Price:"+price);
                //12% GST on Cloths
                double gst = 0.12;
                System.out.println("GST:"+gst);
                double totalPrice = price*gst+price; 
                System.out.println("Total Price:"+totalPrice);
        }
}