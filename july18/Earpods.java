public class Earpods{

        public String earpod_brand;
        public String earpod_model;
        public short earpod_backup;
        public int earpod_price;
        public float earpod_rating;
        public String popular_brands[];

        public Earpods(){
        System.out.println("Earpods Details:");
        }
        public Earpods(String earpod_brand,String earpod_model,short earpod_backup,int earpod_price,float earpod_rating,String popular_brands[]){
        this.earpod_brand = earpod_brand;
        this.earpod_model = earpod_model;
        this.earpod_backup = earpod_backup;
        this.earpod_price = earpod_price;
        this.earpod_rating = earpod_rating;
        this.popular_brands = popular_brands;

        System.out.println("Earpods Brand:"+earpod_brand);
        System.out.println("Earpods model:"+earpod_model);
        System.out.println("Earpods backup:"+earpod_backup);
        System.out.println("Earpods Price:"+earpod_price);
        System.out.println("Earpods Rating:"+earpod_rating);
                for(int index = 0; index < popular_brands.length; index++){
                System.out.println("Popular Earpod Brands:"+popular_brands[index]);
                }

        }

}