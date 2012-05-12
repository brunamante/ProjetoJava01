package br.com.softex.telas;

import br.com.softex.exception.ContaException;
import br.com.softex.service.ContaService;

import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class NovaConta extends javax.swing.JFrame {
	ContaService service = new ContaService();
	
	public NovaConta() {
		initComponents();
	}

	private void initComponents() {

		buttonGroup1 = new javax.swing.ButtonGroup();
		jBSalvar = new javax.swing.JButton();
		jRBContaCorrente = new javax.swing.JRadioButton();
		jRBContaPolpanca = new javax.swing.JRadioButton();
		jRBContaInvestimento = new javax.swing.JRadioButton();
		jLTipo = new javax.swing.JLabel();
		jLDefinicaoConta = new javax.swing.JLabel();
		jTFNumero = new javax.swing.JTextField();
		jTFAgencia = new javax.swing.JTextField();
		jLNumero = new javax.swing.JLabel();
		jLAgencia = new javax.swing.JLabel();
		jLBanco = new javax.swing.JLabel();
		jLNome = new javax.swing.JLabel();
		jTFNome = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jBSalvar.setText("Salvar");
		jBSalvar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jBSalvarActionPerformed(evt);
			}
		});

		buttonGroup1.add(jRBContaCorrente);
		jRBContaCorrente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jRBContaCorrente.setText("Conta Corrente");
		jRBContaCorrente.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRBContaCorrenteActionPerformed(evt);
			}
		});

		buttonGroup1.add(jRBContaPolpanca);
		jRBContaPolpanca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jRBContaPolpanca.setText("Conta Polpança");
		jRBContaPolpanca.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRBContaPolpancaActionPerformed(evt);
			}
		});

		buttonGroup1.add(jRBContaInvestimento);
		jRBContaInvestimento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jRBContaInvestimento.setText("Conta Investimento");
		jRBContaInvestimento
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jRBContaInvestimentoActionPerformed(evt);
					}
				});

		jLTipo.setFont(new java.awt.Font("Tahoma", 1, 12));
		jLTipo.setText("Tipo de conta:");

		jLDefinicaoConta.setFont(new java.awt.Font("Tahoma", 1, 14));
		jLDefinicaoConta.setText("Definição de Conta");

		jLNumero.setFont(new java.awt.Font("Tahoma", 1, 12));
		jLNumero.setText("Número:");

		jLAgencia.setFont(new java.awt.Font("Tahoma", 1, 12));
		jLAgencia.setText("Agência:");

		jLBanco.setFont(new java.awt.Font("Tahoma", 1, 18));
		jLBanco.setText("BANCO SOFTEX");

		jLNome.setFont(new java.awt.Font("Tahoma", 1, 12));
		jLNome.setText("Nome:");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(23, 23, 23)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
																.addGroup(
																		layout.createSequentialGroup()
																				.addComponent(
																						jLDefinicaoConta)
																				.addGap(189,
																						189,
																						189)
																				.addGroup(
																						layout.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																								.addGroup(
																										layout.createSequentialGroup()
																												.addComponent(
																														jBSalvar)
																												.addGap(7,
																														7,
																														7))
																								.addComponent(
																										jLBanco)))
																.addGroup(
																		javax.swing.GroupLayout.Alignment.LEADING,
																		layout.createSequentialGroup()
																				.addComponent(
																						jLTipo)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																				.addComponent(
																						jRBContaCorrente)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																				.addComponent(
																						jRBContaPolpanca)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																				.addComponent(
																						jRBContaInvestimento)))
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						layout.createSequentialGroup()
																								.addComponent(
																										jLAgencia)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jLNome)
																								.addGap(24,
																										24,
																										24)))
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				false)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jTFAgencia,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										126,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addGap(59,
																										59,
																										59)
																								.addComponent(
																										jLNumero)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																								.addComponent(
																										jTFNumero,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										141,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addComponent(
																						jTFNome,
																						javax.swing.GroupLayout.Alignment.LEADING))))
								.addContainerGap(22, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(23, 23, 23)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLDefinicaoConta)
												.addComponent(
														jLBanco,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														27,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(55, 55, 55)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLTipo)
												.addComponent(jRBContaCorrente)
												.addComponent(jRBContaPolpanca)
												.addComponent(
														jRBContaInvestimento))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLAgencia)
												.addComponent(
														jTFAgencia,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														20,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLNumero)
												.addComponent(
														jTFNumero,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jTFNome,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														20,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLNome))
								.addGap(21, 21, 21).addComponent(jBSalvar)
								.addContainerGap(34, Short.MAX_VALUE)));

		pack();
	}

	@SuppressWarnings("deprecation")
	private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBSalvarActionPerformed
		if ((jTFAgencia.getText() == null)
				|| ("".equals(jTFAgencia.getText()))) {
			JOptionPane.showMessageDialog(null, "Digite a Agencia!");
		} else if ((jTFNumero.getText() == null)
				|| ("".equals(jTFNumero.getText()))) {
			JOptionPane.showMessageDialog(null,
					"Digite o Numero da Conta!");
		} else if ((jTFNome.getText() == null)
				|| ("".equals(jTFNome.getText()))) {
			JOptionPane.showMessageDialog(null, "Digite o Nome!");
		} else {
			int tipoConta=0;
			if (jRBContaCorrente.isFocusable()) {
				tipoConta=1;
			} else if (jRBContaPolpanca.isFocusable()) {
				tipoConta=2;
			} else if (jRBContaInvestimento.isFocusable()) {
				tipoConta=3;
			}
			try {
				service.novaConta(jTFAgencia.getText(), jTFNumero.getText(), jTFNome.getText(), tipoConta);
			} catch (ContaException e) {
				e.printStackTrace();
			}
			
		}

		setVisible(false);
		new TelaPrincipal().show();

	}

	private void jRBContaCorrenteActionPerformed(java.awt.event.ActionEvent evt) {
	}

	private void jRBContaPolpancaActionPerformed(java.awt.event.ActionEvent evt) {
	}

	private void jRBContaInvestimentoActionPerformed(
			java.awt.event.ActionEvent evt) {
	}

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new NovaConta().setVisible(true);
			}
		});
	}

	private javax.swing.ButtonGroup buttonGroup1;
	private javax.swing.JButton jBSalvar;
	private javax.swing.JLabel jLAgencia;
	private javax.swing.JLabel jLBanco;
	private javax.swing.JLabel jLDefinicaoConta;
	private javax.swing.JLabel jLNome;
	private javax.swing.JLabel jLNumero;
	private javax.swing.JLabel jLTipo;
	private javax.swing.JRadioButton jRBContaCorrente;
	private javax.swing.JRadioButton jRBContaInvestimento;
	private javax.swing.JRadioButton jRBContaPolpanca;
	private javax.swing.JTextField jTFAgencia;
	private javax.swing.JTextField jTFNome;
	private javax.swing.JTextField jTFNumero;

}
