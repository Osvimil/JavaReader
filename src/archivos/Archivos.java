
package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Archivos {

    
    public static void main(String[] args) throws FileNotFoundException, IOException {
       
        File file = new File("Datos.txt");
        
        if (file.exists()) {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String cadena1;
            while((cadena1= br.readLine())!=null){
                System.out.println(cadena1);           
            }
            
        }else{
            System.out.println("No existe el archivo");
        }
    }
    
}
