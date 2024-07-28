public class SSCRunner{

        public static void main(String args[]){

        SSC result = new SSC();

        result.saveMarks(89);
        result.saveMarks(92);
        result.saveMarks(71);
        result.saveMarks(81);
        result.saveMarks(79);
        result.saveMarks(83);

        result.printMarks();

        String updateStatus = result.updateMarks(81,88);
        System.out.println("Update Status; "+updateStatus);
        result.printMarks();

        String deleteStatus = result.deleteMarks(71);
        System.out.println("Delete Status: "+deleteStatus);
        result.printMarks();

        String searchStatus = result.searchMarks(89);
        System.out.println("Search Status: "+searchStatus);
        }
}