import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int op=0;
        Scanner input = new Scanner(System.in);
        String menu="";
        do{
            menu="";
            menu+="****** Menú ******\n";
            menu+="1.- Verificar Reves-Derecho \n";
            menu+="2.- Contar vocales \n";
            menu+="3.- Encriptar mensaje \n";
            menu+="4.- Desencriptar mensaje \n";
            menu+="5.- Salir \n";
            menu+="EliJa una opción";
            op= input.nextInt();
            switch(op){
                case 1:

                case 2:

                case 3:

                case 4:

            }
        }while(op!=5);
    }
    public boolean verificar_reves_derecho(String[] frase){
        String frase_verificar = pedirFrase().toLowerCase();
        return frase_verificar.contains(frase[0]);
    };
    public int contarVocales(){
        String fraseParaContar = pedirFrase();
        char[] fraseComoArray = fraseParaContar.toCharArray();
        int contador = 0;
        return contador;
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
