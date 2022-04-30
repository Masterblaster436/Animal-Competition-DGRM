public class Monkey extends Animal{

public String species() {
        return "monkey";
}  
  
public void MonkeyIntell(){this.Intel = 8;}  
public void MonkeyPower(){this.Power = 6;}
public void MonkeyDefense(){this.Defense = 5;}
public void MonkeyMammalsMobility(){this.Mobility = 7;}
public void MonkeyMammalsStealth(){this.Stealth = 6;}
public void MonkeyMammalsStamina(){this.Stamina = 7;}
public void MonkeyMammalsIntimidation(){this.Intimidation = 5;}
public void MonkeyMammalsResolve(){this.Resolve = 5;}
public int getTotalLevelMonkey(){
  return (this.Intel + this.Power + this.Defense + this.Mobility + this.Stealth +      this.Stamina + this.Intimidation + this.Resolve);
  }
}  