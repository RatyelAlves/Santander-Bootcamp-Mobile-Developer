Desafio
Leia dois valores inteiros identificados como vari�veis A e B. Calcule a soma entre elas e chame essa vari�vel de SOMA.
A seguir escreva o valor desta vari�vel.

Entrada
O arquivo de entrada cont�m 2 valores inteiros.

Sa�da
Imprima a vari�vel SOMA com todas as letras mai�sculas, inserindo um espa�o em branco antes e depois do s�mbolo de igualdade, seguido pelo valor correspondente � soma de A e B.

 
Exemplos de entrada	        Exemplos de Sa�da
30							SOMA = 40
10



-30                         SOMA = -20
10


0         					SOMA = 0
0



import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val a = input.nextInt()
    val b = input.nextInt()
    println("SOMA = "+ ( a + b ))  //insira as vari�veis corretamente
}