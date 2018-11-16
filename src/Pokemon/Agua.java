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
public class Agua extends Pokemon implements Serializable {

    public Agua(String nome, double peso, double altura, char sexo, int pontosVida, int ataqueUm,
            int ataqueDois, int defesaUm, int defesaDois) {

        super(nome, peso, altura, sexo, "Agua", pontosVida, ataqueUm, ataqueDois, defesaUm, defesaDois,
                "Agua, Dragão, Planta, Pedra, Eletrico", "Fogo, Inseto, Terra", "Crabhammer ", "Hydro Cannon");
    }

    public Agua(String nome) {
        super(nome, "Agua","Agua, Dragão, Planta, Pedra, Eletrico", "Fogo, Inseto, Terra", "Crabhammer ", "Hydro Cannon");
    }

    @Override
    public void caracteristicaTipo() {

    }

}
