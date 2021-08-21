package Persistencia;

import Logica.Consulta;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    ConsultaJpaController consJPA = new ConsultaJpaController();
    //Recibo la consulta y llamo a JPAController de consulta para que lo cree en la base de datos.
    public void crearConsulta(Consulta cons){
        try {
            consJPA.create(cons);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
