import java.util.Random;
import java.util.Scanner;
 
public class App {
 
	public static void main(String[] args) {

		Random aleatorio = new Random();
		Scanner sc = new Scanner(System.in);

		String[] opcoes = {"pedra", "papel", "tesoura"};
        boolean opcao = true;

        while (opcao){
		    System.out.println("Pedra, papel ou tesoura? ");
		    String resposta = sc.nextLine().toLowerCase();

		    int escolhaComputador = aleatorio.nextInt(3);
		    String computadorEscolhe = opcoes[escolhaComputador];

            System.out.println("O computador escolheu: " + computadorEscolhe);

		    if(computadorEscolhe.equals(resposta)) {
			System.out.println("Empate!");
		    }else if ((computadorEscolhe.equals("pedra") && resposta.equals("papel")) || (computadorEscolhe.equals("papel") && resposta.equals("tesoura")) || (computadorEscolhe.equals ("tesoura") && resposta.equals("pedra"))) {
			System.out.println("Parabéns, você venceu!");
		    }else {
		    	System.out.println("Você perdeu!");
		    }

            System.out.println("Vamos jogar de novo? S/N");

            String jogarDeNovo = sc.nextLine();

            if(jogarDeNovo.equals("N")){
                opcao = false;
            }
        }
        sc.close();
	}
}