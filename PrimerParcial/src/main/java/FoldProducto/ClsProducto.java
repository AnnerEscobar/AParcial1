/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoldProducto;
import java.util.Scanner;
/**
 *
 * @author anner
 */
public class ClsProducto {
    private Scanner Teclado = new Scanner(System.in);
    private String Descripcion;
    private int Cantidad;
    private Double Valor;
    private Double Peso;
    
    public void ObtenerInformacion(){
        System.out.println("Ingrese la descripcion del producto: ");
        setDescripcion(gets().nextLine());
        System.out.println("Ingrese la cantidad: ");
        setCantidad(gets().nextInt());
        gets().nextLine();
        System.out.println("Ingrese el valor en factura : ");
        setValor(Double.valueOf(gets().nextLine()));
        System.out.println("Ingrese el peso: ");
        setPeso(Double.valueOf(gets().nextLine()));
    }

    /**
     * @return the ten
     */
    public Scanner gets() {
        return Teclado;
    }

    /**
     * @param t the t to set
     */
    public void setT(Scanner t) {
        this.Teclado = Teclado;
    }

    /**
     * @return the Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param descripcion the Descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.Descripcion = descripcion;
    }

    /**
     * @return the Cantidad
     */
    public int getCantidad() {
        return Cantidad;
    }

    /**
     * @param cantidad the Cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.Cantidad = cantidad;
    }

    /**
     * @return the Valor
     */
    public Double getValor() {
        return Valor;
    }

    /**
     * @param valor the Valor to set
     */
    public void setValor(Double valor) {
        this.Valor = valor;
    }

    /**
     * @return the Peso
     */
    public Double getPeso() {
        return Peso;
    }

    /**
     * @param peso the Peso to set
     */
    public void setPeso(Double peso) {
        this.Peso = peso;
    }

    
}

