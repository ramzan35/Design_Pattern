package main;

/**
 * Created by MRamzan on 7/7/2017.
 */

class Necessity implements Visitable {

    private double price;

    Necessity(double item){
        price = item;
    }

    public double getPrice(){
        return price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}