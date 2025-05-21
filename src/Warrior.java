//based off of CharacterClass interface
//Warrior base character class

public class Warrior implements CharacterClass{
    
    
    @Override
    public String getClassName(){return ("Warrior");}
    
    @Override
    public int getBaseHP(){return (125);}
    
    @Override
    public int getBaseMP(){return (20);}
    
    @Override
    public int getBaseSP(){return (50);}

    @Override
    public int getBaseStr(){return (13);}

    @Override
    public int getBaseDef(){return (10);}

    @Override
    public int getBaseIntel(){return (5);}

    @Override
    public int getBaseAg(){return (8);}

    @Override
    public int getBaseLvl(){return (38);}

    

}
