
package Principal;

import Impl.ConexionMySQL;
import Impl.ConexionOracle;
import Impl.ConexionPostgresSQL;
import Impl.ConexionSQLServer;
import Impl.ConexionVacia;
import Inter.IConexion;

/**
 *
 * @author Luiss
 */
public class ConexionFabrica {
     public IConexion getConexion(String motor) {
        if (motor == null) {
            return new ConexionVacia();
        }
        if (motor.equalsIgnoreCase("MYSQL")) {
            return new ConexionMySQL();
        } else if (motor.equalsIgnoreCase("ORACLE")) {
            return new ConexionOracle();
        } else if (motor.equalsIgnoreCase("POSTGRES")) {
            return new ConexionPostgresSQL();
        } else if (motor.equalsIgnoreCase("SQL")) {
            return new ConexionSQLServer();
        }

        return new ConexionVacia();
    }
}
