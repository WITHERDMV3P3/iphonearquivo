package Iphone;

import java.util.Scanner;

import UtilitiesProgram.AparelhoTelefonico.AparelhoTelefonico;
import UtilitiesProgram.NavegadornaInternet.NavegadornaInternet;
import UtilitiesProgram.ReprodutorMusical.ReprodutorMusical;

public class Iphone {

	public static void main(String[] args) {
		AparelhoTelefonico aparelhotelefonico = new AparelhoTelefonico();
		NavegadornaInternet navegadornainternet = new NavegadornaInternet();
		ReprodutorMusical reprodutormusical = new ReprodutorMusical();
		Scanner scanner = new Scanner(System.in);
		int escolha;
		
		System.out.println("Selecione o APP que deseja acessar");
		System.out.println("1 - Aparelho Telefonico \n2 - Navegador \n3 - Reprodutor Musical");
		escolha = scanner.nextInt();
		
		switch (escolha) {
		case 1: {
			System.out.println("Digite o numero de telefone: ");
			String numero = scanner.next();
			aparelhotelefonico.ligar(numero);
			
			aparelhotelefonico.atender();
			
			aparelhotelefonico.iniciarCorreioVoz();
		
			break;
		}
		case 2: {
			System.out.println("Digite a URL do site: ");
			String url = scanner.next();
			navegadornainternet.exibirPagina(url);
			
			navegadornainternet.atualizarPagina();
			
			navegadornainternet.adicionarNovaAba();
			break;
		}
		case 3: {
			System.out.println("Digite o nome da musica");
			String musica = scanner.next();
			reprodutormusical.selecionarMusica(musica);
			
			reprodutormusical.tocar();
			
			reprodutormusical.pausar();
			break;
		}
		default:
			throw new IllegalArgumentException("Selecione o App desejado, Tente Novamente");
		}
	}

}
