public class Cars {

        public static void ignition(){
                boolean start = true;
                if (start){
                System.out.println("Engine is ON");
                }else{
                System.out.println("Engine is OFF");
                }
        }
        public static void fuel(int level){
                if (level >= 60){
                System.out.println("Fuel Level:"+level);
                }else{
                System.out.println("Fuel is Low");
                }
        }
        public static String speed(){
                int car_speed = 100;
                if (car_speed > 80){
                System.out.println("Over speed:"+car_speed);      
                }else{
                System.out.println("Car speed is:"+car_speed);
                }
                return "Speed Thrills & Speed Kills";
        }
        public static String carDetails(String about_car[]){
                System.out.println("Car Details:"); 
                for (int index = 0; index < about_car.length; index++){
                System.out.println(about_car[index]);
                }
                return "Fav car is : Nissan GTR";
        }
}