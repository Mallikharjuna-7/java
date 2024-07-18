public class EarpodsRunner{

        public static void main(String args[]){

        Earpods Earpods = new Earpods();

        String popular_brands[] = {"Oneplus","JBL","Sony","Samsung","Realme"};
        Earpods getEarpods = new Earpods("Boat","Immortal 131",(short)48,1500,4.3f,popular_brands);
        Earpods getEarpods1 = new Earpods("Noise","Trance",(short)45,999,3.9f,popular_brands);
        Earpods getEarpods2 = new Earpods("Boult","Astra",(short)56,1800,4.4f,popular_brands);
        Earpods getEarpods3 = new Earpods("Nothing","Ear 2",(short)36,1300,4.1f,popular_brands);

        }
}