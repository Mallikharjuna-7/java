public class Hotel {

        public static void menu(){

                boolean tiffins = true;
                if(tiffins){
                        System.out.println("Tiffins Available");
                }else{
                        System.out.println("Tiffins Not Available");
                }
                boolean meals = true;
                if (meals){
                        System.out.println("Meals Available");
                }else{
                        System.out.println("Meals Not Available");
                }
                boolean snacks = true;
                if (snacks){
                        System.out.println("Snacks Available");
                }else{
                        System.out.println("Snacks Not Available");
                }
                boolean veg = true;
                if (veg){
                        System.out.println("Veg items Available");
                }else{
                        System.out.println("veg items Not Available");
                }
                boolean non_veg = true;
                if (non_veg){
                        System.out.println("Non Veg Available");
                }else{
                        System.out.println("Non Veg Not Available");
                }
        } 
        public static void items(){

                int tea = 10;
                if (tea <= 10){
                        System.out.println("Tea cost is Low");
                }else{
                        System.out.println("Tea Cost is High");
                }
                int dosa = 60;
                if (dosa <= 60){
                        System.out.println("Tiffins cost is Low");
                }else{
                        System.out.println("Tiffins Cost is High");
                }
                int meals = 100;
                if (meals <= 100){
                        System.out.println("Meals Cost is 100");
                }else{
                        System.out.println("Meals cost is High");
                }
                boolean biryani = true;
                if (biryani){
                        System.out.println("Biryani taste is Good");
                }else{
                        System.out.println("Biryani taste is Good");
                }
                int biryanii = 300;
                if (biryanii == 300){
                        System.out.println("Biryani cost is :300");
                }else{
                        System.out.println("biryani not available");
                }
        }
        public static void price(){

                boolean upi = true;
                if (upi){
                        System.out.println("UPI is available");
                }else{
                        System.out.println("UPI is not available");
                }
                int daily_customers = 2000;
                if (daily_customers >= 1000){
                        System.out.println("Hotel is Rush");
                }else{
                        System.out.println("Hotel is not Rush");
                }
                boolean clean = true;
                if (clean){
                        System.out.println("Hotel is Hygine");
                }else{
                        System.out.println("hotel is Not Hygine");
                }
                boolean quality = true;
                if (quality){
                        System.out.println("Food Quality is Good");
                }else{
                        System.out.println("Food Quality is Not Good");
                }
                double rating = 4.5;
                if (rating >= 3 ){
                        System.out.println("Rating was not Good");
                }else{
                        System.out.println("rating Was good");
                }
        }
}