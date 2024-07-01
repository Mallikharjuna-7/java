public class Dmart {

        public static void perfumes(int price){
                
                //10% Discount on Perfumes
                double discount = 0.10;
                String product = "Perfume";

                System.out.println("Product Name:"+product);
                System.out.println("Product Price:"+price);
                double discount_price = price*discount;
                System.out.println("Discount:"+discount_price);
                double total_price = price-discount_price;
                System.out.println("Final Price:"+total_price);
                
        }
        public static void groceries(int price){
                
                //8% Discount on Groceries
                double discount = 0.08;
                String product = "Groceries";

                System.out.println("Product Name:"+product);
                System.out.println("Product Price:"+price);
                double discount_price = price*discount;
                System.out.println("Discount:"+discount_price);
                double total_price = price-discount_price;
                System.out.println("Final Price:"+total_price);
                
        }
        public static void vegitables(int price){
                
                //12% Discount on Vegitables
                double discount = 0.12;
                String product = "Vegitables";

                System.out.println("Product Name:"+product);
                System.out.println("Product Price:"+price);
                double discount_price = price*discount;
                System.out.println("Discount:"+discount_price);
                double total_price = price-discount_price;
                System.out.println("Final Price:"+total_price);
                
        }
        public static void personal_care(int price){
                
                //15% Discount on Personal Care
                double discount = 0.15;
                String product = "Personal Care";

                System.out.println("Product Name:"+product);
                System.out.println("Product Price:"+price);
                double discount_price = price*discount;
                System.out.println("Discount:"+discount_price);
                double total_price = price-discount_price;
                System.out.println("Final Price:"+total_price);
                
        }
        public static void household(int price){
                
                //18% Discount on Household Products
                double discount = 0.18;
                String product = "Household Essentials";

                System.out.println("Product Name:"+product);
                System.out.println("Product Price:"+price);
                double discount_price = price*discount;
                System.out.println("Discount:"+discount_price);
                double total_price = price-discount_price;
                System.out.println("Final Price:"+total_price);
                
        }
}