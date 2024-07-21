public class Weekend{

        public static void main(String args[]){
        String day[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
                for(int index = 0; index < day.length; index++){
                        if(day[index] == "Sunday" || day[index] == "Saturday"){
                        System.out.println(day[index]+" -is Weekend");
                        }else{
                        System.out.println(day[index]+" -is Not Weekend");
                        }
                }
        }
}