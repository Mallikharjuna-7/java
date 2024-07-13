public class Leap{

        public static void main(String args[]){
        int year = 2024;
                if(year % 400 == 0){
                System.out.println("Its A Leap Year:"+year);
                }else if(year % 4 == 0 && year % 100 != 0){
                System.out.println("Its A Leap Year:"+year);
                }else{
                System.out.println("Its Not a Leap Year:"+year);
                }
        }
}