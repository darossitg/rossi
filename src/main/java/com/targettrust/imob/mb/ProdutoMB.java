package com.targettrust.imob.mb;

import com.targettrust.imob.bean.ProdutoBean;
import com.targettrust.imob.rn.ProdutoBD;
import com.targettrust.imob.util.Mensagem;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ProdutoMB {

    private ProdutoBean produto;

    public ProdutoMB() {
        produto = new ProdutoBean();
    }

    //novo
    public String ListaComFiltro() {
        try {
            System.out.println("combo"+produto.getProdCombobox());
            //System.out.println("valor checkbox:"+ checkbox);
       //     ArrayList<ProdutoBean> lista = new ArrayList<ProdutoBean>();
         //   lista = new ProdutoBD().listaProdutos(produto);
          //  return lista;
        } catch (Exception e) {
            Mensagem.error(e.getMessage());
        }
        return null;
    }

    public List<ProdutoBean> getLista() {
        try {
            ArrayList<ProdutoBean> lista = new ArrayList<ProdutoBean>();
            lista = new ProdutoBD().listaProdutos(produto);
            return lista;
        } catch (Exception e) {
            Mensagem.error(e.getMessage());
        }
        return null;
    }

    /**
     * @return the produto
     */
    public ProdutoBean getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(ProdutoBean produto) {
        this.produto = produto;
    }
}
