public class Products{

        public String product1;
        public double product1_price;
        public String product2;
        public double product2_price;
        public String product3;
        public double product3_price;
        public String product4;
        public double product4_price;
        public String product5;
        public double product5_price;
        public String product6;
        public double product6_price;
        public String product7;
        public double product7_price;
        public String product8;
        public double product8_price;
        public String product9;
        public double product9_price;
        public String product10;
        public double product10_price;


        public Products(){.
        
        System.out.println("No arguments constructor");
        System.out.println("Product Details:");
        }

        public Products(String product1,double product1_price,String product2,double product2_price,String product3,double product3_price,String product4,double product4_price,
        String product5,double product5_price,String product6,double product6_price,String product7,double product7_price,String product8,double product8_price,
        String product9,double product9_price,String product10,double product10_price){
        this.product1 = product1;
        this.product1_price = product1_price;
        this.product2 = product2;
        this.product2_price = product2_price;
        this.product3 = product3;
        this.product3_price = product3_price;
        this.product4 = product4;
        this.product4_price = product4_price;
        this.product5 = product5;
        this.product5_price = product5_price;
        this.product6 = product6;
        this.product6_price = product6_price;
        this.product7 = product7;
        this.product7_price = product7_price;
        this.product8 = product8;
        this.product8_price = product8_price;
        this.product9 = product9;
        this.product9_price = product9_price;
        this.product10 = product10;
        this.product10_price = product10_price;
        

        System.out.println("Product 1 Name:"+product1);
        System.out.println("Product 1 Price:"+product1_price);
        double p1_discount;
        double p1_price_after_discount;
                if(product1 == "Laptop"){
                p1_discount = product1_price*0.20;
                System.out.println("Discount:"+p1_discount);
                p1_price_after_discount = product1_price - p1_discount; 
                System.out.println("Product 1 Price After Discount:"+p1_price_after_discount);
                }
        System.out.println("Product 2 Name:"+product2);
        System.out.println("Product 2 Price:"+product2_price);
        double p2_discount;
        double p2_price_after_discount;
                if(product2 == "Plants"){
                p2_discount = product2_price*0.10;
                System.out.println("Discount:"+p2_discount);
                p2_price_after_discount = product2_price - p2_discount; 
                System.out.println("Product 2 Price After Discount:"+p2_price_after_discount);
                }
        System.out.println("Product 3 Name:"+product3);
        System.out.println("Product 3 Price:"+product3_price);
        double p3_discount;
        double p3_price_after_discount;
                if(product3 == "Chair"){
                p3_discount = product2_price*0.04;
                System.out.println("Discount:"+p3_discount);
                p3_price_after_discount = product3_price - p3_discount; 
                System.out.println("Product 3 Price After Discount:"+p3_price_after_discount);
                }
        System.out.println("Product 4 Name:"+product4);
        System.out.println("Product 4 Price:"+product4_price);
        double p4_discount;
        double p4_price_after_discount;
                if(product4 == "Bag"){
                p4_discount = product4_price*0.07;
                System.out.println("Discount:"+p4_discount);
                p4_price_after_discount = product4_price - p4_discount; 
                System.out.println("Product 4 Price After Discount:"+p4_price_after_discount);
                }
        System.out.println("Product 5 Name:"+product5);
        System.out.println("Product 5 Price:"+product5_price);
        double p5_discount;
        double p5_price_after_discount;
                if(product5 == "Pen"){
                p5_discount = product5_price*0.01;
                System.out.println("Discount:"+p5_discount);
                p5_price_after_discount = product5_price - p5_discount; 
                System.out.println("Product 5 Price After Discount:"+p5_price_after_discount);
                }
        System.out.println("Product 6 Name:"+product6);
        System.out.println("Product 6 Price:"+product6_price);
        double p6_discount;
        double p6_price_after_discount;
                if(product6 == "Cloth"){
                p6_discount = product6_price*0.25;
                System.out.println("Discount:"+p6_discount);
                p6_price_after_discount = product6_price - p6_discount; 
                System.out.println("Product 6 Price After Discount:"+p6_price_after_discount);
                }
        System.out.println("Product 7 Name:"+product7);
        System.out.println("Product 7 Price:"+product7_price);
        double p7_discount;
        double p7_price_after_discount;
                if(product7 == "Mobile"){
                p7_discount = product7_price*0.15;
                System.out.println("Discount:"+p7_discount);
                p7_price_after_discount = product7_price - p7_discount; 
                System.out.println("Product 7 Price After Discount:"+p7_price_after_discount);
                }
        System.out.println("Product 8 Name:"+product8);
        System.out.println("Product 8 Price:"+product8_price);
        double p8_discount;
        double p8_price_after_discount;
                if(product8 == "Shoes"){
                p8_discount = product8_price*0.10;
                System.out.println("Discount:"+p8_discount);
                p8_price_after_discount = product8_price - p8_discount; 
                System.out.println("Product 8 Price After Discount:"+p8_price_after_discount);
                }
        System.out.println("Product 9 Name:"+product9);
        System.out.println("Product 9 Price:"+product9_price);
        double p9_discount;
        double p9_price_after_discount;
                if(product9 == "Watch"){
                p9_discount = product9_price*0.18;
                System.out.println("Discount:"+p9_discount);
                p9_price_after_discount = product9_price - p9_discount; 
                System.out.println("Product 9 Price After Discount:"+p9_price_after_discount);
                }
        System.out.println("Product 10 Name:"+product10);
        System.out.println("Product 10 Price:"+product10_price);
        double p10_discount;
        double p10_price_after_discount;
                if(product10 == "Bottle"){
                p10_discount = product10_price*0.09;
                System.out.println("Discount:"+p10_discount);
                p10_price_after_discount = product10_price - p10_discount; 
                System.out.println("Product 10 Price After Discount:"+p10_price_after_discount);
                }

        double total_products_price = product1_price+product2_price+product3_price+product4_price+product5_price+product6_price+
        product7_price+product8_price+product9_price+product10_price;
        System.out.println("Total Products Price:"+total_products_price);

       // double total_products_price_after_discount = p1_price_after_discount+p2_price_after_discount+p3_price_after_discount+p4_price_after_discount+p5_price_after_discount+p6_price_after_discount+p7_price_after_discount+p8_price_after_discount+p9_price_after_discount+p10_price_after_discount;
       // System.out.println("Total Products Price After Discounts:"+total_products_price_after_discount);
        }
}