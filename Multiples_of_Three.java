public class Multiples_of_Three {

        public static void main(String args[]){

                int limit = 60;

                System.out.println("Multiples of 3:");

                for(int index = 1; index <= limit/3; index++){
                        int multiple = index*3;
                        System.out.println(multiple);
                }
        }
}