public class RealEstateRunner {

    public static void main(String[] args) {
        RealEstate.propertyID();
        RealEstate.toBuyer("John Doe");
        RealEstate.toLocation();
        String[] features = {"Swimming Pool", "Gym", "Parking", "Garden"};
        RealEstate.propertyDetails(features);
    }
}