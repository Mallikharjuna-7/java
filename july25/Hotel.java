public class Hotel{

        public int food_prices[] = new int[5];
        public int index = 0;

        public int getLength(){
        return food_prices.length;
        }
        public String getCreate(int prices){
        System.out.println("Food Price:"+prices);
                if(this.index < this.getLength()){
                food_prices[index] = prices;
                index++;
                System.out.println("Array is Not Full");
                }else{
                System.out.println("Array is Full");
                }
                return "Creation";
        }
        public void getRead(){
                for(int index = 0; index < this.getLength(); index++){
                System.out.println(food_prices[index]);
                }
        }
}