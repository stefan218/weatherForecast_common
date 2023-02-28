/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Stefan
 */
public class Prognoza implements Serializable{
    private int PrognozaID;
    private Date dan;
    private String opis;
    private Meteorolog meteorolog;
    private ArrayList<PrognozaRegion> listaPrognozaZaRegione;

    public Prognoza() {
    }

    public Prognoza(int PrognozaID, Date dan, String opis, Meteorolog meteorolog, ArrayList<PrognozaRegion> listaPrognozaZaRegione) {
        this.PrognozaID = PrognozaID;
        this.dan = dan;
        this.opis = opis;
        this.meteorolog = meteorolog;
        this.listaPrognozaZaRegione = listaPrognozaZaRegione;
    }


    public Meteorolog getMeteorolog() {
        return meteorolog;
    }

    public void setMeteorolog(Meteorolog meteorolog) {
        this.meteorolog = meteorolog;
    }

    public int getPrognozaID() {
        return PrognozaID;
    }

    public void setPrognozaID(int PrognozaID) {
        this.PrognozaID = PrognozaID;
    }

    public Date getDan() {
        return dan;
    }

    public void setDan(Date dan) {
        this.dan = dan;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public ArrayList<PrognozaRegion> getListaPrognozaZaRegione() {
        return listaPrognozaZaRegione;
    }

    public void setListaPrognozaZaRegione(ArrayList<PrognozaRegion> listaPrognozaZaRegione) {
        this.listaPrognozaZaRegione = listaPrognozaZaRegione;
    }
    
    
}
