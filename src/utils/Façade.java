package utils;

import model.Cpu;
import model.HardDrive;
import model.Memoria;

public class Façade {
	
	private Cpu CPU = new Cpu();
	private HardDrive HD = new HardDrive();
	private Memoria Mem = new Memoria();
	
	public Façade() {
	}
	//Faxada para controlar CPU
	public void ligar() {
		this.CPU.start();
	}
	
	public void executar() {
		this.CPU.execute();
	}
	
	public void carregar() {
		this.CPU.load();
	}
	
	public void livre() {
		this.CPU.free();
	}
	
	//Faxada para controlar HD
	public void ler() {
		this.HD.read();
	}
	
	public void escrever() {
		this.HD.write();
	}
	
	//Faxada para controlar Memória
	public void carregarM() {
		this.Mem.load();
	}
	
	public void livreM() {
		this.Mem.free();
	}
}
