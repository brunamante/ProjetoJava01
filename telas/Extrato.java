package br.com.softex.telas;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import br.com.softex.exception.ContaException;
import br.com.softex.service.ContaService;

@SuppressWarnings("serial")
public class Extrato extends javax.swing.JFrame {
	ContaService service = new ContaService();

	public Extrato() {
		initComponents();
	}
	public Extrato(String numero) {
		initComponents();
		jLConta.setText(numero);
		List<String> texto;
		try {
			int x = 0;
			texto = service.extrato(numero);
			for (String item : texto) {
				model.add(x, item);
				x++;
			}
			
			
		} catch (ContaException e) {
			e.printStackTrace();
		}
		
	}

	private void initComponents() {

		jLTextoExtrato = new javax.swing.JLabel();
		jLBanco = new javax.swing.JLabel();
		jLTextoConta = new javax.swing.JLabel();
		jLConta = new javax.swing.JLabel();
		

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLTextoExtrato.setFont(new java.awt.Font("Tahoma", 1, 12));
		jLTextoExtrato.setText("Extrato");

		jLBanco.setFont(new java.awt.Font("Tahoma", 1, 18));
		jLBanco.setText("BANCO SOFTEX");


		jLTextoConta.setFont(new java.awt.Font("Tahoma", 1, 11));
		jLTextoConta.setText("Conta:");

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
																		jLTextoExtrato)
																.addGap(174,
																		174,
																		174)
																.addComponent(
																		jLBanco)
																.addGap(32, 32,
																		32))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jListExtrato,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		369,
																		Short.MAX_VALUE)
																.addGap(21, 21,
																		21))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLTextoConta)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jLConta)
																.addContainerGap(
																		308,
																		Short.MAX_VALUE)))));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLTextoExtrato)
												.addComponent(
														jLBanco,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														27,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(1, 1, 1)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLTextoConta)
												.addComponent(jLConta))
								.addGap(3, 3, 3)
								.addComponent(jListExtrato,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										172, Short.MAX_VALUE).addContainerGap()));

		pack();
	}

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Extrato().setVisible(true);
			}
		});
	}

	private javax.swing.JLabel jLBanco;
	private javax.swing.JLabel jLConta;
	private javax.swing.JLabel jLTextoConta;
	private javax.swing.JLabel jLTextoExtrato;
	private DefaultListModel model = new DefaultListModel();
	private javax.swing.JList jListExtrato = new JList(model);

}
