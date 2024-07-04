public class GooglePayRunner {

        public static void main(String args[]){
                GooglePay.payment();
                GooglePay.log_in("ABC12345");
                System.out.println(GooglePay.cashback());
                String acc_details[] = {"Name:Mallikharjuna","Phone No:9985056162","Bank Name:Indian Overseas Bank","Account No:122334467889"};
                System.out.println(GooglePay.getAccountDetails(acc_details));
        }
}