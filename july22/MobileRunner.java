public class MobileRunner{

        public static void main(String args[]){

        Mobile Mobile = new Mobile();
        Mobile getMobile1 = new Mobile("Google");
        Mobile getMobile2 = new Mobile("Google","Pixel 8");
        Mobile getMobile3 = new Mobile("Google","Pixel 8","White");
        Mobile getMobile4 = new Mobile("Google","Pixel 8","White",79999);
        Mobile getMobile5 = new Mobile("Google","Pixel 8","White",79999,(short)8);
        Mobile getMobile6 = new Mobile("Google","Pixel 8","White",79999,(short)8,(short)256);
        }
}