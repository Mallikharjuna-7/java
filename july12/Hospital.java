public class Hospital {

        public static String hospitalName = "Govt Hospital";
        public static int totalBeds = 300;
        public static int doctors = 50;
        public static float rating = 4.5f;

        public static void getDetails() {
        String specialty = "Cardiology";
        System.out.println("Specialty:"+specialty);
        long annualPatients = 20000L;
        System.out.println("Annual Patients:"+annualPatients);
        String chiefDoctor = "Dr.Smith";
        System.out.println("Chief Doctor:"+chiefDoctor);
        String location = "Kakinada";
        System.out.println("Location:"+location);
        }
        public static void setFoundationYear(int year, long revenue) {
        int foundationYear = year;
        System.out.println("Foundation Year:"+foundationYear);
        long annualRevenue = revenue;
        System.out.println("Annual Revenue:"+annualRevenue);
        }
}