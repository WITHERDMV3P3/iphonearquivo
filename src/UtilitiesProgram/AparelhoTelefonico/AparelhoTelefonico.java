package UtilitiesProgram.AparelhoTelefonico;

import java.util.Scanner;

public class AparelhoTelefonico implements AparelhoTelefonicoInterface {

	Scanner scanner = new Scanner(System.in);
	@Override
	public void ligar(String numero) {
		System.out.println("Ligando... " + numero);
	}

	@Override
	public void atender() {
		System.out.println("A Atender...");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Deixe seu Recado");
	}

}
