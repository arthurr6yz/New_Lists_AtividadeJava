package org.listaalgoritmos.template;



public class RespostaListaExercicio {
	
	/*
	 * Utilize apenas o método main para testar a implementação dos métodos. 
	 * Não se faz necessário implementar dentro do escopo do método.
	 */
	public static void main(String[] args) {
		
	}
	
	/**
	 * Método deve calcular o IMC utilizando peso e altura. Como resultado
	 * o método deve retornar uma variável resultado do tipo float.
	 * @param peso
	 * @param altura
	 * @return resultado
	 */
	public static float calcularImc(float peso, float altura) 
	{
		float imc = peso / (altura * altura);
		return imc;
	}
	
	/**
	 * Método deve calcular a área do trapézio independente da unidade de medida.
	 * Como resultado, o método deve retornar a área calculada.
	 * @param baseMaior
	 * @param baseMenor
	 * @param altura
	 * @return areaTrapezio
	 */
	public static float calcularAreaTrapezio(float baseMaior, float baseMenor, float altura) 
	{	
		float area = ((baseMaior + baseMenor) * altura) / 2;
		return area;
	}
	
	/**
	 * O método deve calcular o maior entre dois inteiros, que são fornecidos
	 * como argumento do método. O retorno deve ser o maior valor dado
	 * como entrada, sendo do tipo inteiro.
	 * @param a
	 * @param b
	 * @return maiorValor
	 */
	public static int maiorEntreDoisInteiros(int A, int B) 
	{
		if (A > B) {
			return A;
		}
		else
		return B;
		
	}
	
	/**
	 * Método verifica se o número apresentado como argumento é ímpar ou par.
	 * caso seja par, o retorno do método deve ser verdadeiro. Caso contrário,
	 * o valor retornado deve ser falso.
	 * @param numero
	 * @return condicao
	 */
	public static boolean verificarParImpar(int num) 
	{
		if (num % 2 == 0) {
			return true;
		}
		return false;		
	}
	
	/**
	 * Método calcula a média aritmetica dos elementos float a partir de um array. 
	 * O retorno deve ser o resultado do cálculo da média.
	 * @param notas
	 * @return media
	 */
	public static float calcularMediaNotas(float[] notas) {
		float soma = 0;
		for (int i = 0 ; i < notas.length ; i++) {
			soma = soma + notas[i];
		}
		
		float calcularMedia = soma / notas.length;
		return calcularMedia;
		
	}
	
	/**
	 * Método imprime array de inteiros no sentido inverso, separando os elementos por vírgula.
	 * O último elemento impresso não deve preceder vírgula. Use o System.out.print() para imprimir os valores.
	 * Os elementos devem ser impresso numa única linha.
	 * @param array
	 */
	public static void imprimirArrayInverso(int[] array)
	{
		for (int i = array.length-1 ; i >= 0 ; i--) {
			if(i !=0)
		System.out.print(array[i]+" , ");
			else 
				System.out.print(array[i]);
		}
	}
	
	/**
	 * Método deve imprimir os elementos primos de um array de inteiros. O formato da impressão 
	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os elementos e 
	 * após o último elemento. Utilize System.out.print()
	 * @param array
	 */
	public static void imprimirElementosPrimos(int[] array) 
	{
		for (int i = 0; i <= array.length - 1; i++) {
			int numerosPrimos = 0;
			
			for (int numero = 1 ; numero <= array[i]; numero++) {
				if(array[i] % numero == 0) {
					numerosPrimos++;
				}
			}
			
			if(numerosPrimos == 2 ) {
				System.out.print(array[i] + "");
			}
		}

	}
	
	
	/**
	 * Método deve imprimir os elementos ímpares de um array de inteiros. O formato da impressão 
	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os elementos e 
	 * após o último elemento. Utilize System.out.print()
	 * @param array
	 */
	public static void imprimirElementosImpares(int[] array) 
	{
		for (int i = 0 ; i < array.length ; i++) {
			if(array[i] % 2 != 0) {
				System.out.print(array[i] + " ");
			}
		}
		
	}
	
	
	/**
	 * Método deve imprimir os elementos pares de um array de inteiros. O formato da impressão 
	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os elementos e 
	 * após o último elemento. Utilize System.out.print()
	 * @param array
	 */
	public static void imprimirElementosPares(int[] array) 
	{
		for (int i = 0 ; i < array.length ; i++) {
			if(array[i] % 2 == 0) {
						System.out.print(array[i] + " ");
			}
		}

	}
	
	
	/**
	 * Método deve imprimir o maior e o menor elemento de um array de inteiros. O formato da impressão 
	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os elementos e 
	 * após o último elemento. Utilize System.out.print()
	 * @param array
	 */
	public static void imprimirMaiorMenorElemento(int[] array) 
	{
		int maiorNumero = array[0];
		int menorNumero = array[0];
		
		for (int i = 0 ; i < array.length ; i++) {
			if (maiorNumero < array[i]) {
				maiorNumero = array[i];
			}
			if (menorNumero > array[i]) {
				menorNumero = array[i];
			}
		}
		System.out.print(maiorNumero + "  " + menorNumero + " ");
	}
	
	/**
	 * O método calcula a média aritmética dos elementos de um array de inteiros. 
	 * Como resultado, o valor da média deve ser retornado no método.
	 * @param array
	 * @return media
	 */
	public static float calcularMediaAritmetica(int[] array) 
	{
		float soma = 0;
		for (int i = 0 ; i < array.length ; i++) {
			soma += array[i];
		}
		float media = soma / array.length;
		return media;
	}
	
}
