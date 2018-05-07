package fundamentals;

/**
 * Dijkstra’s Two-Stack Algorithm for Expression Evaluation
 *
 */
public class Evaluate {

    /**
     * Evaluate the expression
     * @param expression expression separated by a white space
     * @return the value evaluated by the expression
     */
    public static Double evaluate(String expression) {

        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();

        String[] str = expression.split("\\s+");

        for (String s : str) {

                 if (s.equals("("))               ;
            else if (s.equals("+"))    ops.push(s);
            else if (s.equals("-"))    ops.push(s);
            else if (s.equals("*"))    ops.push(s);
            else if (s.equals("/"))    ops.push(s);
            else if (s.equals("sqrt")) ops.push(s);
            else if (s.equals(")")) {

                String op = ops.pop();
                double v = vals.pop();

                     if (op.equals("+"))    v = vals.pop() + v;
                else if (op.equals("-"))    v = vals.pop() - v;
                else if (op.equals("*"))    v = vals.pop() * v;
                else if (op.equals("/"))    v = vals.pop() / v;
                else if (op.equals("sqrt")) v = Math.sqrt(v);

                vals.push(v);

            } else vals.push(Double.parseDouble(s));
        }

        return vals.pop();
    }
}
