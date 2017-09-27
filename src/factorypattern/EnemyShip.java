package factorypattern;

public abstract class EnemyShip {

    private String name;
    private double antDamage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAntDamage() {
        return antDamage;
    }

    public void setAntDamage(double antDamage) {
        this.antDamage = antDamage;
    }

    public void followHeroShip() {
        System.out.println(getName() + " is folllowing the hero");
    }

    public void displayEnemyShip() {
        System.out.println(getName() + " is on the screen");
    }

    public void enemyShipShoots() {
        System.out.println(getName() + " attacks and does " + getAntDamage());
    }
}
