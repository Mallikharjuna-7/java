public class Count{

        public static void main(String args[]){
        int array[] = {10,-20,-62,55,-33,70,-99,-43,-88,0};
        int negitive = 0;
        int positive = 0;
                for(int index= 0; index <= array.length-1; index++){
                        if(array[index] < 0){
                        negitive++;
                        System.out.println("Negitive:"+array[index]);
                        }else{
                        positive++;
                        System.out.println("Positive:"+array[index]);
                        }
                }
        System.out.println("Negitive Count:"+negitive);
        System.out.println("Positive Count:"+positive);
        }
}