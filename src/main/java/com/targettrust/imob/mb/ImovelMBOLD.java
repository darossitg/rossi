package com.targettrust.imob.mb;

import com.targettrust.imob.bean.ImovelBeanOLD;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ImovelMBOLD {

    private ImovelBeanOLD imovel;
    
    public ImovelMBOLD() {
        imovel = new ImovelBeanOLD();
    }

    public void limpar() {
        imovel = new ImovelBeanOLD();
    }
    
    public String pesquisar() {
        return "listarImovel";
    }

    public String salvar() {
        return "listarImovel";
    }

    public ImovelBeanOLD getImovel() {
        return imovel;
    }

    public void setImovel(ImovelBeanOLD imovel) {
        this.imovel = imovel;
    }
    
}
