public class Bank {

        public static void status(){

                boolean bank_name = true;
                if(bank_name){
                        System.out.println("Bank Name:Indian Overseas Bank");
                }else{
                        System.out.println("Bank Name:No Bank Name");
                }
                boolean acc_name = true;
                if (acc_name){
                        System.out.println("Account Name:Mallikharjuna");
                }else{
                        System.out.println("Account Name:Name not found");
                }
                boolean acc_status = true;
                if (acc_status){
                        System.out.println("Account Status: active");
                }else{
                        System.out.println("Account Status: inactive");
                }
                boolean acc_number = true;
                if (acc_number){
                        System.out.println("Account No:123301000031299");
                }else{
                        System.out.println("Account No:Number not found");
                }
                boolean ifsc_code = true;
                if (ifsc_code){
                        System.out.println("IFSC Code:IOBA0000123");
                }else{
                        System.out.println("IFSC Code:Code not found");
                }
        } 
        public static void balance(){

                int b_balance = 1000;
                if (b_balance < 500){
                        System.out.println("Minimum Account Balance is Not Maintained");
                }else{
                        System.out.println("Minimum Account Balance is Maintaining");
                }
                int c_balance = 30000;
                if (c_balance >= 30000){
                        System.out.println("Salary is Credited");
                }else{
                        System.out.println("Salary is Not Credited");
                }
                int d_balance = 0;
                if (d_balance == 0){
                        System.out.println("Account Balance is zero(0)");
                }else{
                        System.out.println("Balance is Not zero(0)");
                }
                int withdraw_amout = 20000;
                if (withdraw_amout > 10000){
                        System.out.println("Can't withdraw large amount");
                }else{
                        System.out.println("Amount withdrawal success");
                }
                int wifi_card = 3000;
                if (wifi_card > 2000){
                        System.out.println("Enter your PIN for Transaction");
                }else{
                        System.out.println("Transaction Successfull");
                }
        }
        public static void loan(){

                boolean loan_accept = true;
                if (loan_accept){
                        System.out.println("Loan Application Accepted");
                }else{
                        System.out.println("Loan Rejected");
                }
                int loan_amount = 500000;
                if (loan_amount == 500000){
                        System.out.println("Loan Sactioned");
                }else{
                        System.out.println("Loan Not Sanctioned");
                }
                boolean load_credit = true;
                if (load_credit){
                        System.out.println("Load Amount Credited");
                }else{
                        System.out.println("Load Amount Not Credited");
                }
                double intrest = 0.25;
                if (intrest > 0.10){
                        System.out.println("Intrest is High");
                }else{
                        System.out.println("Intrest is Low");
                }
                int time = 5;
                if (time <= 5 ){
                        System.out.println("EMI paid on time");
                }else{
                        System.out.println("EMI not paid on time");
                }
        }
}