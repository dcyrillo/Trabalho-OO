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
public class Planta extends Pokemon implements Serializable{

    public Planta(String nome, double peso, double altura, char sexo, int pontosVida, int ataqueUm,
            int ataqueDois, int defesaUm, int defesaDois) {
        
        super(nome, peso, altura, sexo, "Planta", pontosVida, ataqueUm, ataqueDois, defesaUm, defesaDois, "Fogo, Inseto, Planta, Venenoso, Voador",
                "Agua, Pedra, Terra", "Wood Hammer / Power Whip", "Frenzy Plant");

    }

    public Planta(String nome) {
        super(nome, "Planta", "Fogo, Inseto, Planta, Venenoso, Voador",
                "Agua, Pedra, Terra", "Wood Hammer / Power Whip", "Frenzy Plant");
    }

    @Override
    public void caracteristicaTipo() {
        System.out.println("assasdasda");
    }
}
