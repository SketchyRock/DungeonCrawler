
import java.util.Scanner;

public class Map {

    //map x and y are the bounds for the map
    //entity x and y are the cords for any entity on the map
    private int mapX, mapY, entityX, entityY;

    //this IS the map 2d array
    public char[][] map;

    //initialize the map by setting the bounds
    //then uses for loop to change the 2D array
    //so that the outside of the map is walls # 
    //and open or free spaces are 0
    public Map(int mapX, int mapY){
        this.mapX = mapX;
        this.mapY = mapY;
        this.map = new char[mapY][mapX];
        
        for(int i = 0; i < this.mapY; i++){
            for(int k = 0; k < this.mapX; k++){
                if (i == 0 || i == this.mapY - 1) {
                    this.map[i][k] = '#';
                    continue;
                }
                if (k == 0 || k == this.mapX - 1) {
                    this.map[i][k] = '#';
                    continue;
                }
                this.map[i][k] = '0';
            }
        }

    }

    //sets doors on the map
    //parameter is a list of sides of the map that doors
    //will be put on (north, south, east, west)
    public void setDoors(String[] sides){
        for(String roomSide : sides){
            switch(roomSide.toLowerCase()){
                case "north" -> {this.map[0][(this.mapX)/2] = 'U';}
                case "south" -> {this.map[this.mapY][(this.mapX)/2] = 'U';}
                case "east" -> {this.map[(this.mapY)/2][this.mapX] = 'U';}
                case "west" -> {this.map[(this.mapY)/2][0] = 'U';}
            }
        }


    }

    //just a simple for loop to display map
    public void displayMap(){
        for(char[] i : this.map){
            for(char k : i){
                System.out.print(k + "  ");
            }
            System.out.println();
        }
    }

    //first initialize player on map only at the beginning
    public void initializePlayerInGame(){
        this.map[mapY - 2][mapX/2] = 'A';
        this.entityX = mapX/2;
        this.entityY = mapY - 2;
    }

    //entity movement on map based on how many tiles should be moved
    //and what entity should be moved
    public void entityMovement(int tilesX, int tilesY, Entity entity){
        this.map[this.entityY][this.entityX] = '0';
        this.entityX += tilesX;
        this.entityY += tilesY;
        if (entity.getClass() == Player.class) {
            this.map[this.entityY][this.entityX] = 'A';
        }
        //To be implemented when enemy class is used
        /* 
        else if (entity.getClass() == Enemy.class){
            this.map[this.entityY][this.entityX] = '@';
        }
            */
        else{
            this.map[this.entityY][this.entityX] = 'Y';
        }

    }

    //method of all player actions once inside the game
    public void playerActions(Scanner scanner, Entity entity){
        
        switch (scanner.nextLine().toLowerCase()) {
            case "w"-> {
                if(this.map[this.entityY-1][this.entityX] != '#'){entityMovement(0,-1,entity);}
            }
            case "a"-> {
                if(this.map[this.entityY][this.entityX-1] != '#'){entityMovement(-1,0,entity);}
            
            }
            case "s"-> {
                if(this.map[this.entityY+1][this.entityX] != '#'){entityMovement(0,1,entity);}
            
            }
            case "d"-> {
                if(this.map[this.entityY][this.entityX+1] != '#'){entityMovement(1,0,entity);}
                
            }
            
            default -> System.out.println("input not recognized or movement invalid");
        }


    }



}
