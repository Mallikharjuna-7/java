public class Factory {

        public static void main(String args[]){

                String[] plant_names = {"Steel Plant","Power Plant","Maintanance","Boilers"};
                int[] employees = {1000,2000,1500,1200};
                float[] daily_wages = {500,600,800,550};

                        System.out.println("Plant Names:");
                for (int index = 0; index < plant_names.length; index++){
                        System.out.println(plant_names[index]);
                }
                        System.out.println("Total Employees:");
                for (int index = 0; index < employees.length; index++){
                        System.out.println("Employees:"+employees[index]);
                }
                        System.out.println("Daily Wages:");
                for (int index = 0; index < daily_wages.length; index++){
                        System.out.println(daily_wages[index]);
                }
        }
}