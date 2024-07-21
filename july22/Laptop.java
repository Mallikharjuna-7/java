public class Laptop{

        public String laptop_brand;
        public String laptop_model;
        public String laptop_color;
        public int price;
        public int ram;
        public int storage;
        
        public Laptop(){
        System.out.println("Laptop Details:");
        }
        public Laptop(String laptop_brand){
        this.laptop_brand = laptop_brand;
        System.out.println("Laptop Brand:"+laptop_brand);
        }
        public Laptop(String laptop_brand,String laptop_model){
        this.laptop_brand = laptop_brand;
        this.laptop_model = laptop_model;
        System.out.println("Laptop Brand:"+laptop_brand);
        System.out.println("Laptop model:"+laptop_model);
        }
        public Laptop(String laptop_brand,String laptop_model,String laptop_color){
        this.laptop_brand = laptop_brand;
        this.laptop_model = laptop_model;
        this.laptop_color = laptop_color;
        System.out.println("Laptop Brand:"+laptop_brand);
        System.out.println("Laptop model:"+laptop_model);
        System.out.println("Laptop color:"+laptop_color);
        }
        public Laptop(String laptop_brand,String laptop_model,String laptop_color,int price){
        this.laptop_brand = laptop_brand;
        this.laptop_model = laptop_model;
        this.laptop_color = laptop_color;
        this.price = price;
        System.out.println("Laptop Brand:"+laptop_brand);
        System.out.println("Laptop model:"+laptop_model);
        System.out.println("Laptop color:"+laptop_color);
        System.out.println("price:"+price);
        }
        public Laptop(String laptop_brand,String laptop_model,String laptop_color,int price,int ram){
        this.laptop_brand = laptop_brand;
        this.laptop_model = laptop_model;
        this.laptop_color = laptop_color;
        this.price = price;
        this.ram = ram;
        System.out.println("Laptop Brand:"+laptop_brand);
        System.out.println("Laptop model:"+laptop_model);
        System.out.println("Laptop color:"+laptop_color);
        System.out.println("price:"+price);
        System.out.println("ram:"+ram);
        }
        public Laptop(String laptop_brand,String laptop_model,String laptop_color,int price,int ram,int storage){
        this.laptop_brand = laptop_brand;
        this.laptop_model = laptop_model;
        this.laptop_color = laptop_color;
        this.price = price;
        this.ram = ram;
        this.storage = storage;
        System.out.println("Laptop Brand:"+laptop_brand);
        System.out.println("Laptop model:"+laptop_model);
        System.out.println("Laptop color:"+laptop_color);
        System.out.println("price:"+price);
        System.out.println("ram:"+ram);
        System.out.println("storage:"+storage);
        }
}