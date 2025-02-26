/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crescenteedecrescente1113beecrowd;
import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class CrescenteEDecrescente1113Beecrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        
        int X = 0;
        int Y = 0;
        do {
            X = teclado.nextInt();
            Y = teclado.nextInt();
            if (X > Y) {
                System.out.println("Decrescente");
            } else if (X==Y) {
                continue;
            } else {
                System.out.println("Crescente");
            }
        } while (X != Y);
    }
    
}
