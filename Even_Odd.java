public class Even_Odd {

        public static void main(String args[]){

                int[] numbers = {18,51,69,48,12,89};
                int even = 0;
                int odd = 0;

                for (int index=0; index<numbers.length; index++){
                        if(numbers[index]%2 == 0){
                                even++;
                                System.out.println("Even Numbers:"+numbers[index]);
                        }else{
                                odd++;
                                System.out.println("Odd Numbers:"+numbers[index]);
                        }
                }
                System.out.println("Even numbers Count:"+even++);
                System.out.println("Odd numbers Count:"+odd++);
        }
}