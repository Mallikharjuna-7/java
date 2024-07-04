public class Amazon {

        public static void install(){
                boolean installation = true;
                if (installation){
                System.out.println("App is Installed");
                }else{
                System.out.println("App not Installed");
                }
        }
        public static void user(String user_name){
                if (user_name == "Mallikharjuna"){
                System.out.println("The User name is:"+user_name);
                }else{
                System.out.println("User Not Found");
                }
        }
        public static String cart(){
                int cart_value = 780;
                if (cart_value > 0){
                System.out.println("The Cart value is:"+cart_value);      
                }else{
                System.out.println("No items in your Cart");
                }
                return "Add more items to cart";
        }
        public static String getProductDetails(String product_details[]){
                System.out.println("Product details:"); 
                for (int index = 0; index < product_details.length; index++){
                System.out.println(product_details[index]);
                }
                return "OFFER: Get 2000 cashback with ICICI credit card";
        }
}