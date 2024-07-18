public class UberRunner{

        public static void main(String args[]){

        Uber Uber = new Uber();
        Uber getFb1 = new Uber("Ramesh");
        Uber getFb2 = new Uber("Ramesh","KR Puram");
        Uber getFb3 = new Uber("Ramesh","KR Puram","BTM");
        Uber getFb4 = new Uber("Ramesh","KR Puram","BTM",(short)3);
        Uber getFb5 = new Uber("Ramesh","KR Puram","BTM",(short)3,"Electric");
        Uber getFb6 = new Uber("Ramesh","KR Puram","BTM",(short)3,"Electric","45 min");
        Uber getFb7 = new Uber("Ramesh","KR Puram","BTM",(short)3,"Electric","45 min",19);
        Uber getFb8 = new Uber("Ramesh","KR Puram","BTM",(short)3,"Electric","45 min",19,370);
        Uber getFb9 = new Uber("Ramesh","KR Puram","BTM",(short)3,"Electric","45 min",19,370,true);
        Uber getFb10 = new Uber("Ramesh","KR Puram","BTM",(short)3,"Electric","45 min",19,370,true,48);
        }
}