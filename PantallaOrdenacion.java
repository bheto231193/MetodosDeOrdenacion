import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.text.JTextComponent;

public class PantallaOrdenacion extends JFrame {
	
	
	public static  JTextComponent lblMetodoDeBurbuja = null;
	public static  JTextComponent lblMetodoDeDonal = null;
	private JPanel contentPane;
	private JTextField txtElementos;
	private JTextField txtIntervaloMin;
	private JTextField txtIntervaloMax;
	private JTextArea txtRandomm;
	
	static  JTextArea txtOrdenada;
	static JProgressBar proBurbuja;
	static JProgressBar proQuick;
	static JProgressBar proShell;
	public static Object lblMetodoQuickSort;
	JButton btnIniciarQuick = new JButton("Iniciar");
	JButton btnIniciarBurbuja = new JButton("Iniciar");
	JButton btnIniciarShell = new JButton("Iniciar");
	JButton btnIniciarRadix = new JButton("Iniciar");
	
	
	

	
	private news metodo;

	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaOrdenacion frame = new PantallaOrdenacion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public PantallaOrdenacion() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1210, 545);
		contentPane = new JPanel();
		contentPane.setAutoscrolls(true);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		txtElementos = new JTextField();
		txtElementos.setBounds(59, 79, 86, 20);
		contentPane.add(txtElementos);
		txtElementos.setColumns(10);
		
		txtIntervaloMin = new JTextField();
		txtIntervaloMin.setBounds(236, 79, 86, 20);
		contentPane.add(txtIntervaloMin);
		txtIntervaloMin.setColumns(10);
		
		txtIntervaloMax = new JTextField();
		txtIntervaloMax.setBounds(406, 79, 86, 20);
		contentPane.add(txtIntervaloMax);
		txtIntervaloMax.setColumns(10);
		
		JProgressBar proBurbuja = new JProgressBar();
		proBurbuja.setMaximum(436);
		proBurbuja.setBounds(64, 223, 273, 14);
		contentPane.add(proBurbuja);
		
		JProgressBar proQuick = new JProgressBar();
		proQuick.setBounds(64, 287, 273, 14);
		contentPane.add(proQuick);
		
		JProgressBar proShell = new JProgressBar();
		proShell.setBounds(64, 349, 273, 14);
		contentPane.add(proShell);
		
		JProgressBar proRadix = new JProgressBar();
		proRadix.setBounds(64, 411, 273, 14);
		contentPane.add(proRadix);
		
		JLabel lblMetodoDeBurbuja = new JLabel("Metodo de Burbuja");
		lblMetodoDeBurbuja.setBounds(64, 198, 99, 14);
		contentPane.add(lblMetodoDeBurbuja);
		
		JLabel lblMetodoQuickSort = new JLabel("Metodo Quick Sort");
		lblMetodoQuickSort.setBounds(64, 262, 192, 14);
		contentPane.add(lblMetodoQuickSort);
		
		JLabel lblMetodoDeDonal = new JLabel("Metodo de Donal  Shell");
		lblMetodoDeDonal.setBounds(64, 324, 192, 14);
		contentPane.add(lblMetodoDeDonal);
		
		JLabel lblMetodoDeRadix = new JLabel("Metodo de Radix");
		lblMetodoDeRadix.setBounds(64, 389, 157, 14);
		contentPane.add(lblMetodoDeRadix);
		
		JLabel lblNewLabel = new JLabel("Tiempo");
		lblNewLabel.setBounds(500, 218, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tiempo");
		lblNewLabel_1.setBounds(500, 282, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tiempo");
		lblNewLabel_2.setBounds(500, 344, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblTiempo = new JLabel("Tiempo");
		lblTiempo.setBounds(500, 411, 46, 14);
		contentPane.add(lblTiempo);
		
		JLabel lblEl = new JLabel("Elementos en la lista?");
		lblEl.setBounds(45, 46, 118, 14);
		contentPane.add(lblEl);
		
		JLabel lblIntervaloDesde = new JLabel("Intervalo desde:");
		lblIntervaloDesde.setBounds(236, 46, 99, 14);
		contentPane.add(lblIntervaloDesde);
		
		JLabel lblNewLabel_3 = new JLabel("Intervalo hasta:");
		lblNewLabel_3.setBounds(406, 46, 89, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblRandom = new JLabel(" Random");
		lblRandom.setBounds(583, 46, 99, 14);
		contentPane.add(lblRandom);
		
		JLabel lblListaOrdenada = new JLabel("Lista ordenada");
		lblListaOrdenada.setBounds(878, 46, 99, 14);
		contentPane.add(lblListaOrdenada);
		
		
		//inica burbuja
		
		btnIniciarBurbuja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Burbuja
				
				int elem=Integer.parseInt(txtElementos.getText());
				
				ListaDoble.MetodoBurbuja();
				proBurbuja.setMaximum(ListaDoble.i);
				proBurbuja.setValue(ListaDoble.i);
				System.out.println("");
				ListaDoble.mostrarDA();
			//	ListaDoble.mostrar(txtOrdenada);	
			}
		});
		btnIniciarBurbuja.setBounds(375, 214, 89, 23);
		contentPane.add(btnIniciarBurbuja);
		
		

		//termina burbuj
					
		
		//inicia burbja
		
		
		
		btnIniciarQuick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnIniciarQuickactionPerformed(e, null, null);
				proQuick.setMaximum(ListaDoble.i);
				proQuick.setValue(ListaDoble.i);
			
			}

			
		});
		btnIniciarQuick.setBounds(375, 278, 89, 23);
		contentPane.add(btnIniciarQuick);
		

		
		
		//termina 	quik
		
		
		
		
		btnIniciarShell.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ListaDoble.Shell();
				System.out.println("");
				ListaDoble.mostrarDA();
				proShell.setMaximum(ListaDoble.i);
				proShell.setValue(ListaDoble.i);
			}
		});
		btnIniciarShell.setBounds(375, 340, 89, 23);
		contentPane.add(btnIniciarShell);
		
		
		btnIniciarRadix.setBounds(375, 402, 89, 23);
		contentPane.add(btnIniciarRadix);
		
		JButton btnGenerarLista = new JButton("Generar lista aleatoria");
		
		btnGenerarLista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if(txtElementos.getText().equals("")|| txtIntervaloMin.getText().equals("") || txtIntervaloMax.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null," VERIFICA LOS DATOS ");
				}else{
					int elem=Integer.parseInt(txtElementos.getText());
					int inf=Integer.parseInt(txtIntervaloMin.getText());
					int sup=Integer.parseInt(txtIntervaloMax.getText());
					
					metodo = new news(elem,inf ,sup );

					metodo.crearLista(txtRandomm);
				}	
			}
		});
		btnGenerarLista.setBounds(150, 126, 247, 23);
		contentPane.add(btnGenerarLista);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(593, 79, 230, 357);
		contentPane.add(scrollPane);
		txtRandomm = new JTextArea();
		scrollPane.setViewportView(txtRandomm);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(878, 79, 211, 357);
		contentPane.add(scrollPane_1);
		
		JTextArea txtOrdenada = new JTextArea();
		scrollPane_1.setViewportView(txtOrdenada);
	
	}


	protected void btnIniciarQuickactionPerformed(ActionEvent e, NodoDoble i, NodoDoble j) {
		ListaDoble.quickSort(i, j);
		System.out.println("");
		ListaDoble.mostrarDA();
		
		
	}


	protected void btnIniciarBurbujaActionPerformed(ActionEvent evt) {
		ListaDoble.MetodoBurbuja();
		System.out.println("");
		ListaDoble.mostrarDA();
	}


	
	
	
}
