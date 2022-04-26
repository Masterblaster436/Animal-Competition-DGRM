import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    for (int num = 2; num < 4; num++) {
      Scanner input = new Scanner(System.in);

      //This prints out the welcome message and the list of animal groups
      //Methods.myMethod();
  
      //Bears
        int response = input.nextInt();
        if (response == 1){
        System.out.println("Now pick: 1. Polar bear 2. Grizzly bear 3. Panda bear");
      
        int bear = input.nextInt();
        
        if (bear == 1)
         {
          System.out.println("You selected Polar bear");
        }
        
        else if (bear == 2) {
          System.out.println("You selected Grizzly Bear");
        }
  
        else if (bear == 3) {
          System.out.println("You selected Panda Bear");
        }
      }
  
  
        //bugs
        if (response == 2){
        System.out.println("Now pick: 1. Black Widow 2. Tarantula");
      
        int bugs = input.nextInt();
        
        if (bugs == 1)
         {
          System.out.println("You selected Black Widow");
        }
        
        else if (bugs == 2) {
          System.out.println("You selected Tarantula");
        }
        }
      
  
  
  
  
        //crustaceans
        if (response == 3){
        System.out.println("Now pick: 1. Crab 2. Lobster");
      
        int crust = input.nextInt();
        
        if (crust == 1)
         {
          System.out.println("You selected Crab");
        }
        
        else if (crust == 2) {
          System.out.println("You selected Lobster");
        }
        }
    
    
        //Farm animals
        if (response == 4){
        System.out.println("Now pick: 1. Cow 2. Pig 3. Turkey 4. Sheep ");
      
        int farm = input.nextInt();
        
        if (farm == 1)
         {
          System.out.println("You selected Cow");
        }
        
        else if (farm == 2) {
          System.out.println("You selected Pig");
        }
  
        else if (farm == 3) {
          System.out.println("You selected Turkey");
        }
  
        else if (farm == 4) {
          System.out.println("You selected Sheep");
        }
        }
      
  
  
  
  
  
  
      //large birds
        if (response == 5){
        System.out.println("Now pick: 1. Falcon 2. Eagle ");
      
        int bbird = input.nextInt();
        
        if (bbird == 1)
         {
          System.out.println("You selected Falcon");
        }
        
        else if (bbird == 2) {
          System.out.println("You selected Eagle");
        }
        }
  
        //big mammals
        if (response == 6){
        System.out.println("Now pick: 1. Lion 2. Wolf 3. Horse 4. Bison 5. Coyote ");
      
        int bmam = input.nextInt();
        
        if (bmam == 1)
         {
          System.out.println("You selected Loin");
        }
        
        else if (bmam == 2) {
          System.out.println("You selected Wolf");
        }
  
        else if (bmam == 3) {
          System.out.println("You selected Horse");
        }
  
        else if (bmam == 4) {
          System.out.println("You selected Bison");
        }
  
        else if (bmam == 5) {
          System.out.println("You selected Coyote");
        }
  
  
          
        }
      
  
  
  
      //med mammals
        if (response == 7){
        System.out.println("Now pick: 1. Fox 2. Lemur 3. Monkey 4. Deer 5. Pony ");
      
        int mmam = input.nextInt();
        
        if (mmam == 1)
         {
          System.out.println("You selected Fox");
        }
        
        else if (mmam == 2) {
          System.out.println("You selected Lemur");
        }
  
        else if (mmam == 3) {
          System.out.println("You selected Monkey");
        }
  
        else if (mmam == 4) {
          System.out.println("You selected Deer");
        }
  
        else if (mmam == 5) {
          System.out.println("You selected Pony");
        }
  
  
          
        }
      
  
  
      //pets
        if (response == 8){
        System.out.println("Now pick: 1. Cat 2. Dog");
      
        int pet = input.nextInt();
        
        if (pet == 1)
         {
          System.out.println("You selected Cat");
        }
        
        else if (pet == 2) {
          System.out.println("You selected Dog");
        }
   
        }
      
  
  
      //reptiles
        if (response == 9){
        System.out.println("Now pick: 1. Cobra 2. Rattlesnake 3. Iguana 4. Snapping Turtle");
      
        int rep = input.nextInt();
        
        if (rep == 1)
         {
          System.out.println("You selected Cobra");
        }
        
        else if (rep == 2) {
          System.out.println("You selected Rattlesnake");
        }
  
        else if (rep == 3) {
          System.out.println("You selected Iquana");
        }
  
        else if (rep == 4) {
          System.out.println("You selected Snapping Turtle");
        }
   
        }
      
  
      //small birds
        if (response == 10){
        System.out.println("Now pick: 1. Chicken 2. Bluejay 3. Robin 4. Duck");
      
        int sbird = input.nextInt();
        
        if (sbird== 1)
         {
          System.out.println("You selected Chicken");
        }
        
        else if (sbird == 2) {
          System.out.println("You selected Bluejay");
        }
  
        else if (sbird == 3) {
          System.out.println("You selected Robin");
        }
  
        else if (sbird == 4) {
          System.out.println("You selected Duck");
        }
   
        }
  
  
      //small mammals
        if (response == 11){
        System.out.println("Now pick: 1. Rabbit 2. Hamster 3. Hedgehog 4. Squirrel");
      
        int sbird = input.nextInt();
        
        if (sbird== 1)
         {
          System.out.println("You selected Rabbit");
        }
        
        else if (sbird == 2) {
          System.out.println("You selected Hamster");
        }
  
        else if (sbird == 3) {
          System.out.println("You selected Hedgehog");
        }
  
        else if (sbird == 4) {
          System.out.println("You selected Squirrel");
        } //else if sbird == 4
  } //if response == 11
      } // for loop
      Scanner input = new Scanner(System.in);
      System.out.println("Select an environment");
      System.out.println("1. Forest");
      System.out.println("2. Beach");
      System.out.println("3. Desert");

      int response_enviro = input.nextInt();
    
      if (response_enviro == 1){
        System.out.println("You selected Forest");
        }
    
      else if (response_enviro == 2){
        System.out.println("You selected Beach");
      }
      else if (response_enviro == 3) {
        System.out.println("You selected Beach");
        }
    } //public static void
      } //main