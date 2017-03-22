/**
 * Created by p1509413 on 22/03/2017.
 */
public interface Visitable {

    default void accept(Visitor visitor) {
        visitor.visit(this);
    };
}
