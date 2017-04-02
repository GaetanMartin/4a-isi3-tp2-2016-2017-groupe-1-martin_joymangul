package visitable;

import visitor.VisitorI;

/**
 * Created by p1509413 on 22/03/2017.
 */
public interface Visitable {

    Value accept(VisitorI visitor);
}
