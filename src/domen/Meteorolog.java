/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;

/**
 *
 * @author Stefan
 */
public class Meteorolog implements Serializable{
    private int MeteorologID;
    private String ime;
    private String prezime;
    private String username;
    private String password;

    public Meteorolog() {
    }

    public Meteorolog(int MeteorologID, String ime, String prezime, String username, String password) {
        this.MeteorologID = MeteorologID;
        this.ime = ime;
        this.prezime = prezime;
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMeteorologID() {
        return MeteorologID;
    }

    public void setMeteorologID(int MeteorologID) {
        this.MeteorologID = MeteorologID;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
}
