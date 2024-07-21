public class Dates{

        public String dates_brand;
        public int quantity;
        public String manfacture_date;
        public String expiry_date;
        public int price;

        public Dates(){
        this ("Lion Dates");
        System.out.println("Dates Details:");
        }
        public Dates(String dates_brand){
        this ("Lion Dates",500);
        this.dates_brand = dates_brand;
        System.out.println("dates_brand:"+dates_brand);
        }
        public Dates(String dates_brand,int quantity){
        this ("Lion Dates",500,"05-03-2024");
        this.dates_brand = dates_brand;
        this.quantity = quantity;
        System.out.println("dates_brand:"+dates_brand);
        System.out.println("quantity:"+quantity);
        }
        public Dates(String dates_brand,int quantity,String manfacture_date){
        this ("Lion Dates",500,"05-03-2024","05-03-2025");
        this.dates_brand = dates_brand;
        this.quantity = quantity;
        this.manfacture_date = manfacture_date;
        System.out.println("dates_brand:"+dates_brand);
        System.out.println("quantity:"+quantity);
        System.out.println("manfacture_date:"+manfacture_date);
        }
        public Dates(String dates_brand,int quantity,String manfacture_date,String expiry_date){
        this ("Lion Dates",500,"05-03-2024","05-03-2025",110);
        this.dates_brand = dates_brand;
        this.quantity = quantity;
        this.manfacture_date = manfacture_date;
        this.expiry_date = expiry_date;
        System.out.println("dates_brand:"+dates_brand);
        System.out.println("quantity:"+quantity);
        System.out.println("manfacture_date:"+manfacture_date);
        System.out.println("expiry_date:"+expiry_date);
        }
        public Dates(String dates_brand,int quantity,String manfacture_date,String expiry_date,int price){
        this.dates_brand = dates_brand;
        this.quantity = quantity;
        this.manfacture_date = manfacture_date;
        this.expiry_date = expiry_date;
        this.price = price;
        System.out.println("dates_brand:"+dates_brand);
        System.out.println("quantity:"+quantity);
        System.out.println("manfacture_date:"+manfacture_date);
        System.out.println("expiry_date:"+expiry_date);
        System.out.println("price:"+price);
        }

}