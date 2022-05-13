package modelo;

import exception.TartaException;
import javax.swing.JOptionPane;

public class Pedido {

    private String tipo;
    private int raciones;
    private double fianza;
    private double precio;

    public Pedido(String tipo, String raciones, String fianza, String precio) throws TartaException {
        setTipo(tipo);
        setRaciones(raciones);
        setFianza(fianza);
        setPrecio(precio);
    }

    public void setTipo(String tipo) throws TartaException {
        if (tipo == null || tipo.isEmpty()) {
            throw new TartaException("El tipo es nulo.");
        }
        this.tipo = tipo;
    }

    public void setRaciones(String raciones) throws TartaException {
        int racion=0;

        try {
            racion = Integer.parseInt(raciones);
        } catch (NumberFormatException e) {
            throw new TartaException("Error: Las raciones no es un numero valido.");
        }

        if (racion <= 0) {
            throw new TartaException("Las raciones no puedes ser menores que cero.");
        }
        this.raciones = racion;

    }

    public void setFianza(String fianza) throws TartaException {

        double fian;
        
        try{
            fian = Double.parseDouble(fianza);
        }catch(NumberFormatException e){
            throw new TartaException("Error: la fianza No es un numero valido.");
        }
       
        if (fian <= 0) {
            throw new TartaException("La fianza no puede ser menor que 0. ");
        }
        this.fianza = fian;
    }

    public void setPrecio(String precio) throws TartaException {

        double preci;
        
        try{
            preci=  Double.parseDouble(precio);
        }catch(NumberFormatException e){
             throw new TartaException("Error: El precio no es un numero valido.");
        }
        
        if (preci <= 0) {
            throw new TartaException("El precio no puede ser menor.");
        }
        this.precio = preci;
    }

    public String getTipo() {
        return tipo;
    }

    public int getRaciones() {
        return raciones;
    }

    public double getFianza() {
        return fianza;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Pedido{" + "tipo=" + tipo + ", raciones=" + raciones + ", fianza=" + fianza + ", precio=" + precio + '}';
    }
    
    
}
