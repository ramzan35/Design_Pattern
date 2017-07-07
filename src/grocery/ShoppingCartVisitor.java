package grocery;

/**
 * Created by MRamzan on 7/7/2017.
 */
public interface ShoppingCartVisitor {

    int visit(Book book);
    int visit(Fruit fruit);

}
