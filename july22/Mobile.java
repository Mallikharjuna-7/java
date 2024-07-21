public class Mobile{

        public String mobile_brand;
        public String mobile_model;
        public String mobile_color;
        public int price;
        public short ram;
        public short storage;
        
        public Mobile(){
        System.out.println("Mobile Details:");
        }
        public Mobile(String mobile_brand){
        this.mobile_brand = mobile_brand;
        System.out.println("Mobile Brand:"+mobile_brand);
        }
        public Mobile(String mobile_brand,String mobile_model){
        this.mobile_brand = mobile_brand;
        this.mobile_model = mobile_model;
        System.out.println("Mobile Brand:"+mobile_brand);
        System.out.println("Mobile model:"+mobile_model);
        }
        public Mobile(String mobile_brand,String mobile_model,String mobile_color){
        this.mobile_brand = mobile_brand;
        this.mobile_model = mobile_model;
        this.mobile_color = mobile_color;
        System.out.println("Mobile Brand:"+mobile_brand);
        System.out.println("Mobile model:"+mobile_model);
        System.out.println("Mobile color:"+mobile_color);
        }
        public Mobile(String mobile_brand,String mobile_model,String mobile_color,int price){
        this.mobile_brand = mobile_brand;
        this.mobile_model = mobile_model;
        this.mobile_color = mobile_color;
        this.price = price;
        System.out.println("Mobile Brand:"+mobile_brand);
        System.out.println("Mobile model:"+mobile_model);
        System.out.println("Mobile color:"+mobile_color);
        System.out.println("price:"+price);
        }
        public Mobile(String mobile_brand,String mobile_model,String mobile_color,int price,short ram){
        this.mobile_brand = mobile_brand;
        this.mobile_model = mobile_model;
        this.mobile_color = mobile_color;
        this.price = price;
        this.ram = ram;
        System.out.println("Mobile Brand:"+mobile_brand);
        System.out.println("Mobile model:"+mobile_model);
        System.out.println("Mobile color:"+mobile_color);
        System.out.println("price:"+price);
        System.out.println("ram:"+ram);
        }
        public Mobile(String mobile_brand,String mobile_model,String mobile_color,int price,short ram,short storage){
        this.mobile_brand = mobile_brand;
        this.mobile_model = mobile_model;
        this.mobile_color = mobile_color;
        this.price = price;
        this.ram = ram;
        this.storage = storage;
        System.out.println("Mobile Brand:"+mobile_brand);
        System.out.println("Mobile model:"+mobile_model);
        System.out.println("Mobile color:"+mobile_color);
        System.out.println("price:"+price);
        System.out.println("ram:"+ram);
        System.out.println("storage:"+storage);
        }
}