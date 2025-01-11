package gameattacksystem_strategypattern;

public class Unarmed implements Attacker,Equipable
{
    private float damage;
    
    public Unarmed(float damage)
    {
        this.damage = damage;
    }

    @Override
    public void attack(Damageable target) {
        System.out.println("Attacking with fists for " + damage + " damage.");
        target.takeDamage(damage);
    }

    @Override
    public void equip(Character character)
    {
        System.out.println(character.getName() +" equipped fists!");
    }
}
