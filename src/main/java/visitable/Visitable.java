package visitable;

import visitor.browser.Visitor;
import visitor.calculator.Calculator;

/**
 * Created by p1509413 on 22/03/2017.
 */
public interface Visitable {

    void accept(Visitor visitor);

    int accept(Calculator visitor);
}
