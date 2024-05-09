import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String fileName = "test/text0.txt";
        File file = new File(fileName);
        FileInputStream fis = null;

        try {
            // Open the input file stream
            fis = new FileInputStream(file);

            // Compile
            System.out.println(compile(fis));

            // Close the input file
            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String compile(FileInputStream fis) throws IOException {
        // Create a CharStream that reads from standard input
        ANTLRInputStream input = new ANTLRInputStream(fis);

        // Create a lexer that feeds off of input CharStream
        SQLToPandasLexer lexer = new SQLToPandasLexer(input);

        // Create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create a parser that feeds off the tokens buffer
        SQLToPandasParser parser = new SQLToPandasParser(tokens);

        // Begin parsing at rule query
        ParseTree tree = parser.query();

        return new AntlrParser().visit(tree);
    }
}
