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
public class Normal extends Pokemon  implements Serializable {

    public Normal(String nome, double peso, double altura, char sexo,int pontosVida, int ataqueUm,
            int ataqueDois, int defesaUm, int defesaDois) {

        super(nome, peso, altura, sexo, "Normal", pontosVida, ataqueUm, ataqueDois, defesaUm, defesaDois,
                "Pedra", "Nenhum", "Explosion ", "Hiper Raio");
    }

    public Normal(String nome) {
        super(nome, "Normal","Pedra", "Nenhum", "Explosion ", "Hiper Raio");
    }

    @Override
    public void caracteristicaTipo() {

    }
   


}
