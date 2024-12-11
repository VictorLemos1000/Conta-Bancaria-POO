package bancario.projeto.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

// A classe Cliente ela executará todas as possíveis tarefas que um usuário pode realizar numa conta bancária
// Como adicionar Cliente, remover Cliente, localizar cliente e atualizar cliente;
public class Cliente implements Serializable{ //Serialização de cliente
	
	// SerialversionUID
	private final long seralVersionUID = 1L; 
	private String cpf;
	private String nome;
		
	// Este atributo conta ele vai armazenar uma lista de N contas que um usuário pode conter em um determinado banco
	ArrayList<ContaBancaria> contas = new ArrayList<>();
	public Cliente() {
		
	}
	
	// Método construtor da classe Cliente;
	public Cliente(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	/*
	 * Neste método ele realizará a tarefa de verificar se
	 * há uma conta já cadastrada a um determidado cliente
	 * através de seu número de conta, caso contrário o cliente será
	 * adicionado ao sistema bancário.
	 */
	public void adicionasConta(ContaBancaria numeroConta) {
		if (contas.contains(numeroConta)) {
			System.out.println(" Cliente já vinculado a conta!!!");
		} else {
			contas.add(numeroConta);
			System.out.println(" Conta criada com sucesso!!!");
		}
	}
	
	/*
	 * No método remover conta realizará a seguinte funcionalidade
	 * verificar se o cliente está vinculado uma conta bancária
	 * caso sim irá remover o usuário da plataforma, caso contrário
	 * é porque você não possui uma conta no ambiente monetário;
	 */
	public void removerConta(ContaBancaria numeroConta) {
		if (contas.contains(numeroConta)) {
			contas.remove(numeroConta);
			System.out.println(" Conta removida com sucesso!!!");
		} else {
			System.out.println(" Conta não cadastrada.");
		}
	}
	
	/*
	 * O getContas ele apenas retornará a seguinte informação
	 * de quais contas o cliente possui dentro da aplicação;
	 */
	public ArrayList<ContaBancaria> getContas() {
		return contas;
	}

	/*
	 * O método hashCode ele apenas emite um hash
	 * como saída através do CPF do cliente;
	 */
	@Override
	public int hashCode() {
		return Objects.hash(this.cpf);
	}

	/*
	 * O método equals ele vai comparar se objeto ele é igual a instância
	 * indentificadora CPF para válidar o retorno do objeto;
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
			return Objects.equals(this.cpf, other.cpf);
	}

	/*
	 * O método to String ele vai apenas exibir o as instância
	 * CPF e NOME, para que não apresente um hash como saída de dados;
	 */
	@Override
	public String toString() {
		return "Cliente [cpf=" + this.cpf + ", nome=" + this.nome + "]";
	}
	
	
}
