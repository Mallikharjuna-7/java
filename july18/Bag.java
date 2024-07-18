public class Bag{

        public String bag_brand;
        public String bag_type;
        public short bag_size;
        public int bag_price;
        public float bag_warrenty;
        public String available_colors[];

        public Bag(){
        System.out.println("Bag Details:");
        }
        public Bag(String bag_brand,String bag_type,short bag_size,int bag_price,float bag_warrenty,String available_colors[]){
        this.bag_brand = bag_brand;
        this.bag_type = bag_type;
        this.bag_size = bag_size;
        this.bag_price = bag_price;
        this.bag_warrenty = bag_warrenty;
        this.available_colors = available_colors;

        System.out.println("Bag Brand:"+bag_brand);
        System.out.println("Bag Type:"+bag_type);
        System.out.println("Bag Size:"+bag_size);
        System.out.println("Bag Price:"+bag_price);
        System.out.println("Bag warrenty:"+bag_warrenty);
                for(int index = 0; index < available_colors.length; index++){
                System.out.println("Available Colors:"+available_colors[index]);
                }

        }

}