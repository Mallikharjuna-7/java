public class TableRunner{

        public static void main(String args[]){

        Table Table = new Table();
        Table getTableDetails1 = new Table("Dinig Table");
        Table getTableDetails2 = new Table("Dinig Table","Furniture");
        Table getTableDetails3 = new Table("Dinig Table","Furniture","Round Table");
        Table getTableDetails4 = new Table("Dinig Table","Furniture","Round Table",(short)6);
        Table getTableDetails5 = new Table("Dinig Table","Furniture","Round Table",(short)6,"Brown");
        Table getTableDetails6 = new Table("Dinig Table","Furniture","Round Table",(short)6,"Brown","Teak Wood");
        Table getTableDetails7 = new Table("Dinig Table","Furniture","Round Table",(short)6,"Brown","Teak Wood",25000);
        Table getTableDetails8 = new Table("Dinig Table","Furniture","Round Table",(short)6,"Brown","Teak Wood",25000,2000);
        Table getTableDetails9 = new Table("Dinig Table","Furniture","Round Table",(short)6,"Brown","Teak Wood",25000,2000,true);
        Table getTableDetails10 = new Table("Dinig Table","Furniture","Round Table",(short)6,"Brown","Teak Wood",25000,2000,true,4.4f);
        }
}