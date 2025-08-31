/* Product Inventory
Create a Product class with:
● Instance Variables: productName, price.
● Class Variable: totalProducts (shared among all products).
● Methods:
○ An instance method displayProductDetails() to display the details of a
product.
○ A class method displayTotalProducts() to show the total number of
products created.*/

class Product{
    String productName;
    double price;
    static int totalProducts=0;

    public Product(String productName, double price){
        this.productName= productName;
        this.price= price;
         totalProducts++;
    }
    public void displayProductDetails(){
        System.out.println("Product name = "+ productName);
        System.out.println("Price = "+ price);

    }
    public static void displayTotalProducts(){
        System.out.println("Total number of products ="+totalProducts);
    }

}
public class productDetails {
    public static void main (String args[]){
        Product p1 = new Product("Chips", 50);
        Product p2 = new Product("Dry fruits",500);

        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();


    }
}
