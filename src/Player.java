public class Player extends Entity{

    protected int Lvl,XP;
    protected CharacterClass characterClass;

    public Player(String name, CharacterClass characterClass){
        super(name);
        this.Lvl = 0;
        this.XP = 0;
        this.characterClass = characterClass;
        applyClasseBaseStats();
        

    }

    private void applyClasseBaseStats(){
        this.HP = characterClass.getBaseHP();
        this.MP = characterClass.getBaseMP();
        this.SP = characterClass.getBaseSP();
        this.Str = characterClass.getBaseStr();
        this.Def = characterClass.getBaseDef();
        this.intel = characterClass.getBaseIntel();
        this.Ag = characterClass.getBaseAg();

    }

    @Override
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
        System.out.println(Lvl);
        System.out.println(XP);
        System.out.println(characterClass.getClassName());
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
