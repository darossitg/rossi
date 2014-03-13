package com.targettrust.imob.mb;

import com.targettrust.imob.conexao.ConexaoDB;
import com.targettrust.imob.bean.ClienteBean;
import com.targettrust.imob.rn.ClienteRN;
import com.targettrust.imob.util.Mensagem;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ClienteMB {
    
    private ClienteBean cliente;

    public void editar(ClienteBean cliente) {
        this.cliente = cliente;
    }

    public void limpar() {
        cliente = new ClienteBean();
    }
    
    public List<ClienteBean> lista() {        
        try {
            return new ClienteRN().listar(cliente);
        } catch(Exception e) {
            Mensagem.error(e.getMessage());
        }
        return null;
    }
    
    public String salvar() {
        try {
          
            new ClienteRN().salvar(cliente);
            
            Mensagem.add("Operação executada com sucesso!");
            return "listarCliente";
        } catch(Exception e) {
            Mensagem.error(e.getMessage());
        }
        return null;
    }

    public String excluir() {
        try {
          
            new ClienteRN().excluir(cliente);
            Mensagem.add("Operação executada com sucesso!");
            return "listarCliente";
        } catch(Exception e) {
            Mensagem.error(e.getMessage());
        }
        return null;
    }

    public String pesquisar() {
        return "listarCliente";
    }
    
    public ClienteMB() {
        cliente = new ClienteBean();
    }

    public ClienteBean getCliente() {
        return cliente;
    }

    public void setCliente(ClienteBean cliente) {
        this.cliente = cliente;
    }
    
}
