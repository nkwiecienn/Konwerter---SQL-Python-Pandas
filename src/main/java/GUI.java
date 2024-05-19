
import Converter.CustomErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class GUI implements ActionListener {
    private final JTextArea textField = new JTextArea(10, 30);
    private final JTextArea textArea = new JTextArea(10, 30);

    private final JFrame frame = new JFrame();

    public GUI() {
        JButton button = new JButton("Convert");
        button.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));
        inputPanel.add(new JLabel("SQL Query:"));
        textField.setLineWrap(true);
        textField.setWrapStyleWord(true);
        JScrollPane inputScrollPane = new JScrollPane(textField);
        inputScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        inputScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        inputPanel.add(inputScrollPane);
        panel.add(inputPanel, BorderLayout.WEST);

        JPanel outputPanel = new JPanel();
        outputPanel.setLayout(new BoxLayout(outputPanel, BoxLayout.Y_AXIS));
        outputPanel.add(new JLabel("PythonPandas Code:"));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        JScrollPane outputScrollPane = new JScrollPane(textArea);
        outputScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        outputScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        textArea.setEditable(false);
        outputPanel.add(outputScrollPane);
        panel.add(outputPanel, BorderLayout.EAST);

        panel.add(button, BorderLayout.SOUTH);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("SQL to PythonPandas");
        frame.setPreferredSize(new Dimension(700, 400));
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public static String compile(String sqlQuery) throws IOException {
        ANTLRInputStream input = new ANTLRInputStream(sqlQuery);

        SQLToPandasLexer lexer = new SQLToPandasLexer(input);
        CustomErrorListener errorListener = new CustomErrorListener();
        lexer.removeErrorListeners();
        lexer.addErrorListener(errorListener);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        SQLToPandasParser parser = new SQLToPandasParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);

        ParseTree tree = parser.query();

        if (errorListener.hasErrors()) {
            return errorListener.getErrors();
        }

        return new AntlrParser().visit(tree);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GUI::new);
    }

    public void actionPerformed(ActionEvent e) {
        String sqlQuery = textField.getText();
        try {
            textArea.setText(compile(sqlQuery));
        } catch (IOException ioException) {
            textArea.setText("Error processing SQL query: " + ioException.getMessage());
        }
    }
}
