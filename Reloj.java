import javax.swing.text.JTextComponent;

public class Reloj extends Thread { 
  
	public Reloj(){
        super();
    }
	
    public void run() {
    int nuMin=0; 
    int nuSeg=0; 
    int nuHora=0; 
        try {
            for (; ;){       
               if(nuSeg!=59) {
                   nuSeg++;                                  
                }else{
                    if(nuMin!=59){
                        nuSeg=0;
                        nuMin++;
                    }else{
                            nuHora++;
                            nuMin=0;
                            nuSeg=0;          
                    }
                }              
               
           
            
            }           
        } catch (Exception ex) {
             
        	
        	System.out.println(ex.getMessage());
        	((JTextComponent) PantallaOrdenacion.lblMetodoQuickSort).setText(""+nuHora+nuMin+nuSeg);
         	((JTextComponent) PantallaOrdenacion.lblMetodoDeBurbuja).setText(""+nuHora+nuMin+nuSeg);
         	((JTextComponent) PantallaOrdenacion.lblMetodoDeDonal).setText(""+nuHora+nuMin+nuSeg);
            
            
            
            System.out.println(nuHora+":"+nuMin+":"+nuSeg);
            try {
				sleep(999);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }                 
 } 
}
