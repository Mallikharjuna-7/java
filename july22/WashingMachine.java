public class WashingMachine{

        public String brand;
        public String model;
        public short rating_star;
        public int price;
        public float load;

        public WashingMachine(){
        System.out.println("WashingMachine Details:");
        }
        public WashingMachine(String brand,String model,short rating_star,int price,float load){
        this.brand = brand;
        this.model = model;
        this.rating_star = rating_star;
        this.price = price;
        this.load = load;

        System.out.println("WashingMachine Brand:"+brand);
        System.out.println("WashingMachine model:"+model);
        System.out.println("WashingMachine stars:"+rating_star);
        System.out.println("WashingMachine Price:"+price);
        System.out.println("WashingMachine Capacity:"+load);

        }

}