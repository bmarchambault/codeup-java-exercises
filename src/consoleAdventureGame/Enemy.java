package consoleAdventureGame;

public class Enemy extends AdventureGame {
    int enemyHealth = 75;

    public Enemy(int enemyHealth) {
        this.enemyHealth = enemyHealth;
    }

    public int getEnemyHealth() {
        return enemyHealth;
    }

    public void setEnemyHealth(int enemyHealth) {
        this.enemyHealth = enemyHealth;
    }

    @Override
    public void attack() {
        enemyHealth = enemyHealth - attack;
        System.out.println(attack);
    }




    @Override
    public void drinkPotion() {

    }

    @Override
    public void run() {

    }
}
