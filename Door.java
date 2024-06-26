public class Door {

        public static void main(String args[]){

                int[] door_lengths = {5,6,5,6};
                int[] door_widths = {3,4,6,5};
                float[] door_thick = {1.5f,1.7f,2.0f,2.5f};

                        System.out.println("Door Lemgths:");
                for (int index = 0; index < door_lengths.length; index++){
                        System.out.println(door_lengths[index]);
                }
                        System.out.println("Door Widths:");
                for (int index = 0; index < door_widths.length; index++){
                        System.out.println(door_widths[index]);
                }
                        System.out.println("Door Thickness:");
                for (int index = 0; index < door_thick.length; index++){
                        System.out.println(door_thick[index]);
                }
        }
}