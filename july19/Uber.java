public class Uber {

        public String driver_name;
        public String pickup;
        public String drop;
        public short no_of_passengers;
        public String vehicle_type;
        public String estimated_time;
        public int distance;
        public int price;
        public boolean ride_booked;
        public int app_size;

        public Uber(){
        System.out.println("Uber Details:");
        }
        public Uber(String driver_name){
        this.driver_name = driver_name;
        System.out.println("driver_name:"+driver_name);
        }
        public Uber(String driver_name,String pickup){
        this.driver_name = driver_name;
        this.pickup = pickup;
        System.out.println("driver_name:"+driver_name);
        System.out.println("pickup:"+pickup);
        }
        public Uber(String driver_name,String pickup,String drop){
        this.driver_name = driver_name;
        this.pickup = pickup;
        this.drop = drop;
        System.out.println("driver_name:"+driver_name);
        System.out.println("pickup:"+pickup);
        System.out.println("drop:"+drop);
        }
        public Uber(String driver_name,String pickup,String drop,short no_of_passengers){
        this.driver_name = driver_name;
        this.pickup = pickup;
        this.drop = drop;
        this.no_of_passengers = no_of_passengers;
        System.out.println("driver_name:"+driver_name);
        System.out.println("pickup:"+pickup);
        System.out.println("drop:"+drop);
        System.out.println("no_of_passengers:"+no_of_passengers);
        }
        public Uber(String driver_name,String pickup,String drop,short no_of_passengers,String vehicle_type){
        this.driver_name = driver_name;
        this.pickup = pickup;
        this.drop = drop;
        this.no_of_passengers = no_of_passengers;
        this.vehicle_type = vehicle_type;
        System.out.println("driver_name:"+driver_name);
        System.out.println("pickup:"+pickup);
        System.out.println("drop:"+drop);
        System.out.println("no_of_passengers:"+no_of_passengers);
        System.out.println("vehicle_type:"+vehicle_type);
        }
        public Uber(String driver_name,String pickup,String drop,short no_of_passengers,String vehicle_type,String estimated_time){
        this.driver_name = driver_name;
        this.pickup = pickup;
        this.drop = drop;
        this.no_of_passengers = no_of_passengers;
        this.vehicle_type = vehicle_type;
        this.estimated_time = estimated_time;
        System.out.println("driver_name:"+driver_name);
        System.out.println("pickup:"+pickup);
        System.out.println("drop:"+drop);
        System.out.println("no_of_passengers:"+no_of_passengers);
        System.out.println("vehicle_type:"+vehicle_type);
        System.out.println("estimated_time:"+estimated_time);
        }
        public Uber(String driver_name,String pickup,String drop,short no_of_passengers,String vehicle_type,String estimated_time,int distance){
        this.driver_name = driver_name;
        this.pickup = pickup;
        this.drop = drop;
        this.no_of_passengers = no_of_passengers;
        this.vehicle_type = vehicle_type;
        this.estimated_time = estimated_time;
        this.distance = distance;
        System.out.println("driver_name:"+driver_name);
        System.out.println("pickup:"+pickup);
        System.out.println("drop:"+drop);
        System.out.println("no_of_passengers:"+no_of_passengers);
        System.out.println("vehicle_type:"+vehicle_type);
        System.out.println("estimated_time:"+estimated_time);
        System.out.println("distance:"+distance);
        }
        public Uber(String driver_name,String pickup,String drop,short no_of_passengers,String vehicle_type,String estimated_time,int distance,int price){
        this.driver_name = driver_name;
        this.pickup = pickup;
        this.drop = drop;
        this.no_of_passengers = no_of_passengers;
        this.vehicle_type = vehicle_type;
        this.estimated_time = estimated_time;
        this.distance = distance;
        this.price = price;
        System.out.println("driver_name:"+driver_name);
        System.out.println("pickup:"+pickup);
        System.out.println("drop:"+drop);
        System.out.println("no_of_passengers:"+no_of_passengers);
        System.out.println("vehicle_type:"+vehicle_type);
        System.out.println("estimated_time:"+estimated_time);
        System.out.println("distance:"+distance);
        System.out.println("price:"+price);
        }
        public Uber(String driver_name,String pickup,String drop,short no_of_passengers,String vehicle_type,String estimated_time,int distance,int price,boolean ride_booked){
        this.driver_name = driver_name;
        this.pickup = pickup;
        this.drop = drop;
        this.no_of_passengers = no_of_passengers;
        this.vehicle_type = vehicle_type;
        this.estimated_time = estimated_time;
        this.distance = distance;
        this.price = price;
        this.ride_booked = ride_booked;
        System.out.println("driver_name:"+driver_name);
        System.out.println("pickup:"+pickup);
        System.out.println("drop:"+drop);
        System.out.println("no_of_passengers:"+no_of_passengers);
        System.out.println("vehicle_type:"+vehicle_type);
        System.out.println("estimated_time:"+estimated_time);
        System.out.println("distance:"+distance);
        System.out.println("price:"+price);
        System.out.println("ride_booked Available:"+ride_booked);
        }
        public Uber(String driver_name,String pickup,String drop,short no_of_passengers,String vehicle_type,String estimated_time,int distance,int price,boolean ride_booked,int app_size){
        this.driver_name = driver_name;
        this.pickup = pickup;
        this.drop = drop;
        this.no_of_passengers = no_of_passengers;
        this.vehicle_type = vehicle_type;
        this.estimated_time = estimated_time;
        this.distance = distance;
        this.price = price;
        this.ride_booked = ride_booked;
        this.app_size = app_size;
        System.out.println("driver_name:"+driver_name);
        System.out.println("pickup:"+pickup);
        System.out.println("drop:"+drop);
        System.out.println("no_of_passengers:"+no_of_passengers);
        System.out.println("vehicle_type:"+vehicle_type);
        System.out.println("estimated_time:"+estimated_time);
        System.out.println("distance:"+distance);
        System.out.println("price:"+price);
        System.out.println("ride_booked Available:"+ride_booked);
        System.out.println("app_size:"+app_size);
        }
}