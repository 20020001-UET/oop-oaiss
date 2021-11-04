public class Division extends BinaryExpression {
    public Division(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double evaluate() {
        double result = 0;
        if (Math.abs(right.evaluate()) <= 0.000001f) {
            throw new ArithmeticException("Lỗi chia cho 0");
        } else {
            result = left.evaluate() / right.evaluate();
        }
        return result;
    }

    @Override
    public String toString() {
        String output = "(" + left.toString() + " / " + right.toString() + ")";
        return output;
    }
}
