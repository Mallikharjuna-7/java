public class Reverse_Elements {

        public static void main(String args[]) {

                int[] scores= {180,155,205,242,128};

                System.out.println("Reversing Array Elements:");

                for (int index = scores.length-1 ; index >= 0; index--){
                        System.out.println(scores[index]);
                }
        }
}