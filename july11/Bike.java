public class Bike {

        static String manfacturer_name;
        static String model;
        static String type;
        static int launch_year;
        static int engine_cc;
        static String fuel_type;
        static int mileage;
        static int top_speed;
        static boolean availabile;
        static String color;

        public static void getManfacturer() {
        manfacturer_name = "Kawasaki";
        System.out.println("Bike Manufacture Name:"+manfacturer_name);
        }
        public static void getModel() {
        model = "Ninja 300";
        System.out.println("Model:"+model);
        }
        public static void getType() {
        type = "Sport";
        System.out.println("Bike Type: "+type);
        }
        public static void getLaunchYear() {
        launch_year = 2023;
        System.out.println("Launch Year:"+launch_year);
        }
        public static void getEngineCC() {
        engine_cc = 300;
        System.out.println("Engine Capacity:"+engine_cc+"CC");
        }
        public static void getFuelType() {
        fuel_type = "Petrol";
        System.out.println("Fuel Type:"+fuel_type);
        }
        public static void getMileage() {
        mileage = 25;
        System.out.println("Mileage:"+mileage);
        }
        public static void getTopspeed() {
        top_speed = 180;
	System.out.println("Top Speed:"+top_speed);
        }
        public static void getAvailability() {
        availabile = true;
        System.out.println("Bike in Stock:"+availabile);
        }
        public static void getColor() {
        color = "Green";
	System.out.println("Color:"+color);
        }
}