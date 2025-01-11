package ecommercesystem_observerpattern;

public class User implements Observer {
    
    private String name;
    private Cart cart;
    private int id;
    
    public User(String name) {
        this.name = name;
        this.cart = new Cart();
        id = (int) (Math.random() * 10000);
        System.out.println("User named " + name + " has id " + id);
    }
    
    public void addProductToCart(Product product) {
        cart.addProduct(product);
        System.out.println(name + " added " + product.getName() + " to cart");
    }
    
    public void subscribeToDiscountNotification(Product product)
    {
        //Add listeners
        product.setSubject(new DiscountAvailableSubject());
        product.getSubject().addObserver(this, product.getDiscountObservers());   
    }
    
    public void unsubscribeFromDiscountNotification(Product product)
    {
        //Remove listeners
        product.setSubject(new DiscountAvailableSubject());
        product.getSubject().removeObserver(this, product.getDiscountObservers());
    }
    
    public void subscribeToStockAvailableNotification(Product product)
    {
        //Add listeners
        product.setSubject(new StockAvailableSubject());
        product.getSubject().addObserver(this, product.getStockAvailableObservers());     
    }
    
    public void unsubscribeFromStockAvailableNotification(Product product)
    {      
    	//Remove listeners
        product.setSubject(new StockAvailableSubject());
        product.getSubject().removeObserver(this, product.getStockAvailableObservers());
    }
    
    public void checkoutCart()
    {
    	System.out.println(name + " is checking out cart for total price of " + cart.getTotalPrice());
    	cart.checkout();
    }
    
    public void printCart()
    {
    	cart.printCart();
    }
    
    public String getName() {
        return name;
    }
     
	@Override
	public void Update() {
		System.out.println("User with name " + name + " notified.");	
	}
    
}
