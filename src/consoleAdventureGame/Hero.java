package consoleAdventureGame;
import util.Input;

public class Hero extends AdventureGame {
    Input userInput = new Input();
    private String herosName;
    int herosHealth = 100;


    public Hero() {
        this.herosName = userInput.getString("Great, Please enter a name");
    }



    public String showInfo() {
        return "Heros Name: " + herosName + '\n' +
                "Heros Health = " + herosHealth;
    }

    @Override
    public void attack() {
        System.out.println("You decreased enemy's health by 5 points");
    }

    @Override
    public void drinkPotion() {
        System.out.println("You increased your health by 15 points");
    }

    @Override
    public void run() {
        System.out.println("Better luck next time");
    }

    @Override
    public void remainingHealth() {

    }
}
