package com.targettrust.imob.mb;

import com.targettrust.imob.bean.ImovelBean;
import com.targettrust.imob.rn.ImovelBD;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@ManagedBean
@SessionScoped
public class ImovelMB {

    private ImovelBean imovel;
    
    public ImovelMB() {
        imovel = new ImovelBean();
    }
    
    public void editarImovel(ImovelBean Imovel){
        this.imovel = Imovel;
    }
    
    public String salvarImovel() throws ClassNotFoundException{
        new ImovelBD().salvar(imovel);
        return "";
    }
    
    public ImovelBean getImovel() {
        return imovel;
      }

    public void setImovel(ImovelBean imovel) {
        this.imovel = imovel;
    }
  
            
}
