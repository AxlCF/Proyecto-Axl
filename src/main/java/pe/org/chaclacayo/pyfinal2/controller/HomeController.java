
package pe.org.chaclacayo.pyfinal2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author admin
 */
@Controller
public class HomeController {
    
    @GetMapping("/login")
    public String index(){
        return "login";
    }
    @GetMapping("/register")
    public String register(){
        return "formRegister";
    }
    @GetMapping("/cambiarcontra")
    public String cambiarcontra(){
        return "cambiarcontraseña";  
    }
   @GetMapping("/nuevoregistro")
    public String nuevoregistro(){
        return "nuevoregistro";
    }
    @GetMapping("/actualizar")
    public String actualizar(){
        return "actualizar";
    }
    }
