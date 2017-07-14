package visitorpattern.shop;

import java.text.DecimalFormat;

/**
 * Created by MRamzan on 7/7/2017.
 */
public class TaxVisitor implements Visitor {

    DecimalFormat df= new DecimalFormat("#.##");

    @Override
    public double visit(Liquor liquorItem) {
        System.out.println("Liquor item: Price with Tax");
        return Double.parseDouble(df.format(liquorItem.getPrice() * .18))+liquorItem.getPrice();
    }

    @Override
    public double visit(Tobacco tobaccoItem) {
        System.out.println("Tobacco item: Price with Tax");
        return Double.parseDouble(df.format(tobaccoItem.getPrice() * .18))+tobaccoItem.getPrice();
    }

    @Override
    public double visit(Necessity necessityItem) {
        System.out.println("Necessity item: Price with Tax");
        return Double.parseDouble(df.format(necessityItem.getPrice()));
    }
}
