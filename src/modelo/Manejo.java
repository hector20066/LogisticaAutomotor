/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Mi PC
 */
public class Manejo {
    
    private static Manejo manejo;
    private Vehiculo lista[];
    private int numElementos;
    private int posicion;
    
    public Manejo(){
        lista = null;
        numElementos = 0;
        posicion = 0;
    }
    
    public static Manejo getManejo(){
        if(manejo == null){
            manejo = new Manejo();
        }
        return manejo;
    }
    
    public void setNumElementos(int numElementos){
        this.numElementos = numElementos;
    }
    
    //Metodo para realizar los cambios al ordenar el arreglo
    public void setLista(Vehiculo vehiculo, int pos){
        if(pos < getNumElementos() && pos < getPosicion()){
            lista[pos] = vehiculo;
        }
    }
    
    public int getNumElementos(){
        return numElementos;
    }
    
    public int getPosicion(){
        return posicion;
    }
    
    public Vehiculo getLista(int pos){
        return lista[pos];
    }
    
    public void crearLista(){
        lista = new Vehiculo[numElementos];
    }
    
    //Metodo para guardar la informacion de los vehiculos
    public boolean guardarVehiculos(Vehiculo vehiculo){
        if(getPosicion() < getNumElementos()){
            lista[posicion] = vehiculo;
            posicion++;
            return true;
        }
        return false;
    }
    
    public boolean verificarPlaca(String placa){
        for(int i=0; i<getPosicion(); i++){
            Vehiculo vehiculo = getLista(i);
            String placaVehiculo = vehiculo.getPlaca();
            if(placaVehiculo.equals(placa)){
                return true;
            }
        }
        return false;
    }
    
    public void cambiar(int posicion1, int posicion2){
        Vehiculo vehiculo = getLista(posicion2);
        Vehiculo temporal = getLista(posicion1);
        setLista(vehiculo, posicion1);
        setLista(temporal, posicion2);
    }
    
    public void ordenamientoBurbuja(){
        int i;
        int j;
        for(i = 0; i <= getPosicion() - 1; i++){
            for(j = 0; j <= (getPosicion() - i) - 2; j++){
                if(getLista(j).getModelo() > getLista(j + 1).getModelo()){
                    cambiar(j, j + 1);
                }
            }
        }
    }
    
    public void ordenamientoIntercambiado(){
        int i;
        int j;
        for(i = 0; i <= getPosicion() - 1; i++){
            for(j = i + 1; j <= getPosicion() - 1; j++){
                if(getLista(i).getMarca().compareTo(getLista(j).getMarca()) > 0){
                    cambiar(i, j);
                }
            }
        }
    }
    
    public int posicionMayor(int inicio){
        int i;
        int posMayor;
        float mayorElemento;
        posMayor = inicio;
        mayorElemento = getLista(inicio).getValorComercial();
        for(i = inicio + 1; i <= getPosicion() - 1; i++){
            if(getLista(i).getValorComercial() > mayorElemento){
                mayorElemento = getLista(i).getValorComercial();
                posMayor = i;
            }
        }
        return posMayor;
    }
    
    public void ordenarSeleccion(){
        for(int i = 0; i <= getPosicion() - 1; i++){
            cambiar(i, posicionMayor(i));
        }
    }
    
    public void ordenamientoShell(){
        int i;
        int n;
        int cont;
        n = (getPosicion() - 1) / 2;
        while(n != 0){
            cont = 1;
            while(cont != 0){
                cont = 0;
                for(i = n; i <= getPosicion() - 1; i++){
                    if(getLista(i - n).getPlaca().compareTo(getLista(i).getPlaca()) > 0){
                        cambiar(i, i-n);
                        cont = cont + 1;
                    }
                }
            }
            n = n/2;
        }
    }
    
    public int busquedaBinaria(String placa){
        int pos;
        int izquierda;
        int derecha;
        int centro;
        ordenamientoShell();
        izquierda = 0;
        derecha = getPosicion() - 1;
        pos = -1;
        while((izquierda <= derecha) && (pos == -1)){
            centro = (izquierda + derecha) / 2;
            if(getLista(centro).getPlaca().equals(placa)){
                pos = centro;
            }else{ 
                if(placa.compareTo(getLista(centro).getPlaca()) > 0){
                    izquierda = centro + 1;
                }else{
                    derecha = centro - 1;
                }
            }
        }
        return pos;
    }
    
    public int numMotos(){
        int cantidad = 0;
        for(int i=0; i < getPosicion(); i++){
            if(getLista(i).getTipoVehiculo().equals("Motocicleta")){
                cantidad++;
            }
        }
        return cantidad;
    }
    
    public int numAutomoviles(){
        int cantidad = 0;
        for(int i=0; i < getPosicion(); i++){
            if(getLista(i).getTipoVehiculo().equals("Automovil")){
                cantidad++;
            }
        }
        return cantidad;
    }
    
    public int numCamiones(){
        int cantidad = 0;
        for(int i=0; i < getPosicion(); i++){
            if(getLista(i).getTipoVehiculo().equals("Camion")){
                cantidad++;
            }
        }
        return cantidad;
    }
    
}
