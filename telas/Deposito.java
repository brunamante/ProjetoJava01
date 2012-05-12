package br.com.softex.telas;
import javax.swing.JOptionPane;
import br.com.softex.exception.ContaException;
import br.com.softex.service.ContaService;

@SuppressWarnings("serial")
public class Deposito extends javax.swing.JFrame {
	ContaService service = new ContaService();

	public Deposito() {
		initComponents();
	}

	public Deposito(String numero) {
		initComponents();
		jLConta.setText(numero);
	}

	private void initComponents() {

		jBExecutar = new javax.swing.JButton();
		jLBanco = new javax.swing.JLabel();
		jLTextoDeposito = new javax.swing.JLabel();
		jLDeposito = new javax.swing.JLabel();
		jTFDeposito = new javax.swing.JTextField();
		jLTextoConta = new javax.swing.JLabel();
		jLConta = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jBExecutar.setText("Executar");
		jBExecutar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jBExecutarActionPerformed(evt);
			}
		});

		jLBanco.setFont(new java.awt.Font("Tahoma", 1, 18));
		jLBanco.setText("BANCO SOFTEX");

		jLTextoDeposito.setFont(new java.awt.Font("Tahoma", 1, 12));
		jLTextoDeposito.setText("Depósito");

		jLDeposito.setFont(new java.awt.Font("Tahoma", 1, 12));
		jLDeposito.setText("Digite o valor do depósito:");

		jLTextoConta.setFont(new java.awt.Font("Tahoma", 1, 11));
		jLTextoConta.setText("Conta:");

		jLConta.setText("");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
																		jLConta)
																.addContainerGap())
												.addGroup(
														layout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
																.addGroup(
																		layout.createSequentialGroup()
																				.addComponent(
																						jLDeposito)
																				.addGap(22,
																						22,
																						22)
																				.addComponent(
																						jTFDeposito,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						57,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						jBExecutar)
																				.addGap(101,
																						101,
																						101))
																.addGroup(
																		layout.createSequentialGroup()
																				.addComponent(
																						jLTextoDeposito)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																						211,
																						Short.MAX_VALUE)
																				.addComponent(
																						jLBanco)
																				.addGap(21,
																						21,
																						21))))));
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
												.addComponent(jLTextoDeposito))
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
														jTFDeposito,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jBExecutar)
												.addComponent(jLDeposito))
								.addContainerGap(31, Short.MAX_VALUE)));

		pack();
	}

	@SuppressWarnings("deprecation")
	private void jBExecutarActionPerformed(java.awt.event.ActionEvent evt) {
		if ((jTFDeposito.getText() == null)
				|| ("".equals(jTFDeposito.getText()))) {
			JOptionPane.showMessageDialog(null, "Digite o valor do deposito!");
		} else {
			
			try {
				
				service.deposito(Double.parseDouble(jTFDeposito.getText()));
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
				new Deposito().setVisible(true);
			}
		});
	}

	private javax.swing.JButton jBExecutar;
	private javax.swing.JLabel jLBanco;
	private javax.swing.JLabel jLConta;
	private javax.swing.JLabel jLDeposito;
	private javax.swing.JLabel jLTextoConta;
	private javax.swing.JLabel jLTextoDeposito;
	private javax.swing.JTextField jTFDeposito;

}
