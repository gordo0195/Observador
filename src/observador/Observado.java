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
 * * La clase Observado llama a Observador, el cual recibe un mensaje del usuario y devuelve la 
 * entrada del usuario en forma de objeto mediante su notificación a los Observados que se encuentren disponibles.
 * Estos a su vez actualizan y muestran el mensaje.
 * Entradas: Una notificación de Observer.
 * Salidas: La notificación al usuario.
 * Restricciones: Solo recibe mensajes básicos y si son fraces retorna solamente la palabra inicial
 * porque convierte la cadena en un objeto.
 */
import java.util.Observable;
import java.util.Observer;

//Observado inicia el servicio y hace la llamada a Observador 
public class Observado {
    

    public static void main(String[] args) {
        System.out.println("Introducir Texto: ");
        Observador fuente = new Observador();

        fuente.addObserver(new Observer(){//llamada a la clase de java Observer y hereda sus métodos
                @Override
                public void update(Observable obj, Object arg){//actualiza sus registros y encuentra un nuevo mensaje
                    System.out.println("\nRespuesta recibida: " + arg); //devuelve al usuario el mensaje como un objeto
                }
        });

        new Thread(fuente).start();// adición del proceso para uno o más Observados mediante hilos
    }

}
