package com.targettrust.imob.mb;

import com.targettrust.imob.bean.UsuarioBean;
import com.targettrust.imob.rn.UsuarioBD;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@ManagedBean
@SessionScoped
public class UsuarioMB extends UsuarioBD{
    private UsuarioBean usuario;

    public UsuarioMB(){
    usuario = new UsuarioBean();
    }
    
    public String consultaUsuario() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
        boolean login = consultaUsuarioBD(usuario);  
        if(login)
            return "index1";
        else
            return "";
    }
    /**
     * @return the usuario
     */
    public UsuarioBean getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(UsuarioBean usuario) {
        this.usuario = usuario;
    }
    
    /**
     *
     * @return
     */
    public String mataSessao(){
        System.out.println("eh aqui");
   // FacesContext fc = FacesContext.getCurrentInstance();    
   // HttpSession session = (HttpSession)fc.getExternalContext().getSession(false);    
    //session.invalidate();
    return "index";    
    }
    
}
