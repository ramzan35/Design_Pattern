package factorypattern;

import java.util.Scanner;

public class EmptyShipTesting {

    public static void main(String[] args) {

        /*EnemyShip Ship = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("What type of ship? (U / R)");
        String name = sc.nextLine();

        if(name.equals("U")){
            Ship = new UFDEEnemyShip();
        }else if(name.equals("R")){
            Ship = new RocketEnemyShip();
        }*/

        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip theEnemy = null;
        System.out.println("What type of ship? (U / R / B)");
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextLine()) {
            String name = sc.nextLine();
            theEnemy = shipFactory.makeEnemySip(name);
        }

        if (theEnemy != null)
            doStuffEnemy(theEnemy);
        else
            System.out.println("Enter U / R / B next time.");

    }

    public static void doStuffEnemy(EnemyShip anEnemyShip) {
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }

}

