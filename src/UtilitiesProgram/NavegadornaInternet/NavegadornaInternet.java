package UtilitiesProgram.NavegadornaInternet;

import java.util.Scanner;

public class NavegadornaInternet implements NavegadornaInternetInterface {
	Scanner scanner = new Scanner(System.in);
	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo Página "+ url);		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Abrindo Aba");	
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando Página");	
		
	}

}
