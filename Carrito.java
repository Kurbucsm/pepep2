/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carrito;
import java.util.Scanner;

public class Carrito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        double suma = 0;
        System.out.println("All & All");
        System.out.println("Bienvenido a A&A");
        System.out.println("¿Cuantos productos serán?");
        int canti=scanner.nextInt();
        double[] precios=new double[canti];
        String[] produ=new String[canti];
        System.out.println("Por favor a continuación ingrese los productos y sus precios");
        for (int i = 0; i < canti; i++) {
            System.out.println("Producto "+(i+1));
            produ[i]= scanner.next();
            System.out.println("Precio de "+produ[i]);
            precios[i]= scanner.nextDouble();
            suma+=precios[i];
        }
        System.out.println("Lista de productos y precios:");
        for (int i = 0; i < canti; i++) {
            System.out.println("- "+produ[i]+" $"+precios[i]);
        }
        System.out.println("Total");
        System.out.println("$"+suma);
    }
    
}