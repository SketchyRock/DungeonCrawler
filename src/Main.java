import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner SCANNER = new Scanner(System.in);
        Map firstMap = new Map(15,15);
        CharacterClass w = new Warrior();
        Player playerCharacter = new Player("Jyorin", w);

        firstMap.setPlayerOnMap();

        for(char[] x : firstMap.getMap()){
            for(char y : x){
                System.out.print(y + "  ");
            }
            System.out.println();
        }

        playerCharacter.toStringIFuckingGuess();

    
    
        SCANNER.close();
    }


    

}
