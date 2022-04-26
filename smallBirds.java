public class smallBirds extends animals{


int Intel = 10; 
  public int getIntelLevel(){
    return this.Intel;
  }

 // The animals stregnth 
  int Power = 3; 
  public int getPowerLevel(){
    return this.Power;
  }

// How much damage an animal can take
  int Defense = 4; 
  public int getDefenseLevel(){
    return this.Defense;
  }

// How fast it can travel in an enviroment 
  int Mobility = 10;
  public int getMobilityLevel(){
    return this.Mobility;
  }

// How well it can hide from or sneak up on other animals
  int Stealth = 7;
  public int getStealthLevel(){
    return this.Stealth;
  }

// How long it can surivive in an enviorment
  int Stamina = 8;
  public int getStaminaLevel(){
    return this.Stamina;
  }

  // how easy it is to scare off other animals
  int Intimidation = 1;
  public int getIntimidationLevel(){
    return this.Intimidation;
  }

// how much it is able to not be intimidated
  int Resolve = 1;  
  public int getResolveLevel(){
    return this.Resolve;
  }
  
  int Total = 44;
  public int getTotalLevel(){
    return this.Total;
  }
}