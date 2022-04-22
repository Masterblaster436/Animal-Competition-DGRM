//public class bears extends animals {
  //  public String _name;

class bears extends animals {
    //super(name); 
    //}

  //public String species() {
        //return "bears";
    //}
  int Intel = 6;
  public int getIntelLevel(){
    return this.Intel;
  }
  
  int Power = 10;
  public int getPowerLevel(){
    return this.Power;
  }

  int Defense = 7;
  public int getDefenseLevel(){
    return this.Defense;
  }

  int Mobility = 4;
  public int getMobilityLevel(){
    return this.Mobility;
  }

  int Stealth = 3;
  public int getStealthLevel(){
    return this.Stealth;
  }

  int Stamina = 6;
  public int getStaminaLevel(){
    return this.Stamina;
  }

  int Intimidation = 8;
  public int getIntimidationLevel(){
    return this.Intimidation;
  }
  
  int Resolve = 8; // 
  public int getResolveLevel(){
    return this.Resolve;
  }
  
  int Total = 52;
  public int getTotalLevel(){
    return this.Total;
  }


  // each animal class has their own stats theres no point in doing them all here since its the same code