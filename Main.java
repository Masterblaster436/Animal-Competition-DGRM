import java.util.*;

import java.util.Scanner;

import java.text.DecimalFormat;



public class Main {
	public static void main(String[] args) {
  var numberOne = 0;
  var numberTwo = 0;
    
    System.out.println("Welcome to DGR MAD Animal Competition");
    System.out.println("");
    System.out.println("Player 1 please choose your animal!");
    System.out.println("");



    System.out.println("1.  Bear");
    System.out.println("2.  Cat");
    System.out.println("3.  Crab");
    System.out.println("4.  Eagle");
    System.out.println("5.  Monkey");
    System.out.println("6.  Pig");
    System.out.println("7.  Rattlesnake");
    System.out.println("8.  Robin");
    System.out.println("9.  Tarantula");
    System.out.println("10. Wolf");

    Scanner input = new Scanner(System.in);
     int response = input.nextInt();
        if (response == 1){
        numberOne = 52; 
        System.out.println("You selected Bear");
          }
      
  	    //int response = input.nextInt();
        if (response == 2){
        numberOne = 53;
        System.out.println("You selected Cat");
        }
          
        //int response = input.nextInt();
        if (response == 3){
        numberOne = 51;
        System.out.println("You selected Crab");
        }
      
        //int response = input.nextInt();
        if (response == 4){
        numberOne = 53;
        System.out.println("You selected Eagle");
        }
      
        //int response = input.nextInt();
        if (response == 5){
        numberOne = 49;
        System.out.println("You selected Monkey");
        }
  
        //int response = input.nextInt();
        if (response == 6){
        numberOne = 47;
        System.out.println("You selected Pig");
        }
  
        //int response = input.nextInt();
        if (response == 9){
        numberOne = 51;
        System.out.println("You selected Tarantula");
        }
  
        //int response = input.nextInt();
        if (response == 7){
        numberOne = 52;
        System.out.println("You selected Rattlesnake");
        }
        
        //int response = input.nextInt();
        if (response == 8){
        numberOne = 44;
        System.out.println("You selected Robin");
        }
  
        //int response = input.nextInt();
        if (response == 10){
        numberOne = 52;
        System.out.println("You selected Wolf");
        }

    System.out.println("");
    System.out.println("Player 2 please choose your animal!");
    System.out.println("");



    System.out.println("1.  Bear");
    System.out.println("2.  Cat");
    System.out.println("3.  Crab");
    System.out.println("4.  Eagle");
    System.out.println("5.  Monkey");
    System.out.println("6.  Pig");
    System.out.println("7.  Rattlesnake");
    System.out.println("8.  Robin");
    System.out.println("9.  Tarantula");
    System.out.println("10. Wolf");

    //Scanner input = new Scanner(System.in);
        int response1 = input.nextInt();
        if (response1 == 1){
        numberTwo = 52; 
        System.out.println("You selected Bear");
          }
      
  	    //int response = input.nextInt();
        if (response1 == 2){
        numberTwo = 53;
        System.out.println("You selected Cat");
        }
          
        //int response = input.nextInt();
        if (response1 == 3){
        numberTwo = 51;
        System.out.println("You selected Crab");
        }
      
        //int response = input.nextInt();
        if (response1 == 4){
        numberTwo = 53;
        System.out.println("You selected Eagle");
        }
      
        //int response = input.nextInt();
        if (response1 == 5){
        numberTwo = 49;
        System.out.println("You selected Monkey");
        }
  
        //int response = input.nextInt();
        if (response1 == 6){
        numberTwo = 47;
        System.out.println("You selected Pig");
        }
  
        //int response = input.nextInt();
        if (response1 == 7){
        numberTwo = 52;
        System.out.println("You selected Rattlesnake");
        }
        
        //int response = input.nextInt();
        if (response1 == 8){
        numberTwo = 44;
        System.out.println("You selected Robin");
        }

        //int response = input.nextInt();
        if (response1 == 9){
        numberTwo = 51;
        System.out.println("You selected Tarantula");
        }
    
        //int response = input.nextInt();
        if (response1 == 10){
        numberTwo = 52;
        System.out.println("You selected Wolf");
        }


    //numOne = numberOne;
    //numTwo = numberTwo;
    
    if (numberOne == numberTwo){
      System.out.println("It's a tie!!!");
        }

    if (numberOne > numberTwo){
      System.out.println("Player 1 Wins!!!");
        }
    
    if (numberOne < numberTwo){
       System.out.println("Player 2 Wins!!!");
         }
    
    //this.player1 = this.selectPlayer("Player 1");
    
    //this.player2 = this.selectPlayer("Player 2");
    
    
    //for (int num = 2; num < 4; num++) {
      
      
//      System.out.println("  ");
  //  System.out.println("Welcome to DGR MAD Animal Competition");
   //   System.out.println("Player choose your animal!");
   //   System.out.println("  ");
      
  
  //    static void myMethod() {
  //   // code to be executed
  // Scanner input = new Scanner(System.in);
    
  //                 var bear = new Bear();
  //                 var cat = new Cat();
  //                 var crab = new Crab();
  //                 var eagle = new Eagle();
  //                 var monkey = new Monkey();
  //                 var pig = new Pig();
  //                 var tarantula = new Tarantula();
  //                 var rattlesnake = new Rattlesnake();
  //                 var robin = new Robin();
  //                 var wolf = new Wolf();
                  
  //                 var animals = new ArrayList<Animal>();
  //                 animals.add(bear);
  //                 animals.add(cat);
  //                 animals.add(crab);
  //                 animals.add(eagle);
  //                 animals.add(monkey);
  //                 animals.add(pig);
  //                 animals.add(tarantula);
  //                 animals.add(rattlesnake);
  //                 animals.add(robin);
  //                 animals.add(wolf);
  
  //                 //int i = 0;
  //                 int n = animals.size();
  //                 for(int i = 0; i < n; i++) {
  //                   var animal = animals.get(i);
                      
  //                 System.out.println(String.format("%d. %s", i, animal.species()));
  //                   }
  //      }
////////System.out.println("");
       
        //int response = input.nextInt();
       // if (response == 0){
      //  int numberOne = 52; 
      //  System.out.println("You selected Bear");
     //     }
     // 
  	    //int response = input.nextInt();
    //    if (response == 1){
    //    int numberOne = 53;
    //    System.out.println("You selected Cat");
    //    }
          
        //int response = input.nextInt();
    //    if (response == 2){
   //     int numberOne = 51;
    //    System.out.println("You selected Crab");
   //     }
      
        //int response = input.nextInt();
  //      if (response == 3){
   //     int numberOne = 53;
  //      System.out.println("You selected Eagle");
    //    }
      
        //int response = input.nextInt();
   //     if (response == 4){
    // //   int numberOne = 49;
    //    System.out.println("You selected Monkey");
   //     }
  
        //int response = input.nextInt();
     //   if (response == 5){
     //   int numberOne = 47;
     //   System.out.println("You selected Pig");
    //    }
  
        //int response = input.nextInt();
      //  if (response == 6){
      //  int numberOne = 51;
      //  System.out.println("You selected Tarantula");
      //  }
  
        //int response = input.nextInt();
      //  if (response == 7){
//        int numberOne = 52;
    //    System.out.println("You selected Rattlesnake");
  //      }
        
        //int response = input.nextInt();
    //    if (response == 8){
    //    int numberOne = 44;
    //    System.out.println("You selected Robin");
   //     }
  
        //int response = input.nextInt();
   //     if (response == 9){
   //     int numberOne = 52;
   //     System.out.println("You selected Wolf");
   //     }
////////////////////////////// Second animal /////////////////////////////
            //      var bearOne = new Bear();
             //     var catOne = new Cat();
             //     var crabOne = new Crab();
            ///      var eagleOne = new Eagle();
            //      var monkeyOne = new Monkey();
             //     var pigOne = new Pig();
             //     var tarantulaOne = new Tarantula();
            //      var rattlesnakeOne = new Rattlesnake();
            //      var robinOne = new Robin();
            //      var wolfOne = new Wolf();
                  
                  // var animalsOne = new ArrayList<Animal>();
                  // animalsOne.add(bear);
                  // animalsOne.add(cat);
                  // animalsOne.add(crab);
                  // animalsOne.add(eagle);
                  // animalsOne.add(monkey);
                  // animalsOne.add(pig);
                  // animalsOne.add(tarantula);
                  // animalsOne.add(rattlesnake);
                  // animalsOne.add(robin);
                  // animalsOne.add(wolf);
  
                  //int i = 0;
                //  int q = animalsOne.size();
                  
    //for(int i = 0; i < q; i++) {
                    //var animal = animals.get(i); 
    
    
    
    //for(int w = 0; w < q; w++) {
            //      animalsOne.get(w);
             //         
  //                System.out.println(String.format("%d. %s", w, animal.species()));
///                    }

 //       input.nextInt();
   //     if (response == 0){
         
    //    System.out.println("You selected Bear");
    //  //    }
      
  	    //int response = input.nextInt();
      //  if (response == 1){
        
  //      System.out.println("You selected Cat");
   //     }
          
        //int response = input.nextInt();
   //     if (response == 2){
        
   //     System.out.println("You selected Crab");
   //     }
      
        //int response = input.nextInt();
     //   if (response == 3){
        
   //     System.out.println("You selected Eagle");
 //       }
      
        //int response = input.nextInt();
     //   if (response == 4){
        
    //    System.out.println("You selected Monkey");
    //    }
  
        //int response = input.nextInt();
   //     if (response == 5){
        
 //       System.out.println("You selected Pig");
 //       }
  
        //int response = input.nextInt();
    //    if (response == 6){
        
    //    System.out.println("You selected Tarantula");
    //    }
  
        //int response = input.nextInt();
      //  if (response == 7){
        
        //System.out.println("You selected Rattlesnake");
     //  }
        
        //int response = input.nextInt();
        //if (response == 8){
       
        //System.out.println("You selected Robin");
      //  }
  
        //int response = input.nextInt();
    //    if (response == 9){
      
    //    System.out.println("You selected Wolf");
        //}
////////////////////////////////////////////////////////////////////////////////////
    
          //} //for loop

                  //var beach = new Beach();
                  // var forest = new Forest();
                  // var desert = new Desert();

                  // var Environment  = new ArrayList<Environment>();

                  // Environment.add(beach);
                  // Environment.add(forest);
                  // Environment.add(desert);

                  // int e = Environment.size();
                  // for(int i = 0; i < e; i++) {
                  //   var Enviroment = Environment.get(i);
                      
                  // System.out.println(String.format("%d. %s", e,                                  Environment.Biome()));
                  // }
    
         // public static void
       // Main
    
   // int OneTotal = response 1
  }
}