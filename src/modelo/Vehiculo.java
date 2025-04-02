/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Mi PC
 */
public class Vehiculo {
    
    private String placa;
    private String tipoVehiculo;
    private float valorComercial;
    private int modelo;
    private String marca;

    public Vehiculo() {
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public void setValorComercial(float valorComercial) {
        this.valorComercial = valorComercial;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public float getValorComercial() {
        return valorComercial;
    }

    public int getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }
    
}
