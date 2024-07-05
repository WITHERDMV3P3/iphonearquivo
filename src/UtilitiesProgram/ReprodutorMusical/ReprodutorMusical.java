package UtilitiesProgram.ReprodutorMusical;

import java.util.Scanner;

public class ReprodutorMusical implements ReprodutorMusicalInterface {
	Scanner scanner = new Scanner(System.in);
	
	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando Música "+musica);	
		
	}
	@Override
	public void tocar() {
		System.out.println("Tocando Música");	
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando Música");	
		
	}
	
}
