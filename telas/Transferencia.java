package br.com.softex.telas;

import javax.swing.JOptionPane;

import br.com.softex.exception.ContaException;
import br.com.softex.service.ContaService;

@SuppressWarnings("serial")
public class Transferencia extends javax.swing.JFrame {
	ContaService service = new ContaService();

	public Transferencia() {
		initComponents();
	}

	public Transferencia(String numero) {
		initComponents();
		jLConta.setText(numero);
	}

	private void initComponents() {

		jLTextoTransferencia = new javax.swing.JLabel();
		jLBanco = new javax.swing.JLabel();
		jBExecutar = new javax.swing.JButton();
		jLTranferencia = new javax.swing.JLabel();
		jTFTransferencia = new javax.swing.JTextField();
		jLContaDestino = new javax.swing.JLabel();
		jTFContaDestino = new javax.swing.JTextField();
		jLTextoConta = new javax.swing.JLabel();
		jLConta = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLTextoTransferencia.setFont(new java.awt.Font("Tahoma", 1, 12));
		jLTextoTransferencia.setText("Tranferência");

		jLBanco.setFont(new java.awt.Font("Tahoma", 1, 18));
		jLBanco.setText("BANCO SOFTEX");

		jBExecutar.setText("Executar");
		jBExecutar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jBExecutarActionPerformed(evt);
			}
		});

		jLTranferencia.setFont(new java.awt.Font("Tahoma", 1, 12));
		jLTranferencia.setText("Digite o valor do tranferência:");

		jLContaDestino.setFont(new java.awt.Font("Tahoma", 1, 12));
		jLContaDestino.setText("Digite a conta de destino:");

		jLTextoConta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLTextoConta.setText("Conta:");

		jLConta.setText("");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap(286, Short.MAX_VALUE)
								.addComponent(jBExecutar).addGap(53, 53, 53))
				.addGroup(
						layout.createSequentialGroup()
								.addGap(30, 30, 30)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLTextoConta)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jLConta))
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																				.addComponent(
																						jLContaDestino)
																				.addComponent(
																						jLTranferencia))
																.addGap(22, 22,
																		22)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jLBanco)
																				.addGroup(
																						layout.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								false)
																								.addComponent(
																										jTFTransferencia,
																										javax.swing.GroupLayout.Alignment.LEADING)
																								.addComponent(
																										jTFContaDestino,
																										javax.swing.GroupLayout.Alignment.LEADING,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										61,
																										Short.MAX_VALUE))))
												.addComponent(
														jLTextoTransferencia))
								.addContainerGap(40, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jLTextoTransferencia)
												.addComponent(
														jLBanco,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														27,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLTextoConta)
												.addComponent(jLConta))
								.addGap(32, 32, 32)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jTFTransferencia,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLTranferencia))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLContaDestino)
												.addComponent(
														jTFContaDestino,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(24, 24, 24).addComponent(jBExecutar)
								.addContainerGap(22, Short.MAX_VALUE)));

		pack();
	}

	@SuppressWarnings("deprecation")
	private void jBExecutarActionPerformed(java.awt.event.ActionEvent evt) {
		if ((jTFContaDestino.getText() == null)
				|| ("".equals(jTFContaDestino.getText()))) {
			JOptionPane.showMessageDialog(null, "Digite a conta destino!");
		} else if ((jTFTransferencia.getText() == null)
				|| ("".equals(jTFTransferencia.getText()))) {
			JOptionPane.showMessageDialog(null, "Digite sua conta!");
		} else {
			try {
				service.tranferencia(jTFContaDestino.getText(), Double.parseDouble(jTFTransferencia.getText()));
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (ContaException e) {
				e.printStackTrace();
			}
			new Movimentacoes().show();
			setVisible(false);
		}

	}

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Transferencia().setVisible(true);
			}
		});
	}

	private javax.swing.JButton jBExecutar;
	private javax.swing.JLabel jLBanco;
	private javax.swing.JLabel jLConta;
	private javax.swing.JLabel jLContaDestino;
	private javax.swing.JLabel jLTextoConta;
	private javax.swing.JLabel jLTextoTransferencia;
	private javax.swing.JLabel jLTranferencia;
	private javax.swing.JTextField jTFContaDestino;
	private javax.swing.JTextField jTFTransferencia;

}
