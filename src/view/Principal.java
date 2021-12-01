package view;

import java.util.ArrayList;
import java.util.Hashtable;

import javax.swing.JOptionPane;

import controller.BuilderHash;

public class Principal {
	static BuilderHash ControllerHash = new BuilderHash();
	static Hashtable<Double, ArrayList<String>> dados = new Hashtable<Double, ArrayList<String>>();

	public static void main(String[] args) {
		while (true) {
			int opc = Integer.parseInt(
					JOptionPane.showInputDialog("Menu\n1-Adicionar Comprador\n2-Consultar Comprador\n3-Sair"));
			switch (opc) {
			case 1:
				String nome = JOptionPane.showInputDialog("Digite seu nome: ");
				String rg = JOptionPane.showInputDialog("Digite seu RG: ");
				String cpf = JOptionPane.showInputDialog("Digite seu CPF: ");
				String telefone = JOptionPane.showInputDialog("Digite seu telefone: ");

				dados.putAll(ControllerHash.adicionar(nome, rg, cpf, telefone));
				break;
			case 2:
				Double chave = Double.parseDouble(JOptionPane.showInputDialog("Digite o CPF para buscar: "));
				ControllerHash.buscar(chave, dados);
				break;
			case 3:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Invalida");
			}
		}
	}
}