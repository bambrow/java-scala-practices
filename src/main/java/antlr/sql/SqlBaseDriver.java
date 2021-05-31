package antlr.sql;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class SqlBaseDriver {
    public static void main(String[] args) {
        String query = "SELECT * FROM huadi LIMIT 5;";
        SqlBaseLexer lexer = new SqlBaseLexer(new ANTLRInputStream(query));
        SqlBaseParser parser = new SqlBaseParser(new CommonTokenStream(lexer));
        SqlBaseVisitorImpl visitor = new SqlBaseVisitorImpl();
        String res = visitor.visitSingleStatement(parser.singleStatement());
        System.out.println("result = " + res);
    }
}
