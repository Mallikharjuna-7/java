public class Shoes{

        public String shoe_brands[] = new String[5];
        public int index = 0;

        public int getShoeLength(){
        return shoe_brands.length;
        }
        public String saveShoeBrands(String shoe_name){
        System.out.println("Shoe Name:"+shoe_name);
                if(this.index < getShoeLength()){
                shoe_brands[index] = shoe_name;
                index++;
                System.out.println("Array length is NOT FULL");
                }else{
                System.out.println("Array length is FULL");
                }
                return " Shoes Brands Saved ";
        }
        public void printShoeBrands(){
                for(index = 0; index < getShoeLength(); index++){
                System.out.println("- "+shoe_brands[index]);
                }
        }
        public String updateShoeBrand(String oldBrand, String newBrand){
                for(int index = 0; index < getShoeLength(); index++){
                        if(shoe_brands[index] == oldBrand){
                        shoe_brands[index] = newBrand;
                        return "Shoe Brand Updated Sucessfully";
                        }
                }
                return "Shoe Brand Not Updated";
        }
        public String deleteShoeBrand(String deleteBrand){
                for(int index = 0; index < getShoeLength(); index++){
                        if(shoe_brands[index] == deleteBrand){
                        shoe_brands[index] = null;
                        return "Shoe Brand Deleted Successfully";
                        }
                }
                return "Shoe Brand Not Deleted";
        }
        public String searchShoeBrand(String brand){
                for(String name : shoe_brands){
                        if(name == brand){
                        return "Shoe Brand Found:"+brand;
                        }
                }
                return "Brand Not Found";
        }
}