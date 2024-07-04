public class SpicesRunner {

    public static void main(String[] args) {
        Spices.spiceID();
        Spices.toChef("Gordon Ramsay");
        Spices.toDish();
        String[] details = {"Organic", "Non-GMO", "Fresh"};
        Spices.spiceDetails(details);
    }
}