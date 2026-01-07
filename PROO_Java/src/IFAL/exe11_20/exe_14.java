/*1 - Crie a classe chamada Porta com os seguintes atributos: cor, largura, altura, aberta (boolean - true significa 
que está aberta; false - está fechada). Crie também os seguintes métodos: 
cadastrar, exibir, abrir (coloca o atributo aberta como true), fechar (coloca o atributo aberta como false), pintar 
(mudar a cor da porta – perguntar qual a nova cor da porta.
Em cada método, coloque também mensagens informando o que está sendo feito. Por exemplo: "fechando a porta... ", 
"pintando a porta com a cor ..."

2 – Crie uma classe chamada Responsavel. Esta classe possui os atributos: nome, telefone gênero. Esta classe possui os 
seguintes métodos: 
cadastrar (inserir os dados dos responsável), exibir (exibe nome e telefone do responsavel) e atualizarTelefone 
(atualiza o telefone do responsável).

3 - Crie a classe Casa. Esta classe possui os seguintes atributos: cor, número, portaDaFrente (atributo do tipo Porta 
criado na questao 1), portaDeFundo (atributo do tipo Porta criado na questão 1) e responsavel (atributo do tipo
Responsavel criado na questao 2). Esta classe possui ainda os seguintes métodos: 
cadastrar, exibir, pintar, estaAberta (verifica se todas as portas estão abertas) e fecharCasa (fecha as portas da casa), 
consultarResponsavel (ver quem é o responsável) e mudarResponsavel (trocar/mudar o responsavel pela casa).
Em cada método, coloque mensagens informando o que está sendo feito. Por exemplo: "fechando a casa de número... ", 
"pintando a casa de número..." Se julgar necessário, pode adicionar outros métodos e/ou atributos para as classes acima.

4. Na classe Principal, crie três objetos do tipo Casa, cada uma deve representar, respectivamente, a sua casa, a casa do
(a) seu/sua melhor amigo(a) e a terceira casa deve representar a casa de um parente (tia, avó, irmão, etc). Apresente o 
menu abaixo, que o usuário deverá informar uma casa (entre as três criadas) e escolher uma das opções abaixo para 
executar:
    1 - Pintar a casa
    2 - Verificar se a casa está aberta
    3 - Abrir a porta da frente da casa
    4 - Fechar a casa
    5 – Consultar telefone do responsável
    6 – Mudar responsável pela casa
*/
package IFAL.exe11_20;
import IFAL.Classes.Porta_exe_14_16;
public class exe_14 {
    public static void main(String[] args) {
        Porta_exe_14_16 por = new Porta_exe_14_16 ();
        
        por.cadastrar();
        por.exibir();
        por.abrir();
        por.pintar();
        por.exibir();
    }
}
