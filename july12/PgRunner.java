public class PgRunner{

        public static void main(String args[]){
        System.out.println("PG Name:"+Pg.pg_name);
        System.out.println("No of Floors:"+Pg.total_floors);
        System.out.println("No of Rooms:"+Pg.total_rooms);
        System.out.println("Total People in PG:"+Pg.total_people_in_pg);
        Pg.getPG();
        Pg.aboutPG("Bommanahalli",true);
        }
}