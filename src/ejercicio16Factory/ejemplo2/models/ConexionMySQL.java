package ejercicio16Factory.ejemplo2.models;

import ejercicio16Factory.ejemplo2.interfaces.IConexion;

public class ConexionMySQL implements IConexion {

    private String host;
    private String puerto;
    private String usuario;
    private String contrasenia;

    public ConexionMySQL() {
        this.host = "";
        this.puerto = "";
        this.usuario = "";
        this.contrasenia = "";
    }

    @Override
    public void conectar() {
        System.out.println("Se conecto a MySQL");
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconecto MySQL");
    }
}
