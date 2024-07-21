public class Purifier{

        public String brand;
        public String model;
        public int capacity;
        public int price;
        public String color;

        public Purifier(){
        System.out.println("Purifier Details:");
        }
        public Purifier(String brand,String model,int capacity,int price,String color){
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
        this.price = price;
        this.color = color;

        System.out.println("Purifier Brand:"+brand);
        System.out.println("Purifier model:"+model);
        System.out.println("Purifier capacity:"+capacity);
        System.out.println("Purifier Price:"+price);
        System.out.println("Purifier Color:"+color);

        }

}