public class Curd{

        public String name;
        public int no_of_packs;
        public String manfacture_date;
        public String expiry_date;
        public int price;

        public Curd(){
        this ("Arokya");
        System.out.println("Curd Details:");
        }
        public Curd(String name){
        this ("Arokya",2);
        this.name = name;
        System.out.println("name:"+name);
        }
        public Curd(String name,int no_of_packs){
        this ("Arokya",2,"03-02-2024");
        this.name = name;
        this.no_of_packs = no_of_packs;
        System.out.println("name:"+name);
        System.out.println("no_of_packs:"+no_of_packs);
        }
        public Curd(String name,int no_of_packs,String manfacture_date){
        this ("Arokya",2,"03-02-2024","03-02-2025");
        this.name = name;
        this.no_of_packs = no_of_packs;
        this.manfacture_date = manfacture_date;
        System.out.println("name:"+name);
        System.out.println("no_of_packs:"+no_of_packs);
        System.out.println("manfacture_date:"+manfacture_date);
        }
        public Curd(String name,int no_of_packs,String manfacture_date,String expiry_date){
        this ("Arokya",2,"03-02-2024","03-02-2025",10);
        this.name = name;
        this.no_of_packs = no_of_packs;
        this.manfacture_date = manfacture_date;
        this.expiry_date = expiry_date;
        System.out.println("name:"+name);
        System.out.println("no_of_packs:"+no_of_packs);
        System.out.println("manfacture_date:"+manfacture_date);
        System.out.println("expiry_date:"+expiry_date);
        }
        public Curd(String name,int no_of_packs,String manfacture_date,String expiry_date,int price){
        this.name = name;
        this.no_of_packs = no_of_packs;
        this.manfacture_date = manfacture_date;
        this.expiry_date = expiry_date;
        this.price = price;
        System.out.println("name:"+name);
        System.out.println("no_of_packs:"+no_of_packs);
        System.out.println("manfacture_date:"+manfacture_date);
        System.out.println("expiry_date:"+expiry_date);
        System.out.println("price:"+price);
        }

}