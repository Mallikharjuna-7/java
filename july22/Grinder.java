public class Grinder{

        public String brand;
        public String model;
        public int watts;
        public int price;
        public String color;

        public Grinder(){
        System.out.println("Grinder Details:");
        }
        public Grinder(String brand,String model,int watts,int price,String color){
        this.brand = brand;
        this.model = model;
        this.watts = watts;
        this.price = price;
        this.color = color;

        System.out.println("Grinder Brand:"+brand);
        System.out.println("Grinder model:"+model);
        System.out.println("Grinder watts:"+watts);
        System.out.println("Grinder Price:"+price);
        System.out.println("Grinder Color:"+color);

        }

}