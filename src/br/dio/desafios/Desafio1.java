/*Desafio
Duas motos (X e Y) partem em uma mesma direção. A moto X sai com velocidade constante de 60 Km/h e a moto Y sai com 
velocidade constante de 90 Km/h.
Em uma hora (60 minutos) a moto Y consegue se distanciar 30 quilômetros da moto X, ou seja, consegue se afastar um 
quilômetro a cada 2 minutos.
O seu desafio é ler a distância (em Km) e calcular quanto tempo leva (em minutos) para a moto Y tomar essa distância da 
outra moto.
*/

package br.dio.desafios;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		int minutos;
		try (Scanner input = new Scanner(System.in)) {
			minutos = input.nextInt();
		}
		int K = (minutos * 2);
		System.out.printf("%d minutos\n", K); // Digite aqui o calculo dos minutos
	}
}
