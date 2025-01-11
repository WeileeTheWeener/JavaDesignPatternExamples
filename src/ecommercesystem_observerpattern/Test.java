package ecommercesystem_observerpattern;

public class Test {
    
    User user1 = new User("Veli Emre");
    User user2 = new User("Boğaçhan");

    Product laptopProduct = new Product("Gaming Laptop", 30000, ProductCategory.ELECTRONICS, 1);
    Product bookProduct = new Product("Philosophy Book", 150, ProductCategory.BOOKS, 2);
    
    public static void main(String[] args) {
    	
        Test test = new Test();
        
        //Simulation without subscribing
        /*test.user1.addProductToCart(test.laptopProduct);
        test.user1.addProductToCart(test.bookProduct);
        test.user2.addProductToCart(test.laptopProduct);
             
        test.laptopProduct.setDiscountAvailable(true);
        
        test.user1.printCart(); 
        
        test.user1.checkoutCart();
        
        test.laptopProduct.setStock(1);
        
        System.out.println("************************************");*/
        
        //Simulation with subscribing        
        test.user1.subscribeToDiscountNotification(test.laptopProduct);     
        test.laptopProduct.setDiscountAvailable(true);
        
        test.user1.addProductToCart(test.laptopProduct);
        test.user2.addProductToCart(test.bookProduct);
      
        test.user1.printCart(); 
        
        test.user1.checkoutCart();
        test.user2.checkoutCart();
        
        test.user2.subscribeToStockAvailableNotification(test.bookProduct);
        
        test.bookProduct.setStock(1);
    }
}
