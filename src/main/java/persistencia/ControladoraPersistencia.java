package persistencia;

import logica.Automovil;

public class ControladoraPersistencia {

    AutomovilJpaController autoJpa = new AutomovilJpaController();

    
    //ALTA DE AUTOMOVIL
    public void crearAuto(Automovil auto){
        autoJpa.create(auto);
    }
    
    
}
