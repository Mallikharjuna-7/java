public class Biriyani {

        public static void ingredients(String a_name,String b_name, String c_name, String d_name, String e_name){
                System.out.println("Ingredients:");
                System.out.println("1:"+a_name);
                System.out.println("2:"+b_name);
                System.out.println("3:"+c_name);
                System.out.println("4:"+d_name);
                System.out.println("5:"+e_name);
        }
        public static void review(int biriyani_review){
                if (biriyani_review == 10){
                        System.out.println("WOW");
                }else if(biriyani_review < 10 && biriyani_review > 5){
                        System.out.println("Good");
                }else if(biriyani_review <= 5){
                        System.out.println("Worst");
                }

        }
        public static void price(int biriyani_price , int delivery_charge){
                System.out.println("Biriyani Price:"+biriyani_price);
                System.out.println("Delivery Charge:"+delivery_charge);
                int total_price = biriyani_price+delivery_charge;
                System.out.println("Total Price:"+total_price);
        }
        
}