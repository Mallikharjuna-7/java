public class ArrayCount{

        public static void main(String args[]){
        int array[] = {0,1,0,0,1,0,1,0,1};
        int count_0 = 0;
        int count_1 = 0;
                for(int d = 0; d < array.length; d++){
                        if(array[d] == 0 ){
                        count_0++;
                        }else{
                        count_1++;
                        }
                }
        System.out.println("0's count in Array:"+count_0++);
        System.out.println("1's count in Array:"+count_1++);
        }
}