package shop;

/**
 * Created by MRamzan on 7/7/2017.
 */
public interface Visitor {

    public double visit(Liquor liquorItem);

    public double visit(Tobacco tobaccoItem);

    public double visit(Necessity necessityItem);
}
