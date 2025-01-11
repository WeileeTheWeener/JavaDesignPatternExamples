package gameattacksystem_strategypattern;

public class Enemy implements Attacker, Damageable, Character {
    
    private String name;
    private float health;
    
    //Strategy pattern
    private Attacker attacker;

    public Enemy(String name, Attacker initialWeapon) {
        this.name = name;
        this.health = 100;
        this.attacker = initialWeapon;  
    }
    
    @Override
    public void attack(Damageable target) {
        if(health > 0) {
            System.out.println("Enemy " + name + " attacks to " + target);
            attacker.attack(target);
        }  
    }

    @Override
    public void takeDamage(float damage) {

        if(health - damage > 0) {
            health -= damage;
            System.out.println("Enemy " + name + " takes " + damage + " damage!"); 
            System.out.println("Enemy " + name + " has " + health + " health left.");
        }
        else {
            System.out.println("Enemy " + name + " is dead!");
            health = 0;
        }
        
    }

    @Override
    public String getName() {
        return name;
    }
}