
package boletin2_4;
import java.util.Scanner;

public class Boletin2_4 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        int billetes100,billetes20,billetes5,monedas1;
        System.out.println("Cantos billetes de 100€ tes?");
        billetes100 = leer.nextInt();
        
        System.out.println("Cantos billetes de 20€ tes?");
        billetes20 = leer.nextInt();
        
        System.out.println("Cantos billetes de 5€ tes? ");
        billetes5 = leer.nextInt();
        
        System.out.println("Cantos monedas de 1€ tes? ");
        monedas1 = leer.nextInt();
        
        int euros100,euros20,euros5;
        
        euros100 = billetes100*100;
        euros20 = billetes20*20;
        euros5 = billetes5*5;
                      
System.out.println("Tes "+(euros100+euros20+euros5+monedas1)+"euros");
        
        // TODO code application logic here
    }
    
}
