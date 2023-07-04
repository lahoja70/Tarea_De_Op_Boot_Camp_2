/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edensilvestre
 */
public class Ejercicio_Tema_4 {
    public static void main(String[] args) {
        int numeroIf = 5;
        if (numeroIf > 0) {
            System.out.println("El número es positivo.");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es igual a 0.");
        }
         int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("Valor de numeroWhile: " + numeroWhile);
        }
         int numeroDoWhile = 0;
        do {
            numeroDoWhile++;
            System.out.println("Valor de numeroDoWhile: " + numeroDoWhile);
        } while (numeroDoWhile < 3);
         for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("Valor de numeroFor: " + numeroFor);
        }
         String estacion = "verano";
        switch (estacion) {
            case "primavera":
                System.out.println("Estamos en primavera.");
                break;
            case "verano":
                System.out.println("Estamos en verano.");
                break;
            case "otoño":
                System.out.println("Estamos en otoño.");
                break;
            case "invierno":
                System.out.println("Estamos en invierno.");
                break;
            default:
                System.out.println("El valor de estacion no corresponde a una estación.");
        }
    }
}