package gameattacksystem_strategypattern;

public class Test {
    
    Sword sword = new Sword("Iron Sword", 25);
    Bow bow = new Bow("Long Bow", 15);
    Bow legendaryBow = new Bow("Legendary Bow", 80);
    Unarmed unarmed = new Unarmed(5);

    Player player = new Player("Dragonborn", sword);
    Enemy enemy = new Enemy("Bandit", bow);

    public static void main(String[] args) {
        Test test = new Test();
        
        test.player.attack(test.enemy);
        test.enemy.attack(test.player);

        //player changes to a bow
        test.player.equip(test.legendaryBow);
        test.player.attack(test.enemy);
        test.enemy.attack(test.player);      

        //job done, player goes back to fists
        test.player.equip(test.unarmed);
    }
}
