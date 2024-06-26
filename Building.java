public class Building {

        public static void main(String args[]){

                String[] floors = {"Ground Floor","First Floor","Second Floor","Third Floor"};
                int[] room_numbers = {101,201,301,310};
                float[] rent = {6500.0f,7500.0f,8000.0f,7000.0f};

                        System.out.println("Floor Names:");
                for (int index = 0; index < floors.length; index++){
                        System.out.println(floors[index]);
                }
                        System.out.println("Room Numbers:");
                for (int index = 0; index < room_numbers.length; index++){
                        System.out.println("Room No:"+room_numbers[index]);
                }
                        System.out.println("Room Rents:");
                for (int index = 0; index < rent.length; index++){
                        System.out.println(rent[index]);
                }
        }
}