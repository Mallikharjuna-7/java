public class Car{

        public String car_brand;
        public String car_model;
        public String car_type;
        public int engine_capacity;
        public short horse_power;
        public short top_speed;
        public byte mileage;
        public int price;
        public float car_rating;
        public String color;

        public Car(){
        System.out.println("Car Details:");
        }
        public Car(String car_brand){
        this.car_brand = car_brand;
        System.out.println("Car Brand:"+car_brand);
        }
        public Car(String car_brand,String car_model){
        this.car_brand = car_brand;
        this.car_model = car_model;
        System.out.println("Car Brand:"+car_brand);
        System.out.println("Car model:"+car_model);
        }
        public Car(String car_brand,String car_model,String car_type){
        this.car_brand = car_brand;
        this.car_model = car_model;
        this.car_type = car_type;
        System.out.println("Car Brand:"+car_brand);
        System.out.println("Car model:"+car_model);
        System.out.println("Car type:"+car_type);
        }
        public Car(String car_brand,String car_model,String car_type,int engine_capacity){
        this.car_brand = car_brand;
        this.car_model = car_model;
        this.car_type = car_type;
        this.engine_capacity = engine_capacity;
        System.out.println("Car Brand:"+car_brand);
        System.out.println("Car model:"+car_model);
        System.out.println("Car type:"+car_type);
        System.out.println("Engine capacity:"+engine_capacity);
        }
        public Car(String car_brand,String car_model,String car_type,int engine_capacity,short horse_power){
        this.car_brand = car_brand;
        this.car_model = car_model;
        this.car_type = car_type;
        this.engine_capacity = engine_capacity;
        this.horse_power = horse_power;
        System.out.println("Car Brand:"+car_brand);
        System.out.println("Car model:"+car_model);
        System.out.println("Car type:"+car_type);
        System.out.println("Engine capacity:"+engine_capacity);
        System.out.println("Horse Power:"+horse_power);
        }
        public Car(String car_brand,String car_model,String car_type,int engine_capacity,short horse_power,short top_speed){
        this.car_brand = car_brand;
        this.car_model = car_model;
        this.car_type = car_type;
        this.engine_capacity = engine_capacity;
        this.horse_power = horse_power;
        this.top_speed = top_speed;
        System.out.println("Car Brand:"+car_brand);
        System.out.println("Car model:"+car_model);
        System.out.println("Car type:"+car_type);
        System.out.println("Engine capacity:"+engine_capacity);
        System.out.println("Horse Power:"+horse_power);
        System.out.println("Top Speed:"+top_speed);
        }
        public Car(String car_brand,String car_model,String car_type,int engine_capacity,short horse_power,short top_speed,byte mileage){
        this.car_brand = car_brand;
        this.car_model = car_model;
        this.car_type = car_type;
        this.engine_capacity = engine_capacity;
        this.horse_power = horse_power;
        this.top_speed = top_speed;
        this.mileage = mileage;
        System.out.println("Car Brand:"+car_brand);
        System.out.println("Car model:"+car_model);
        System.out.println("Car type:"+car_type);
        System.out.println("Engine capacity:"+engine_capacity);
        System.out.println("Horse Power:"+horse_power);
        System.out.println("Top Speed:"+top_speed);
        System.out.println("Mileage:"+mileage);
        }
        public Car(String car_brand,String car_model,String car_type,int engine_capacity,short horse_power,short top_speed,byte mileage,int price){
        this.car_brand = car_brand;
        this.car_model = car_model;
        this.car_type = car_type;
        this.engine_capacity = engine_capacity;
        this.horse_power = horse_power;
        this.top_speed = top_speed;
        this.mileage = mileage;
        this.price = price;
        System.out.println("Car Brand:"+car_brand);
        System.out.println("Car model:"+car_model);
        System.out.println("Car type:"+car_type);
        System.out.println("Engine capacity:"+engine_capacity);
        System.out.println("Horse Power:"+horse_power);
        System.out.println("Top Speed:"+top_speed);
        System.out.println("Mileage:"+mileage);
        System.out.println("Price:"+price);
        }
        public Car(String car_brand,String car_model,String car_type,int engine_capacity,short horse_power,short top_speed,byte mileage,int price,float car_rating){
        this.car_brand = car_brand;
        this.car_model = car_model;
        this.car_type = car_type;
        this.engine_capacity = engine_capacity;
        this.horse_power = horse_power;
        this.top_speed = top_speed;
        this.mileage = mileage;
        this.price = price;
        this.car_rating = car_rating;
        System.out.println("Car Brand:"+car_brand);
        System.out.println("Car model:"+car_model);
        System.out.println("Car type:"+car_type);
        System.out.println("Engine capacity:"+engine_capacity);
        System.out.println("Horse Power:"+horse_power);
        System.out.println("Top Speed:"+top_speed);
        System.out.println("Mileage:"+mileage);
        System.out.println("Price:"+price);
        System.out.println("Car Rating:"+car_rating);
        }
        public Car(String car_brand,String car_model,String car_type,int engine_capacity,short horse_power,short top_speed,byte mileage,int price,float car_rating,String color){
        this.car_brand = car_brand;
        this.car_model = car_model;
        this.car_type = car_type;
        this.engine_capacity = engine_capacity;
        this.horse_power = horse_power;
        this.top_speed = top_speed;
        this.mileage = mileage;
        this.price = price;
        this.car_rating = car_rating;
        this.color = color;
        System.out.println("Car Brand:"+car_brand);
        System.out.println("Car model:"+car_model);
        System.out.println("Car type:"+car_type);
        System.out.println("Engine capacity:"+engine_capacity);
        System.out.println("Horse Power:"+horse_power);
        System.out.println("Top Speed:"+top_speed);
        System.out.println("Mileage:"+mileage);
        System.out.println("Price:"+price);
        System.out.println("Car Rating:"+car_rating);
        System.out.println("Color:"+color);
        }
}