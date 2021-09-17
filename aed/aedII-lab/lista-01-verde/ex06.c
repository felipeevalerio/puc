#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>
#include <ctype.h>

bool respostaVogais = true;
bool respostaConsoante = true;
bool respostaNumeroInteiro = true;
bool respostaNumeroFloat = true;

int main(){


  char string[100];
  scanf("%s",string);

  while(string != "FIM"){
      somenteVogais(string);
      somenteConsoantes(string);
      numeroInteiro(string);
      numeroReal(string);

      printf("%s",respostaVogais ? "SIM": "NAO");
      printf("%s",respostaConsoante ? "SIM": "NAO");
      printf("%s",respostaNumeroInteiro ? "SIM": "NAO");
      printf("%s",respostaNumeroFloat ? "SIM": "NAO");
      scanf("%s",string);
  }
}

void somenteVogais(char string[100]) {

    for (int i = 0; i <= strlen(string) - 1; i++) {
      if (string[i] != 'A' && string[i] != 'a' && string[i] != 'E' && string[i] != 'e'
          && string[i] != 'I' && string[i] != 'i' && string[i] != 'O' && string[i] != 'o'
          && string[i] != 'U' && string[i] != 'u') {

        respostaVogais = false;
      }
    }
  }

void somenteConsoantes(char string[100]) {
    for (int i = 0; i <= strlen(string) - 1; i++) {

    if (string[i] <= (char) 65 || string[i] == 'A' || string[i] == 'E' || string[i] == 'I'
        || string[i] == 'O' || string[i] == 'U' || string[i] == '['
        || string[i] == (char) 92 || string[i] >= (char) 122 && string[i] == ']'
        || string[i] == '^' || string[i] == '_' || string[i] == '`' || string[i] == 'a'
        || string[i] == 'e' || string[i] == 'i' || string[i] == 'o' || string[i] == 'u') {

      respostaConsoante = false;
    }
  }
  }

void numeroInteiro(char string[100]){
    for(int i = 0; i < strlen(string);i++){
      if(string[i] < '0' || string[i] > '9' || string[i] == '.' ){
        respostaNumeroInteiro = false;
      }
    }
  }

void numeroReal(char string[100]){
  for(int i = 0; i < strlen(string);i++){
    if(string[i] < '0' || string[i] > '9'){
      if(string[i] != '.'){
        respostaNumeroFloat = false;
      }
    }
  }

}

