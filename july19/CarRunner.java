public class CarRunner{

        public static void main(String args[]){

        Car Car = new Car();
        Car car1 = new Car("Mahindra");
        Car car2 = new Car("Mahindra","Scorpio");
        Car car3 = new Car("Mahindra","Scorpio","SUV");
        Car car4 = new Car("Mahindra","Scorpio","SUV",2184);
        Car car5 = new Car("Mahindra","Scorpio","SUV",2184,(short)200);
        Car car6 = new Car("Mahindra","Scorpio","SUV",2184,(short)200,(short)180);
        Car car7 = new Car("Mahindra","Scorpio","SUV",2184,(short)200,(short)180,(byte)15);
        Car car8 = new Car("Mahindra","Scorpio","SUV",2184,(short)200,(short)180,(byte)15,1500000);
        Car car9 = new Car("Mahindra","Scorpio","SUV",2184,(short)200,(short)180,(byte)15,1500000,4.6f);
        Car car10 = new Car("Mahindra","Scorpio","SUV",2184,(short)200,(short)180,(byte)15,1500000,4.6f,"Black");
        }
}