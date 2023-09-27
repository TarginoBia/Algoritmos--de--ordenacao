package metodoBolha;

public class BubbleSort {

	public void bolha(int[] vetor) {
		//laço para repetir a "quantidade de elementos do vetor" vezes
		for(int j = 1; j <= vetor.length; j++) {
			//laço para comparar os valores do vetor
			for(int i = 0; i<vetor.length-1; i++) {
				// compara um elemento com o próximo logo depois
				if (vetor[i] > vetor[i+1]) {
					// variavel para guardar o valor maior
					int auxiliar = vetor[i];
					// posicao para guardar o menor valor
					vetor[i]=vetor[i+1];
					// proxima posicaao fica com o valor de maior valor
					vetor[i+1] = auxiliar;
				}
			}

		}

	}
}

