public class Flight {

        public static void main(String args[]){

                String[] flight_names = {"IndiGo","SpaceJet","AirIndia","Vistara"};
                int[] ticket_cost = {10000,15000,12000,14000};
                String[] flight_time = {"8:00 AM","9:00 PM","10:00 AM","11:00 AM"};

                        System.out.println("flight Names:");
                for (int index = 0; index < flight_names.length; index++){
                        System.out.println(flight_names[index]);
                }
                        System.out.println("Ticket Costs:");
                for (int index = 0; index < ticket_cost.length; index++){
                        System.out.println("Cost:"+ticket_cost[index]);
                }
                        System.out.println("Flight Timings:");
                for (int index = 0; index < flight_time.length; index++){
                        System.out.println("Time:"+flight_time[index]);
                }
        }
}