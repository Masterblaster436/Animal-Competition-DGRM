//public class lilMammals extends animals

class smallMammals extends animals {
    //super(name); 
    //}

  public String species() {
        return "SmallMammals";
    }

  int Intel = 7; 
  public int getIntelLevel(){
    return this.Intel;
  }
  
  int Power = 4; 
  public int getPowerLevel(){
    return this.Power;
  }

  int Defense = 4; 
  public int getDefenseLevel(){
    return this.Defense;
  }

  int Mobility = 8;
  public int getMobilityLevel(){
    return this.Mobility;
  }

  int Stealth = 9;
  public int getStealthLevel(){
    return this.Stealth;
  }

  int Stamina = 6;
  public int getStaminaLevel(){
    return this.Stamina;
  }

  int Intimidation = 3;
  public int getIntimidationLevel(){
    return this.Intimidation;
  }
  
  int Resolve = 3;  
  public int getResolveLevel(){
    return this.Resolve;
  }
  
  int Total = 45;
  public int getTotalLevel(){
    return this.Total;
  }
}