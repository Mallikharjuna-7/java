public class Crickett {

        public static void run_rate(String name, int score){
                System.out.println("Player Name:"+name);
                System.out.println("Player Score:"+score);
                int no_of_balls = 59;
                System.out.println("No of Balls Played:"+no_of_balls);
                double runRate = (score*100)/no_of_balls;
                System.out.println("Player RunRate:"+runRate); 
        }
        public static void match_result(String result){
                System.out.println("Match Result:"+result);
        }
        public static void players(String p1,String p2,String p3,String p4,String p5,String p6,String p7,String p8,String p9,String p10,String p11){
                System.out.println("11 Players:");
                System.out.println("1:"+p1);
                System.out.println("2:"+p2);
                System.out.println("3:"+p3);
                System.out.println("4:"+p4);
                System.out.println("5:"+p5);
                System.out.println("6:"+p6);
                System.out.println("7:"+p7);
                System.out.println("8:"+p8);
                System.out.println("9:"+p9);
                System.out.println("10:"+p10);
                System.out.println("11:"+p11);
        }
        public static void details(String name,int age,int height,int weight, String education,int no_of_matches, int score){
                System.out.println("Player Name:"+name);
                System.out.println("Player Age:"+age+"years");
                System.out.println("Player Height:"+height+"c.m");
                System.out.println("Player Weight:"+weight+"Kg");
                System.out.println("Player Education:"+education);
                System.out.println("No.of.Matches Played :"+no_of_matches+"matches");
                System.out.println("Total Runs:"+score+"runs");
        }
 
}