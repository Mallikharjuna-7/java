public class Shirt{

        public String shirt_brand;
        public String shirt_type;
        public short shirt_size;
        public int shirt_price;
        public float shirt_rating;
        public String available_colors[];

        public Shirt(){
        System.out.println("Shirt Details:");
        }
        public Shirt(String shirt_brand,String shirt_type,short shirt_size,int shirt_price,float shirt_rating,String available_colors[]){
        this.shirt_brand = shirt_brand;
        this.shirt_type = shirt_type;
        this.shirt_size = shirt_size;
        this.shirt_price = shirt_price;
        this.shirt_rating = shirt_rating;
        this.available_colors = available_colors;

        System.out.println("Shirt Brand:"+shirt_brand);
        System.out.println("Shirt Type:"+shirt_type);
        System.out.println("Shirt Size:"+shirt_size);
        System.out.println("Shirt Price:"+shirt_price);
        System.out.println("Shirt Rating:"+shirt_rating);
                for(int index = 0; index < available_colors.length; index++){
                System.out.println("Available Colors:"+available_colors[index]);
                }

        }

}