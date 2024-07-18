public class ACRunner{

        public static void main(String args[]){

        AC AC = new AC();

        String top_brands[] = {"LG","Mitsubishi","Samsung","Whirlpool","Voltas"};
        AC getAC = new AC("Godrej","5 in 1",(short)4,31000,1.5f,top_brands);
        AC getAC1 = new AC("Panasonic","7 in 1",(short)5,44990,2.0f,top_brands);
        AC getAC2 = new AC("Lloyed","Split AC",(short)3,33990,1.0f,top_brands);
        AC getAC3 = new AC("IFB","8 in 1",(short)5,39000,1.5f,top_brands);

        }
}