import Elemento.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Batalla {
    public static void main(String[] args) {

        int qty=3;
        Scanner sc=new Scanner(System.in);
        List<Humano> humans=new ArrayList<Humano>();
        List <Demonios> demons = new ArrayList<>();
        List <Angeles> angels = new ArrayList<>();
        Random rand=new Random();
        double intel =0, mal=0, bondad=0, soul=0,fe=0;
        do{
            System.out.println("Ingrese la Cantidad de humanos a luchar [MAX 5]: ");
            qty=sc.nextInt();
            if(qty>5 || qty<=0){
                System.out.println("valor no valido!!!");
            }
            else{
                for(int i=0;i<qty;i++){
                    intel =rand.nextDouble(0,200);
                    fe =rand.nextDouble(0,100);
                    mal =rand.nextDouble(0,100);
                    bondad =rand.nextDouble(0,100);
                    soul =rand.nextDouble(0,200);

                    Humano human = new Humano(fe,mal,bondad,soul,intel);
                    humans.add(human);
                }
            }


        }while(qty>5 || qty<=0);

        qty=3;
        do{
            System.out.println("Ingrese la Cantidad de Angeles a luchar [MAX 5]: ");
            qty=sc.nextInt();
            if(qty>5 || qty<=0){
                System.out.println("valor no valido!!!");
            }else{
                for(int i=0;i<qty;i++){
                    fe =rand.nextDouble(0,200);
                    mal =rand.nextDouble(0,200);
                    bondad =rand.nextDouble(0,10);

                    Angeles angel = new Angeles(fe,mal,bondad);
                    angels.add(angel);
                }
            }
        }while(qty>5 || qty<=0);



        qty=3;
        do{
            System.out.println("Ingrese la Cantidad de Demonios a luchar [MAX 5]: ");
            qty=sc.nextInt();
            if(qty>5 || qty<=0){
                System.out.println("valor no valido!!!");
            }else{
                for(int i=0;i<qty;i++){
                    fe =rand.nextDouble(0,200);
                    mal =rand.nextDouble(0,200);
                    bondad =rand.nextDouble(0,10);

                   Demonios demon = new Demonios(fe,mal,bondad);
                   demons.add(demon);
                }
            }
        }while(qty>5 || qty<=0);



        

    }
}