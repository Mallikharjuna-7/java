public class FoodItemRunner{
        public static void main(String[] args){
        System.out.println(FoodItem.itemDetails());
        System.out.println(FoodItem.itemDetails("Cake"));
        System.out.println(FoodItem.itemDetails("Cake","Bakery"));
        System.out.println(FoodItem.itemDetails("Cake","Bakery",299.00));
        System.out.println(FoodItem.itemDetails("Cake","Bakery",299.00,600));
        System.out.println(FoodItem.itemDetails("Cake","Bakery",299.00,600,"11/6/2024"));
        System.out.println(FoodItem.itemDetails("Cake","Bakery",299.00,600,"11/6/2024",1555));
        System.out.println(FoodItem.itemDetails("Cake","Bakery",299.00,600,"11/6/2024",1555,false));
        }
}
