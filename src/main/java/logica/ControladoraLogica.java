package logica;

import persistencia.ControladoraPersistencia;

public class ControladoraLogica {
    
    ControladoraPersistencia controladoraPersis = new ControladoraPersistencia();

    public void guardar(
            String modelo, 
            String marca, 
            String motor, 
            String color, 
            String patente, 
            int puertas
    ){
        Automovil automovil = new Automovil();
        automovil.setModelo(modelo);
        automovil.setMarca(marca);
        automovil.setMotor(motor);
        automovil.setColor(color);
        automovil.setPatente(patente);
        automovil.setCantPuertas(puertas);
        
        controladoraPersis.crearAuto(automovil);
        
    }
    
}
