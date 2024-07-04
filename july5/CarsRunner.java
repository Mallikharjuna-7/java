public class CarsRunner {

        public static void main(String args[]){
                Cars.ignition();
                Cars.fuel(80);
                System.out.println(Cars.speed());
                String about_car[] = {"Car Brand:Range Rover","Model:Evoque","Color:Black","Year:2023","Price:84lacs"};
                System.out.println(Cars.carDetails(about_car));
        }
}