public class Electronics{

        public static String mobile_brand;
        public static String mobile_model;
        public static int mobile_ram;
        public static String mobile_color;
        public static int mobile_price;

        public String laptop_brand;
        public String laptop_model;
        public int laptop_ram;
        public float display_size;
        public int laptop_price;

        public Electronics(){
        System.out.println("Electronics Details:");
        }
        public Electronics(String laptop_brand,String laptop_model,int laptop_ram,float display_size,int laptop_price){
        this.laptop_brand = laptop_brand;
        this.laptop_model = laptop_model;
        this.laptop_ram = laptop_ram;
        this.display_size = display_size;
        this.laptop_price = laptop_price;

        System.out.println("Laptop Brand:"+laptop_brand);
        System.out.println("Laptop Model:"+laptop_model);
        System.out.println("RAM:"+laptop_ram);
        System.out.println("Display Size:"+display_size);
        System.out.println("Laptop Price:"+laptop_price);
        
        }
}