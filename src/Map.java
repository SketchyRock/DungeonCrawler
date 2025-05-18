public class Map {

    private int mapX;
    private int mapY;
    private char[][] map;

    public char[][] getMap() {
        return map;
    }

    public Map(){
        this.mapX = 15;
        this.mapY = 15;
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

        this.map[0][(this.mapX)/2] = 'U';
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

        this.map[0][(this.mapX)/2] = 'U';
    }

    public void setPlayerOnMap(){
        this.map[mapY - 2][mapX/2] = 'A';
    }


}
