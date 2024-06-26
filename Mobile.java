public class Mobile {

        public static void main(String args[]){

                String[] mobile_brands = {"Apple","Samsung","Oneplus","Realme"};
                long[] prices = {90000L,124000L,450000L,250000L};
                int[] strorages = {64,128,256,128};

                        System.out.println("Mobile Brand Names:");
                for (int index=0; index < mobile_brands.length; index++){
                        System.out.println("Mobile Brand:"+mobile_brands[index]);
                }
                        System.out.println("Mobile Prices:");
                for (int index=0; index < prices.length; index++){
                        System.out.println("Price:"+prices[index]);
                }
                        System.out.println("Mobile Storages:");
                for (int index=0; index < strorages.length; index++){
                        System.out.println("Storage:"+strorages[index]);
                }
        }
}