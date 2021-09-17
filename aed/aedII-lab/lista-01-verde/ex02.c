#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int isPalindromo(char [100]);

int main(){
  char string[100];
  while(string != "FIM"){
    scanf("%s",string);
    fgets(string,100,stdin);
    int palindromo = isPalindromo(string);
    printf("%s\n", palindromo ? "SIM" : "NAO");
  }
  return 0;
}

int isPalindromo(char string[100]){
  char invertida[100] = "";
  int stringLength = strlen(string) - 1;
  for(int i = 0; i < strlen(string); i++){ 
    invertida[i] = string[stringLength];
    stringLength--;
  }

  if(strcmp(invertida,string) == 0){
    return 1;
  }
  else{
    return 0;
  }
}