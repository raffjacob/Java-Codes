package Estrutura_de_Dados;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

//import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Fila fila = new Fila();
		int opc = 0;
		int opcf = 0;
		JFrame frame = new JFrame("Validação");
	    while (opc!= 9){
	        opc = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma opção:\n 1- Fila\n 9- Sair"));
	        switch (opc) {
	            case 1: 
	            	while (opcf != 9){
	        	        opcf = Integer.parseInt(JOptionPane.showInputDialog("1- Inserir na fila\n 2- Retirar da fila\n 3- Mostrar fila\n 9- Sair"));
	        	        switch (opcf) {
		            		case 1: 
		            			int resp1 = JOptionPane.YES_OPTION;
		            			while (resp1 == JOptionPane.YES_OPTION) {
		            				int input = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor a ser inserido na Fila: "));
		            				fila.inserir(input);
		            				resp1 = JOptionPane.showConfirmDialog(frame,"Deseja inserir mais um valor?", "", JOptionPane.YES_NO_OPTION);
		            			}
		            			break;
		            		case 2:
		            			int resp2 = JOptionPane.YES_OPTION;
		            			while (resp2 == JOptionPane.YES_OPTION) {
		            				if (! fila.vazio()) {
		            					int x = fila.retirar();
		            					System.out.println("Retirado: " + x);
		            				}
		            				else {
		            					JOptionPane.showMessageDialog(null, "Lista vazia!");
		            				}
		            				resp2 = JOptionPane.showConfirmDialog(frame,"Deseja retirar mais um valor?", "", JOptionPane.YES_NO_OPTION);
		            			}
		            			break;
		            		case 3:
		            			fila.mostrar();
		            			break;
		            		default:
		            			break;
	            			}
	            		}
	            	default:
	            		break;
	        }
	    }
	}
}