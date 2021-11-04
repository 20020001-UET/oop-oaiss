public class Multiplication extends BinaryExpression {
    public Multiplication(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double evaluate() {
        double result = left.evaluate() * right.evaluate();
        return result;
    }

    @Override
    public String toString() {
        String output = "(" + left.toString() + " * " + right.toString() + ")";
        return output;
    }
}
