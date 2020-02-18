/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author APCMRVOL2
 */
public class Usuari {
    private int id_user;
    private String email_user;
    private String password_user;
    private String nombre_user;

    public Usuari() {
    }

    public Usuari(int id_user, String email_user, String password_user, String nombre_user) {
        this.id_user = id_user;
        this.email_user = email_user;
        this.password_user = password_user;
        this.nombre_user = nombre_user;
    }

    public int getId_user() {
        return id_user;
    }

    public String getEmail_user() {
        return email_user;
    }

    public String getPassword_user() {
        return password_user;
    }

    public String getNombre_user() {
        return nombre_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public void setEmail_user(String email_user) {
        this.email_user = email_user;
    }

    public void setPassword_user(String password_user) {
        this.password_user = password_user;
    }

    public void setNombre_user(String nombre_user) {
        this.nombre_user = nombre_user;
    }
    
    
}
