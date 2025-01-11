package ecommercesystem_observerpattern;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    
    private Map<Product, Integer> products;
    private double totalPrice;
    
    
    public Cart() {
        this.products = new HashMap<Product,Integer>();
     }
    
    public void addProduct(Product product) 
    {
    
    	if(products.containsKey(product))
    	{
    		products.put(product, products.get(product) + 1);
    	}
    	else 
    	{
    		products.put(product, 1);
    	}
        
        totalPrice += product.getPrice();
    }
    
    public void removeProduct(Product product) {
    	
    	if(products.containsKey(product))
    	{
    		products.put(product, products.get(product) - 1);
    		
    		if(products.get(product) == 0)
    		{
    			products.remove(product);
    		}
    	}
    	
        totalPrice -= product.getPrice();
    }
    
    public Map<Product,Integer> getProducts() {
        return products;
    }
    
    public void clear() {
        products.clear();
    }
    
    public double getTotalPrice() {
        return totalPrice;
    }

    public void printCart()
    {
    	for (Product product : products.keySet()) {
			System.out.println(product);
		}
    }
    
    public void checkout()
    {
    	for (Product product : products.keySet()) {
			product.setStock(product.getStock() - 1);
		}
    	
    	products.clear();
    	totalPrice = 0;
    }
}
