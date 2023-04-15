
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class RubyParserDemo {
    public static void main(String[] args) {

        String input = "puts 'Hello, World!';";
        RubyLexer lexer = new RubyLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RubyParser parser = new RubyParser(tokens);

        ParseTree tree = parser.compilation_unit();
        System.out.println(tree.toStringTree(parser));


//        String rubyStmt = "puts 'Hello, World!'";
//        ANTLRInputStream input = new ANTLRInputStream(rubyStmt);
//        RubyLexer lexer = new RubyLexer(input);
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//        RubyParser parser = new RubyParser(tokens);
//        ParseTree tree = parser.compstmt();
//        System.out.println(tree.toStringTree(parser));
    }
}
