public class ElectronicsRunner{

        public static void main(String args[]){

        Electronics electronics = new Electronics();

        Electronics.mobile_brand = "Samsung";
        Electronics.mobile_model = "Galaxy F15";
        Electronics.mobile_ram = 6;
        Electronics.mobile_color = "Green";
        Electronics.mobile_price = 12999;

        System.out.println("Mobile Name:"+Electronics.mobile_brand);
        System.out.println("Mobile Model:"+Electronics.mobile_model);
        System.out.println("RAM:"+Electronics.mobile_ram);
        System.out.println("Mobile Color:"+Electronics.mobile_color);
        System.out.println("Mobile Price:"+Electronics.mobile_price);

        Electronics getElectronics = new Electronics("HP","Victus",16,15.6f,59999);
        
        }
}