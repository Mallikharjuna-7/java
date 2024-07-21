public class Sort{

        public static void main(String args[]){
        int array[] = {3,5,7,9,1,4,6,2,8};
        int temp;
                for(int i = 0; i < array.length; i++){
                        for(int j = i+1; j < array.length; j++){
                                if(array[i] > array[j]){
                                        temp = array[i];
                                        array[i] = array[j];
                                        array[j] = temp;
                                }
                        }
                }
                for(int d = 0; d < array.length; d++){
                System.out.println(array[d]);
                }
        }
}