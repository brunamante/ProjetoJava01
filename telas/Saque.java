package br.com.softex.telas;
import javax.swing.JOptionPane;
import br.com.softex.exception.ContaException;
import br.com.softex.service.ContaService;

@SuppressWarnings("serial")
public class Saque extends javax.swing.JFrame {
	ContaService service = new ContaService();

	public Saque() {
		initComponents();
	}

	public Saque(String numero) {
		initComponents();
		jLConta.setText(numero);
	}

	private void initComponents() {

		jLBanco = new javax.swing.JLabel();
		jLTextoSaque = new javax.swing.JLabel();
		jLSaque = new javax.swing.JLabel();
		jTFSaque = new javax.swing.JTextField();
		jBExecutar = new javax.swing.JButton();
		jLTextoConta = new javax.swing.JLabel();
		jLConta = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLBanco.setFont(new java.awt.Font("Tahoma", 1, 18));
		jLBanco.setText("BANCO SOFTEX");

		jLTextoSaque.setFont(new java.awt.Font("Tahoma", 1, 12));
		jLTextoSaque.setText("Saque");

		jLSaque.setFont(new java.awt.Font("Tahoma", 1, 12));
		jLSaque.setText("Digite o valor do saque:");

		jTFSaque.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionPerformed(evt);
			}
		});

		jBExecutar.setText("Executar");
		jBExecutar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jBExecutarActionPerformed(evt);
			}
		});

		jLTextoConta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLTextoConta.setText("Conta:");

		jLConta.setText("");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLSaque)
																.addGap(22, 22,
																		22)
																.addComponent(
																		jTFSaque,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		52,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(75, 75,
																		75)
																.addComponent(
																		jBExecutar)
																.addContainerGap())
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																				.addComponent(
																						jLTextoConta)
																				.addComponent(
																						jLTextoSaque))
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																										111,
																										Short.MAX_VALUE)
																								.addComponent(
																										jLBanco)
																								.addGap(109,
																										109,
																										109))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGap(18,
																										18,
																										18)
																								.addComponent(
																										jLConta)
																								.addContainerGap()))))));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jLBanco,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														27,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLTextoSaque))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLTextoConta)
												.addComponent(jLConta))
								.addGap(27, 27, 27)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jTFSaque,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLSaque)
												.addComponent(jBExecutar))
								.addContainerGap(30, Short.MAX_VALUE)));

		pack();
	}

	@SuppressWarnings("deprecation")
	private void jBExecutarActionPerformed(java.awt.event.ActionEvent evt) {
		
		if ((jTFSaque.getText() == null) || ("".equals(jTFSaque.getText()))) {
			JOptionPane.showMessageDialog(null, "Digite o valor do saque!");
		} else {
			try {
			service.saque(Double.parseDouble(jTFSaque.getText()));
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (ContaException e) {
				e.printStackTrace();
			}
		}
			new Movimentacoes().show();
			setVisible(false);
		
	}

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Saque().setVisible(true);
			}
		});
	}

	private javax.swing.JButton jBExecutar;
	private javax.swing.JLabel jLBanco;
	private javax.swing.JLabel jLConta;
	private javax.swing.JLabel jLSaque;
	private javax.swing.JLabel jLTextoConta;
	private javax.swing.JLabel jLTextoSaque;
	private javax.swing.JTextField jTFSaque;

}
