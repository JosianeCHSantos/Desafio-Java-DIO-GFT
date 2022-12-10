/*
* Desafio: Encontrando o Percentual de Desconto
* O gerente de uma loja resolveu aplicar descontos em todos os seus produtos!
* A tarefa é calcular a Porcentagem de Desconto aplicada a esses produtos.
*
* Entrada
* A entrada deverá ser feita por dois valores M e D, onde a primeira linha deverá receber o valor
* marcado do produto, e na segunda linha o valor do produto com o desconto já aplicado.
*
* Saída
* A saída deverá retornar o percentual de desconto que foi aplicado no produto, conforme exemplo abaixo.
*
* Entrada
* 40
* 30
*  Saída
* O desconto foi de 25%
*
* Entrada
* 500
* 195
* Saída
* O desconto foi de 61%
*
* Entrada
* 100
* 50
* Saída
* O desconto foi de 50%
*
*
* */




// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

//TODO:  Retorne o percentual de desconto que foi aplicado no produto
      

import java.util.Scanner;

public class PercentualDesconto {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int M = input.nextInt();
        
        int S = input.nextInt();

        double percentual = (S*100 / M);
        System.out.format("O desconto foi de %.0f%%%n" ,(100 - percentual));
    }
}
