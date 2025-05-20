public class Map {

    private int mapX, mapY;
    private char[][] map;

    public char[][] getMap() {
        return map;
    }

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
        

        //this.map[0][(this.mapX)/2] = 'U';
    }

    public void setDoors(String[] sides){
        String roomSide;

        for(String x : sides){
        roomSide = side.toLowerCase();
            switch(roomSide){
                case "north": 
                    
                    break;
                case "south": 
                    
                    break;
                case "east": 
                    
                    break;
                case "west": 
                    
                    break;
            }
        }


    }

    public void displayInitialMap(){
        for(char[] x : getMap()){
            for(char y : x){
                System.out.print(y + "  ");
            }
            System.out.println();
        }
    }


    public void initializePlayerInGame(){
        this.map[mapY - 2][mapX/2] = 'A';
    }


}
