public class CarNamesRunner {

        public static void main(String args[]){
                        System.out.println("Total Cars:"+CarNames.names.length);
                for(int index = 0; index < CarNames.names.length; index++){
                        System.out.println("Car Name:"+CarNames.names[index]);
                }
        }
}