package controller;

import java.util.ArrayList;
import java.util.Hashtable;

import javax.swing.JOptionPane;

public class BuilderHash {

	public Hashtable<Double, ArrayList<String>> adicionar(String nome, String rg, String cpf, String telefone) {
		Hashtable<Double, ArrayList<String>> dados = new Hashtable<Double, ArrayList<String>>();
		ArrayList<String> informacoes = new ArrayList<String>();
		informacoes.add(nome);
		informacoes.add(rg);
		informacoes.add(cpf);
		informacoes.add(telefone);
		double chave = Double.parseDouble(cpf);
		dados.put(chave, informacoes);
		return dados;
	}

	public void buscar(Double chave, Hashtable<Double, ArrayList<String>> dados) {
			ArrayList<String> dados_consulta = new ArrayList<String>();
			try {
				dados_consulta = dados.get(chave);
				String retorno = "Nome: " + dados_consulta.get(0) + "\nRG: " + dados_consulta.get(1) + "\nCPF: " + dados_consulta.get(2) + "\nTelefone: " + dados_consulta.get(3);
				JOptionPane.showMessageDialog(null, retorno);
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "CPF Invalido ou Inesistente na Base");
			}
		
	}
}