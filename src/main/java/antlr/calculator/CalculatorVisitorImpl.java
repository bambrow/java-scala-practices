package antlr.calculator;

public class CalculatorVisitorImpl extends CalculatorBaseVisitor<Object> {
    @Override
    public Object visitDouble(CalculatorParser.DoubleContext ctx) {
        return Double.parseDouble(ctx.getText());
    }

    @Override
    public Object visitAddOrSub(CalculatorParser.AddOrSubContext ctx) {
        Object obj0 = ctx.expr(0).accept(this);
        Object obj1 = ctx.expr(1).accept(this);
        if ("+".equals(ctx.getChild(1).getText())) {
            return (Double)obj0 + (Double)obj1;
        } else if ("-".equals(ctx.getChild(1).getText())) {
            return (Double)obj0 - (Double)obj1;
        }
        return .0;
    }

    @Override
    public Object visitMultOrDiv(CalculatorParser.MultOrDivContext ctx) {
        Object obj0 = ctx.expr(0).accept(this);
        Object obj1 = ctx.expr(1).accept(this);
        if ("*".equals(ctx.getChild(1).getText())) {
            return (Double)obj0 * (Double)obj1;
        } else if ("/".equals(ctx.getChild(1).getText())) {
            return (Double)obj0 / (Double)obj1;
        }
        return .0;
    }

    @Override
    public Object visitPower(CalculatorParser.PowerContext ctx) {
        Object obj0 = ctx.expr(0).accept(this);
        Object obj1 = ctx.expr(1).accept(this);
        return Math.pow((Double)obj0, (Double)obj1);
    }

    @Override
    public Object visitParenExpr(CalculatorParser.ParenExprContext ctx) {
        return ctx.expr().accept(this);
    }
}
