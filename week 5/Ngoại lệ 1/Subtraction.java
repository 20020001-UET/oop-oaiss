public class Subtraction extends BinaryExpression {
    public Subtraction(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double evaluate() {
        double result = left.evaluate() - right.evaluate();
        return result;
    }

    @Override
    public String toString() {
        String output = "(" + left.toString() + " - " + right.toString() + ")";
        return output;
    }
}
