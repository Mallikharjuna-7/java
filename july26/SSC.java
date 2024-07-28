public class SSC{

        public int ssc_marks[] = new int[6];
        public int index = 0;

        public int getMarksLength(){
        return ssc_marks.length;
        }
        public void saveMarks(int marks){
        System.out.println("Marks:"+marks);
                if(this.index < getMarksLength()){
                ssc_marks[index] = marks;
                index++;
                System.out.println("Array Length NOT FULL");
                }else{
                System.out.println("Array Length FULL");
                }
        }
        public void printMarks(){
                for(int index = 0; index < getMarksLength(); index++){
                System.out.println(ssc_marks[index]);
                }
        }
        public String updateMarks(int oldMarks, int newMarks){
                for(int index = 0; index < getMarksLength(); index++){
                        if(ssc_marks[index] == oldMarks){
                        ssc_marks[index] = newMarks;
                        return "Marks Updated Successfully";
                        } 
                }
                return "Marks Not Updated";
        }
        public String deleteMarks(int delete){
                for(int index = 0; index < getMarksLength(); index++){
                        if(ssc_marks[index] == delete){
                        ssc_marks[index] = 0;
                        return  "Marks deleted Successfully";
                        }
                }
                return "Marks not deleted";
        }
        public String searchMarks(int search){
                for(int marks : ssc_marks){
                        if(marks == search){
                        System.out.println("Search: "+search);
                        return "Marks Found";
                        }
                }
                return "Marks Not Found";
        }
}