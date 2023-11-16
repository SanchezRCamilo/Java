
package ruleta;

import javax.swing.JOptionPane;

public class Ruleta {

    public static void main(String[] args) {
        double dinero=0;
        int numRandom=0;
        
        dinero=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la apuesta:"));
        
        numRandom= (int)(Math.random()*3)+1;
        //JOptionPane.showMessageDialog(null, numRandom);
        
        switch(numRandom){
            case 1:
                //sol
                JOptionPane.showMessageDialog(null, "---La ruleta te trajo al Sol ---");
                JOptionPane.showMessageDialog(null, "Haz recuperado lo apostado \n Total:"+dinero);
                break;
            case 2:
                //luna
                JOptionPane.showMessageDialog(null, "---La ruleta te trajo la Luna ---");
                dinero=dinero*2;
                JOptionPane.showMessageDialog(null,"Haz multiplicado lo apostado por la Luna\n Total: "+dinero);
                break;
            case 3:
                //ladron
                dinero=0;
                JOptionPane.showMessageDialog(null, "---El ladron robo todo ---");
                JOptionPane.showMessageDialog(null, "Haz perdido todo \n Total: "+dinero);
                break;
                
        }
    }
    
}
