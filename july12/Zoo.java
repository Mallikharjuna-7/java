public class Zoo{

        public static void zooDetails(){
        System.out.println("ZOO DETAILS:");
        Zoo.list_of_mamals();
        }
        public static void list_of_mamals(){
        System.out.println("LIST OF MAMALS:");
        System.out.println("Lion");
        System.out.println("Elephant");
        System.out.println("Giraffe");
        System.out.println("Kangaroo");
        Zoo.list_of_birds();
        }
        public static void list_of_birds(){
        System.out.println("LIST OF BIRDS:");
        System.out.println("Eagle");
        System.out.println("Parrot");
        System.out.println("Ostrich");
        System.out.println("Flemingo");
        Zoo.list_of_reptiles();
        }
        public static void list_of_reptiles(){
        System.out.println("LIST OF REPTILES:");
        System.out.println("Crocodile");
        System.out.println("Snake");
        System.out.println("Turtle");
        System.out.println("Lizard");
        Zoo.list_of_aquatics();
        }
        public static void list_of_aquatics(){
        System.out.println("LIST OF AQUATICS:");
        System.out.println("Shark");
        System.out.println("Clown Fish");
        System.out.println("Star Fish");
        System.out.println("Stingray");
        System.out.println("Seahorse");
        }
}