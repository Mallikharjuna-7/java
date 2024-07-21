public class Fan{

        public String fan_brand;
        public String fan_model;
        public String fan_color;
        public int price;
        public int watts;
        public boolean is_bldc_fan;
        
        public Fan(){
        System.out.println("Fan Details:");
        }
        public Fan(String fan_brand){
        this.fan_brand = fan_brand;
        System.out.println("Fan Brand:"+fan_brand);
        }
        public Fan(String fan_brand,String fan_model){
        this.fan_brand = fan_brand;
        this.fan_model = fan_model;
        System.out.println("Fan Brand:"+fan_brand);
        System.out.println("Fan model:"+fan_model);
        }
        public Fan(String fan_brand,String fan_model,String fan_color){
        this.fan_brand = fan_brand;
        this.fan_model = fan_model;
        this.fan_color = fan_color;
        System.out.println("Fan Brand:"+fan_brand);
        System.out.println("Fan model:"+fan_model);
        System.out.println("Fan color:"+fan_color);
        }
        public Fan(String fan_brand,String fan_model,String fan_color,int price){
        this.fan_brand = fan_brand;
        this.fan_model = fan_model;
        this.fan_color = fan_color;
        this.price = price;
        System.out.println("Fan Brand:"+fan_brand);
        System.out.println("Fan model:"+fan_model);
        System.out.println("Fan color:"+fan_color);
        System.out.println("price:"+price);
        }
        public Fan(String fan_brand,String fan_model,String fan_color,int price,int watts){
        this.fan_brand = fan_brand;
        this.fan_model = fan_model;
        this.fan_color = fan_color;
        this.price = price;
        this.watts = watts;
        System.out.println("Fan Brand:"+fan_brand);
        System.out.println("Fan model:"+fan_model);
        System.out.println("Fan color:"+fan_color);
        System.out.println("price:"+price);
        System.out.println("watts:"+watts);
        }
        public Fan(String fan_brand,String fan_model,String fan_color,int price,int watts,boolean is_bldc_fan){
        this.fan_brand = fan_brand;
        this.fan_model = fan_model;
        this.fan_color = fan_color;
        this.price = price;
        this.watts = watts;
        this.is_bldc_fan = is_bldc_fan;
        System.out.println("Fan Brand:"+fan_brand);
        System.out.println("Fan model:"+fan_model);
        System.out.println("Fan color:"+fan_color);
        System.out.println("price:"+price);
        System.out.println("watts:"+watts);
        System.out.println("is_bldc_fan:"+is_bldc_fan);
        }
}