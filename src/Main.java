

public class Main {
    public static void main(String[] args) {









    Map firstMap = new Map(15,15);
    Player yayPlayer = new Player();

    firstMap.setPlayerOnMap();

    for(char[] x : firstMap.getMap()){
        for(char y : x){
            System.out.print(y + "  ");
        }
        System.out.println();
    }

    
    
  
    }


    

}
