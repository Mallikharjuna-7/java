public class HospitalRunner{

        public static void main(String[] args) {
        System.out.println("Hospital Name:"+Hospital.hospitalName);
        System.out.println("Total Beds:"+Hospital.totalBeds);
        System.out.println("Doctors:"+Hospital.doctors);
        System.out.println("Rating:"+Hospital.rating+"stars");

        Hospital.getDetails();
        Hospital.setFoundationYear(1992, 7000000L);
    }
}