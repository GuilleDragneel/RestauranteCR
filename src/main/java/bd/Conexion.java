/*
Autor= Guillermo Daniel Cruz Ortega
Fecha creacion= 08/03/2022
Fecha actualizacion= 08/03/2022
Descripcion= Paquete de base de datos
 */
package bd;

import java.sql.*;

public class Conexion {

    private Connection conecction;
    private String url;
    private String user;
    private String pwd;

    public Conexion() {
    }

    public Conexion(Connection conecction, String url, String user, String pwd) {
        this.conecction = conecction;
        this.url = url;
        this.user = user;
        this.pwd = pwd;
    }

    public void Conectar() {

    }

    public void Desconectar() {

    }

    public Connection getConecction() {
        return conecction;
    }

    public static void main(String[] args) {

    }

}
