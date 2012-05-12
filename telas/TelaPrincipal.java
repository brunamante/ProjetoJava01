package br.com.softex.telas;

@SuppressWarnings("serial")
public class TelaPrincipal extends javax.swing.JFrame {

	public TelaPrincipal() {
		initComponents();
	}

	private void initComponents() {

		jBAcessarConta = new javax.swing.JButton();
		jBNovaConta = new javax.swing.JButton();
		jLBanco = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jBAcessarConta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		jBAcessarConta.setText("ACESSAR CONTA");
		jBAcessarConta.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jBAcessarContaActionPerformed(evt);
			}
		});

		jBNovaConta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		jBNovaConta.setText("CRIAR NOVA CONTA");
		jBNovaConta.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jBNovaContaActionPerformed(evt);
			}
		});

		jLBanco.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLBanco.setText("BANCO SOFTEX");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(73, 73, 73)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING,
												false)
												.addComponent(
														jBAcessarConta,
														javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(
														jBNovaConta,
														javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														248, Short.MAX_VALUE))
								.addContainerGap(62, Short.MAX_VALUE))
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap(235, Short.MAX_VALUE)
								.addComponent(jLBanco).addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLBanco)
								.addGap(55, 55, 55)
								.addComponent(jBAcessarConta,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										39,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jBNovaConta,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										39,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(43, Short.MAX_VALUE)));

		pack();
	}

	@SuppressWarnings("deprecation")
	private void jBNovaContaActionPerformed(java.awt.event.ActionEvent evt) {
		new NovaConta().show();
		setVisible(false);
	}

	@SuppressWarnings("deprecation")
	private void jBAcessarContaActionPerformed(java.awt.event.ActionEvent evt) {
		new EntarConta().show();
		setVisible(false);
	}

	public static void main() {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TelaPrincipal().setVisible(true);
			}
		});
	}

	private javax.swing.JButton jBAcessarConta;
	private javax.swing.JButton jBNovaConta;
	private javax.swing.JLabel jLBanco;

}
