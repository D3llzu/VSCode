/*[#4] Leia um nome completo de pessoa e imprima apenas o nome e sobrenome no formato SOBRENOME/Nome. 
Ex.: Antônio Fernando Silva → SILVA/Antônio*/

#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <stdlib.h>

int main(){
    char Nome[20], SNome[20]; SNOME[20]

    printf("Digite seu primeiro nome: ");
    gets (Nome);

    printf("Digite agora seu sobrenome: ");
    gets (SNome);

    SNOME[20] = toupper(SNome[20]);

    printf("\n", "%s", SNome, "/%s", Nome);

    return 0;
}