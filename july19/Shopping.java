public class Shopping {

        public String cloth_brand;
        public String category;
        public String type;
        public short size;
        public String color;
        public String material;
        public int price;
        public int discount;
        public boolean stock;
        public float rating;

        public Shopping(){
        System.out.println("Shopping Details:");
        }
        public Shopping(String cloth_brand){
        this.cloth_brand = cloth_brand;
        System.out.println("Cloth Brand:"+cloth_brand);
        }
        public Shopping(String cloth_brand,String category){
        this.cloth_brand = cloth_brand;
        this.category = category;
        System.out.println("Cloth Brand:"+cloth_brand);
        System.out.println("Category:"+category);
        }
        public Shopping(String cloth_brand,String category,String type){
        this.cloth_brand = cloth_brand;
        this.category = category;
        this.type = type;
        System.out.println("Cloth Brand:"+cloth_brand);
        System.out.println("Category:"+category);
        System.out.println("Type:"+type);
        }
        public Shopping(String cloth_brand,String category,String type,short size){
        this.cloth_brand = cloth_brand;
        this.category = category;
        this.type = type;
        this.size = size;
        System.out.println("Cloth Brand:"+cloth_brand);
        System.out.println("Category:"+category);
        System.out.println("Type:"+type);
        System.out.println("Size:"+size);
        }
        public Shopping(String cloth_brand,String category,String type,short size,String color){
        this.cloth_brand = cloth_brand;
        this.category = category;
        this.type = type;
        this.size = size;
        this.color = color;
        System.out.println("Cloth Brand:"+cloth_brand);
        System.out.println("Category:"+category);
        System.out.println("Type:"+type);
        System.out.println("Size:"+size);
        System.out.println("Color:"+color);
        }
        public Shopping(String cloth_brand,String category,String type,short size,String color,String material){
        this.cloth_brand = cloth_brand;
        this.category = category;
        this.type = type;
        this.size = size;
        this.color = color;
        this.material = material;
        System.out.println("Cloth Brand:"+cloth_brand);
        System.out.println("Category:"+category);
        System.out.println("Type:"+type);
        System.out.println("Size:"+size);
        System.out.println("Color:"+color);
        System.out.println("Material:"+material);
        }
        public Shopping(String cloth_brand,String category,String type,short size,String color,String material,int price){
        this.cloth_brand = cloth_brand;
        this.category = category;
        this.type = type;
        this.size = size;
        this.color = color;
        this.material = material;
        this.price = price;
        System.out.println("Cloth Brand:"+cloth_brand);
        System.out.println("Category:"+category);
        System.out.println("Type:"+type);
        System.out.println("Size:"+size);
        System.out.println("Color:"+color);
        System.out.println("Material:"+material);
        System.out.println("Price:"+price);
        }
        public Shopping(String cloth_brand,String category,String type,short size,String color,String material,int price,int discount){
        this.cloth_brand = cloth_brand;
        this.category = category;
        this.type = type;
        this.size = size;
        this.color = color;
        this.material = material;
        this.price = price;
        this.discount = discount;
        System.out.println("Cloth Brand:"+cloth_brand);
        System.out.println("Category:"+category);
        System.out.println("Type:"+type);
        System.out.println("Size:"+size);
        System.out.println("Color:"+color);
        System.out.println("Material:"+material);
        System.out.println("Price:"+price);
        System.out.println("Discount:"+discount);
        }
        public Shopping(String cloth_brand,String category,String type,short size,String color,String material,int price,int discount,boolean stock){
        this.cloth_brand = cloth_brand;
        this.category = category;
        this.type = type;
        this.size = size;
        this.color = color;
        this.material = material;
        this.price = price;
        this.discount = discount;
        this.stock = stock;
        System.out.println("Cloth Brand:"+cloth_brand);
        System.out.println("Category:"+category);
        System.out.println("Type:"+type);
        System.out.println("Size:"+size);
        System.out.println("Color:"+color);
        System.out.println("Material:"+material);
        System.out.println("Price:"+price);
        System.out.println("Discount:"+discount);
        System.out.println("Stock Available:"+stock);
        }
        public Shopping(String cloth_brand,String category,String type,short size,String color,String material,int price,int discount,boolean stock,float rating){
        this.cloth_brand = cloth_brand;
        this.category = category;
        this.type = type;
        this.size = size;
        this.color = color;
        this.material = material;
        this.price = price;
        this.discount = discount;
        this.stock = stock;
        this.rating = rating;
        System.out.println("Cloth Brand:"+cloth_brand);
        System.out.println("Category:"+category);
        System.out.println("Type:"+type);
        System.out.println("Size:"+size);
        System.out.println("Color:"+color);
        System.out.println("Material:"+material);
        System.out.println("Price:"+price);
        System.out.println("Discount:"+discount);
        System.out.println("Stock Available:"+stock);
        System.out.println("Rating:"+rating);
        }
}