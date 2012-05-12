package br.com.softex.telas;

import javax.swing.JOptionPane;
import br.com.softex.service.ContaService;
@SuppressWarnings("serial")
public class EntarConta extends javax.swing.JFrame {
	ContaService service = new ContaService();

	public EntarConta() {
		initComponents();
	}

	private void initComponents() {

		jBEntar = new javax.swing.JButton();
		jLBanco = new javax.swing.JLabel();
		jLNumero = new javax.swing.JLabel();
		jLDefinicaoConta = new javax.swing.JLabel();
		jTFNumero = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jBEntar.setText("Entrar");
		jBEntar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jBEntarActionPerformed(evt);
			}
		});

		jLBanco.setFont(new java.awt.Font("Tahoma", 1, 18));
		jLBanco.setText("BANCO SOFTEX");

		jLNumero.setFont(new java.awt.Font("Tahoma", 1, 12));
		jLNumero.setText("Número:");

		jLDefinicaoConta.setFont(new java.awt.Font("Tahoma", 1, 14));
		jLDefinicaoConta.setText("Definição de Conta");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup().addContainerGap()
								.addComponent(jLDefinicaoConta)
								.addGap(189, 189, 189).addComponent(jLBanco)
								.addContainerGap(14, Short.MAX_VALUE))
				.addGroup(
						layout.createSequentialGroup()
								.addGap(27, 27, 27)
								.addComponent(jLNumero)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jTFNumero,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										141,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										132, Short.MAX_VALUE)
								.addComponent(jBEntar).addGap(56, 56, 56)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLDefinicaoConta)
												.addComponent(
														jLBanco,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														27,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(28, 28, 28)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLNumero)
												.addComponent(
														jTFNumero,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jBEntar))
								.addContainerGap(23, Short.MAX_VALUE)));

		pack();
	}

	@SuppressWarnings({ "deprecation", "static-access" })
	private void jBEntarActionPerformed(java.awt.event.ActionEvent evt) {
		if ((jTFNumero.getText() == null) || ("".equals(jTFNumero.getText()))) {
			JOptionPane.showMessageDialog(null, "Digite o Numero da Conta!");
		} else {
			try{ContaService.setConta(service.getLista().get(Integer.parseInt(jTFNumero.getText())));
			new Movimentacoes().show();
			setVisible(false);
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Numero de conta nao existe!");
			}
		}
	}

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new EntarConta().setVisible(true);
			}
		});
	}

	private javax.swing.JButton jBEntar;
	private javax.swing.JLabel jLBanco;
	private javax.swing.JLabel jLDefinicaoConta;
	private javax.swing.JLabel jLNumero;
	private javax.swing.JTextField jTFNumero;

}
