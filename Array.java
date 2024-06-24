public class Array {
        public static void main(String args[]) {

                String[] cricket_teams = {"India","Australia","Newzealand","England","South Africa"};
                int[] scores_in_innings = {196,135,100,140,189};
                byte[] wickets_in_innings = {2,7,5,9,3};
                short[] sixes_in_innings = {14,6,9,2,11};
                long[] stadiums_capacities = {132000L,114000L,107601L,106572L,100024L,102733L};
                double[] players_strike_rates = {224.39,107.14,193.75,127.27,158.82};
                float[] required_run_rates = {7.0f,8.9f,15.2f,10.7f,3.5f};
                boolean[] match_wins = { true,false,true,true,false };
                char[] toss_wins = {'W','L','L','W','W'};


                        System.out.println("No of Cricket teams:"+cricket_teams.length);
                for (int i = 0; i < cricket_teams.length; i++){
                        System.out.println("Country Name:"+cricket_teams[i]);
                }
                        System.out.println("No of Innings:"+scores_in_innings.length);
                for (int i = 0; i < scores_in_innings.length; i++){
                        System.out.println("Scores:"+scores_in_innings[i]);
                }
                        System.out.println("No of Innings:"+wickets_in_innings.length);
                for (int i = 0; i < wickets_in_innings.length; i++){
                        System.out.println("Wickets in Inning:"+wickets_in_innings[i]);
                }
                        System.out.println("No of Innings:"+sixes_in_innings.length);
                for (int i = 0; i < sixes_in_innings.length; i++){
                        System.out.println("Sixes in Inning:"+sixes_in_innings[i]);
                }
                        System.out.println("No of Stadiums:"+stadiums_capacities.length);
                for (int i = 0; i < stadiums_capacities.length; i++){
                        System.out.println("Stadium capacity:"+stadiums_capacities[i]);
                }
                        System.out.println("No of Players StrikeRates:"+players_strike_rates.length);
                for (int i = 0; i < players_strike_rates.length; i++){
                        System.out.println("Player StrikeRate:"+players_strike_rates[i]);
                }
                        System.out.println("No of Req.RunRates:"+required_run_rates.length);
                for (int i = 0; i < required_run_rates.length; i++){
                        System.out.println("Req.RunRate:"+required_run_rates[i]);
                }
                        System.out.println("No of Matches:"+match_wins.length);
                for (int i = 0; i < match_wins.length; i++){
                        System.out.println("Match Result:"+match_wins[i]);
                }
                        System.out.println("No of Matches:"+toss_wins.length);
                for (int i = 0; i < toss_wins.length; i++){
                        System.out.println("Toss Result:"+toss_wins[i]);
                }

        }
}