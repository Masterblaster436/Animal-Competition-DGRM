public class Bear extends Animal {

public String species() {
        return "bear";
}  
public void bearsIntell(){this.Intel = 3;}  
public void bearsPower(){this.Power = 10;}
public void bearsDefense(){this.Defense = 10;}
public void bearsMobility(){this.Mobility = 4;}
public void bearsStealth(){this.Stealth = 3;}
public void bearsStamina(){this.Stamina = 6;}
public void bearsIntimidation(){this.Intimidation = 8;}
public void bearsResolve(){this.Resolve = 8;}
public int getTotalLevelBears(){
  return (this.Intel + this.Power + this.Defense + this.Mobility + this.Stealth +      this.Stamina + this.Intimidation + this.Resolve);
  }

}