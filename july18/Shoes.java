public class Shoes{

        public String shoe_brand;
        public String shoe_type;
        public short shoe_size;
        public int shoe_price;
        public float shoe_length;
        public String available_colors[];

        public Shoes(){
        System.out.println("Shoes Details:");
        }
        public Shoes(String shoe_brand,String shoe_type,short shoe_size,int shoe_price,float shoe_length,String available_colors[]){
        this.shoe_brand = shoe_brand;
        this.shoe_type = shoe_type;
        this.shoe_size = shoe_size;
        this.shoe_price = shoe_price;
        this.shoe_length = shoe_length;
        this.available_colors = available_colors;

        System.out.println("Shoes Brand:"+shoe_brand);
        System.out.println("Shoes Type:"+shoe_type);
        System.out.println("Shoes Size:"+shoe_size);
        System.out.println("Shoes Price:"+shoe_price);
        System.out.println("Shoes length:"+shoe_length);
                for(int index = 0; index < available_colors.length; index++){
                System.out.println("Available Colors:"+available_colors[index]);
                }

        }

}