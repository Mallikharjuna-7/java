public class Myntra {

        public static void getMyntra(){
        String username = "Mallikharjuna";
        System.out.println("Username:"+username);
        }
        public static void getMyntra(int appsize){
        System.out.println("App Size"+appsize+"MB");
        }
        public static String getMyntra(String[] cartdetails){
        System.out.println("Cart items:");
        for (int index = 0; index < cartdetails.length; index++){
        System.out.println(cartdetails[index]);
        }
        return "Add more cart to get Discount";
        }
        public static String getMyntra(int bill, int discount){
        System.out.println("Cart value:"+bill);
        System.out.println("Discount:"+discount);
        System.out.println("Bill Amount:"+(bill-discount));
        return "Thank you for Shopping in Myntra";
        }
}