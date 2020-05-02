package ejercicio16Factory.ejemplo2.factory;

import ejercicio16Factory.ejemplo2.interfaces.IConexion;
import ejercicio16Factory.ejemplo2.models.ConexionMySQL;
import ejercicio16Factory.ejemplo2.models.ConexionOracle;
import ejercicio16Factory.ejemplo2.models.ConexionSQLServer;

public class ConexionFabrica {

    public IConexion getConexion(String conexion) {
        if (conexion == null) {
            return null;
        }
        if (conexion.equals("MYSQL")) {
            return new ConexionMySQL();
        } else if (conexion.equals("ORACLE")) {
            return new ConexionOracle();
        } else if (conexion.equals("SQL")) {
            return new ConexionSQLServer();
        }
        return null;
    }

}
