#include <stdio.h>

int main()
{
  int n, premier = 0, second = 1, suivant, i;
 
  printf("Entrez le nombre de termes\n");
  scanf("%d", &n);
 
  printf("Les %d premiers termes de la suite de Fibonacci sont :\n", n);
 
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
    printf("%d\n", suivant);
  }
 
  return 0;
}
