import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.function.Consumer;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GameWindow {
    private final JTextArea display;
    private final JTextField answerField;
    private final JLabel inputLabel;
    private final JDialog dialog;
    private Consumer<String> submitHandler;
    private Runnable closeHandler;

    public GameWindow() {
        display = new JTextArea(20, 55);
        display.setEditable(false);
        display.setLineWrap(true);
        display.setWrapStyleWord(true);
        display.setFont(new java.awt.Font(java.awt.Font.MONOSPACED, java.awt.Font.PLAIN, 14));

        answerField = new JTextField(40);
        inputLabel = new JLabel("Escribe tu respuesta y presiona Enter:");

        JPanel inputPanel = new JPanel(new BorderLayout(8, 4));
        inputPanel.add(inputLabel, BorderLayout.NORTH);
        inputPanel.add(answerField, BorderLayout.CENTER);

        JPanel mainPanel = new JPanel(new BorderLayout(8, 8));
        mainPanel.add(new JScrollPane(display), BorderLayout.CENTER);
        mainPanel.add(inputPanel, BorderLayout.SOUTH);
        mainPanel.setPreferredSize(new Dimension(650, 470));

        JOptionPane optionPane = new JOptionPane(mainPanel, JOptionPane.PLAIN_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);
        dialog = optionPane.createDialog("100 Argentinos Dicen");
        dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent event) {
                if (closeHandler != null) closeHandler.run();
            }
        });
        dialog.setResizable(true);

        answerField.addActionListener(event -> {
            String answer = answerField.getText();
            answerField.setText("");
            if (submitHandler != null) submitHandler.accept(answer);
        });
    }

    public void setSubmitHandler(Consumer<String> submitHandler) {
        this.submitHandler = submitHandler;
    }

    public void showWindow() {
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }

    public void updateDisplay(String text, String inputText) {
        display.setText(text);
        display.setCaretPosition(0);
        inputLabel.setText(inputText);
        answerField.setEnabled(true);
        answerField.requestFocusInWindow();
    }
    
    public void setCloseHandler(Runnable closeHandler) {
    this.closeHandler = closeHandler;
    }

    public void closeWindow() {
        dialog.dispose();
    }
}