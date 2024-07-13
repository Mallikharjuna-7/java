public class ReverseFor{

        public static void main(String args[]){
        long number = 9876543210L;
        long reverse = 0L;
                for(int index = 1; index < number; index++){
                long rem = number%10;
                reverse = reverse*10+rem;
                number = number/10;
                }
        System.out.println("Reverse:"+reverse);
        }
}