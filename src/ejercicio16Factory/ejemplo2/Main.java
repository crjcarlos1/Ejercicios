package ejercicio16Factory.ejemplo2;

import ejercicio16Factory.ejemplo2.factory.ConexionFabrica;
import ejercicio16Factory.ejemplo2.interfaces.IConexion;

public class Main {
    public static void main(String... args) {
        ConexionFabrica fabrica = new ConexionFabrica();

        /**ORACLE*/
        IConexion oracle = fabrica.getConexion("ORACLE");
        oracle.conectar();
        oracle.desconectar();

        System.out.println();

        /**MYSQL*/
        IConexion mysql = fabrica.getConexion("MYSQL");
        mysql.conectar();
        mysql.desconectar();

        System.out.println();

        /**SQLSERVER*/
        IConexion sql = fabrica.getConexion("SQL");
        sql.conectar();
        sql.desconectar();
    }
}
