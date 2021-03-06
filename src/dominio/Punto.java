/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author alumnoFI
 */
public abstract class Punto {
	private Double coordX;
    private Double coordY;

    public Double getCoordX() {
        return coordX;
    }

    public void setCoordX(Double coordX) {
        this.coordX = coordX;
    }

    public Double getCoordY() {
        return coordY;
    }

    public void setCoordY(Double coordY) {
        this.coordY = coordY;
    }

    public Punto(Double coordX, Double coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }
    
    @Override
    public String toString() {
        return coordX + ";" + coordY;
    }
    
    // la opcion es hacer esto asi, o que get nombre este en punto y tenga su atributo comun aca
    public abstract String getNombre();
}
