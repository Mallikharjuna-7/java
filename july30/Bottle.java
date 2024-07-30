//create class with 4 properties and make it private,
//assign values and display it..

public class Bottle{

        private String brand;
        private String material;
        private int capacity;
        private String color;
        private int price;

        public void setBrand(String brand){
        this.brand = brand;
        }
        public String getBrand(){
        return this.brand;
        }
        public void setMaterial(String material){
        this.material = material;
        }
        public String getMaterial(){
        return this.material;
        }
        public void setCapacity(int capacity){
        this.capacity = capacity;
        }
        public int getCapacity(){
        return this.capacity;
        }
        public void setColor(String color){
        this.color = color;
        }
        public String getColor(){
        return this.color;
        }
        public void setPrice(int price){
        this.price = price;
        }
        public int getPrice(){
        return this.price;
        }
}