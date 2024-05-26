import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class main {
    public static void main(String[] args) {
        int menu = 0;
        String contra = null;
        String strHash;
        String confirmador = "false";
        byte[] msg;
        byte[] hash;
        StringBuilder strBuilder;

        while (menu != 3) {
            String menuh = JOptionPane.showInputDialog("Que operacion quieres realizar: 1) Codificar tu contraseña | 2) Desencriptar contraseña | 3) Cerrar");
            menu = Integer.valueOf(menuh);

            switch (menu) {
                case 1:
                    contra = JOptionPane.showInputDialog("Introduzca tu contraseña mi compa");
                    msg = contra.getBytes();
                    hash = null;

                    try {
                        MessageDigest md = MessageDigest.getInstance("MD5");
                        hash = md.digest(msg);
                    } catch (NoSuchAlgorithmException e) {
                        e.printStackTrace();
                    }

                    strBuilder = new StringBuilder();
    
                    for (byte b : hash) {
                        strBuilder.append(String.format("%02x", b));
                    }
    
                    strHash = strBuilder.toString();
                    System.out.println("La contraseña encriptada en HASH " + strHash);
                    break;

                case 2:
                    try {
                        String encriptado = JOptionPane.showInputDialog("Introduzca la encriptacion y se encontrara la contraseña");
                        FileReader file = new FileReader("C:\\Users\\leo10\\OneDrive\\Documentos\\Code\\Uni\\diccionario.txt");
                        
                        if(file.ready()){
                            BufferedReader lector = new BufferedReader(file);
                            while(confirmador == "false"){
                                contra = lector.readLine();
                                msg = contra.getBytes();
                                hash = null;

                                try {
                                    MessageDigest md = MessageDigest.getInstance("MD5");
                                    hash = md.digest(msg);
                                } catch (NoSuchAlgorithmException e) {
                                e.printStackTrace();
                                }

                                strBuilder = new StringBuilder();

                                for (byte b : hash) {
                                    strBuilder.append(String.format("%02x", b));
                                }

                                strHash = strBuilder.toString();
                                System.out.println(contra);
                                System.out.println(strHash);

                                if (encriptado == strHash){
                                    confirmador = "true";
                                }
                            }
                                System.out.println("Del Hash: " + encriptado);
                                System.out.println("La contraseña es: " + contra);
                        }else{
                            System.out.println("El archivo aun no esta cargado");
                        }
                    } catch (Exception e){
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }
    }
}
