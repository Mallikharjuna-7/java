public class Multiplication {

    public static void main(String[] args) {
        int number = 2; 

        System.out.println("Multiplication for " + number + ":");
        for (int index = 1; index <= 20; index++) {
            System.out.println(number + " * " + index + " = " + (number * index));
        }
    }
}