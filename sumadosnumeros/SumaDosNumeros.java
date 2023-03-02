
package sumadosnumeros;

import javax.swing.JOptionPane;

/*@author SanchezCamilo*/
public class SumaDosNumeros {

    public static void main(String[] args) {
     //Inicialización de variables
     //variables enteras, nos permiten ingresar valores númericos, naturales.
     int num1=0, num2=0, r=0;
     //Debemos convertir el texto en valores númericos para permitir que se logre realizar la oepración
     //en este caso como es un valor entero, la conversión de String(texto) a Int(entero) 
     //usaremos el metodo Integer.ParseInt(String)
     //num1=usamos conversión(String)
     //num1=Integer.ParseInt(String)
     //----------en el espacio String, incluimos el metodo de impresion.
     //usamos la impresión de pantalla para ingresar un dato
     //JOptionPane.showInputDialog(String);
     //Le permite al usuario ingresar un dato tipo String en el espacio en blanco que muestra la ventana
     //El apartado (String) que va acompañado del metodo, lo usaremos para el texto que acompañe a la ventana que se visualiza
     //JOptionPane.showInputDialog("Ingresa el primer número");
     //Como el dato es tipo String, podemos usarlo para hacer una conversión directa en la misma linea de codigo
     //Ejemplo:
     //num1=Integer.parseInt(string)
     //num1=Integer.parseInt(JOptionPane.showInputDialog(mensaje))
     //num1=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer número"));
    num1=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer número")); 
    //almacenando el dato que ingresa el usuario en una variable, en este caso la variable num1
    //pedimos el segundo numero
    num2=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo número")); 
    //ahora realizamos la operación
    //donde la variable r sera nuestro resultado
    //resultado=numero1+numero2;
    r=num1+num2;
    //para saber el resulta y que el usuario lo pueda visualizar necesitamos realizar una impresion de pantalla
    //Usamos el metodo JOptionPane.ShowMessage para visualizar información
    JOptionPane.showMessageDialog(null,"El resultado es: " + r);
    //JOptionPane.showMessageDialog(null,"texto que acompaña la ventana" + variable donde almaceno el resultado);
    
    }
    
}
