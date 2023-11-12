package Usuario;

import javax.swing.JTextArea;

public class Compresor {

    String binario = "0";
    int decimal = 0;

    private String CodigoAscii_a_binario(String cadena) {
        int val_en_ascii = 0;
        for (int x = 0; x < cadena.length(); x++) {
            val_en_ascii = cadena.codePointAt(x);
            binario += Ascii_a_Binario(val_en_ascii);
        }
        // mostrar.setText("el equivalente binario de la palabra ingresada:" + " " + binario);
//        System.out.println("el equivalente binario de la palabra ingresada:" + " " + binario);

        return binario;
    }

    private String cadena_RLE(String cadena) {
        String cadenaRLE = "";
        char letra1, letra2 = ' ', comparacion;
        int cont = 1;
        for (int x = 0; x < cadena.length(); x++) {
            letra1 = cadena.charAt(x);
            if (x < cadena.length() - 1) {
                letra2 = cadena.charAt(x + 1);
            } else {
                letra2 = ' ';
            }
            if (letra1 == letra2) {
                cont++;
            } else if (letra2 == ' ') {
                cadenaRLE += cont;
                cadenaRLE += letra1;
            } else {
                cadenaRLE += cont;
                cadenaRLE += letra1;
                cont = 1;

            }
        }
        return cadenaRLE;
    }

    private void limpiar() {
        binario = "";
        val = "";
        totaldevalores = 7;
        palabra_creada = "";
        decimal = 0;
    }

    private String Ascii_a_Binario(int val_en_ascii) {
        String binario = Integer.toBinaryString(val_en_ascii);
        return binario;
    }

    String val = " ";
    int totaldevalores = 7;
    String palabra_creada = "";

    private void Binario_a_Ascii(String cadena_binario, JTextArea mostrar) {
        for (int i = 0; i < cadena_binario.length(); i++) {
            val += cadena_binario.charAt(i);
            if (i == totaldevalores) {
                int el_decimal = Binario_a_decimal(val);
                palabra_creada += decimal_a_ascii(el_decimal);
                totaldevalores = totaldevalores + 8;
                val = " ";
                decimal = 0;
            }
        }
        mostrar.setText("las letras ingresadas en binario son:" + " " + palabra_creada);
    }

    private String rle_a_Ascii(String cadena_rle) {
        String dato = "";
        int totaldevalores = 1;
        for (int i = 0; i < cadena_rle.length(); i++) {
            dato += cadena_rle.charAt(i);
            if (i == totaldevalores) {
                int dato_en_numero = Integer.parseInt(dato);
                //    System.out.println("DATO ANTES" + dato_en_numero);

                if (dato_en_numero < 33) {
                    dato_en_numero = dato_en_numero + 43;
                }
                //   System.out.println("datooooo" + dato_en_numero);
                palabra_creada += decimal_a_ascii(dato_en_numero);
                totaldevalores = totaldevalores + 2;
                dato = "";
            }
        }
        return palabra_creada;
    }

    private int Binario_a_decimal(String binario) {
        int exponente = 128;

        for (int x = 0; x < binario.length(); x++) {
            char val = binario.charAt(x);
            if (val != ' ') {
                if (val == '1') {
                    decimal = decimal + exponente;
                }
                exponente = exponente / 2;
            }
        }
        return decimal;
    }

    private String decimal_a_ascii(int decimal) {

        String letra = Character.toString((char) decimal);
        return letra;
    }

    public String comprimir(String frase) {
        Compresor compresor = new Compresor();
        String Cadena_en_binario = compresor.CodigoAscii_a_binario(frase);
        String cadena_simple = compresor.cadena_RLE(Cadena_en_binario);
        String ultima_cadena = compresor.rle_a_Ascii(cadena_simple);
        return ultima_cadena;
    }
}
