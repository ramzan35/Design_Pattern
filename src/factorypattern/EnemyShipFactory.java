package factorypattern;

public class EnemyShipFactory {

    public EnemyShip makeEnemySip(String newShipType) {
        EnemyShip enemyShip = null;

        if (newShipType.equals("R")) {
            enemyShip = new RocketEnemyShip();
        }
        else if (newShipType.equals("U")) {
            enemyShip = new UFDEEnemyShip();
        }
        else if (newShipType.equals("B")) {
            enemyShip = new BigUFDEEnemyShip();
        }

        return enemyShip;
    }

}
