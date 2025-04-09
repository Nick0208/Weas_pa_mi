import java.util.InputMismatchException;
import java.util.Scanner;

public class LecturaEntero {
    
    private Scanner teclado = new Scanner(System.in);

    public int LeerNumero();
    {
        Vista vista = new Vista();

        boolean salir = false;

        int num = 0;
        while(!salir){

            vista leer.NumeroEntero();

            try{
                num=teclado.nextInt();
                salir = true;
            } catch (InputMismatchException e){
                vista.mostrarInputMismatchException();
                teclado.next();
            }
        }
        return num ;//Retorna num
    }
}
