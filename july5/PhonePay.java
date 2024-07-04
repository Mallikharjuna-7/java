public class PhonePay {

        public static void upi(){
                boolean upi_pin = true;
                if (upi_pin){
                        System.out.println("Transaction is Successfull");
                }else{
                        System.out.println("Wrong UPI Pin");
                }
        }
        public static void logIn(String password){
                if (password == "ABC12345"){
                        System.out.println("Welcome to PhonePay");
                }else{
                        System.out.println("Password is Incorrect");
                }
        }
        public static String balance(){
                int acc_balance = 2500;
                if (acc_balance > 0){
                        System.out.println("Account balance:"+acc_balance);
                        
                }else{
                        System.out.println("Account balance is: 0");
                        
                }
                return "Account balance fetched Successfully";
        }
        public static String getAccountDetails(String acc_details[]){

                        System.out.println("Account details:"); 
                for (int index=0;index < acc_details.length;index++){
                        System.out.println(acc_details[index]);
                }
                return "Thank You for using PhonePay";
        }
}