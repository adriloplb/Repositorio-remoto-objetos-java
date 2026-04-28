package org.example;

public class Mago {
    private String nombre;
    private Integer vida;
    private Integer energia;
    private Integer poder;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Integer getEnergia() {
        return energia;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }

    public Integer getPoder() {
        return poder;
    }

    public void setPoder(Integer poder) {
        this.poder = poder;
    }

    public Mago(String nombre) {
        this.nombre = nombre;
        this.vida = 100;
        this.energia = 50;
        this.poder = 15;
    }

    public boolean estaVivo() {
        if(this.vida > 0) {
            return true;
        }
        return false;
    }

    public void meditar() {
       this.energia += 20;

       if(this.energia > 50) {
           this.energia = 50;
       }
    }

    public void lanzarHechizo(Mago atacado) {
        if(this.energia >= 10) {
            this.energia -= 10;
            atacado.vida -= this.poder;
            System.out.println(this.nombre + " lanza hechizo a " + atacado.nombre + " y le ha hecho " + this.poder + " daño");
        } else {
            System.out.println(this.nombre + " esta agotado y no puede realizar un ataque");
        }
    }
}
