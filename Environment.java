public interface Environment {

  // Biome is essentially one of the Environments (Forest, Beach, Desert)
  abstract public String Biome(); 
  
  // Want environments to increase/decrease the total stats for certain animals
  abstract public int total_reduction_increase();
  
  
//abstract class Environment implements IAttackable {
  //abstract public String name();
  
  //public void inflictDamageTo(IDamagable target){
    //int targetHealth = target.getHealthLevel();
    //target.setHealthLevel(targetHealth - 1);
    }




//}