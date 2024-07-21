public class Tablet{

        public String tablet_brand;
        public int no_of_tablets;
        public String manfacture_date;
        public String expiry_date;
        public int price;

        public Tablet(){
        this ("Dolo");
        System.out.println("Tablet Details:");
        }
        public Tablet(String tablet_brand){
        this ("Dolo",10);
        this.tablet_brand = tablet_brand;
        System.out.println("tablet_brand:"+tablet_brand);
        }
        public Tablet(String tablet_brand,int no_of_tablets){
        this ("Dolo",10,"12-01-2024");
        this.tablet_brand = tablet_brand;
        this.no_of_tablets = no_of_tablets;
        System.out.println("tablet_brand:"+tablet_brand);
        System.out.println("no_of_tablets:"+no_of_tablets);
        }
        public Tablet(String tablet_brand,int no_of_tablets,String manfacture_date){
        this ("Dolo",10,"12-01-2024","12-01-2025");
        this.tablet_brand = tablet_brand;
        this.no_of_tablets = no_of_tablets;
        this.manfacture_date = manfacture_date;
        System.out.println("tablet_brand:"+tablet_brand);
        System.out.println("no_of_tablets:"+no_of_tablets);
        System.out.println("manfacture_date:"+manfacture_date);
        }
        public Tablet(String tablet_brand,int no_of_tablets,String manfacture_date,String expiry_date){
        this ("Dolo",10,"12-01-2024","12-01-2025",40);
        this.tablet_brand = tablet_brand;
        this.no_of_tablets = no_of_tablets;
        this.manfacture_date = manfacture_date;
        this.expiry_date = expiry_date;
        System.out.println("tablet_brand:"+tablet_brand);
        System.out.println("no_of_tablets:"+no_of_tablets);
        System.out.println("manfacture_date:"+manfacture_date);
        System.out.println("expiry_date:"+expiry_date);
        }
        public Tablet(String tablet_brand,int no_of_tablets,String manfacture_date,String expiry_date,int price){
        this.tablet_brand = tablet_brand;
        this.no_of_tablets = no_of_tablets;
        this.manfacture_date = manfacture_date;
        this.expiry_date = expiry_date;
        this.price = price;
        System.out.println("tablet_brand:"+tablet_brand);
        System.out.println("no_of_tablets:"+no_of_tablets);
        System.out.println("manfacture_date:"+manfacture_date);
        System.out.println("expiry_date:"+expiry_date);
        System.out.println("price:"+price);
        }

}