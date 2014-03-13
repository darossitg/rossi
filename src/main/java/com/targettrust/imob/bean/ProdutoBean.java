package com.targettrust.imob.bean;

public class ProdutoBean {
    private int prodCodigo = 0;
    private String prodDescricao = "";
    private int prodQuantidadeAtual = 0;
    private double prodValorUnitario = 0;
    private String prodReferencia = "";
    private String prodTamanho = "";
    private String prodObservacao = "";
    private String prodFiltro = "";
    private int prodCombobox = 0;
    
    

    /**
     * @return the prodCodigo
     */
    public int getProdCodigo() {
        return prodCodigo;
    }

    /**
     * @param prodCodigo the prodCodigo to set
     */
    public void setProdCodigo(int prodCodigo) {
        this.prodCodigo = prodCodigo;
    }

    /**
     * @return the prodDescricao
     */
    public String getProdDescricao() {
        return prodDescricao;
    }

    /**
     * @param prodDescricao the prodDescricao to set
     */
    public void setProdDescricao(String prodDescricao) {
        this.prodDescricao = prodDescricao;
    }

    /**
     * @return the prodQuantidadeAtual
     */
    public int getProdQuantidadeAtual() {
        return prodQuantidadeAtual;
    }

    /**
     * @param prodQuantidadeAtual the prodQuantidadeAtual to set
     */
    public void setProdQuantidadeAtual(int prodQuantidadeAtual) {
        this.prodQuantidadeAtual = prodQuantidadeAtual;
    }

    /**
     * @return the prodValorUnitario
     */
    public double getProdValorUnitario() {
        return prodValorUnitario;
    }

    /**
     * @param prodValorUnitario the prodValorUnitario to set
     */
    public void setProdValorUnitario(double prodValorUnitario) {
        this.prodValorUnitario = prodValorUnitario;
    }

    /**
     * @return the prodReferencia
     */
    public String getProdReferencia() {
        return prodReferencia;
    }

    /**
     * @param prodReferencia the prodReferencia to set
     */
    public void setProdReferencia(String prodReferencia) {
        this.prodReferencia = prodReferencia;
    }

    /**
     * @return the prodTamanho
     */
    public String getProdTamanho() {
        return prodTamanho;
    }

    /**
     * @param prodTamanho the prodTamanho to set
     */
    public void setProdTamanho(String prodTamanho) {
        this.prodTamanho = prodTamanho;
    }

    /**
     * @return the prodObservacao
     */
    public String getProdObservacao() {
        return prodObservacao;
    }

    /**
     * @param prodObservacao the prodObservacao to set
     */
    public void setProdObservacao(String prodObservacao) {
        this.prodObservacao = prodObservacao;
    }

    /**
     * @return the prodFiltro
     */
    public String getProdFiltro() {
        return prodFiltro;
    }

    /**
     * @param prodFiltro the prodFiltro to set
     */
    public void setProdFiltro(String prodFiltro) {
        this.prodFiltro = prodFiltro;
    }

    /**
     * @return the prodCombobox
     */
    public int getProdCombobox() {
        return prodCombobox;
    }

    /**
     * @param prodCombobox the prodCombobox to set
     */
    public void setProdCombobox(int prodCombobox) {
        System.out.println("prodcombo:"+prodCombobox);
        this.prodCombobox = prodCombobox;
    }
    
    
}
