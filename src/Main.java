import java.util.Scanner

public class Main {
    public static void main(String[] args) {

    }
    }
    public boolean verificar_reves_derecho(String[] frase){
        String frase_verificar = pedirFrase().toLowerCase();
    };
    public int contarVocales(){
        String fraseParaContar = pedirFrase();
        char[] fraseComoArray = fraseParaContar.toCharArray();
        int contador = 0;
        for(char i :)
    };
    public String encriptar(){
    String fraseEncriptar = pedirFrase();
    String fraseEncriptadaA = fraseEncriptar.replace("a","@");
    String fraseEncriptadaE = fraseEncriptadaA.replace("e","&");
    String fraseEncriptadaI = fraseEncriptadaE.replace("i","!");
    String fraseEncriptadaO = fraseEncriptadaI.replace("o","*");
    String fraseEncriptadafinal = fraseEncriptadaO.replace("u","#");
    return fraseEncriptadafinal;
};
    public String desencriptar(){
        String fraseEncriptada = encriptar();
        String fraseDesencriptadaA = fraseEncriptada.replace("@","a");
        String fraseDesencriptadaE = fraseDesencriptadaA.replace("&","e");
        String fraseDesencriptadaI = fraseDesencriptadaE.replace("!","i");
        String fraseDesencriptadaO = fraseDesencriptadaI.replace("*","o");
        String fraseDesencriptadafinal = fraseDesencriptadaO.replace("#","u");
        return fraseDesencriptadafinal;
    }
    public String pedirFrase(){
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe una frase: ");
        String frase = input.nextLine();
        String fraseSinMayuscula = frase.toLowerCase();
        return fraseSinMayuscula;
    }
}
