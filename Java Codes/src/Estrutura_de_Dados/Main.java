package Estrutura_de_Dados;

public class Main {

	public static void main(String[] args) {
		Fila fila = new Fila();

		fila.inserir(1);
		fila.inserir(2);
		fila.inserir(3);
		fila.inserir(4);
		fila.inserir(5);
		
		while (! fila.vazio()) {
			int x = fila.retirar();
			System.out.println("Retirado: "+x);
		}
		int y = fila.retirar();
	}

}
