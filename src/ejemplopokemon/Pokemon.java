/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopokemon;

/**
 *
 * @author Raymon
 */
public class Pokemon {
    
    private String nombre;
    private String tipo;
    private String peso;
    private String altura;
    private String puntosCombate;
    private String vida;
    private String alias;

    public Pokemon(String nombre, String tipo, String peso, String altura, String puntosCombate, String vida, String alias) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.peso = peso;
        this.altura = altura;
        this.puntosCombate = puntosCombate;
        this.vida = vida;
        this.alias = alias;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPuntosCombate() {
        return puntosCombate;
    }

    public void setPuntosCombate(String puntosCombate) {
        this.puntosCombate = puntosCombate;
    }

    public String getVida() {
        return vida;
    }

    public void setVida(String vida) {
        this.vida = vida;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
    
    
    
}
