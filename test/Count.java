public class Count {

        public static void main(String args[]){
                int even = 0;
                int odd = 0;
                for(int index = 1; index <= 50; index++){
                        if(index % 2 == 0){
                        even++;
                        }else{
                        odd++;
                        }
                }
                System.out.println("Even Odd "+even++);
                System.out.println("Odd Count"+odd++);
        }
}