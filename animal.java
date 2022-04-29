public abstract class Animal {
  //public abstract int statistics();
  
  public abstract String species();
//%s
 // The animals intelligence
  
  protected int Intel = 0;
  public int getIntelLevel(){
    return this.Intel;
  }
  
  protected int Power = 0;
  public int getPowerLevel(){
    return this.Power;
  }

  protected int Defense = 0;
  public int getDefenseLevel(){
    return this.Defense;
  }

  protected int Mobility = 0;
  public int getMobilityLevel(){
    return this.Mobility;
  }

  protected int Stealth = 0;
  public int getStealthLevel(){
    return this.Stealth;
  }

  protected int Stamina = 0;
  public int getStaminaLevel(){
    return this.Stamina;
  }

  protected int Intimidation = 0;
  public int getIntimidationLevel(){
    return this.Intimidation;
  }
  
  protected int Resolve = 0; 
  public int getResolveLevel(){
    return this.Resolve;
  }
  
  
  public int getTotalLevel(){
    return (this.Intel + this.Power + this.Defense + this.Mobility + this.Stealth +      this.Stamina + this.Intimidation + this.Resolve);
  }



  
   // var beartotal = new Beartotal();
  

}