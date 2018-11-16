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
public class Eletrico extends Pokemon  implements Serializable{

    public Eletrico(String nome, double peso, double altura, char sexo, int pontosVida, int ataqueUm,
            int ataqueDois, int defesaUm, int defesaDois) {

        super(nome, peso, altura, sexo, "Eletrico", pontosVida, ataqueUm, ataqueDois, defesaUm, defesaDois,
                "Dragão, Eletrico, Planta, Pedra", "Agua, Voador", "Bolt Strike ", "Zap Cannon");
    }

    public Eletrico(String nome) {
        super(nome, "Eletrico","Dragão, Eletrico, Planta, Pedra", "Agua, Voador", "Bolt Strike ", "Zap Cannon");
    }

    @Override
    public void caracteristicaTipo() {

    }
    


}
