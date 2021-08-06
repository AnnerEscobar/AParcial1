/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoldGastos;
import java.util.Scanner;
/**
 *
 * @author anner
 */
public class ClsGastos {
    private Scanner Teclado = new Scanner(System.in);
    private Double Seguro;
    private Double Flete;
    private Double Aduana;
    private Double Acarreo;
    private Double Banco;
    

    public void ObtenerInformacion(){
        System.out.println(" Monto de los Seguros: ");
        setSeguro(Double.valueOf(gets().nextLine()));
        System.out.println(" Monto de los Fletes: ");
        setFlete(Double.valueOf(gets().nextLine()));
        System.out.println(" Monto Pago en Aduanas: ");
        setAduana(Double.valueOf(gets().nextLine()));
        System.out.println("Monto de los Acarreos: ");
        setAcarreo(Double.valueOf(gets().nextLine()));
        System.out.println("Monto de pago a Bancos: "); 
        setBanco(Double.valueOf(gets().nextLine()));
    }

    public Scanner gets() {
        return Teclado;
    }

    public void sets(Scanner teclado) {
        this.Teclado = teclado;
    }

    public Double getSeguro() {
        return Seguro;
    }

    public void setSeguro(Double seguro) {
        this.Seguro = seguro;
    }

    public Double getFlete() {
        return Flete;
    }

    public void setFlete(Double flete) {
        this.Flete = flete;
    }

    public Double getAduana() {
        return Aduana;
    }

    public void setAduana(Double aduana) {
        this.Aduana = aduana;
    }

    public Double getAcarreo() {
        return Acarreo;
    }

    public void setAcarreo(Double acarreo) {
        this.Acarreo = acarreo;
    }

    public Double getBanco() {
        return Banco;
    }

    public void setBanco(Double banco) {
        this.Banco = banco;
    }
}

    

