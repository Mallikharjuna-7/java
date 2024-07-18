public class Bike{

        public String bike_brand;
        public String bike_model;
        public String bike_type;
        public int engine_capacity;
        public short tank_capacity;
        public short top_speed;
        public byte mileage;
        public int price;
        public float bike_rating;
        public String color;

        public Bike(){
        System.out.println("Bike Details:");
        }
        public Bike(String bike_brand){
        this.bike_brand = bike_brand;
        System.out.println("Bike Brand:"+bike_brand);
        }
        public Bike(String bike_brand,String bike_model){
        this.bike_brand = bike_brand;
        this.bike_model = bike_model;
        System.out.println("Bike Brand:"+bike_brand);
        System.out.println("Bike model:"+bike_model);
        }
        public Bike(String bike_brand,String bike_model,String bike_type){
        this.bike_brand = bike_brand;
        this.bike_model = bike_model;
        this.bike_type = bike_type;
        System.out.println("Bike Brand:"+bike_brand);
        System.out.println("Bike model:"+bike_model);
        System.out.println("Bike type:"+bike_type);
        }
        public Bike(String bike_brand,String bike_model,String bike_type,int engine_capacity){
        this.bike_brand = bike_brand;
        this.bike_model = bike_model;
        this.bike_type = bike_type;
        this.engine_capacity = engine_capacity;
        System.out.println("Bike Brand:"+bike_brand);
        System.out.println("Bike model:"+bike_model);
        System.out.println("Bike type:"+bike_type);
        System.out.println("Engine capacity:"+engine_capacity);
        }
        public Bike(String bike_brand,String bike_model,String bike_type,int engine_capacity,short tank_capacity){
        this.bike_brand = bike_brand;
        this.bike_model = bike_model;
        this.bike_type = bike_type;
        this.engine_capacity = engine_capacity;
        this.tank_capacity = tank_capacity;
        System.out.println("Bike Brand:"+bike_brand);
        System.out.println("Bike model:"+bike_model);
        System.out.println("Bike type:"+bike_type);
        System.out.println("Engine capacity:"+engine_capacity);
        System.out.println("Tank Capacity:"+tank_capacity);
        }
        public Bike(String bike_brand,String bike_model,String bike_type,int engine_capacity,short tank_capacity,short top_speed){
        this.bike_brand = bike_brand;
        this.bike_model = bike_model;
        this.bike_type = bike_type;
        this.engine_capacity = engine_capacity;
        this.tank_capacity = tank_capacity;
        this.top_speed = top_speed;
        System.out.println("Bike Brand:"+bike_brand);
        System.out.println("Bike model:"+bike_model);
        System.out.println("Bike type:"+bike_type);
        System.out.println("Engine capacity:"+engine_capacity);
        System.out.println("Tank Capacity:"+tank_capacity);
        System.out.println("Top Speed:"+top_speed);
        }
        public Bike(String bike_brand,String bike_model,String bike_type,int engine_capacity,short tank_capacity,short top_speed,byte mileage){
        this.bike_brand = bike_brand;
        this.bike_model = bike_model;
        this.bike_type = bike_type;
        this.engine_capacity = engine_capacity;
        this.tank_capacity = tank_capacity;
        this.top_speed = top_speed;
        this.mileage = mileage;
        System.out.println("Bike Brand:"+bike_brand);
        System.out.println("Bike model:"+bike_model);
        System.out.println("Bike type:"+bike_type);
        System.out.println("Engine capacity:"+engine_capacity);
        System.out.println("Tank Capacity:"+tank_capacity);
        System.out.println("Top Speed:"+top_speed);
        System.out.println("Mileage:"+mileage);
        }
        public Bike(String bike_brand,String bike_model,String bike_type,int engine_capacity,short tank_capacity,short top_speed,byte mileage,int price){
        this.bike_brand = bike_brand;
        this.bike_model = bike_model;
        this.bike_type = bike_type;
        this.engine_capacity = engine_capacity;
        this.tank_capacity = tank_capacity;
        this.top_speed = top_speed;
        this.mileage = mileage;
        this.price = price;
        System.out.println("Bike Brand:"+bike_brand);
        System.out.println("Bike model:"+bike_model);
        System.out.println("Bike type:"+bike_type);
        System.out.println("Engine capacity:"+engine_capacity);
        System.out.println("Tank Capacity:"+tank_capacity);
        System.out.println("Top Speed:"+top_speed);
        System.out.println("Mileage:"+mileage);
        System.out.println("Price:"+price);
        }
        public Bike(String bike_brand,String bike_model,String bike_type,int engine_capacity,short tank_capacity,short top_speed,byte mileage,int price,float bike_rating){
        this.bike_brand = bike_brand;
        this.bike_model = bike_model;
        this.bike_type = bike_type;
        this.engine_capacity = engine_capacity;
        this.tank_capacity = tank_capacity;
        this.top_speed = top_speed;
        this.mileage = mileage;
        this.price = price;
        this.bike_rating = bike_rating;
        System.out.println("Bike Brand:"+bike_brand);
        System.out.println("Bike model:"+bike_model);
        System.out.println("Bike type:"+bike_type);
        System.out.println("Engine capacity:"+engine_capacity);
        System.out.println("Tank Capacity:"+tank_capacity);
        System.out.println("Top Speed:"+top_speed);
        System.out.println("Mileage:"+mileage);
        System.out.println("Price:"+price);
        System.out.println("Bike Rating:"+bike_rating);
        }
        public Bike(String bike_brand,String bike_model,String bike_type,int engine_capacity,short tank_capacity,short top_speed,byte mileage,int price,float bike_rating,String color){
        this.bike_brand = bike_brand;
        this.bike_model = bike_model;
        this.bike_type = bike_type;
        this.engine_capacity = engine_capacity;
        this.tank_capacity = tank_capacity;
        this.top_speed = top_speed;
        this.mileage = mileage;
        this.price = price;
        this.bike_rating = bike_rating;
        this.color = color;
        System.out.println("Bike Brand:"+bike_brand);
        System.out.println("Bike model:"+bike_model);
        System.out.println("Bike type:"+bike_type);
        System.out.println("Engine capacity:"+engine_capacity);
        System.out.println("Tank Capacity:"+tank_capacity);
        System.out.println("Top Speed:"+top_speed);
        System.out.println("Mileage:"+mileage);
        System.out.println("Price:"+price);
        System.out.println("Bike Rating:"+bike_rating);
        System.out.println("Color:"+color);
        }
}