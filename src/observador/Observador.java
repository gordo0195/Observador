/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observador;

/**
 *
 * @author Gordo_0195
 * 
 * La clase Observador ejecuta un ciclo infinito que queda a la espera del mensaje que va a ingresar el 
 * usuario, llama los métodos de la clase Observable y notifica a los Observados.
 * Entradas: Mensaje del usuario.
 * Salidas: Notificación a los observados
 * Restricciones: sólo recibe cadenas.
 */

import java.util.Scanner;
import java.util.Observable;

public class Observador extends Observable implements Runnable{//Imlements Runnable asegura una ejecución
    //ordenada de los procesos a seguir

    @Override
    public void run() {
        while (true) {
            String respuesta = new Scanner(System.in).next();//recibe el mensaje
            setChanged();//verifica que exista un nuevo registro
            notifyObservers(respuesta);//lo envía a los Observados
        }
    }

  
    
}
