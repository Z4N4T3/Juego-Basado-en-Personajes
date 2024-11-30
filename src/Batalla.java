import Elemento.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Batalla {
    public static void main(String[] args) {

        int qty = 3, numHum, numDem, numAng;
        Scanner sc = new Scanner(System.in);
        List<Humano> humans = new ArrayList<Humano>();
        List<Demonios> demons = new ArrayList<>();
        List<Angeles> angels = new ArrayList<>();
        Random rand = new Random();
        String nombre;
        double intel = 0, mal = 0, bondad = 0, soul = 0, fe = 0;
        do {
            System.out.println("Ingrese la Cantidad de humanos a luchar [MAX 5]: ");
            qty = sc.nextInt();
            numHum = qty;
            if (qty > 5 || qty <= 0) {
                System.out.println("valor no valido!!!");
            } else {
                for (int i = 0; i < qty; i++) {
                    System.out.print("Nombre del Humano" + "[" + (i + 1) + "]: ");
                    nombre = sc.next();
                    intel = rand.nextDouble(0, 200);
                    fe = rand.nextDouble(0, 100);
                    mal = rand.nextDouble(0, 100);
                    bondad = rand.nextDouble(0, 100);
                    soul = rand.nextDouble(0, 200);

                    Humano human = new Humano(fe, mal, bondad, soul, intel, nombre);
                    humans.add(human);
                }
            }

            for (Humano human : humans) {
                human.getStats();
            }

        } while (qty > 5 || qty <= 0);

        qty = 3;
        do {
            System.out.println("Ingrese la Cantidad de Angeles a luchar [MAX 5]: ");
            qty = sc.nextInt();
            numAng = qty;
            if (qty > 5 || qty <= 0) {
                System.out.println("valor no valido!!!");
            } else {
                for (int i = 0; i < qty; i++) {
                    fe = rand.nextDouble(0, 200);
                    mal = rand.nextDouble(0, 200);
                    bondad = rand.nextDouble(0, 10);

                    Angeles angel = new Angeles(fe, mal, bondad);
                    angels.add(angel);
                }
            }
        } while (qty > 5 || qty <= 0);

        for (Angeles angel : angels) {
            angel.getStats();
        }

        qty = 3;
        do {
            System.out.println("Ingrese la Cantidad de Demonios a luchar [MAX 5]: ");
            qty = sc.nextInt();
            numDem = qty;
            if (qty > 5 || qty <= 0) {
                System.out.println("valor no valido!!!");
            } else {
                for (int i = 0; i < qty; i++) {
                    fe = rand.nextDouble(0, 200);
                    mal = rand.nextDouble(0, 200);
                    bondad = rand.nextDouble(0, 10);

                    Demonios demon = new Demonios(fe, mal, bondad);
                    demons.add(demon);
                }
            }
        } while (qty > 5 || qty <= 0);
        for (Demonios dem : demons) {
            dem.getStats();
        }

        int numTurnos =3;
        do{
            System.out.println("Ingresa el numero de turnos: ");
            numTurnos= sc.nextInt();
            if (numTurnos >5 || numTurnos<=0) {
                System.out.println("valor no valido!!!");
            }

        }while(numTurnos >5 || numTurnos<=0);


        for (int turno = 0; turno < numTurnos; turno++) {
            System.out.println("\n=============================");
            System.out.println("Turno " + (turno + 1) + ":");
            System.out.println("=============================");

            for (Humano humano : humans) {

                Angeles angel = angels.get(rand.nextInt(angels.size()));
                Demonios demonio = demons.get(rand.nextInt(demons.size()));

                System.out.println("\nHumano en conflicto:");
                humano.getStats();

                System.out.println("\nSe enfrenta al angel:");
                angel.getStats();

                System.out.println("\nSe enfrenta  al demonio:");
                demonio.getStats();


                humano.conflictoMoral(angel, demonio);


                System.out.println("\nResultado tras el conflicto moral:");
                humano.getStats();
            }

        }

        System.out.println("\n=============================");


        DiosCristiano diosito = new DiosCristiano(

                rand.nextDouble() * 200,
                rand.nextDouble() * 100,
                rand.nextDouble() * 100,
                numAng,
                numDem
                );
        for (Humano humano : humans) {
            System.out.println("\nJUICIO FINAL");
            humano.getStats();

            if (diosito.esBuenHombre(humano)) {
                System.out.println("diosito dice que el humano es un buen Hombre ");
            } else {
                System.out.println("diosito dice que el humano no es considerado un buen hombre");
            }
        }




    }
}