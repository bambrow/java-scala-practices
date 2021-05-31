package antlr.calculator;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class CalculatorDriver {
    public static void main(String[] args) {
        String expr = "1.5*(2.0+3.2)";
        CalculatorLexer lexer = new CalculatorLexer(new ANTLRInputStream(expr));
        CalculatorParser parser = new CalculatorParser(new CommonTokenStream(lexer));
        CalculatorVisitor<Object> visitor = new CalculatorVisitorImpl();
        System.out.println(visitor.visit(parser.expr()));
    }
}
