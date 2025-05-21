import java.io.IOException;
import java.util.Scanner;

public class Main {

    //currently just using the Main class and main method to test map and player actions
    public static void main(String[] args) throws InterruptedException {
        Scanner SCANNER = new Scanner(System.in);
        
        //initialize first map, creates warrior name ____
        Map firstMap = new Map(8,8);
        CharacterClass w = new Warrior();
        Player playerCharacter = new Player("Jyorin", w);

        //initially display map with player
        firstMap.initializePlayerInGame();
        firstMap.displayMap();

        //temporary loop to test if user enters wasd character will move on screen
        //also this will be turned into a non scanner type of moving once gui is implemented
        while(true){
            firstMap.playerActions(SCANNER,playerCharacter);
            try {
               new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch (IOException e) {}
            firstMap.displayMap();
        }

        

    
    
        //SCANNER.close();
    }


    

}
