import java.util.Scanner;

public class metodoEncriptar {
    public String pedirFrase(){
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe una frase: ");
        String frase = input.nextLine();
        String fraseSinMayuscula = frase.toLowerCase();
        return fraseSinMayuscula;
    }
    public String encriptar(){
        String fraseEncriptar = pedirFrase();
        String fraseEncriptadaA = fraseEncriptar.replace("a","@");
        String fraseEncriptadaE = fraseEncriptadaA.replace("e","&");
        String fraseEncriptadaI = fraseEncriptadaE.replace("i","!");
        String fraseEncriptadaO = fraseEncriptadaI.replace("o","*");
        String fraseEncriptadafinal = fraseEncriptadaO.replace("u","#");
        return fraseEncriptadafinal;
    };
}
