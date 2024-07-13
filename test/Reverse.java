public class Reverse{

        public static void main(String args[]){
        long number = 9876543210L;
        long reverse = 0L;
                while(number != 0){
                long rem = number%10;
                reverse = reverse*10+rem;
                number = number/10;
                }
        System.out.println("Reverse:"+reverse);
        }
}