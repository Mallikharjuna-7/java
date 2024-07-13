public class Prime{

        public static void main(String args[]){
        int number = 21;
        int count = 0;
                if(number < 2 ){
                System.out.println("Its not a Prime Number:"+number);
                }
                for (int index = 2; index <= number; index++){
                        if(number%index == 0){
                        count++;
                        }
                }
                if(count < 2){
                System.out.println("Its a prime number:"+number);
                }else{
                System.out.println("It not a Prime Number:"+number);
                              
                }
        }
}