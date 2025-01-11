package ecommercesystem_observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Product {
    
    private String name;
    private double price;
    private ProductCategory category;
    private int stock;
    private boolean discountAvailable;
    
    //Observer pattern with strategy 
    private Subject subject;
    
    private List<Observer> discountObservers = new ArrayList<Observer>();
    private List<Observer> stockAvailableObservers = new ArrayList<Observer>();
    
    public Product(String name, double price, ProductCategory electronics, int stock) {
        this.name = name;
        this.price = price;
        this.category = electronics;
        this.stock = stock;        
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }
    
    public Subject getSubject() {
 		return subject;
 	}
    
    public void setSubject(Subject subject) {
		this.subject = subject;
	}
    
    public int getStock() {
		return stock;
	}
    
    public void setStock(int stock) {
    	
		this.stock = stock;
		
		if(stock > 0 && subject != null)
		{
			notifyStockObservers();
		}
	}
    
    public List<Observer> getDiscountObservers() {
		return discountObservers;
	}
    
    public List<Observer> getStockAvailableObservers() {
		return stockAvailableObservers;
	}
    
    public void notifyDiscountObservers() {
    	String discountMsgString = "Discount available for " + name;
    	subject.notifyObservers(discountObservers, discountMsgString);
    }
    
    public void notifyStockObservers(){
    	String stockMsgString = "Stock available for " + name;
    	subject.notifyObservers(stockAvailableObservers, stockMsgString);
    }
    
    public void setDiscountAvailable(boolean discountAvailable) {
		
    	this.discountAvailable = discountAvailable;
		
		if(discountAvailable && subject != null) {
			notifyDiscountObservers();
		}
	}
    
    @Override
    public String toString() {
        return "Product [name=" + name + ", category=" + category + ", stock=" + stock + ", price=" + price + "]";
    }
    
}
