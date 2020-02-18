/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import model.UserDAO;
import model.Usuari;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author APCMRVOL2
 */
@Controller
@RequestMapping("/")
@SessionAttributes({"nombreLogin"})
public class UserController {
    String nombreSesion;
    int id=0;
    UserDAO userdao=new UserDAO();
    @RequestMapping(value = "index",method=RequestMethod.GET)
    public String indexController(Model model){
        return "index";
    }
    
    @RequestMapping(value = "login",method=RequestMethod.GET)
    public String loginController(Model model){
        Usuari usu = new Usuari();
        model.addAttribute("usuari", usu);
        return "login";
    }
    
    @RequestMapping(value="login",method=RequestMethod.POST)
    public String loginPostController(Model model,@ModelAttribute("usuari") Usuari usu){
    String redirectUrl = "login";      
    //Comprobar que el usuario existe en la base de datos
        String usuario=usu.getEmail_user();
        String pass=usu.getPassword_user();
        boolean log = userdao.loginAdministrador(usuario,pass);
        if (log == true){
            this.nombreSesion=userdao.nombreUser(usuario);
            redirectUrl = "home"; 
        }else{
        JOptionPane.showMessageDialog(null, "Usuario no existe o contraseña incorrecta");
        }
        return "redirect:" + redirectUrl;
        
    }
    
    @RequestMapping(value = "home",method=RequestMethod.GET)
    public String homeController(Model model){
        if (nombreSesion != null) {
            model.addAttribute("nombreLogin", nombreSesion);
        }
        return "home";
    }
}
