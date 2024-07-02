public class Metro {

        public static void from_to_price(String from, String to, boolean price){
                System.out.println("Starting Point:"+from);
                System.out.println("Destination:"+to); 
                
                if (price) {
                        System.out.println("Ticket Cost:25");
                }else{
                        System.out.println("Ticket Cost:50");
                }
        }
        public static void balance(int card_balance, int price){
                System.out.println("Card Balance:"+card_balance);
                System.out.println("Ticket price:"+price);
                int current_balance = card_balance-price; 
                System.out.println("Current Balance:"+current_balance);
        }
}