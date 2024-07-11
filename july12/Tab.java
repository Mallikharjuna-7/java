public class Tab {

    static String brand;
    static String model;
    static int screenSize;
    static int ramSize;
    static int storageCapacity;
    static String color;
    static double weight;
    static boolean isTouchscreen;
    static String operatingSystem;
    static double price;

    public static void main(String[] args) {
        Tab.brand = "Apple";
        Tab.model = "Ipad Air";
        Tab.screenSize = 10;
        Tab.ramSize = 6;
        Tab.storageCapacity = 128;
        Tab.color = "Silver";
        Tab.weight = 460.0;
        Tab.isTouchscreen = true;
        Tab.operatingSystem = "Mac OS";
        Tab.price = 48999.00;

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("RAM Size: " + ramSize + " GB");
        System.out.println("Storage Capacity: " + storageCapacity + " GB");
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight + " grams");
        System.out.println("Touchscreen: " + isTouchscreen);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Price:" + price);
    }
}