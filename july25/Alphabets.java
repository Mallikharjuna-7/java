public class Alphabets{

        public char alphabet[] = new char[12];
        public int index = 0;

        public int getLength(){
        return alphabet.length;
        }
        public String getCreate(char abcd){
        System.out.println("Alphabet :"+abcd);
                if(this.index < this.getLength()){
                alphabet[index] = abcd;
                index++;
                System.out.println("Array is Not Full");
                }else{
                System.out.println("Array is Full");
                }
                return "Creation";
        }
        public void getRead(){
                for(int index = 0; index < this.getLength(); index++){
                System.out.println(alphabet[index]);
                }
        }
}