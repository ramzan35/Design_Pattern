package shop;


/**
 * Created by MRamzan on 7/7/2017.
 */
class Liquor implements Visitable {

    private double price;

    Liquor(double item){
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
