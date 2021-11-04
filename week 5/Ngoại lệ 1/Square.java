public class Square extends Expression {
    private Expression expression;

    public Square(Expression expression) {
        this.expression = expression;
    }

    @Override
    public double evaluate() {
        double result = expression.evaluate();
        return result * result;
    }

    @Override
    public String toString() {
        String output = "(" + expression.toString() + ") ^ 2";
        return output;
    }
}
