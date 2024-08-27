import java.util.Random;
import java.util.Scanner;

/*
 * Classe principal que implementa o jogo "Pedra, Papel, Tesoura" em Java.
 */
 
public class App {
 
	public static void main(String[] args) {
		
		// Cria uma instância de Random para gerar escolhas aleatórias do computador
		Random aleatorio = new Random();
		// Cria um Scanner para ler a entrada do usuário
		Scanner sc = new Scanner(System.in);

		// Array contendo as três opções do jogo: "pedra", "papel", e "tesoura"
		String[] opcoes = {"pedra", "papel", "tesoura"};
		// Variável de controle do loop do jogo
        	boolean opcao = true;

		// Loop principal do jogo
        	while (opcao){
		    	// Solicita ao usuário que escolha entre "pedra", "papel" ou "tesoura"
		    	System.out.println("Pedra, papel ou tesoura? ");
		    	// Lê a resposta do usuário e converte para minúsculas
		    	String resposta = sc.nextLine().toLowerCase();

		   	// Gera uma escolha aleatória para o computador
		    	int escolhaComputador = aleatorio.nextInt(3);
		    	// Atribui a escolha do computador a uma string correspondente
		    	String computadorEscolhe = opcoes[escolhaComputador];

		    	// Exibe a escolha do computador
            	    	System.out.println("O computador escolheu: " + computadorEscolhe);

		    	// Verifica se a escolha do usuário é igual à escolha do computador (empate)
		    	if(computadorEscolhe.equals(resposta)) {
				System.out.println("Empate!");
		    	}
		    	// Verifica se o usuário venceu (comparando as escolhas)
		    	else if ((computadorEscolhe.equals("pedra") && resposta.equals("papel")) || (computadorEscolhe.equals("papel") && resposta.equals("tesoura")) || (computadorEscolhe.equals ("tesoura") && resposta.equals("pedra"))) {
				System.out.println("Parabéns, você venceu!");
		    	}
		    	// Caso contrário, o usuário perdeu
		   	else{
		    		System.out.println("Você perdeu!");
		   	}
	   	 	// Pergunta ao usuário se ele quer jogar novamente
            		System.out.println("Vamos jogar de novo? S/N");

	   	 	// Lê a resposta do usuário
           	 	String jogarDeNovo = sc.nextLine();

	   		 // Se o usuário escolher "N", o loop termina
            		if(jogarDeNovo.equals("N")){
                		opcao = false;
            		}
            	}

		// Fecha o Scanner para liberar os recursos
        	sc.close();
	}
}
