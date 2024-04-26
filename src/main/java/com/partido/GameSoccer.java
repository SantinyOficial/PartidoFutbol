package com.partido;

import java.util.Scanner;

public class GameSoccer {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Algoritmo Partido de Futbol");
        System.out.println("\nDatos de entrada\n");
        System.out.print("Ingrese el nombre del primer equipo: ");
        String teamNameA = s.nextLine();

        System.out.print("Ingrese el nombre del segundo equipo: ");
        String teamNameB = s.nextLine();

        System.out.println("\nProcesos\n");
        System.out.print("Ingrese el número de goles del equipo " + teamNameA + " :");
        int goalsA = s.nextInt();

        System.out.print("Ingrese el número de goles del equipo " + teamNameB + " :");
        int goalsB = s.nextInt();

        System.out.println("\nDatos de salida\n");
        String winner;
        if (goalsA > goalsB) {
            winner = teamNameA;
        }
        if (goalsA < goalsB) {
            winner = teamNameB;
        } else {
            winner = "Empate";
        }

        System.out.println("Resultado del partido\n" +
                teamNameA + " " + goalsA +
                "\n" + teamNameB + " " + goalsB +
                "\nGanador : " + winner +
                "\nFin del juego \n(FIN)");
    }
}

// Datos de entrada:
//Nombre del primer equipo.
//Nombre del segundo equipo.
//Número de goles del primer equipo.
//Número de goles del segundo equipo.

//Procesos:
//Solicitar al usuario que ingrese el nombre del primer equipo.
//Solicitar al usuario que ingrese el nombre del segundo equipo.
//Solicitar al usuario que ingrese el número de goles del primer equipo.
//Solicitar al usuario que ingrese el número de goles del segundo equipo.
//Determinar quién ganó el partido comparando el número de goles de ambos equipos.
//Mostrar el resultado del partido y quién fue el ganador.

//Salida:
//Mostrar el nombre de ambos equipos.
//Mostrar el número de goles de cada equipo.
//Mostrar quién ganó el partido (o si fue un empate).
