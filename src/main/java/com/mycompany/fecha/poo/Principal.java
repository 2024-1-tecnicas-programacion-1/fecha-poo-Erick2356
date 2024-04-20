package com.mycompany.fecha.poo;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner e = new Scanner (System.in);

        int dia= e.nextInt();
        int mes= e.nextInt();
        int anio= e.nextInt();
        Fecha f = new Fecha (dia,mes,anio);
        Fecha v = new Fecha(dia, mes, anio);
        System.out.println(f.fechaLarga());
        System.out.println(v.validaFecha());
    }
}