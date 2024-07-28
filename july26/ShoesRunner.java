public class ShoesRunner{

        public static void main(String args[]){

        Shoes getShoes = new Shoes();

        getShoes.saveShoeBrands("Nike");
        getShoes.saveShoeBrands("Adidas");
        getShoes.saveShoeBrands("Puma");
        getShoes.saveShoeBrands("Campus");
        getShoes.saveShoeBrands("Reebok");
        getShoes.saveShoeBrands("Sparx");

        getShoes.printShoeBrands();

        String updateStatus = getShoes.updateShoeBrand("Campus","Roadster");
        System.out.println("Update Status:"+updateStatus);
        getShoes.printShoeBrands();

        String deleteStatus = getShoes.deleteShoeBrand("Adidas");
        System.out.println("Delete Status:"+deleteStatus);
        getShoes.printShoeBrands();

        String searchStatus = getShoes.searchShoeBrand("Reebok");
        System.out.println("Search Status:"+searchStatus);
        }
}