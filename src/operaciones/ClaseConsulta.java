
package operaciones;

/**
 *
 * @author ubuntu
 */
public class ClaseConsulta extends Operaciones{
    
    @Override
    public void Transacciones(){
        System.out.println("--------------------------------");
        System.out.println("Su saldo actual es: "+ getSaldo());
        System.out.println("--------------------------------");
    }
}
