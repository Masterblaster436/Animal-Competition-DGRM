public class Cat extends Animal{

public String species() {
        return "cat";
}  

public void catIntell(){this.Intel = 9;}  
public void catPower(){this.Power = 6;}
public void catDefense(){this.Defense = 4;}
public void catMobility(){this.Mobility = 9;}
public void catStealth(){this.Stealth = 7;}
public void catStamina(){this.Stamina = 6;}
public void catIntimidation(){this.Intimidation = 4;}
public void catResolve(){this.Resolve = 8;}
public int getTotalLevelCat(){
  return (this.Intel + this.Power + this.Defense + this.Mobility + this.Stealth +      this.Stamina + this.Intimidation + this.Resolve);
  }
}  
