public class Earpods {

        public static void earpodDetails(){
        String earpodsb_brand = "Boat";
        System.out.println("Earpods Brand:"+earpodsb_brand);
        }
        public static void earpodDetails(String model){
        System.out.println("Earpods Model:"+model);
        }
        public static String earpodDetails(double bt_version){
        System.out.println("Bluetooth Version:"+bt_version);
        return "Charging is Full";
        }
        public static String earpodDetails(int price, String backup){
        System.out.println("Earpods Price:"+price);
        System.out.println("Battery Backup:"+backup);
        return "500 Discount on SBI credit card";
        }
}