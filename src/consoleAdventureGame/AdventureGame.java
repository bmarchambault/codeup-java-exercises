package consoleAdventureGame;

public abstract class AdventureGame {

    int attack = 5;
    int defend = 3;
    int potion = 15;
    int remainingHeath;

    public abstract void attack();
//    public void defend(){};
    public abstract void drinkPotion();
    public abstract void run();
    public abstract void remainingHealth ();
}
