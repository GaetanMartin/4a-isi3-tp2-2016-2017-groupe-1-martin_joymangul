package visitable;

import visitor.Visitor;

/**
 * Created by p1509413 on 22/03/2017.
 */
public interface Visitable {

    void accept(Visitor visitor);

    int calculate(Visitor visitor);
}
