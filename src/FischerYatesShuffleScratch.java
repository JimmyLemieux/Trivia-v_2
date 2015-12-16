/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author burtm5944
 */
public class FischerYatesShuffleScratch {

    /**
     * http://stackoverflow.com/questions/1519736/random-shuffling-of-an-array
     */
    public static void main(String[] args) { //
        // TODO code application logic here
        String[] arnNumbers = {"Question 1", "Question 2", "Question 3", "Question 4"};

    FischerYates(arnNumbers);
    for (int i = 0; i < arnNumbers.length; i++)
    {
      System.out.print(arnNumbers[i] + " ");
    }
    System.out.println();
  }

  static void FischerYates(String[] ar) {
    Random rnd = ThreadLocalRandom.current();
    for (int i = ar.length - 1; i > 0; i--) {
      int index = rnd.nextInt(i + 1);
      String a = ar[index];
      ar[index] = ar[i];
      ar[i] = a;
    }
  }
}

