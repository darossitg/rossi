package com.targettrust.imob.rn;

import com.targettrust.imob.bean.ProdutoBean;
import com.targettrust.imob.conexao.ConexaoDB;
import com.targettrust.imob.mb.ProdutoMB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.jsp.jstl.sql.Result;
import javax.servlet.jsp.jstl.sql.ResultSupport;

public class ProdutoBD {
   

    
    public ArrayList<ProdutoBean> listaProdutos(ProdutoBean produto) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Connection conn = ConexaoDB.getConnection();
        try {
                 StringBuffer sql = new StringBuffer("select prodcodigo, proddescricao, prodvalorunitario, prodreferencia, prodtamanho, prodobservacao, prodquantidadeatual from produto")
			.append(" WHERE 1 = 1 ");
                 if(produto.getProdReferencia()!=null && !produto.getProdReferencia().equals("") || 1==1)
                        sql.append("AND produto.prodreferencia like '%2%' ");
                     PreparedStatement  pstmt = conn.prepareStatement(sql.toString());    
            ResultSet rs = pstmt.executeQuery();
            ArrayList<ProdutoBean> lista = new ArrayList<ProdutoBean>();
            ProdutoBean prod;
            while (rs.next()) {
                prod = new ProdutoBean();
                prod.setProdCodigo(rs.getInt("prodcodigo"));
                prod.setProdDescricao(rs.getString("proddescricao"));
                prod.setProdValorUnitario(rs.getDouble("prodvalorunitario"));
                prod.setProdReferencia(rs.getString("prodreferencia"));
                prod.setProdTamanho(rs.getString("prodtamanho"));
                prod.setProdObservacao(rs.getString("prodobservacao"));
                prod.setProdQuantidadeAtual(rs.getInt("prodquantidadeatual"));
                lista.add(prod);
            }
            return lista;
        } catch (Exception e) {
            return null;
        }
    }
}
