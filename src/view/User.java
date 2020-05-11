package view;

import utils.Façade;

public class User {
	
	public static void main(String[] args) {
		
		Façade fc = new Façade();
		
		fc.ligar();
		fc.ler();
		fc.carregarM();
		fc.carregar();
		fc.executar();
		fc.escrever();
		
	}

}
