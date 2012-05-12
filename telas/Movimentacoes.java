package br.com.softex.telas;

import br.com.softex.domain.ContaCorrente;
import br.com.softex.domain.ContaInvestimento;
import br.com.softex.domain.ContaPolpanca;
import br.com.softex.service.ContaService;

@SuppressWarnings("serial")
public class Movimentacoes extends javax.swing.JFrame {

	public Movimentacoes() {
		initComponents();
		jLNumeroConta.setText(ContaService.getConta().getNumeroConta());
		jLNumeroAgencia.setText(ContaService.getConta().getAgencia());
		if (ContaService.getConta() instanceof ContaCorrente){
			jLNomeTipo.setText("Corrente");
		}else if(ContaService.getConta() instanceof ContaPolpanca){
			jLNomeTipo.setText("Polpanca");
		}else if(ContaService.getConta() instanceof ContaInvestimento){
			jLNomeTipo.setText("Investimento");
		}
	}



	private void initComponents() {

		jLBanco = new javax.swing.JLabel();
		jLAgencia = new javax.swing.JLabel();
		jLConta = new javax.swing.JLabel();
		jLTipo = new javax.swing.JLabel();
		jLNumeroAgencia = new javax.swing.JLabel();
		jLNumeroConta = new javax.swing.JLabel();
		jLNomeTipo = new javax.swing.JLabel();
		jBDeposito = new javax.swing.JButton();
		jBSaque = new javax.swing.JButton();
		jBTransferencia = new javax.swing.JButton();
		jBExtrato = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLBanco.setFont(new java.awt.Font("Tahoma", 1, 18));
		jLBanco.setText("BANCO SOFTEX");

		jLAgencia.setFont(new java.awt.Font("Tahoma", 1, 12));
		jLAgencia.setText("Agencia:");

		jLConta.setFont(new java.awt.Font("Tahoma", 1, 12));
		jLConta.setText("Conta:");

		jLTipo.setFont(new java.awt.Font("Tahoma", 1, 12));
		jLTipo.setText("Conta ");

		jLNumeroAgencia.setText("");

		jLNumeroConta.setText("");

		jLNomeTipo.setText("");

		jBDeposito.setFont(new java.awt.Font("Tahoma", 1, 12));
		jBDeposito.setText("DEPÓSITO");
		jBDeposito.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jBDepositoActionPerformed(evt);
			}
		});

		jBSaque.setFont(new java.awt.Font("Tahoma", 1, 12));
		jBSaque.setText("SAQUE");
		jBSaque.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jBSaqueActionPerformed(evt);
			}
		});

		jBTransferencia.setFont(new java.awt.Font("Tahoma", 1, 12));
		jBTransferencia.setText("TRANSFERÊNCIA");
		jBTransferencia.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jBTransferenciaActionPerformed(evt);
			}
		});

		jBExtrato.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		jBExtrato.setText("EXTRATO");
		jBExtrato.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jBExtratoActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addContainerGap()
																.addComponent(
																		jLAgencia)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jLNumeroAgencia)
																.addGap(3, 3, 3)
																.addComponent(
																		jLConta)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(
																		jLNumeroConta,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		38,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(
																		jLTipo)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jLNomeTipo,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		81,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jLBanco))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(37, 37,
																		37)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jBDeposito,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						176,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						jBTransferencia,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						176,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGap(36, 36,
																		36)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jBExtrato,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						176,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						jBSaque,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						176,
																						javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLAgencia)
												.addComponent(jLTipo)
												.addComponent(jLNumeroAgencia)
												.addComponent(jLNomeTipo)
												.addComponent(jLConta)
												.addComponent(jLNumeroConta)
												.addComponent(
														jLBanco,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														27,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(78, 78, 78)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jBDeposito,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														40,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jBSaque,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														40,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jBTransferencia,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														40,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jBExtrato,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														40,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap(40, Short.MAX_VALUE)));

		pack();
	}

	@SuppressWarnings("deprecation")
	private void jBTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {
		new Transferencia(jLNumeroConta.getText()).show();
		setVisible(false);
	}

	@SuppressWarnings("deprecation")
	private void jBDepositoActionPerformed(java.awt.event.ActionEvent evt) {
		new Deposito(jLNumeroConta.getText()).show();
		setVisible(false);
	}

	@SuppressWarnings("deprecation")
	private void jBSaqueActionPerformed(java.awt.event.ActionEvent evt) {
		new Saque(jLNumeroConta.getText()).show();
		setVisible(false);
	}

	@SuppressWarnings("deprecation")
	private void jBExtratoActionPerformed(java.awt.event.ActionEvent evt) {
		new Extrato(jLNumeroConta.getText()).show();
		setVisible(false);
	}

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Movimentacoes().setVisible(true);
			}
		});
	}

	private javax.swing.JButton jBDeposito;
	private javax.swing.JButton jBExtrato;
	private javax.swing.JButton jBSaque;
	private javax.swing.JButton jBTransferencia;
	private javax.swing.JLabel jLAgencia;
	private javax.swing.JLabel jLBanco;
	private javax.swing.JLabel jLConta;
	private javax.swing.JLabel jLNomeTipo;
	private javax.swing.JLabel jLNumeroAgencia;
	private javax.swing.JLabel jLNumeroConta;
	private javax.swing.JLabel jLTipo;

}
