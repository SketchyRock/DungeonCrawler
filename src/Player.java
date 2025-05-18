import java.util.ArrayList;

public class Player {

    private int playerX;
    private int playerY;

    private int playerHealth;
    private int playerMana;
    private int playerStamina;
    private ArrayList<String> playerInventory;

    public int getPlayerX() {
        return playerX;
    }

    public int getPlayerY() {
        return playerY;
    }

    public int getPlayerHealth() {
        return playerHealth;
    }

    public int getPlayerMana() {
        return playerMana;
    }

    public int getPlayerStamina() {
        return playerStamina;
    }

    public ArrayList<String> getPlayerInventory() {
        return playerInventory;
    }

    public void setPlayerX(int playerX) {
        this.playerX = playerX;
    }

    public void setPlayerY(int playerY) {
        this.playerY = playerY;
    }

    public void setPlayerHealth(int playerHealth) {
        this.playerHealth = playerHealth;
    }

    public void setPlayerMana(int playerMana) {
        this.playerMana = playerMana;
    }

    public void setPlayerStamina(int playerStamina) {
        this.playerStamina = playerStamina;
    }

    public void setPlayerInventory(ArrayList<String> playerInventory) {
        this.playerInventory = playerInventory;
    }
    

    public Player(){
        this.playerHealth = 100;
        this.playerMana = 20;
        this.playerStamina = 50;
        this.playerInventory = new ArrayList<>();
        this.playerInventory.add("Sword");

    }

    public Player(int playerHealth, int playerMana, int playerStamina){
        this.playerHealth = playerHealth;
        this.playerMana = playerMana;
        this.playerStamina = playerStamina;
        this.playerInventory = new ArrayList<>();

    }

    public void setPlayerCords(int playerX, int playerY){
        

    }
    

    

    
}
