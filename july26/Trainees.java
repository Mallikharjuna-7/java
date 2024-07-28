public class Trainees{

        public String trainee_names[] = new String[4];
        public int index = 0;

        public int getArrayLength(){
        return trainee_names.length;
        }
        public String saveTraineeNames(String t_name){
                System.out.println("Trainee Name:"+t_name);
                if(this.index < this.getArrayLength()){
                trainee_names[index] = t_name;
                index++;
                System.out.println("Array length is Not Full");
                }else{
                System.out.println("Array length is Full");
                }
                return "======== Save operaion is done ========";
        }
        public void printTraineeNames(){
                for(int index = 0; index < getArrayLength(); index++){
                System.out.println("Trainee Name:"+trainee_names[index]);
                }
        }
        public String updateTraineeName(String oldName, String newName){
                for(int index = 0; index < getArrayLength(); index++){
                        if(trainee_names[index] == oldName){
                        trainee_names[index] = newName;
                        return "Update operation done Successfully";
                        }
                }
                return "Not Updated";
        }
        public String deleteTraineeName(String d_name){
                for(int index = 0; index < getArrayLength(); index++){
                        if(trainee_names[index] == d_name){
                        trainee_names[index] = null;
                        return "Delete operation done Successfully";
                        }
                }
                return "Not deleted";
        }
        public String searchTraineeName(String search_name){
                for(String name : trainee_names){
                        if(name == search_name){
                        return "Searched name Found:"+search_name;
                        }
                }
                return "Name Not found";
        }
}