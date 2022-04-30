public class Tarantula extends Animal{

public String species() {
        return "tarantula";
} 
public void tarantulaIntell(){this.Intel = 7;}  
public void tarantulaPower(){this.Power = 10;}
public void tarantulaDefense(){this.Defense = 7;}
public void tarantulaMobility(){this.Mobility = 4;}
public void tarantulaStealth(){this.Stealth = 6;}
public void tarantulaStamina(){this.Stamina = 5;}
public void tarantulaIntimidation(){this.Intimidation = 10;}
public void tarantulaResolve(){this.Resolve = 2;}
public int getTotalLevelTarantula(){
  return (this.Intel + this.Power + this.Defense + this.Mobility + this.Stealth +      this.Stamina + this.Intimidation + this.Resolve);
  }
}