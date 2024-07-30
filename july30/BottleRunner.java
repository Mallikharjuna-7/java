public class BottleRunner{

        public static void main(String args[]){

        Bottle bottle = new Bottle();

        bottle.setBrand("Milton");
        System.out.println("Brand: "+bottle.getBrand());

        bottle.setMaterial("Copper");
        System.out.println("Material: "+bottle.getMaterial());

        bottle.setCapacity(1);
        System.out.println("Capacity: "+bottle.getCapacity()+" Litre");

        bottle.setColor("Coppered color");
        System.out.println("Color: "+bottle.getColor());

        bottle.setPrice(799);
        System.out.println("Price: "+bottle.getPrice());
        }
}