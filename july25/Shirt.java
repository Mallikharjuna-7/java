public class Shirt{

        public String shirt_brand;
        public String shirt_color;
        public int shirt_size;
        public String shirt_type;
        public int shirt_price;

        public Shirt(){
        this ("Highlander");
        System.out.println("Shirt Details:");
        }
        public Shirt(String shirt_brand){
        this ("Highlander","Black");
        this.shirt_brand = shirt_brand;
        System.out.println("Shirt Brand:"+shirt_brand);
        }
        public Shirt(String shirt_brand,String shirt_color){
        this ("Highlander","Black",42);
        this.shirt_brand = shirt_brand;
        this.shirt_color = shirt_color;
        System.out.println("Shirt Brand:"+shirt_brand);
        System.out.println("Shirt Color:"+shirt_color);
        }
        public Shirt(String shirt_brand,String shirt_color,int shirt_size){
        this ("Highlander","Black",42,"Full Sleeve");
        this.shirt_brand = shirt_brand;
        this.shirt_color = shirt_color;
        this.shirt_size = shirt_size;
        System.out.println("Shirt Brand:"+shirt_brand);
        System.out.println("Shirt Color:"+shirt_color);
        System.out.println("Shirt Size:"+shirt_size);
        }
        public Shirt(String shirt_brand,String shirt_color,int shirt_size,String shirt_type){
        this ("Highlander","Black",42,"Full Sleeve",1299);
        this.shirt_brand = shirt_brand;
        this.shirt_color = shirt_color;
        this.shirt_size = shirt_size;
        this.shirt_type = shirt_type;
        System.out.println("Shirt Brand:"+shirt_brand);
        System.out.println("Shirt Color:"+shirt_color);
        System.out.println("Shirt Size:"+shirt_size);
        System.out.println("Shirt Type:"+shirt_type);
        }
        public Shirt(String shirt_brand,String shirt_color,int shirt_size,String shirt_type,int shirt_price){
        this.shirt_brand = shirt_brand;
        this.shirt_color = shirt_color;
        this.shirt_size = shirt_size;
        this.shirt_type = shirt_type;
        this.shirt_price = shirt_price;
        System.out.println("Shirt Brand:"+shirt_brand);
        System.out.println("Shirt Color:"+shirt_color);
        System.out.println("Shirt Size:"+shirt_size);
        System.out.println("Shirt Type:"+shirt_type);
        System.out.println("Shirt Price:"+shirt_price);
        }
}