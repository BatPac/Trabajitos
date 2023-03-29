/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author GOD LUFFY
 */
import java.util.Scanner;

class Supermercado {
    String nombre;
    int codigo;
    String nombreGerente;
    int[] ventasDiarias = new int[7];
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreGerente() {
        return nombreGerente;
    }

    public void setNombreGerente(String nombreGerente) {
        this.nombreGerente = nombreGerente;
    }

    public int[] getVentasDiarias() {
        return ventasDiarias;
    }

    public void setVentasDiarias(int[] ventasDiarias) {
        this.ventasDiarias = ventasDiarias;
    }

    void ingresarVentas() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese la venta del día " + (i + 1) + ":");
            ventasDiarias[i] = scanner.nextInt();
        }
    }

    int calcularVentasSemanales() {
        int total = 0;
        for (int venta : ventasDiarias) {
            total += venta;
        }
        return total;
    }
}
