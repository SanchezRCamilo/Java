
package procesosmatematicos;

import javax.swing.JOptionPane;

public class ProcesosMatematicos {

    public static void main(String[] args) {
        int menu=0, numero1=0, numero2=0, resultado=0;
        
        menu=Integer.parseInt(JOptionPane.showInputDialog("Menu\n1.Suma \n2.Resta \n3.Multiplicación"));
        
        switch(menu){
            case 1:
                numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número"));
                numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número"));
                resultado=numero1+numero2;
                JOptionPane.showMessageDialog(null, "Resultado de la suma es: "+resultado);
                break;
            case 2:
                numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número"));
                numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número"));
                resultado=numero1-numero2;
                JOptionPane.showMessageDialog(null, "Resultado de la resta es: "+resultado);
                break;
            case 3:
                numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número"));
                numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número"));
                resultado=numero1*numero2;
                JOptionPane.showMessageDialog(null, "Resultado de la multiplicación es: "+resultado);
                break;
        }
        
        
    }
    
}
