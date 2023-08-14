package ejercicio1.grab;

import javax.swing.JOptionPane;

public class Ejercicio1Grab {

    public static void main(String[] args) {
        int num1 =0, num2=0, menu=0;
        
        num1=Integer.parseInt(JOptionPane.showInputDialog("Ingresar primer número"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Ingresar segundo número"));
        menu=Integer.parseInt(JOptionPane.showInputDialog("-----MENU----- \n1. Sumar. \n2. Restar."));
        
        if (menu==1) {
           // sumarnums(num1,num2);
            JOptionPane.showMessageDialog(null,"El total de la suma es: "+ sumarnums(num1,num2));
        }
        if (menu==2){
            JOptionPane.showMessageDialog(null, "El total de la resta es: "+ restarnums(num1, num2));
        }
    }
    
    public static int sumarnums(int n1, int n2){
        int total=0;
        total=n1+n2;
        return total;
    }
    
    public static int restarnums(int n1, int n2){
        int total=0;
        total=n1-n2;
        return total;
    }
}
