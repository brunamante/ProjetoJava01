package br.com.softex.service;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.softex.domain.Conta;
import br.com.softex.domain.ContaCorrente;
import br.com.softex.domain.ContaPolpanca;
import br.com.softex.domain.ContaInvestimento;
import br.com.softex.exception.ContaException;;

public class ContaService {
	static HashMap<Integer, Conta> lista = new HashMap<Integer, Conta>();
	ContaException ex = new ContaException();
	static Conta conta;
	
	public static HashMap<Integer, Conta> getLista() {
		return lista;
	}

	public static void setLista(HashMap<Integer, Conta> lista) {
		ContaService.lista = lista;
	}

	public static Conta getConta() {
		return conta;
	}

	public static void setConta(Conta conta) {
		ContaService.conta = conta;
	}

	public void novaConta(String agencia,String conta,String nome,int tipoConta)throws ContaException{
		if (!lista.containsKey(Integer.parseInt(conta))){
		if (tipoConta==1) {
			lista.put(Integer.parseInt(conta),
					new ContaCorrente(agencia,
							conta, nome));

		} else if (tipoConta==3) {
			lista.put(Integer.parseInt(conta),
					new ContaPolpanca(agencia,
							conta, nome));
		} else if (tipoConta==3) {
			lista.put(Integer.parseInt(conta),
					new ContaInvestimento(agencia,
							conta, nome));
		}
		if (!ex.getMessages().isEmpty()) {
			throw ex;
		}
		gravarLista();
		}else{
			JOptionPane.showMessageDialog(null, "Numero de conta ja existe!");
		}
	}
	
	public void saque(double valor) throws ContaException {

		if (conta.getSaldo()<valor){
			JOptionPane.showMessageDialog(null, "Saldo Insuficiente!");
		}else{
			conta.setSaldo(conta.getSaldo()-valor);
			conta.addExtrato("\n" + valor + " - Saque");
		}
		
		if (!ex.getMessages().isEmpty()) {
			throw ex;
		}
		gravarLista();

	}
	public void deposito(double valor) throws ContaException {

		if(valor<=0){
			JOptionPane.showMessageDialog(null, "Valor negativo!");
		} else{
			conta.setSaldo(conta.getSaldo()+valor);
			conta.addExtrato("\n" + valor + " - Deposito"  );
		}
		
		if (!ex.getMessages().isEmpty()) {
			throw ex;
		}
		gravarLista();

	}
	public void tranferencia(String ncontaDestino, double valor) throws ContaException {
		if (lista.containsKey(Integer.parseInt(ncontaDestino))){
		Conta contaDestino = lista.get(Integer.parseInt(ncontaDestino));
		if (conta.getSaldo() < valor) {
			JOptionPane.showMessageDialog(null, "Saldo Insuficiente!");
		} else{
			conta.setSaldo(conta.getSaldo()-valor);
			contaDestino.setSaldo(contaDestino.getSaldo()+valor);
			conta.addExtrato("\n" + valor + " - Transferido"  );
			contaDestino.addExtrato("\n" + valor + " - Debitado"  );
			
		}
		
		if (!ex.getMessages().isEmpty()) {
			throw ex;
		}
		gravarLista();
		}else{
			JOptionPane.showMessageDialog(null, "Conta nao existe!");
		}
	}
	public List<String> extrato(String nconta) throws ContaException {
		return conta.getExtrato();
	}
	public static void abriLista(){
		try {
			ObjectInputStream input = new ObjectInputStream(
					new FileInputStream(
							"C:/Users/Bruna/workspace/ProjetoJavaBasico/Nova/Contas.ser"));
			
			lista = (HashMap<Integer, Conta>) input.readObject();
			System.out.println(lista);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}		
	}

	public void gravarLista(){

		try {
			ObjectOutputStream out = new ObjectOutputStream(
					new FileOutputStream(
							"C:/Users/Bruna/workspace/ProjetoJavaBasico/Nova/Contas.ser"));
			out.writeObject(lista);
			out.close();
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
}
