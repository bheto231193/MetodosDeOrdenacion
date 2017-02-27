import java.util.Random;

import javax.swing.JTextArea;

public class news {
	private ListaDoble lista;



	private int elementos;
	private int Superior;
	private int Inferior;


	public news(int Elementos, int Inferior, int Superior){
		this.elementos = Elementos;
		this.Superior = Superior;
		this.Inferior = Inferior;
		lista = new ListaDoble();                     
	}

	public void crearLista(JTextArea aa) {
		int dato;
		Random r = new Random();
		JTextArea a1 = aa;
		System.out.println("Lista generada");
		for (int i = 0; i < elementos; i++) {
			dato = (int) (r.nextDouble() * this.Superior + this.Inferior );
			a1.append("\n"+dato);
			System.out.print(" <--["+ dato +"]--> ");
			System.out.println("");
			lista.InsertarFinal(dato);
			
		}     
	
	}
}