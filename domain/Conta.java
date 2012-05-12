package br.com.softex.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public abstract class Conta implements Serializable{
	private String nome;
	private String agencia;
	private String numeroConta;
	private double saldo;
	List<String> extrato = new ArrayList<String>();
	
	public void addExtrato(String operacao) {
		this.extrato.add(operacao);		
	}
		
	public Conta(String agencia, String numeroConta, String nome) {
		super();
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.nome = nome;
	}
			
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo() {
		return saldo;
	}
	public List<String> getExtrato() {
		return extrato;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}

