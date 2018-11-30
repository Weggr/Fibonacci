import java.util.Scanner;

public class Fibonacci
{
  public static void main(String args[])
  {
    int n, premier = 0, second = 1, suivant, i;
    Scanner keyb = new Scanner (System.in);
    
    System.out.println("Entrez le nombre de termes :");
    int n = keyb.nextInt();
    
    System.out.println("Les " + n + " premiers termes de la suite de Fibonacci sont :");
 
    for (i = 0; i < n; i++)
    {
      if (i <= 1)
        suivant = i;
      else
      {
        suivant = premier + second;
        premier = second;
        second = suivant;
      }
      System.out.println(suivant);
    }
  } 
}
