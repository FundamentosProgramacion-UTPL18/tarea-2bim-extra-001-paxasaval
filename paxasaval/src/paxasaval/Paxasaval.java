/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paxasaval;

/**
 *
 * @author User
 */
public class Paxasaval {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //declaracioon de variales de entrada(listas)
        String[] meses = {"Agosto", "Octubre", "Diciembre"};
        String[] sucursales = {"sucursal 1", "sucursal 2", "sucursal 3", "sucursal 4"};
        double[] ventas_mes_1 = {4500.2, 5500.2, 6500.2, 2500.1};
        double[] ventas_mes_2 = {1500.2, 2500.2, 3500.2, 1500.1};
        double[] ventas_mes_3 = {2300.2, 1200.2, 4700.2, 3200.1};

        //declaracion de variables de salida
        //(listas)
        double[] venta_total_sucursal = new double[4];
        double[] venta_promedio_sucursal = new double[4];
        String cadena = String.format("%s\n\n%-10s", "Reporte", "");
        //Acumulador 
        double total = 0;

        //Imprimir titulos o rotulos
        for (int i = 0; i < meses.length; i++) {
            cadena = String.format("%s\t%-10s", cadena, meses[i]);
        }
        cadena = String.format("%s\t%-10s\t%-10s\n", cadena, "Total", "Promedio");
        System.out.printf("%s", cadena);

        //bucle for que recorre las cadenas de entrada para calcular, guardar y presentar los datos de salida
        for (int j = 0; j < sucursales.length; j++) {

            //Calcula y guarda los datos de salida
            venta_total_sucursal[j] = ventas_mes_1[j] + ventas_mes_2[j] + ventas_mes_3[j];
            venta_promedio_sucursal[j] = venta_total_sucursal[j] / meses.length;

            //Presenta los datos de salida
            System.out.printf("%-10s\t%-12.2f\t%-12.2f\t%-12.2f\t%-10.2f\t%-10.2f\n", sucursales[j], ventas_mes_1[j], ventas_mes_2[j], ventas_mes_3[j], venta_total_sucursal[j], venta_promedio_sucursal[j]);
        }
        //Bucle for para calcular las ventaas totales
        for (int k = 0; k < venta_total_sucursal.length; k++) {
            total = total + venta_total_sucursal[k];
        }
        //Presentacion de las ventas totales    
        System.out.printf("\n\n%s%.2f\n", "Total de ventas de total las sucursales: ", total);

    }

}
