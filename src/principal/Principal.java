
package principal;

import operaciones.ClaseConsulta;
import operaciones.Operaciones;


/**
 *
 * @author ubuntu
 */
public class Principal {
    public static void main(String[] args) {
        
        Operaciones mensajero = new ClaseConsulta();
        mensajero.setSaldo(2000000);
        mensajero.Operaciones();
    }
}
