import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Pantalla extends javax.swing.JFrame {



	private static final long serialVersionUID = 1L;
	private news metodo;
	public Pantalla() {
		initComponents();
	}


	private void initComponents() {
		
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jProgressBarBurbuja = new javax.swing.JProgressBar();
		jLabel3 = new javax.swing.JLabel();
		jProgressBarQuickSort = new javax.swing.JProgressBar();
		jLabel4 = new javax.swing.JLabel();
		jProgressBarShell = new javax.swing.JProgressBar();
		jTextFieldTiempoBurbuja = new javax.swing.JTextField();
		jTextFieldTiempoQuickSort = new javax.swing.JTextField();
		jTextFieldTiempoShell = new javax.swing.JTextField();
		jTextFieldElemLista = new javax.swing.JTextField();
		jTextFieldIntervaloA = new javax.swing.JTextField();
		jTextFieldIntervaloB = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		jButtonBurbuja = new javax.swing.JButton();
		jButtonQuickSort = new javax.swing.JButton();
		jButtonShell = new javax.swing.JButton();
		jButtonGenerar = new javax.swing.JButton();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setText("Metodos ordenamiento");

		jLabel2.setText("Metodo Burbuja");

		jLabel3.setText("Metodo QuickSort ");

		jLabel4.setText("Metodo Shell");

		jTextFieldTiempoBurbuja.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldTiempoBurbujaActionPerformed(evt);
			}
		});

		jTextFieldTiempoQuickSort.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldTiempoQuickSortActionPerformed(evt);
			}
		});

		jTextFieldTiempoShell.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldTiempoShellActionPerformed(evt);
			}
		});

		jTextFieldElemLista.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldElemListaActionPerformed(evt);
			}
		});

		jTextFieldIntervaloA.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldIntervaloAActionPerformed(evt);
			}
		});

		jTextFieldIntervaloB.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldIntervaloBActionPerformed(evt);
			}
		});

		jLabel5.setText("Elementos en la lista");

		jButtonBurbuja.setText("Start");
		jButtonBurbuja.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonBurbujaActionPerformed(evt);
			}
		});

		jButtonQuickSort.setText("Start");
		jButtonQuickSort.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonQuickSortActionPerformed(evt, null, null);
			}
		});

		jButtonShell.setText("Start");
		jButtonShell.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonShellActionPerformed(evt);
			}
		});

		jButtonGenerar.setText("OK");
		jButtonGenerar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonGenerarActionPerformed(evt);
			}
		});

		jLabel6.setText("Intervalo desde:");

		jLabel7.setText("Intervalo Hasta");

		jLabel8.setText("Método Burbuja");

		jLabel9.setText("Método QuickSort");

		jLabel10.setText("Método Shell");

		jLabel11.setText("Tiempo de ordenamiento");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGap(29, 29, 29)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
										.addGap(139, 139, 139)
										.addComponent(jLabel1)
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(layout.createSequentialGroup()
														.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(jLabel2)
																.addComponent(jLabel3)
																.addComponent(jProgressBarQuickSort, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(jLabel4)
																.addComponent(jProgressBarShell, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																.addGroup(layout.createSequentialGroup()
																		.addGap(64, 64, 64)
																		.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(jTextFieldTiempoShell, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(jTextFieldTiempoQuickSort, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGap(0, 0, Short.MAX_VALUE))
																.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
																		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
																		.addComponent(jLabel11))))
												.addGroup(layout.createSequentialGroup()
														.addComponent(jProgressBarBurbuja, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(64, 64, 64)
														.addComponent(jTextFieldTiempoBurbuja, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(0, 0, Short.MAX_VALUE))
												.addGroup(layout.createSequentialGroup()
														.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																.addGroup(layout.createSequentialGroup()
																		.addComponent(jButtonBurbuja)
																		.addGap(18, 18, 18)
																		.addComponent(jLabel8))
																.addGroup(layout.createSequentialGroup()
																		.addComponent(jButtonQuickSort)
																		.addGap(18, 18, 18)
																		.addComponent(jLabel9))
																.addGroup(layout.createSequentialGroup()
																		.addComponent(jButtonShell)
																		.addGap(18, 18, 18)
																		.addComponent(jLabel10)))
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
																		.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(jLabel7)
																				.addComponent(jLabel6)
																				.addGroup(layout.createSequentialGroup()
																						.addGap(10, 10, 10)
																						.addComponent(jTextFieldIntervaloB, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
																		.addGap(24, 24, 24))
																.addGroup(layout.createSequentialGroup()
																		.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(jLabel5)
																				.addGroup(layout.createSequentialGroup()
																						.addGap(19, 19, 19)
																						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																								.addComponent(jTextFieldIntervaloA, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addComponent(jTextFieldElemLista, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
																		.addGap(15, 15, 15)))
														.addComponent(jButtonGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGap(27, 27, 27))))
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGap(30, 30, 30)
						.addComponent(jLabel1)
						.addGap(50, 50, 50)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jLabel2)
								.addComponent(jLabel11))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jProgressBarBurbuja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextFieldTiempoBurbuja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addComponent(jLabel3)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jProgressBarQuickSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextFieldTiempoQuickSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addComponent(jLabel4)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jProgressBarShell, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextFieldTiempoShell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(26, 26, 26)
						.addComponent(jLabel5)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addComponent(jTextFieldElemLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jLabel6)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jTextFieldIntervaloA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jButtonGenerar))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabel7)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jTextFieldIntervaloB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButtonBurbuja)
												.addComponent(jLabel8))
										.addGap(18, 18, 18)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButtonQuickSort)
												.addComponent(jLabel9))
										.addGap(18, 18, 18)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButtonShell)
												.addComponent(jLabel10))
										.addGap(0, 0, Short.MAX_VALUE)))
						.addGap(38, 38, 38))
				);

		pack();
	}// </editor-fold>                        

	@SuppressWarnings("deprecation")
	private void jButtonBurbujaActionPerformed(java.awt.event.ActionEvent evt) {   
	
	
		
		System.out.println("");
		ListaDoble.mostrarDA();
		
	}                                              

	private void jButtonQuickSortActionPerformed(java.awt.event.ActionEvent evt, NodoDoble i, NodoDoble j) {                                                 


		ListaDoble.quickSort(i, j);
		System.out.println("");
		ListaDoble.mostrarDA();
		
	}                                                

	private void jButtonShellActionPerformed(java.awt.event.ActionEvent evt) {                                             

		ListaDoble.Shell();
		System.out.println("");
		ListaDoble.mostrarDA();
		
	}                                            

	
	private void jButtonGenerarActionPerformed(java.awt.event.ActionEvent evt) {                                               

		{
			if(jTextFieldElemLista.getText().equals("")|| jTextFieldIntervaloA.getText().equals("") || jTextFieldIntervaloB.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null," VERIFICA LOS DATOS ");
			}else{
				int elem=Integer.parseInt(jTextFieldElemLista.getText());
				int inf=Integer.parseInt(jTextFieldIntervaloA.getText());
				int sup=Integer.parseInt(jTextFieldIntervaloB.getText());
				metodo = new news(elem,inf ,sup );
				
			}	
		}
	}     


	private void jTextFieldTiempoBurbujaActionPerformed(java.awt.event.ActionEvent evt) {                                                        

	}                                                       

	private void jTextFieldTiempoQuickSortActionPerformed(java.awt.event.ActionEvent evt) {                                                          

	}                                                         

	private void jTextFieldTiempoShellActionPerformed(java.awt.event.ActionEvent evt) {                                                      

	}                                                     

	private void jTextFieldElemListaActionPerformed(java.awt.event.ActionEvent evt) {                                                    
	
	}                                                   

	private void jTextFieldIntervaloAActionPerformed(java.awt.event.ActionEvent evt) {                                                     
		// TODO add your handling code here:
	}                                                    

	private void jTextFieldIntervaloBActionPerformed(java.awt.event.ActionEvent evt) {                                                     
		// TODO add your handling code here:
	}                           
	
	
	
	
	
	


	public static void main(String args[]) {


		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}


		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Pantalla().setVisible(true);
			}
		});
	}
	private javax.swing.JButton jButtonBurbuja;
	private javax.swing.JButton jButtonGenerar;
	private javax.swing.JButton jButtonQuickSort;
	private javax.swing.JButton jButtonShell;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	static javax.swing.JProgressBar jProgressBarBurbuja;
	static javax.swing.JProgressBar jProgressBarQuickSort;
	static javax.swing.JProgressBar jProgressBarShell;
	private javax.swing.JTextField jTextFieldElemLista;
	private javax.swing.JTextField jTextFieldIntervaloA;
	private javax.swing.JTextField jTextFieldIntervaloB;
	static javax.swing.JTextField jTextFieldTiempoBurbuja;
	static javax.swing.JTextField jTextFieldTiempoQuickSort;
	static javax.swing.JTextField jTextFieldTiempoShell;
	private Timer timer;

}
