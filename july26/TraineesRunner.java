public class TraineesRunner{

        public static void main(String args[]){

        Trainees aboutTrainee = new Trainees();

        aboutTrainee.saveTraineeNames("Mallikharjun");
        aboutTrainee.saveTraineeNames("Ganesh");
        aboutTrainee.saveTraineeNames("Jhenkhar");
        aboutTrainee.saveTraineeNames("Vinay");
        aboutTrainee.saveTraineeNames("Santhosh");

        aboutTrainee.printTraineeNames();

        String updateResult = aboutTrainee.updateTraineeName("Ganesh","Gowtham");
        System.out.println("Update Result:"+updateResult);
        aboutTrainee.printTraineeNames();

        String deleteResult = aboutTrainee.deleteTraineeName("Mallikharjun");
        System.out.println("Delete Result:"+deleteResult);
        aboutTrainee.printTraineeNames();

        String searchResult = aboutTrainee.searchTraineeName("Vinay");
        System.out.println("Search Result:"+searchResult);
        }
        
}