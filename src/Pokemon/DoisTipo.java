/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokemon;

import java.io.Serializable;

/**
 *
 * @author Samira
 */
public class DoisTipo extends Pokemon implements Serializable{

    private String tipo2;

    public DoisTipo(String nome, double peso, double altura, char sexo, String tipo, String tipo2, int pontosVida, int ataqueUm,
            int ataqueDois, int defesaUm, int defesaDois, String fraqueza, String fortaleza, String ataqueNor, String ataqueEsp) {
        
        super(nome, peso, altura, sexo, tipo, pontosVida, ataqueUm, ataqueDois, defesaUm, defesaDois, fraqueza, fortaleza, ataqueNor, ataqueEsp);
        this.tipo2 = tipo2;
    }

    public DoisTipo(String nome, String tipo, String tipo2, String fraqueza, String fortaleza, String ataqueNor, String ataqueEsp) {
        super(nome, tipo, fraqueza, fortaleza, ataqueNor, ataqueEsp);
        this.tipo2 = tipo2;
    }
    
    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }
    
    @Override
    public void caracteristicaTipo() {
        
    }
    
}
