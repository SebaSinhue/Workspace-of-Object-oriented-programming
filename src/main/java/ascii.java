import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba la cadena de caracteres: ");
        String cadena = sc.nextLine();
        boolean Consecutiva = true;
        for (int i = 1; i < cadena.length(); i++) {
            if ((int) cadena.charAt(i) != (int) cadena.charAt(i - 1) + 1) {
                Consecutiva = false;
                break;
            }
        }
        System.out.println(Consecutiva);
    }
}

