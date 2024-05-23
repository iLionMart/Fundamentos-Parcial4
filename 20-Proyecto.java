import javax.swing.*;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class main {
    public static void main(String[] args) {
        int menu = 0;

        File file = new File("C:\\Users\\ALUMNO\\IdeaProjects\\FundamentosProgramacion\\src\\diccionario.txt");

        while (menu != 3) {
            String menuh = JOptionPane.showInputDialog("Que operacion quieres realizar: 1) Codificar tu contraseña | 2) Desencriptar contraseña | 3) Cerrar");
            menu = Integer.valueOf(menuh);

            switch (menu) {
                case 1:
                    String contra = JOptionPane.showInputDialog("Introduzca tu contraseña mi compa");

                    byte[] msg = contra.getBytes();
                    byte[] hash = null;

                    try {
                        MessageDigest md = MessageDigest.getInstance("MD5");
                        hash = md.digest(msg);
                    } catch (NoSuchAlgorithmException e) {
                        e.printStackTrace();
                    }
                    StringBuilder strBuilder = new StringBuilder();
                    for (byte b : hash) {
                        strBuilder.append(String.format("%02x", b));
                    }
                    String strHash = strBuilder.toString();
                    System.out.println("The MD5 hash: " + strHash);
                    break;

                case 2:
                    String encriptado = JOptionPane.showInputDialog("Introduzca la encriptacion y se encontrara la contraseña");

                    break;
            }
        }
    }
}
