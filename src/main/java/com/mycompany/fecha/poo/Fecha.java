package com.mycompany.fecha.poo;
import java.util.HashMap;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;


    } 
    // Complejidad temporal O(1)
    public String fechaCorta(){
        return dia + "/" + mes + "/" + anio;

    } 
    // Complejidad temporal O(1)
    public boolean validaFecha () {

        if (mes>12 || mes<1) {
            return false;

        } 
        else if (mes==2)
        {
            if (anio%4==0 && dia>=1 && dia<=29) {
                return true;
            } 
        }
        else{

            if ((mes==1 || mes==3 || mes==5 || mes==7 || mes ==8 || mes ==10 || mes==12) && dia>=1 && dia<=31) {
                    return true;
                
            }

            else if (dia>=1 && dia<=30) {
                return true;
            }
        }
        return false;
    } 
    // Complejidad temporal O(1)
    public String mesLetra () {
        HashMap<Integer, String> meses = new HashMap<Integer, String>();
        meses.put(1, "Enero");
        meses.put(2, "Febrero");
        meses.put(3, "Marzo");
        meses.put(4, "Abril");
        meses.put(5, "Mayo");
        meses.put(6, "Junio");
        meses.put (7, "Julio");
        meses.put (8, "Agosto");
        meses.put (9, "Septiembre");
        meses.put (10, "Octubre");
        meses.put (11, "Noviembre");
        meses.put (12, "Diciembre");

        return meses.get(mes);

    }
    // Complejidad temporal O(1)
    public String fechaLarga() {
        return dia + " de " + this.mesLetra() + " de " + anio;
    
    
}
// Todos los metodos usados tienen complejidad temporal O(1) lo que significa que el tiempo de ejecución no va a aumentar cuando el tamaño de entrada crece.


}