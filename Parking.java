public class Parking {

        public static void main(String args[]){

                String[] parked_vehicles = {"Cars","Bikes","Cycles","Vans"};
                int[] cost = {10,20,50,100};
                byte[] vehicles_count = {30,50,45,10};

                        System.out.println("Parked Vehicles:");
                for (int index = 0; index < parked_vehicles.length; index++){
                        System.out.println(parked_vehicles[index]);
                }
                        System.out.println("Parking Cost:");
                for (int index = 0; index < cost.length; index++){
                        System.out.println("Cost:"+cost[index]);
                }
                        System.out.println("Vechicles Count:");
                for (int index = 0; index < vehicles_count.length; index++){
                        System.out.println(vehicles_count[index]);
                }
        }
}