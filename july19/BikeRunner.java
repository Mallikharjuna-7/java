public class BikeRunner{

        public static void main(String args[]){

        Bike Bike = new Bike();
        Bike getBike1 = new Bike("Kawasaki");
        Bike getBike2 = new Bike("Kawasaki","Ninja 300");
        Bike getBike3 = new Bike("Kawasaki","Ninja 300","Sport");
        Bike getBike4 = new Bike("Kawasaki","Ninja 300","Sport",300);
        Bike getBike5 = new Bike("Kawasaki","Ninja 300","Sport",300,(short)17);
        Bike getBike6 = new Bike("Kawasaki","Ninja 300","Sport",300,(short)17,(short)196);
        Bike getBike7 = new Bike("Kawasaki","Ninja 300","Sport",300,(short)17,(short)196,(byte)25);
        Bike getBike8 = new Bike("Kawasaki","Ninja 300","Sport",300,(short)17,(short)196,(byte)25,350000);
        Bike getBike9 = new Bike("Kawasaki","Ninja 300","Sport",300,(short)17,(short)196,(byte)25,350000,4.5f);
        Bike getBike10 = new Bike("Kawasaki","Ninja 300","Sport",300,(short)17,(short)196,(byte)25,350000,4.5f,"Green");
        }
}