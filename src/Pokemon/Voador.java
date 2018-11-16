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

public class Voador extends Pokemon implements Serializable {

    public Voador(String nome, double peso, double altura, char sexo, int pontosVida, int ataqueUm,
            int ataqueDois, int defesaUm, int defesaDois) {

        super(nome, peso, altura, sexo, "Voador", pontosVida, ataqueUm, ataqueDois, defesaUm, defesaDois,
                "Eletriico, Pedra", "Inseto, Lutador, Planta", "Sky Attack ", "Furacão");
    }

    public Voador(String nome) {
        super(nome, "Voador", "Eletriico, Pedra", "Inseto, Lutador, Planta", "Sky Attack ", "Furacão");
    }

    @Override
    public void caracteristicaTipo() {

    }
    
}
