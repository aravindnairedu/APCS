package edu.kyleknobloch.APCS.Classwork.December.Animals;


public class AnimalTester
{
   public static void main(String args[])
   {
      Reptile croc = new Reptile("Crocodile", "Saltwater Crocodile", "Crocodilian");

      croc.setClimate("Aquatic or Semi-aquatic environments in any tropical place");
      croc.setFoodSource("Buffalo, Zebra, Fish, Sharks, Birds, Humans, Snakes");

      System.out.println(croc.toString());

      Reptile snake = new Reptile("Anaconda", "Green Anaconda", "Snake");

      snake.setClimate("Rainforest, Swamps, Rivers, Slow-moving Streams");
      snake.setFoodSource("Caimans, Birds, Monkeys, Capybaras, Humans");

      System.out.println(snake.toString());
      
      Mammal cougar = new Mammal("Big Cat", "Cougar", "Cats");

      cougar.setClimate("Mountainous regions");
      cougar.setFoodSource("Deer, Moose, Mice");

      System.out.println(cougar.toString());

      Mammal pug = new Mammal("Domestic Doge", "Pug", "Doge");

      pug.setClimate("Andruseph's house");
      pug.setFoodSource("COOKIEZ");

      System.out.println(pug.toString());   
   }
} //end main