public class PoliceStationRunner {

        public static void main(String args[]){
                PoliceStation.inspector();
                PoliceStation.station("Pitapuram Police Station");
                System.out.println(PoliceStation.cases());
                String location[] = {"MainRoad","Pitapuram","EastGodavari dt","Andhra Pradesh"};
                System.out.println(PoliceStation.stationDetails(location));
        }
}