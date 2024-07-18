public class AC{

        public String ac_brand;
        public String ac_model;
        public short ac_star;
        public int ac_price;
        public float ac_tons;
        public String top_brands[];

        public AC(){
        System.out.println("AC Details:");
        }
        public AC(String ac_brand,String ac_model,short ac_star,int ac_price,float ac_tons,String top_brands[]){
        this.ac_brand = ac_brand;
        this.ac_model = ac_model;
        this.ac_star = ac_star;
        this.ac_price = ac_price;
        this.ac_tons = ac_tons;
        this.top_brands = top_brands;

        System.out.println("AC Brand:"+ac_brand);
        System.out.println("AC model:"+ac_model);
        System.out.println("AC star:"+ac_star);
        System.out.println("AC Price:"+ac_price);
        System.out.println("AC tons:"+ac_tons);
                for(int index = 0; index < top_brands.length; index++){
                System.out.println("Top Brands:"+top_brands[index]);
                }

        }

}