
package tecnologiaspc;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Panel;

/**
 *
 * @author Raymon
 */
public class TecnologiasPC extends Frame {
   
    Panel panel;
    Dialog dialogo;
    
    public TecnologiasPC(){
        setSize(600, 400);
        setTitle("Mi Ventana");
        setLocationRelativeTo(null);
        panel = new Panel();
        panel.setBackground(Color.red);
        this.add(panel);
        
        dialogo = new Dialog(this, "Hola Dialogo", false);
        dialogo.setBounds(250, 200, 300, 100);
        dialogo.setVisible(true);
    }

    public TecnologiasPC(String title) throws HeadlessException {
        super(title);
        setSize(300, 200);
        setLocationRelativeTo(null);
        panel = new Panel();
        panel.setBackground(Color.red);
        this.add(panel);
        
        dialogo = new Dialog(this, "Hola Dialogo", false);
        dialogo.setBounds(250, 200, 300, 100);
        dialogo.setVisible(true);
    }
    
    
    
    public static void main(String[] args) {
        TecnologiasPC ventana = new TecnologiasPC("Ventana dos");
        ventana.setVisible(true);
    }
    
}
