
import java.util.Scanner;


public class HomeworkAccsi {

    public static void main(String[] args) {
       
        System.out.println(Encriptador("Sere un gran Ingeniero", 5));
        
        
    }
   
      public static String Encriptador(String palabra, int Llave){
        
        String Ascci = "";
        int codificador = 0;
                
        for(int x=0; x<palabra.length(); x++){
            
            codificador = (int)palabra.charAt(x);
            codificador = codificador + Llave;
            
            
            char caracter = (char)codificador;
            Ascci = Ascci + caracter;
        }
        return Ascci;
      }
}
