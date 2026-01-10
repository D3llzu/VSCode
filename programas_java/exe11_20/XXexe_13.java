/*1. Crie uma classe Lampada de acordo com as informações abaixo:
a) Atributos: fabricante, preço, estado (indica se a lampada está ligada ou desligada) e potência.
b) Métodos: ler, ligar, desligar, exibirDados, alterarPreco.
Descrição dos métodos:
◦ O método ler deve ler os dados da lâmpada pelo teclado;
◦ O método ligar deve alterar o atributo estado para true/ligado e exibir a mensagem “Lampada ligada!”
◦ O método desligar deve alterar o atributo estado para false/desligado e exibir a mensagem “Lampada desligada!”;
◦ O método exibirDados deve informar as informações presentes nos atributos;
◦ O método alterarPreco deve alterar o preço da lâmpada e precisará de duas informações: o valor do reajuste e se o 
reajuste é para somar ou para diminuir do preço da lâmpada

2. Crie também um método main que realize as seguintes operações:
Crie três objetos do tipo Lampada, faça a leitura dos dados (chamar o método ler) e apresente o seguinte menu:
    1 – ligar
    2 – desligar
    3 – exibir
    4 – alterar preço
    5 – Exibir quantas lâmpadas são de um determinado fabricante (solicitar o nome do
    fabricante)
    6 – Exibir o valor total (soma dos preços das lâmpadas)
    7 - Sair
Para os itens de 1 a 4 é necessário solicitar a lâmpada desejada.

3. O Analista identificou que serão necessários guardar os seguintes dados do Fabricante: nome, endereço, e-mail e 
telefone. Para isto, crie uma classe Fabricante colocando os atributos necessários, bem como crie os seguintes métodos: 
ler e exibir.

4. Atualize a classe lâmpada de modo que o atributo Fabricante não seja mais do tipo String e sim do tipo Fabricante 
(além da classe Lampada, a classe Principal/Main pode ser adaptada também, dependendo da forma que tenha sido 
implementada).

1 - Adapte o exercício postado no dia 20/05 de modo que o atributo endereço na classe Fornecedor, seja uma classe 
chamada Endereco. Os atributos são: 
rua, cep, cidade, bairro. Adicione os métodos para ler e exibir os atributos. 
A leitura dos dados deve ser realizada pelo teclado. 
2 - No menu criado na classe Principal/Main, adicione as seguintes funcionalidades:
   8 - Exibir a quantidade de lâmpadas cujo Fornecedor é da cidade de Arapiraca.
   9 - Atualizar o CEP do Fornecedor de uma das lâmpadas (perguntar o valor do novo CEP e de qual lâmpada)
*/
package IFAL.exe11_20;
import IFAL.Classes.Lampada_exe_13;
import java.util.Scanner;
public class XXexe_13 {
   public static void main(String[] args) {
       Scanner scanf = new Scanner (System.in);
       Lampada_exe_13 lamp = new Lampada_exe_13();
       
       lamp.ler();
       lamp.exibirDados();
       lamp.ligar();
       lamp.desligar();
       lamp.alterarPreco();
   }
}
