package com.app;
import com.dominio.JuegoPpt;
import javax.swing.*;

public class AppPiedraPapelTijera {
    public static void main(String[] args) {
        String nombreUsuario= JuegoPpt.nombreUsuario();

        while (true) {
            int opcionElegida = JuegoPpt.mostrarMenu(nombreUsuario);

            switch (opcionElegida) {
                case JuegoPpt.VER_INSTRUCCIONES ->
                    JuegoPpt.mostrarInstrucciones();
                case JuegoPpt.JUGAR -> {
                    JuegoPpt.ejecutarJuego();
                }

            }
        }


    }

}
