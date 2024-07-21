public class Swap{

        public static void main(String args[]){
        int number1 = 10;
        int number2 = 20;
        int temp;
        System.out.println("Not Swapped Numbers:"+number1+" "+number2);
        temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("Swapped Numbers:"+number1+" "+number2);
        }
}