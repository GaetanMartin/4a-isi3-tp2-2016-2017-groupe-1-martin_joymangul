package visitable;

/**
 * Created by Gaetan on 02/04/2017.
 */
public class Value {

    private int value;

    public Value(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Value add(int v) {
        this.value += v;
        return this;
    }

    public Value add(Value v) {
        this.add(v.getValue());
        return this;
    }

    public Value max(Value bis) {
        if (bis.getValue() > value) {
            return bis;
        } else {
            return this;
        }
    }

    public Value neg() {
        this.value *= -1;
        return this;
    }

    public Value multiply(Value value) {
        this.value*=value.getValue();
        return this;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
