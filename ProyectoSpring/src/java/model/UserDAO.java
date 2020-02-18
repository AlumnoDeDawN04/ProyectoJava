/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author victo
 */
public class UserDAO {
    Conexion con= new Conexion();
    Connection cn=con.conectar();
    String sql="";
    
    public boolean loginAdministrador (String usuario, String pass){
        sql = "SELECT * from `tbl_usuario` WHERE `email_user`='"+usuario+"' and `password_user`='"+pass+"'";
        try {
            PreparedStatement pst =cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            if (!rs.next()) { 
                return false;
            }else{
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }
    
    public String nombreUser(String usuario){
        sql = "SELECT * from `tbl_usuario` WHERE `email_user`='"+usuario+"'";
        try {
            PreparedStatement pst =cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            if (!rs.next()){
                return null;
            }else{
                String nombre=rs.getString("nombre_user");
                return nombre;
            }
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
                return null;
        }
    }
}
