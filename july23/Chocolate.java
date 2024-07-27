public class Chocolate{

        public String chocolate_name;
        public int no_of_chocolates;
        public String manfacture_date;
        public String expiry_date;
        public int price;

        public Chocolate(){
        this ("Snickers");
        System.out.println("Chocolate Details:");
        }
        public Chocolate(String chocolate_name){
        this ("Snickers",5);
        this.chocolate_name = chocolate_name;
        System.out.println("chocolate_name:"+chocolate_name);
        }
        public Chocolate(String chocolate_name,int no_of_chocolates){
        this ("Snickers",5,"12-01-2024");
        this.chocolate_name = chocolate_name;
        this.no_of_chocolates = no_of_chocolates;
        System.out.println("chocolate_name:"+chocolate_name);
        System.out.println("no_of_chocolates:"+no_of_chocolates);
        }
        public Chocolate(String chocolate_name,int no_of_chocolates,String manfacture_date){
        this ("Snickers",5,"12-01-2024","12-01-2025");
        this.chocolate_name = chocolate_name;
        this.no_of_chocolates = no_of_chocolates;
        this.manfacture_date = manfacture_date;
        System.out.println("chocolate_name:"+chocolate_name);
        System.out.println("no_of_chocolates:"+no_of_chocolates);
        System.out.println("manfacture_date:"+manfacture_date);
        }
        public Chocolate(String chocolate_name,int no_of_chocolates,String manfacture_date,String expiry_date){
        this ("Snickers",5,"12-01-2024","12-01-2025",50);
        this.chocolate_name = chocolate_name;
        this.no_of_chocolates = no_of_chocolates;
        this.manfacture_date = manfacture_date;
        this.expiry_date = expiry_date;
        System.out.println("chocolate_name:"+chocolate_name);
        System.out.println("no_of_chocolates:"+no_of_chocolates);
        System.out.println("manfacture_date:"+manfacture_date);
        System.out.println("expiry_date:"+expiry_date);
        }
        public Chocolate(String chocolate_name,int no_of_chocolates,String manfacture_date,String expiry_date,int price){
        this.chocolate_name = chocolate_name;
        this.no_of_chocolates = no_of_chocolates;
        this.manfacture_date = manfacture_date;
        this.expiry_date = expiry_date;
        this.price = price;
        System.out.println("chocolate_name:"+chocolate_name);
        System.out.println("no_of_chocolates:"+no_of_chocolates);
        System.out.println("manfacture_date:"+manfacture_date);
        System.out.println("expiry_date:"+expiry_date);
        System.out.println("price:"+price);
        }

        public void chocoDetails(){
        System.out.println("no arguments");
        }
        public void choco(String name){
        System.out.println("Name:"+name);
        }
        public void choco1(int price){
        System.out.println("Price:"+price);
        }
        public void choco2(String name,int price){
        System.out.println("Name:"+name);
        System.out.println("Price:"+price);       
        }

}