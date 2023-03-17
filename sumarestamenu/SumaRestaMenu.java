
package sumarestamenu;

import javax.swing.JOptionPane;

public class SumaRestaMenu {

    public static void main(String[] args) {
        int num1=0,num2=0,resultado=0,eleccion=0;
        //variables definidas
        //pedir datos
        num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer número"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo número"));
        //creacion de menu
       eleccion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1.Suma 2. Resta"));
       //eleccion para proceso 
       
        if (eleccion == 1) {
            //suma
            resultado=num1+num2;
            //mostrar en pantalla
            JOptionPane.showMessageDialog(null, "El resultado es: "+resultado);
        }
        if (eleccion == 2) {
            //resta
            resultado=num1-num2;
            //mostrar en pantalla
            JOptionPane.showMessageDialog(null, "El resultado es: "+resultado);
        }
       
    }
    
}
