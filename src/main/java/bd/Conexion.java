/*
Autor= Guillermo Daniel Cruz Ortega
Fecha creacion= 08/03/2022
Fecha actualizacion= 09/03/2022
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
        try {
            getConecction();
            System.out.println("Conexion exitosa");
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public void Desconectar() {
        try {
            getConecction().close();
            System.out.println("Desconexion exitosa");
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public Connection getConecction() {
        try {

            Class.forName("org.postgresql.Drive");
            conecction = DriverManager.getConnection("jdbc:postgresql://" + url + "/", user, pwd);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return conecction;
    }

    public static void main(String[] args) {
        Conexion con = new Conexion();
    }

}
