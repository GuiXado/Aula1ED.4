import javax.swing.JOptionPane;

public class Lista1_Ativ4 {

	public static void main(String[] args) {
		int [] vet = {-5, 1, 7, -8, 11, -4, 7};
		int b = vet.length -1 ;
		int a = rec(vet, b, 0);
		JOptionPane.showMessageDialog(null, "O total de n° negativos é: " + a);
	}

	public static int rec(int[] vet, int b, int cont){
		// Parada definida no ponto em que o tamanho do vetor for menor que zero.
		if (b < 0) {
			return cont;
		// Caso o índice seja menor que zero soma 1 ao contador e diminiu o valor do índice.
		} else if (vet[b] < 0) {
			return rec(vet, b-1, cont+1);
		// Caso não atenda a condição anterior irá apenas subtrair 1 do índice para a próxima verificação.
		}else {
			return rec(vet, b-1, cont);
		}
		
	}
}
