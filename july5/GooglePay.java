public class GooglePay {

        public static void payment(){
                boolean upi_pin = true;
                if (upi_pin){
                        System.out.println("Payment is Successfull");
                }else{
                        System.out.println("Wrong UPI Pin");
                }
        }
        public static void log_in(String password){
                if (password == "ABC12345"){
                        System.out.println("Welcome to GooglePay");
                }else{
                        System.out.println("Password is Incorrect");
                }
        }
        public static String cashback(){
                int scratch_card = 40;
                if (scratch_card > 0){
                        System.out.println("You won cashback:"+scratch_card);
                        
                }else{
                        System.out.println("Better luck next time");
                        
                }
                return "Do any Payment for next Scratch Card";
        }
        public static String getAccountDetails(String acc_details[]){

                        System.out.println("Account details:"); 
                for (int index=0;index < acc_details.length;index++){
                        System.out.println(acc_details[index]);
                }
                return "Thank You for using GooglePay";
        }
}