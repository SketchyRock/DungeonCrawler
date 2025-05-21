//based off of CharacterClass interface
//Rouge base character class

public class Rouge implements CharacterClass{
    
    
    @Override
    public String getClassName(){return ("Rouge");}
    
    @Override
    public int getBaseHP(){return (100);}
    
    @Override
    public int getBaseMP(){return (20);}
    
    @Override
    public int getBaseSP(){return (75);}

    @Override
    public int getBaseStr(){return (6);}

    @Override
    public int getBaseDef(){return (6);}

    @Override
    public int getBaseIntel(){return (10);}

    @Override
    public int getBaseAg(){return (16);}

    @Override
    public int getBaseLvl(){return (38);}

    

}
