public class Shop{

        public String shop_names[] = new String[4];
        public int index = 0;

        public int getLength(){
        return shop_names.length;
        }
        public String getCreate(String names){
        System.out.println("Shop Name:"+names);
                if(this.index < this.getLength()){
                shop_names[index] = names;
                index++;
                System.out.println("Array is Not Full");
                }else{
                System.out.println("Array is Full");
                }
                return "Creation";
        }
        public void getRead(){
                for(int index = 0; index < this.getLength(); index++){
                System.out.println(shop_names[index]);
                }
        }
}