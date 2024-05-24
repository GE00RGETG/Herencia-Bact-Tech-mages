
package JAVA;

class Vehiculo {
    private int year;
    private String marca;
    private String modelo;
    public Vehiculo(int year, String marca, String modelo) {
        this.year = year;
        this.marca = marca;
        this.modelo = modelo;
    }
    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getMarca() {
        return this.marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
class Trailer extends Vehiculo {
    private double capacidad;
    public Trailer(int year, String marca, String modelo, double capacidad) {
        super(year, marca, modelo);
        this.capacidad = capacidad;
    }
    public double getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }
}
public class Herencia {
    public static void main(String[] args) {
        Trailer camion = new Trailer(2024, "BMW", "X200Z", 1300.10);
        System.out.println(camion.getYear());
        System.out.println(camion.getMarca());
        System.out.println(camion.getModelo());
        System.out.println(camion.getCapacidad());
    }
}
