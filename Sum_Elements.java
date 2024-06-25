public class Sum_Elements {

        public static void main(String args[]){

                int[] ssc_marks = {89,92,79,82,85,76};
                int sum = 0;

                for (int index = 0; index < ssc_marks.length; index++) {
                        sum = sum+ssc_marks[index];
                }
                System.out.println("Sum of Elements:"+sum);
        }
}