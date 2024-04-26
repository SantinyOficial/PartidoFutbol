package com.partido;
import java.util.Scanner;

public class AssembleYourPC {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double initialMoney;
        double minimunMoney = 1000000;
        System.out.println("\nAlgoritmo para armar una PC Gamer\n");

        System.out.println("Dato de entrada");
        do {
            System.out.print("\nIngrese su presupuesto: $");
            initialMoney = s.nextDouble();
            if (initialMoney < minimunMoney) {
                System.out.print("\nDinero insuficiente para armar tu PC Gamer\nIngrese un valor mayor a $1.000.000");
            }
        } while (initialMoney < minimunMoney);
        double costoTotal = 0;

        boolean ValidationOne = false;
        System.out.println("\nProcesos");
        System.out.println("\nSeleccione los componentes requeridos");
        System.out.println("Procesadores disponibles:\n" +
                "1. Intel Core i5: $1.050.000\n" +
                "2. Intel Core i7: $1.200.000\n" +
                "3. Intel Core i3: $900.000\n" +
                "4. Intel Core i9: $1.300.000\n"
        );
        do {

            System.out.print("Seleccione el procesador deseado:");
            int option = s.nextInt();
            switch (option){
                case 1:
                    costoTotal = 1050000;
                    ValidationOne = true;
                    break;
                case 2:
                    costoTotal = 1200000;
                    ValidationOne = true;
                    break;
                case 3:
                    costoTotal = 900000;
                    ValidationOne = true;
                    break;
                case 4:
                    costoTotal = 1300000;
                    ValidationOne = true;
                    break;
                default:
                    System.out.println("Numero no valido, ingrese nuevamente");
            }
        }while(!ValidationOne);

        boolean validationTwo = false;
        System.out.println("\nMemorias RAM Disponibles:");
        System.out.println("1. RAM Samsung Ddr3 8gb: $120.000\n" +
                "2. RAM toshiba Ddr3 16gb: $210.000\n" +
                "3. RAM Gamer Crucial Ddr4 32gb: $300.000\n" +
                "4. RAM Lenovo Ddr3 4gb: 80.000\n");
        do{
            System.out.print("Seleccione la RAM deseado:");
            int optionTwo = s.nextInt();
            switch (optionTwo){
                case 1:
                    costoTotal = costoTotal + 120000;
                    validationTwo = true;
                    break;
                case 2:
                    costoTotal = costoTotal + 210000;
                    validationTwo = true;
                    break;
                case 3:
                    costoTotal = costoTotal + 300000;
                    validationTwo = true;
                    break;
                case 4:
                    costoTotal = costoTotal + 80000;
                    validationTwo = true;
                    break;
                default:
                    System.out.println("Numero no valido, ingrese nuevamente");
            }
        }while(!validationTwo);


        boolean validationthree = false;
        System.out.println("\nDiscos de almacenamiento Disponibles: ");
        System.out.println("1. HDD Adata 500Gb: $90.000\n" +
                "2. HDD Toshiba 1Tb: $150.000\n" +
                "3. SSD Crucial 500Gb: $130.000\n" +
                "4. SSD Kingdton 1Tb: $240.000\n ");
        do{
            System.out.print("Selecciona el almacenamiento deseado:");
            int option3 = s.nextInt();

            switch (option3) {
                case 1:
                    costoTotal = costoTotal + 90000;
                    validationthree = true;
                    break;
                case 2:
                    costoTotal = costoTotal + 150000;
                    validationthree = true;
                    break;
                case 3:
                    costoTotal = costoTotal + 130000;
                    validationthree = true;
                    break;
                case 4:
                    costoTotal = costoTotal + 240000;
                    validationthree = true;
                    break;
                default:
                    System.out.println("Numero no valido, ingrese nuevamente");
            }
        }while (!validationthree);


        System.out.println("\nDatos de Salida");
        System.out.println("\nCosto total de los componentes seleccionados: $" + costoTotal);

        if (costoTotal <= initialMoney) {
            System.out.println("Compra realizada con éxito. ¡Disfruta de tu nueva PC!");
        } else {
            System.out.println("No tienes suficiente capital para realizar la compra. Vuelve cuando tengas más fondos.");
        }

    }
}
