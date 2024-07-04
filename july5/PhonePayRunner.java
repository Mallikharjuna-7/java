public class PhonePayRunner {

        public static void main(String args[]){
                PhonePay.upi();
                PhonePay.logIn("ABC12345");
                System.out.println(PhonePay.balance());
                String acc_details[] = {"Name:Mallikharjuna","Phone No:9985056162","Bank Name:Indian Overseas Bank","Account No:122334467889"};
                System.out.println(PhonePay.getAccountDetails(acc_details));
        }
}