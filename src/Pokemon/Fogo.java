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
public class Fogo extends Pokemon implements Serializable {

    public Fogo(String nome, double peso, double altura, char sexo,int pontosVida, int ataqueUm,
            int ataqueDois, int defesaUm, int defesaDois) {

        super(nome, peso, altura, sexo, "Fogo", pontosVida, ataqueUm, ataqueDois, defesaUm, defesaDois,
                "Agua, Dragão, Fogo, Pedra", "Gelo, Inseto, Planta", "V-create ", "Blast Burn");

    }

    public Fogo(String nome) {
        super(nome, "Fogo","Agua, Dragão, Fogo, Pedra", "Gelo, Inseto, Planta", "V-create ", "Blast Burn");
    }

    @Override
    public void caracteristicaTipo() {
        System.out.println();
    }

}
