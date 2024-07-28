public class SubjectsRunner{

        public static void main(String args[]){

        Subjects aboutSubject = new Subjects();

        aboutSubject.saveSubjects("Telugu");
        aboutSubject.saveSubjects("English");
        aboutSubject.saveSubjects("Hindi");
        aboutSubject.saveSubjects("Physics");
        aboutSubject.saveSubjects("Maths");
        aboutSubject.saveSubjects("Social");

        aboutSubject.printSubjects();

        String upadteStatus = aboutSubject.updateSubject("Physics","Sceince");
        System.out.println("Update Status: "+upadteStatus);
        aboutSubject.printSubjects();

        String deleteStatus = aboutSubject.deleteSubject("Hindi");
        System.out.println("Delete Status: "+deleteStatus);
        aboutSubject.printSubjects();

        String searchStatus = aboutSubject.searchSubject("Telugu");
        System.out.println("Search Status: "+searchStatus);
        }
}