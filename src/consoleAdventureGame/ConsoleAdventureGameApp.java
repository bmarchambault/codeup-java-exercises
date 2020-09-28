package consoleAdventureGame;

import util.Input;

public class ConsoleAdventureGame {
    public static void main(String[] args) {
        Input userInput = new Input();
       boolean confirmPlay;


        //ask if the user is ready to start
        //ask user for their name
        //hero - display enemy stats and hero stats: example - health, attack,
        //hero actions:  attack - decreases enemy health, drink potion - add to hero health, run - ends the game;
        //keep asking for user input until enemy health is

        confirmPlay = userInput.yesNo("Would you like to play a role player game? ");
//        System.out.println(playGame);
        if (confirmPlay) {
            Hero hero = new Hero();
            System.out.println(hero);
        } else {
            System.out.println("Maybe next time");
        }

    }


}

