/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labprogramacion2;

import java.util.Scanner;

/**
 *
 * @author Maria Gabriela
 */
public class LabProgramacion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        String cadena;

        System.out.println(".....MENU.....\n"
                + "1.Cadena\n"
                + "2.Notas\n"
                + "3.Clases\n"
                + "4.Salir\n");
        System.out.println("Favor ingrese que actividad que quiere realizar");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            System.out.println("Has elegido CADENA");

            System.out.println("Ingrese la cadena de texto que desea analizar");
            cadena = entrada.next();
            int contador = 0;
            int veces = 0, vecesMayor = 0;
            char masBuscado = ' ';
            while (contador < cadena.length()) {
                char letraActual = cadena.charAt(contador);
                veces = 0;
                int indexletra = 0;
                while (indexletra < cadena.length()) {
                    if (cadena.charAt(indexletra) == letraActual) {
                        veces++;
                    }
                    indexletra++;
                }
                if (veces > vecesMayor) {
                    vecesMayor = veces;
                    masBuscado = letraActual;
                }
                contador++;
            }
            System.out.println("La letra más repetida de la cadena es: '" + masBuscado + "' y es repetida por " + vecesMayor + " veces.");
        }
        if (opcion == 2) {
            System.out.println("Has elegido NOTAS");
            System.out.println("Ingresar cantidad de notas:");
            int cantnotas = entrada.nextInt();
            int contador = 1,sumatotal=0;
            int notamax = Integer.MIN_VALUE; 
            int notamin = Integer.MAX_VALUE; 


            while (contador <= cantnotas) {
                int nota = -1; 

                while (nota < 0 || nota > 100) {
                    System.out.println("Ingresar nota " + contador + " que no sea negativo ni mayor a 100:");
                    nota = entrada.nextInt();

                    if (nota < 0 || nota > 100) {
                        System.out.println("La nota ingresada no es valida ya que debe estar entre 0 y 100.");
                    }
                }

                sumatotal += nota;
                
            if (nota > notamax) {
                notamax = nota;
            }
            if (nota < notamin) {
                notamin = nota;
            }
                contador++;
            }

            double promediof = (double) sumatotal / cantnotas;
            System.out.println("El promedio de las notas es: " + promediof);

        }
        if(opcion==3){
            String fecha;
            System.out.println("Has elegido CLASES");
            System.out.println("Ingrese la fecha actual en el formato 'día de la semana, Dia/Mes':");
                    }
        }
    }

