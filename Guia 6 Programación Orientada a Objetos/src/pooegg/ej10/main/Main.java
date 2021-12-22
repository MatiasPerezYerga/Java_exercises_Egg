package pooegg.ej10.main;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double arregloA[] = new double[50];
        double arregloB[] = new double[20];

        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = Math.random();
        }
        imprimirArreglo(arregloA);
        Arrays.sort(arregloA);
        imprimirArreglo(arregloA);
        for (int i = 0; i < 10; i++) {  ///METODO MANUAL DE LLENADO PARA POSICIONES DE RANGO PARA ARREGLOS
            arregloB[i] = arregloA[i];
        }
        System.arraycopy(arregloB, 0, arregloA, 0, 10); ///METODO AUTOMATICO DE LLENADO PARA POSICIONES EN RANGO PARA ARREGLOS

//src_array => Matriz de origen desde donde se copiarán los contenidos.
//src_Pos => La posición en la matriz de origen desde donde comenzará la copia.
//dest_array => Matriz de destino en la que se copiarán los elementos.
//dest_Pos => Posición inicial en la matriz de destino de los elementos a copiar.
//largo => Longitud de la matriz a copiar.
        Arrays.fill(arregloB, 10, arregloB.length, 0.5);

        imprimirArreglo(arregloA);
        imprimirArreglo(arregloB);

    }

    public static void imprimirArreglo(double arreglo[]) {
        System.out.println("**ARREGLO**");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");

        }
    }

}
