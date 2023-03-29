/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author GOD LUFFY
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Supermercado[] supermercados = new Supermercado[3];
        int totalVentas = 0;

        for (int i = 0; i < 3; i++) {
            supermercados[i] = new Supermercado();
            System.out.println("Ingrese la información del supermercado " + (i + 1));
            Scanner scanner = new Scanner(System.in);

            System.out.println("Nombre:");
            supermercados[i].nombre = scanner.nextLine();

            System.out.println("Código:");
            supermercados[i].codigo = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Nombre del gerente:");
            supermercados[i].nombreGerente = scanner.nextLine();

            System.out.println("Ingrese las ventas diarias:");
            supermercados[i].ingresarVentas();

            int ventasSemanales = supermercados[i].calcularVentasSemanales();
            totalVentas += ventasSemanales;
        }

        System.out.println("Total de ventas de los 3 supermercados: " + "$" + totalVentas);

        for (int i = 0; i < 7; i++) {
            int ventasDia = supermercados[0].ventasDiarias[i] + supermercados[1].ventasDiarias[i] + supermercados[2].ventasDiarias[i];
            double porcentaje = (ventasDia * 100.0) / totalVentas;
            System.out.printf("Porcentaje de venta en el día %d: %.2f%%\n", i + 1, porcentaje);
        }

        int indiceMenorVenta = 0;
        int menorVenta = supermercados[0].calcularVentasSemanales();

        for (int i = 1; i < 3; i++) {
            int ventasSemanales = supermercados[i].calcularVentasSemanales();
            if (ventasSemanales < menorVenta) {
                menorVenta = ventasSemanales;
                indiceMenorVenta = i;
            }
        }

        System.out.println("El supermercado que menos vendió fue: " + supermercados[indiceMenorVenta].nombre);
    }
}
