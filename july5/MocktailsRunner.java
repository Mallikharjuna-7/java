public class MocktailsRunner {

        public static void main(String[] args) {
                Mocktails.drinkID();
                Mocktails.toCustomer("Alice");
                Mocktails.toTableNumber();
                String[] ingredients = {"Mint", "Lemon", "Sugar", "Soda", "Ice"};
                Mocktails.ingredients(ingredients);
        }
}