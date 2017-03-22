import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by p1509413 on 22/03/2017.
 */
public interface Visitor {

    default void visit(Visitable visitable) {
        throw new NotImplementedException();
    }

    void visit(Negation negation);

    void visit(Multiplication multiplication);

    void visit(Addition addition);

    void visit(Constante constante);

}
