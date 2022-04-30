public class Pig extends Animal{

  public String species() {
        return "pig";
}

public void pigIntell(){this.Intel = 10;}  
public void pigPower(){this.Power = 5;}
public void pigDefense(){this.Defense = 6;}
public void pigMobility(){this.Mobility = 1;}
public void pigStealth(){this.Stealth = 3;}
public void pigStamina(){this.Stamina = 7;}
public void pigIntimidation(){this.Intimidation = 5;}
public void pigResolve(){this.Resolve = 5;}
// total stat 47
public int getTotalLevelPig(){
  return (this.Intel + this.Power + this.Defense + this.Mobility + this.Stealth +      this.Stamina + this.Intimidation + this.Resolve);
  }
}