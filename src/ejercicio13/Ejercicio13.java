/*
 Pedir 10 numeros, mostrar la media de los números positivos, la media de los números negativos y la cantidad
de ceros.
 */
package ejercicio13;

import javax.swing.JOptionPane;

/**
 *
 * @author Carolina EM
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, suma_pos=0, conteo_pos=0, suma_neg=0, conteo_neg=0,conteo_ceros=0;
        float media_pos,media_neg;
        
        for (int i=1; i<=10;i++){
            numero= Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
            
            if (numero == 0){ //si el número es 0
                conteo_ceros++; // aumentamos en 1 el conteo de 0.
            }
            else {
                if (numero>0){ // si el número es positivo 
                    suma_pos += numero; //suma iterativa de positivos 
                    conteo_pos++;
                }
                else { // si el número es negativo
                    suma_neg +=numero;
                    conteo_neg++;
                }
            }}
            //Tratamos con los positivos
            if (conteo_pos == 0){
                System.out.println("No se puede sacar la media de los positivos");
            }
            else {
                media_pos = (float) suma_pos/conteo_pos;
                System.out.println("La media de los números positivos es: "+media_pos);
            }
            // Tratamos con los negativos 
            if (conteo_neg ==0){
                System.out.println("No se puede sacar la media de los negativos");
            }
            else {
                media_neg= (float) suma_neg / conteo_neg;
                System.out.println("La media de los negativos es: "+media_neg);
            }
            System.out.println("La cantidad de ceros es: "+conteo_ceros);
        
    }
               
        
    }
    

