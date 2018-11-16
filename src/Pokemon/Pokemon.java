/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokemon;

import java.util.ArrayList;

/**
 *
 * @author Samira
 */
public abstract class Pokemon {

    private String nome;
    private double peso;
    private double altura;
    private char sexo;
    private String tipo;
    private int pontosVida;
    private int ataqueUm;
    private int ataqueDois;
    private int defesaUm;
    private int defesaDois;
    private String ataqueNormal = null;
    private String ataqueEspecial = null;
    private String fraqueza;
    private String fortaleza;
    private ArrayList<Pokemon> vetPokemons = new ArrayList();
    private final int totalPokemons = 0;

    public Pokemon(String nome, double peso, double altura, char sexo, String tipo, int pontosVida, int ataqueUm,
            int ataqueDois, int defesaUm, int defesaDois, String fraqueza, String fortaleza, String ataqueNor, String ataqueEsp) {
        
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
        this.tipo = tipo;
        this.pontosVida = pontosVida;
        this.ataqueUm = ataqueUm;
        this.ataqueDois = ataqueDois;
        this.defesaUm = defesaUm;
        this.defesaDois = defesaDois;
        this.ataqueNormal = ataqueNor;
        this.ataqueEspecial = ataqueEsp;
        this.fraqueza = fraqueza;
        this.fortaleza = fortaleza;

    }

    public Pokemon(String nome, String tipo, String fraqueza, String fortaleza, String ataqueNor, String ataqueEsp) {
        this.nome = nome;
        this.tipo = tipo;
        this.fraqueza = fraqueza;
        this.fortaleza = fortaleza;
        this.ataqueNormal = ataqueNor;
        this.ataqueEspecial = ataqueEsp;
    }

    public Pokemon() {

    }
    
    public abstract void caracteristicaTipo();               //onde vivem, o que comem , etc...

    public boolean verificaPokemon(String nome) {           //verifica se pokemon esta no vetor 

        for (Pokemon p : vetPokemons) {
            if (p.getNome().equals(nome)) {
                return true;
            }
        }

        return false;
    }

    public void inserePokemon(Pokemon p) {
        this.vetPokemons.add(p);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPontosVida() {
        return pontosVida;
    }

    public void setPontosVida(int pontosVida) {
        this.pontosVida = pontosVida;
    }

    public int getAtaqueUm() {
        return ataqueUm;
    }

    public void setAtaqueUm(int ataqueUm) {
        this.ataqueUm = ataqueUm;
    }

    public int getAtaqueDois() {
        return ataqueDois;
    }

    public void setAtaqueDois(int ataqueDois) {
        this.ataqueDois = ataqueDois;
    }

    public int getDefesaUm() {
        return defesaUm;
    }

    public void setDefesaUm(int defesaUm) {
        this.defesaUm = defesaUm;
    }

    public int getDefesaDois() {
        return defesaDois;
    }

    public void setDefesaDois(int defesaDois) {
        this.defesaDois = defesaDois;
    }

    public String getAtaqueNormal() {
        return ataqueNormal;
    }

    public void setAtaqueNormal(String ataqueNormal) {
        this.ataqueNormal = ataqueNormal;
    }

    public String getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public void setAtaqueEspecial(String ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }

    public String getFraqueza() {
        return fraqueza;
    }

    public void setFraqueza(String fraqueza) {
        this.fraqueza = fraqueza;
    }

    public String getFortaleza() {
        return fortaleza;
    }

    public void setFortaleza(String fortaleza) {
        this.fortaleza = fortaleza;
    }

    public void imprimeInfo() {
        System.out.println("");
        System.out.println(" ====== INFO POKEMON =======");
        System.out.println(" Nome: " + nome);
        System.out.println(" Tipo: " + tipo);
        System.out.println(" Peso: " + peso);
        System.out.println(" Altura: " + altura);
        System.out.println(" Sexo: " + sexo);
        System.out.println(" Pontos de vida: " + pontosVida);
        System.out.println(" Pontos Ataque: " + ataqueUm);
        System.out.println(" Pontos Ataque Especial: " + ataqueDois);
        System.out.println(" Pontos Defesa: " + defesaUm);
        System.out.println(" Pontos Defesa Especial: " + defesaDois);
        System.out.println(" Ataque Fisico: " + ataqueNormal);
        System.out.println(" Ataque Especial: " + ataqueEspecial);
        System.out.println(" Pokemons do tipo " + tipo.toUpperCase() + " são fortes contra: " + fortaleza);
        System.out.println(" Pokemons do tipo " + tipo.toUpperCase() + " são fracos contra: " + fraqueza);
        System.out.println(" Caracteristicas Pokemon: " ); caracteristicaTipo();
        System.out.println("");

    }

}
