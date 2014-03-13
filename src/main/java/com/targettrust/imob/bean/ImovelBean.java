package com.targettrust.imob.bean;

import javax.persistence.Entity;

@Entity
public class ImovelBean {
 
    private int imovelCod = 0;
    private String imovelEnd = null;
    private String imovelProp = null;
    private double imovelValor = 0;
    private String imovelDes = null;

    /**
     * @return the imovelCod
     */
    public int getImovelCod() {
        return imovelCod;
    }

    /**
     * @param imovelCod the imovelCod to set
     */
    public void setImovelCod(int imovelCod) {
        this.imovelCod = imovelCod;
    }

    /**
     * @return the imovelEnd
     */
    public String getImovelEnd() {
        return imovelEnd;
    }

    /**
     * @param imovelEnd the imovelEnd to set
     */
    public void setImovelEnd(String imovelEnd) {
        this.imovelEnd = imovelEnd;
    }

    /**
     * @return the imovelProp
     */
    public String getImovelProp() {
        return imovelProp;
    }

    /**
     * @param imovelProp the imovelProp to set
     */
    public void setImovelProp(String imovelProp) {
        this.imovelProp = imovelProp;
    }

    /**
     * @return the imovelValor
     */
    public double getImovelValor() {
        return imovelValor;
    }

    /**
     * @param imovelValor the imovelValor to set
     */
    public void setImovelValor(double imovelValor) {
        this.imovelValor = imovelValor;
    }

    /**
     * @return the imovelDes
     */
    public String getImovelDes() {
        return imovelDes;
    }

    /**
     * @param imovelDes the imovelDes to set
     */
    public void setImovelDes(String imovelDes) {
        this.imovelDes = imovelDes;
    }
    
    
    
}
