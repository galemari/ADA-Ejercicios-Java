package FacturaScanner;

import java.util.Scanner;

/*La tarea consiste en crear una nueva clase con el método main llamada DetalleDeFactura, se requiere desarrollar un programa que reciba datos
        de la factura utilizando la clase Scanner de la siguiente manera:

        Reciba el nombre de la factura o descripción, utilizar método nextLine() para obtener el nombre de la factura con espacios.

        Reciba 2 precios de productos de tipo double, utilizar método nextDouble() para obtener precios con decimales (,).

        Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%

        Se pide mostrar en un solo String el nombre de la factura, el monto total bruto (antes de impuesto), el impuesto y el monto total neto incluyendo impuesto.

        Por ejemplo, el resultado podría ser algo así:

        La factura producto de oficina tiene un total bruto de 134.78, con un impuesto de 25.6082 y el monto después de impuesto es de 160.3882*/
public class DetalleDeFactura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese area de producto: Oficina, Colegio :");
        String productoFactura = sc.nextLine();

        System.out.println("Ingrese valor del primer item: " );
        double itemUno = sc.nextDouble();

        System.out.println("Ingrese valor del segundo item: " );
        double itemDos = sc.nextDouble();

        double total = itemUno + itemDos;
        double iva = 0.19;
        double totalIva = ((total * iva)+total);
        
        System.out.println( productoFactura + "total bruto: " + total + "\ncon un impuesto de: " + iva + "\ny monto después de impuesto es de: " + totalIva);

    }
}
