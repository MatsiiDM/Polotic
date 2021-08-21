package Logica;

import Persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    //Recibo todos los datos
    public void altaConsulta(int nroCliente, String nombre, String raza, String color, String alergia, String atencionEspecial, String nombreDuenio, String telefono, String observaciones){
        //Creo un nuevo objeto del tipo Consulta
        Consulta cons = new Consulta();
        //Y le asigno los valores recibido de la interfaz
        cons.setNroCliente(nroCliente);
        cons.setNombre(nombre);
        cons.setRaza(raza);
        cons.setColor(color);
        cons.setAlergia(alergia);
        cons.setAtencionEspecial(atencionEspecial);
        cons.setNombreDueño(nombreDuenio);
        cons.setTelefono(telefono);
        cons.setObservaciones(observaciones);
        
        //Llamo a la controladora de persistencia para dar de alta esta Consulta en la base de datos
        controlPersis.crearConsulta(cons);
    }
    
}
