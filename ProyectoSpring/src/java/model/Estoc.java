/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author APCMRVOL2
 */
public class Estoc {
    private int estoc_id;
    private int estoc_q_max;
    private int estoc_q_min;
    private int prod_id;
    private int lloc_id;

    public Estoc() {
    }

    public Estoc(int estoc_id, int estoc_q_max, int estoc_q_min, int prod_id, int lloc_id) {
        this.estoc_id = estoc_id;
        this.estoc_q_max = estoc_q_max;
        this.estoc_q_min = estoc_q_min;
        this.prod_id = prod_id;
        this.lloc_id = lloc_id;
    }

    public int getEstoc_id() {
        return estoc_id;
    }

    public int getEstoc_q_max() {
        return estoc_q_max;
    }

    public int getEstoc_q_min() {
        return estoc_q_min;
    }

    public int getProd_id() {
        return prod_id;
    }

    public int getLloc_id() {
        return lloc_id;
    }

    public void setEstoc_id(int estoc_id) {
        this.estoc_id = estoc_id;
    }

    public void setEstoc_q_max(int estoc_q_max) {
        this.estoc_q_max = estoc_q_max;
    }

    public void setEstoc_q_min(int estoc_q_min) {
        this.estoc_q_min = estoc_q_min;
    }

    public void setProd_id(int prod_id) {
        this.prod_id = prod_id;
    }

    public void setLloc_id(int lloc_id) {
        this.lloc_id = lloc_id;
    }
    
    
}
