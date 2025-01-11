package gameattacksystem_strategypattern;

public class Sword implements Attacker,Equipable
{
    private int damage;
    private String name;

    public Sword(String name, int damage)
    {
        this.name = name;
        this.damage = damage;
    }

    @Override
    public void attack(Damageable target) {
        System.out.println("Sword " + name + " does " + damage + " damage.");
        target.takeDamage(damage);
    }

    @Override
    public void equip(Character character)
    {
        System.out.println(character.getName() +" equipped a sword!");
    }
}