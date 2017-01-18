
package archivos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedWriter;


public class Escritura {
    
    public static void main(String[] args) throws IOException {
        
        FileWriter fw = new FileWriter("datos.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        
        Scanner sc = new Scanner(System.in);
        String cadena1;
        String seguir=" ";
        
        do{
            System.out.println("Write something");
            cadena1 = sc.nextLine();
            bw.write(cadena1);
            bw.newLine();
            System.out.println("Continuar? Y/N");
            seguir= sc.nextLine();
        
        }while(!seguir.equalsIgnoreCase("no"));
        bw.close();
        fw.close();
    }
    
}
