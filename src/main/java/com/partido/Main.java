package com.partido;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("(INICIO)\n" + "Algoritmo Partido de Futbol");
        System.out.print("Ingrese el nombre del primer equipo: ");
        String teamNameA = s.next();

        System.out.print("Ingrese el nombre del segunfo equipo: ");
        String teamNameB = s.next();

        System.out.print("Ingrese el número de goles del equipo " + teamNameA + " :");
        int goalsA = s.nextInt();

        System.out.print("Ingrese el número de goles del equipo " + teamNameB + " :");
        int goalsB = s.nextInt();

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
