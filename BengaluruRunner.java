public class BengaluruRunner {

        public static void main(String args[]){

                for (int index = 0; index < Bengaluru.city_names.length; index++){
                        if(Bengaluru.name == Bengaluru.city_names[index]){
                                System.out.println("City Name Matched:"+Bengaluru.name);
                        }else{
                                System.out.println("City Name Not Matched");
                        }
                }
        }
}