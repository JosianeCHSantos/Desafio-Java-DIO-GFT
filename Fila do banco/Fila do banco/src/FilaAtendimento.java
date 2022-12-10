/*
* Desafio: A fila do Banco
* Elabore um programa que simule uma fila de atendimento bancário. O programa deve ler o nome de 3 pessoas
* (clientes do banco), armazenando-os em uma fila.
*
* Entrada
* A entrada será o nome de três pessoas (clientes do banco).
*
* Saída
* O programa deve imprimir como saída na tela o nome da pessoa e sua posição na fila.
*
* Entrada	    Saída
* Ana           Ana - esta na posicao: 1
* Sofia         Sofia - esta na posicao: 2
* Lucas         Lucas - esta na posicao: 3
*
* */


// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

//TODO: Implemente uma condição que simule uma fila bancaria, gerando o nome a posição do cliente na fila:
  
 
import java.util.Scanner;

public class FilaAtendimento {

       public static void main(String[] args) {

            String[] nomesFila = new String[3];
            Scanner nome = new Scanner(System.in);

            for (int i = 0; i < nomesFila.length; i++) {
                nomesFila[i] = nome.next();

                System.out.format("%s - esta na posicao: %d%n",nomesFila[i],(i + 1) );
            }
        }
    }