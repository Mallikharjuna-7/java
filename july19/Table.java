public class Table {

        public String table_name;
        public String category;
        public String type;
        public short no_of_chairs;
        public String color;
        public String material;
        public int price;
        public int discount;
        public boolean stock;
        public float rating;

        public Table(){
        System.out.println("Table Details:");
        }
        public Table(String table_name){
        this.table_name = table_name;
        System.out.println("Table Brand:"+table_name);
        }
        public Table(String table_name,String category){
        this.table_name = table_name;
        this.category = category;
        System.out.println("Table Brand:"+table_name);
        System.out.println("Category:"+category);
        }
        public Table(String table_name,String category,String type){
        this.table_name = table_name;
        this.category = category;
        this.type = type;
        System.out.println("Table Brand:"+table_name);
        System.out.println("Category:"+category);
        System.out.println("Type:"+type);
        }
        public Table(String table_name,String category,String type,short no_of_chairs){
        this.table_name = table_name;
        this.category = category;
        this.type = type;
        this.no_of_chairs = no_of_chairs;
        System.out.println("Table Brand:"+table_name);
        System.out.println("Category:"+category);
        System.out.println("Type:"+type);
        System.out.println("no_of_chairs:"+no_of_chairs);
        }
        public Table(String table_name,String category,String type,short no_of_chairs,String color){
        this.table_name = table_name;
        this.category = category;
        this.type = type;
        this.no_of_chairs = no_of_chairs;
        this.color = color;
        System.out.println("Table Brand:"+table_name);
        System.out.println("Category:"+category);
        System.out.println("Type:"+type);
        System.out.println("no_of_chairs:"+no_of_chairs);
        System.out.println("Color:"+color);
        }
        public Table(String table_name,String category,String type,short no_of_chairs,String color,String material){
        this.table_name = table_name;
        this.category = category;
        this.type = type;
        this.no_of_chairs = no_of_chairs;
        this.color = color;
        this.material = material;
        System.out.println("Table Brand:"+table_name);
        System.out.println("Category:"+category);
        System.out.println("Type:"+type);
        System.out.println("no_of_chairs:"+no_of_chairs);
        System.out.println("Color:"+color);
        System.out.println("Material:"+material);
        }
        public Table(String table_name,String category,String type,short no_of_chairs,String color,String material,int price){
        this.table_name = table_name;
        this.category = category;
        this.type = type;
        this.no_of_chairs = no_of_chairs;
        this.color = color;
        this.material = material;
        this.price = price;
        System.out.println("Table Brand:"+table_name);
        System.out.println("Category:"+category);
        System.out.println("Type:"+type);
        System.out.println("no_of_chairs:"+no_of_chairs);
        System.out.println("Color:"+color);
        System.out.println("Material:"+material);
        System.out.println("Price:"+price);
        }
        public Table(String table_name,String category,String type,short no_of_chairs,String color,String material,int price,int discount){
        this.table_name = table_name;
        this.category = category;
        this.type = type;
        this.no_of_chairs = no_of_chairs;
        this.color = color;
        this.material = material;
        this.price = price;
        this.discount = discount;
        System.out.println("Table Brand:"+table_name);
        System.out.println("Category:"+category);
        System.out.println("Type:"+type);
        System.out.println("no_of_chairs:"+no_of_chairs);
        System.out.println("Color:"+color);
        System.out.println("Material:"+material);
        System.out.println("Price:"+price);
        System.out.println("Discount:"+discount);
        }
        public Table(String table_name,String category,String type,short no_of_chairs,String color,String material,int price,int discount,boolean stock){
        this.table_name = table_name;
        this.category = category;
        this.type = type;
        this.no_of_chairs = no_of_chairs;
        this.color = color;
        this.material = material;
        this.price = price;
        this.discount = discount;
        this.stock = stock;
        System.out.println("Table Brand:"+table_name);
        System.out.println("Category:"+category);
        System.out.println("Type:"+type);
        System.out.println("no_of_chairs:"+no_of_chairs);
        System.out.println("Color:"+color);
        System.out.println("Material:"+material);
        System.out.println("Price:"+price);
        System.out.println("Discount:"+discount);
        System.out.println("Stock Available:"+stock);
        }
        public Table(String table_name,String category,String type,short no_of_chairs,String color,String material,int price,int discount,boolean stock,float rating){
        this.table_name = table_name;
        this.category = category;
        this.type = type;
        this.no_of_chairs = no_of_chairs;
        this.color = color;
        this.material = material;
        this.price = price;
        this.discount = discount;
        this.stock = stock;
        this.rating = rating;
        System.out.println("Table Brand:"+table_name);
        System.out.println("Category:"+category);
        System.out.println("Type:"+type);
        System.out.println("no_of_chairs:"+no_of_chairs);
        System.out.println("Color:"+color);
        System.out.println("Material:"+material);
        System.out.println("Price:"+price);
        System.out.println("Discount:"+discount);
        System.out.println("Stock Available:"+stock);
        System.out.println("Rating:"+rating);
        }
}