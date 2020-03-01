package Estrutura_de_Dados;

//import javax.management.RuntimeException;

public class Fila {
	private int[] valores;
	private int   primeiro;
	private int   ultimo;
	private int   total;

	public Fila(){
		valores = new int[5];
		primeiro = 0;
		ultimo = 0;
		total = 0;
	}

	public void inserir(int input){
		if (cheio()) {
			throw new RuntimeException("Fila cheia!");
		}
		valores[ultimo] = input;
		ultimo = (ultimo + 1) % valores.length;
		total++;
	}

	public int retirar(){
		if (vazio()) {
			throw new RuntimeException("Fila vazia!");
		}
		int input = valores[primeiro];
		valores[primeiro] = valores[ultimo];
		primeiro = (primeiro + 1) % valores.length;
		total--;
		return input;
	}
	
	public void mostrar() {
		System.out.print("Fila: ");
		for (int i=0; i<valores.length; i++) {
			System.out.print("["+valores[i]+"]");
		}
		System.out.print("\n");
	}

	public boolean vazio() {
		return total == 0;
	}

	public boolean cheio() {
		return total == valores.length;
	}
}

