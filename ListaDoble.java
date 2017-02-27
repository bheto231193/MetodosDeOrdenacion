import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JTextArea;
import javax.swing.text.html.HTMLDocument.Iterator;

public class ListaDoble {
	public static NodoDoble inicio;
	public static NodoDoble ultimo;
	static int i=0;
	static int h=0;
	
	
	public ListaDoble (){
		inicio =  null;
	}

	public boolean vacia(){

		return inicio==null;
	}
	public static void InsertarInicio(int elemento){
		NodoDoble nuevo = new NodoDoble(elemento);
		if (inicio == null){
			inicio = nuevo;
		}else{
			nuevo.setSiguiente(inicio);
			inicio.setAnterior(nuevo);
			inicio = nuevo;
		}
	}	
	public static void InsertarFinal(int elemento){

		NodoDoble nuevo = new NodoDoble(elemento);
		if (inicio == null){
			inicio = nuevo;
		}else{
			NodoDoble aux = inicio;
			while(aux.getSiguiente()!= null){
				aux = aux.getSiguiente();
			}
			aux.setSiguiente(nuevo);
			nuevo.setAnterior(aux);
		}
	}	

	public static void atras(){
		ultimo = inicio;
		while(ultimo.getSiguiente() != null){
			ultimo=ultimo.getSiguiente();
		}

	}

	public static void MetodoBurbuja( ){

		System.out.println("");
		System.out.print("Burbuja");
		NodoDoble primero = inicio;
		NodoDoble ultimo = inicio;
		
		if (primero.getSiguiente() != null) {
			ultimo = primero.getSiguiente();
			while (primero != null) {
				while (ultimo != null) {
						if (primero.getDato() < ultimo.getDato()) {
							int datoAux = primero.getDato();
							int datoComp = ultimo.getDato();
							primero.setDato(datoComp);
							ultimo.setDato(datoAux);
							i++;
						}
						
						ultimo = ultimo.getSiguiente();
					}
					ultimo = inicio;
					
					primero = primero.getSiguiente();
				}
			}
		System.out.println("si llega"+i);
	}

	
	
	public static void quickSort(NodoDoble i, NodoDoble j) {
		System.out.println("");
		System.out.print("QuickSort");
		
		if (i != null && j != null) {
		
			NodoDoble ii = i;
			NodoDoble jj = j;
			int aux = 0;
			while (i != j) {
				while (i!=j&&(j.getDato()>i.getDato())) {
					j = j.getAnterior();          
				} 
				aux = j.getDato();
				j.setDato(i.getDato());
				i.setDato(aux);
				h++;
				while(i!=j && (i.getDato()<=j.getDato())) {
					i = i.getSiguiente();
				} 
				aux = j.getDato();
				j.setDato(i.getDato());
				i.setDato(aux);
				h++;
			}                
			if (ii != i) {
				quickSort(ii, i.getAnterior());
			}
			if (j != jj) {
				quickSort(j.getSiguiente(), jj);
			}
		

		}
		System.out.println("si llega"+ h);
		System.out.println("");
		mostrarDA();

		
	}

	private static int Nnodos() {
		NodoDoble aux = inicio;
		int nNodo = 0;
		while (aux != null) {
			nNodo++;
			aux = aux.getSiguiente();
		}
		return nNodo;
	}


	public static void Shell() {

		System.out.println("");
		System.out.print("Shell");

		Reloj c=new Reloj(); 
		c.start();

		int saltos = Nnodos();
		NodoDoble ii, jj;
		int auxS;
		int auxDato = 0;
		int aux;
		while ((saltos = saltos / 2) != 0) {
			ii = inicio;
			jj = inicio;
			auxS = saltos;
			while (jj != null && auxS > 0) {
				jj = jj.getSiguiente();
				auxS--;
			}
			while (ii != null && jj != null) {
				if (ii.getDato()>0 && jj.getDato() > 0) {
					auxDato = ii.getDato();
					ii.setDato(jj.getDato());
					jj.setDato(auxDato);
					NodoDoble aux2 = ii;
					NodoDoble aux3 = ii;
					aux = saltos;
					while (aux2 != null && aux > 0) {
						aux2 = aux2.getAnterior();
						aux--;
					}
					while (aux2 != null) {
						if (aux2.getDato()>0 && aux3.getDato() > 0) {
							auxDato = aux2.getDato();
							aux2.setDato(aux3.getDato());
							aux3.setDato(auxDato);
							aux3 = aux2;
						}
						aux2 = aux2.getAnterior();
					}
				}
				ii = ii.getSiguiente();
				jj = jj.getSiguiente();
			}
		}

		System.out.println("");
		mostrarDA();

	}

	public static int mostrarDA(){
		NodoDoble aux = inicio;
		NodoDoble ant = null;
		while (aux != null){
			System.out.print("");
			System.out.print(" <--["+ aux.getDato()+"]--> ");
			ant = aux;
			aux = aux.getSiguiente();
		}

		return 0;
	}	



	public static int mostrar(JTextArea b1){
		NodoDoble aux = inicio;
		NodoDoble ant = null;
		int dato;
		JTextArea bb = b1;

		while (aux != null){
			System.out.print("");
			System.out.print(" <--["+ aux.getDato()+"]--> ");

			dato=aux.getDato();
			bb.append(""+dato);
			ant = aux;
			aux = aux.getSiguiente();
		}
		return 0;
	}	









}