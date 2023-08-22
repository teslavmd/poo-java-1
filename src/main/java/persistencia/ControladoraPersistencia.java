package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Automovil;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {

    AutomovilJpaController autoJpa = new AutomovilJpaController();

    
    //ALTA DE AUTOMOVIL
    public void crearAuto(Automovil auto){
        autoJpa.create(auto);
    }

    public List<Automovil> findAll() {
       return autoJpa.findAutomovilEntities();
    }

    public void delete(Long idAuto) {
        try {
            autoJpa.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil findAutomovil(Long idAuto) {
        return autoJpa.findAutomovil(idAuto);
    }

    public void edit(Automovil automovil) {
        try {
            autoJpa.edit(automovil);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
