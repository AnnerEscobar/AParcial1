/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoldProrrateo;
import FoldGastos.ClsGastos;
import FoldProducto.ClsProducto;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author anner
 */
public class ClsProrrateo {
    private static String[][] Prorrateo = new String[1][1];
    private static Double[] Gastos = new Double[1];
    private static Double[] PesoProducto = new Double[1];
    
    private static final int Cantidad = 0;
    private static final int Descripcion = 1;
    private static final int ValorFactura = 2;
    private static final int GastoValor = 3;
    private static final int GastoPeso = 4;
    private static final int PrecioUnidad = 5;
    private static final int PrecioTotal = 6;
    private final int ColumnasTop = 7;
    
    private int filaActual = 0;
    
    public ClsProrrateo(int filas){
        Prorrateo = new String[filas][ColumnasTop];
        PesoProducto = new Double[filas];
        Gastos = new Double[5];
    }
    

    public static void imprimirDecorado(){
        for (int x = 0; x < Prorrateo.length; x++) { 
            System.out.print("|");
            for (int y = 0; y < Prorrateo[x].length; y++) {
                if (y > 1){
                    System.out.print(Prorrateo[x][y]);
                }
                else{
                    System.out.print(Prorrateo[x][y]);
                }
                if (y != Prorrateo[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
    }
    
    public static Double ValorTotal(){
        Double total = 0.0;
        for (int fila = 0; fila < Prorrateo.length; fila++) {
            total += (Double.valueOf(Prorrateo[fila][ValorFactura])*Double.valueOf(Prorrateo[fila][Cantidad]));
        }
        return total;
    }
    
    public static Double Sumatoria(int inicio){
        Double total = 0.0;
        for (int i = inicio; i < Gastos.length; i+=2) {
            total += Gastos[i];
        }
        return total;
    }
    
    public static void GastosValor(Double coeficiente){
        for (int i = 0; i < Prorrateo.length; i++) {
            Prorrateo[i][GastoValor] = (Double.valueOf(Prorrateo[i][ValorFactura])*coeficiente) + " ";
        }
    }
    
    public static Double PesoTotal(){
        Double total = 0.0;
        for (int fila = 0; fila < Prorrateo.length; fila++) {
            total += (Double.valueOf(Prorrateo[fila][Cantidad])*PesoProducto[fila]);
        }
        return total;
    }
    
    public static Double TotalGastoPeso(){
        Double total = 0.0;
        for (int i = 1; i < Gastos.length; i+=2) {
            total += Double.valueOf(Gastos[i]);
        }
        return total;
    }
    
    public static void GastoPeso(Double coeficiente){
        for (int fila = 0; fila < Prorrateo.length; fila++) {
            Prorrateo[fila][GastoPeso] = (PesoProducto[fila]*coeficiente) + "";
        }
    }
    
    public static void PrecioUnitario(){
        for (int fila = 0; fila < Prorrateo.length; fila++) {
            Prorrateo[fila][PrecioUnidad] = (Double.valueOf(Prorrateo[fila][ValorFactura])
                                            +Double.valueOf(Prorrateo[fila][GastoValor])
                                            +Double.valueOf(Prorrateo[fila][GastoPeso])) + "";
        }
    }
    
    public static void PrecioTotal(){
        for (int fila = 0; fila < Prorrateo.length; fila++) {
            Prorrateo[fila][PrecioTotal] = (Double.valueOf(Prorrateo[fila][PrecioUnidad])
                                           *Double.valueOf(Prorrateo[fila][Cantidad])) + "";
        }
    }
    
    
    public static void TodosProcesos(){
        
        Double valorTotal = ValorTotal();
       //***************
        Double totalGastoValor = Sumatoria(0);
       //****************
        Double coeficienteGasto = totalGastoValor/valorTotal;
        //**************
        GastosValor(coeficienteGasto);
        //***********
        Double pesoTotal = PesoTotal();
        //************
        Double totalGastoPeso = Sumatoria(1);
        //*************
        Double coeficienteGastoPeso = totalGastoPeso/pesoTotal;
        //***********
        GastoPeso(coeficienteGastoPeso);
        //**********
        PrecioUnitario();//imprime el preio unitario
        PrecioTotal();//imprime los precios total
        imprimirDecorado();//Imprime el decorado de la matriz
       
      
    }
    
    public String agregaVendedorMatriz(ClsProducto producto){
        if (filaActual >= Prorrateo.length){
            return "Limite de filas alcanzado.";
        }
        else{
            Prorrateo[filaActual][Descripcion] = producto.getDescripcion();
            Prorrateo[filaActual][Cantidad] = producto.getCantidad() + "";
            Prorrateo[filaActual][ValorFactura] = producto.getValor() + "";
            PesoProducto[filaActual] = producto.getPeso();
            filaActual++;
        }
        return "OK!";
    }
    
    public void agregaGastos(ClsGastos objGastos){
        Gastos[0] = objGastos.getSeguro();
        Gastos[1] = objGastos.getFlete();
        Gastos[2] = objGastos.getAduana();
        Gastos[3] = objGastos.getAcarreo();
        Gastos[4] = objGastos.getBanco();
    }
}
