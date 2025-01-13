package gameattacksystem_strategyandsingletonpattern;

public class Player implements Attacker, Damageable, Character {
    
    private String name;
    private float health;

    //Strategy pattern
    private Attacker attacker;
        
    public Player(String name, Attacker initialWeapon) {
        this.name = name;
        this.health = 100;  
        this.attacker = initialWeapon;  
    }

    @Override
    public void attack(Damageable target) {
        
    	if(target == null) return;
    	
    	if(health > 0) {
            System.out.println("Player " + name + " attacks to " + target);
            attacker.attack(target);
        }  
    }

    @Override
    public void takeDamage(float damage) {

        if(health - damage > 0) {
            health -= damage;
            System.out.println("Player " + name + " takes " + damage + " damage!"); 
            System.out.println("Player " + name + " has " + health + " health left.");
        }
        else {
            System.out.println("Player " + name + " is dead!");
            health = 0;
        }
        
    }

    public void equip(Attacker attacker) {
        
    	if(attacker == null) return;
    	
        if(attacker instanceof Equipable) {
            ((Equipable) attacker).equip(this);
            this.attacker = attacker;
        }    
    }

    @Override
    public String getName() {
        return name;
    }
}