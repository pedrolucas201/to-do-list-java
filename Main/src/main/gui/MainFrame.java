package main.gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private TarefaPanel tarefaPanel;

    public MainFrame() {
        setTitle("Gerenciador de Tarefas");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Inicializar os painéis
        tarefaPanel = new TarefaPanel();

        // Adicionar os painéis ao JFrame
        setLayout(new BorderLayout());
        add(tarefaPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame frame = new MainFrame();
            frame.setVisible(true);
        });
    }
}
