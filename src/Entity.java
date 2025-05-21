//this class defines all entities (player, npc, enemies)

public class Entity {

    public String name;
    public int HP,MP,SP,Str,Def,intel,Ag,gold,Dmg;
    public String[] equippedWeapons,equippedArmor,equipment;

    //base constructor, never to be actually used,
    //all set vars in this should be set later to different values
    //Other than like gold and stuff that should start at 0
    public Entity(String name){
        this.name = name;
        this.HP = 100;
        this.MP = 20;
        this.SP = 50;
        this.Str = 0;
        this.Def = 0;
        this.intel = 0;
        this.Ag = 0;
        this.gold = 0;
        equippedWeapons = new String[2];
        equippedArmor = new String[5];
        equipment = new String[20];

    }
    
    //prints all instance variables for the object
    //only for testing, never to be used
    public void toStringIFuckingGuess(){
        System.out.println(name);
        System.out.println(HP);
        System.out.println(MP);
        System.out.println(SP);
        System.out.println(Str);
        System.out.println(Def);
        System.out.println(intel);
        System.out.println(Ag);
        System.out.println(gold);
        for(String x : equippedWeapons){
            System.out.println(x);
        }
        for(String x : equippedArmor){
            System.out.println(x);
        }
        for(String x : equipment){
            System.out.println(x);
        }
    }
    

    


    
}
