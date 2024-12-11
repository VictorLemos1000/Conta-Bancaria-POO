package bancario.projeto.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;

public class ContaBancaria {

	/**
	 * 
	 */
	private Integer numeroConta;
	private float saldo;
	// O tipo LocalDateTime ele determida data e hora que algo foi criado,
	// neste caso é a data de abertura de uma conta bancária.
	private LocalDateTime dataAbertura;
	private boolean status;

	/*
	 * ArrayList do tipo ContaBancaria;
	 * Este atributo contas ele vai fazer uma
	 * listagem de contas associadas a um determinado cliente;
	 */
			  // Dentro do diamente é onde estar determinado o tipo do ArrayList
	ArrayList<ContaBancaria> contas;
	
	public ContaBancaria() {
		
	}
	
	public ContaBancaria(Integer numero, LocalDateTime dataAbertura) {
		this.numeroConta = numero;
		this.saldo = 0f;
		this.dataAbertura = dataAbertura;
		this.status = true;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(numeroConta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaBancaria other = (ContaBancaria) obj;
		return Objects.equals(numeroConta, other.numeroConta);
	}

	// Métodos geters e seters para os respectivos atributos dentro da classe;
	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public LocalDateTime getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(LocalDateTime dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	

	@Override
	public String toString() {
		return "ContaBancaria [numeroConta=" + numeroConta + ", saldo=" + saldo + ", dataAbertura=" + dataAbertura
				+ ", status=" + status + "]";
	}

	/*
	 * O método de depositar tem como foco incluir
	 * certa quantia a sua respectiva conta caso necessário
	 * nesta atividade só podemos adicionar certa quantia caso
	 * ela seja maior que 
	 */
	public void depositar(float quantia) {
		if (status) {
			if (quantia > 0.0f) {
				this.saldo += quantia;
				System.out.println("Deposito realizado com sucesso.");
			} else {
				System.err.println("Valor invalido para deposito.");
			}
		} else {
			System.err.println("Operação não permitida. Conta desativada.");
		}
	}

	public void sacar(float quantia) {
		if (status) {
			if (quantia > 0.0f) {
				if (this.saldo >= quantia) {
					this.saldo -= quantia;
					System.out.println("Saque realizado com sucesso!");
				} else {
					System.err.println("Saldo insuficiente.");
				}
			} else {
				System.err.println("Valor invalido para saque.");
			}
		} else {
			System.err.println("Operação não permitida. Conta desativada.");
		}

	}

	public void transferir(ContaBancaria c, float quantia) {
		if (status && c.isStatus()) {
			if (quantia > 0) {
				System.err.println("Valor invalido para transferencia.");
			} else if (quantia <= saldo) {
				this.saldo -= quantia;
				c.saldo += quantia;
			} else
				System.err.println("Saldo insuficiente para realizar a transferencia.");
		} else {
			System.err.println("Operacao nao pode ser realizada entre contas desativadas.");
		}

	}
}
