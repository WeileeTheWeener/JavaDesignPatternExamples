package gameattacksystem_strategyandsingletonpattern;

public class Bow implements Attacker, Equipable
{
    private int damage;
    private String name;

    public Bow(String name, int damage)
    {
        this.name = name;
        this.damage = damage;
    }

    @Override
    public void attack(Damageable target) {
    	
    	if(target == null) return;
    	
        System.out.println("Bow " + name + " does " + damage + " damage.");
        target.takeDamage(damage);
    }

    @Override
    public void equip(Character character)
    {
    	if(character == null) return;
    	
        System.out.println(character.getName() +" equipped a bow!");
    }
}