public class BikeRunner{

        public static void main(String args[]){
        Bike.bikeDetails();
        Bike.bikeDetails("N250");
        System.out.println(Bike.bikeDetails(250));
        System.out.println(Bike.bikeDetails(220000,"RED"));
        }
}