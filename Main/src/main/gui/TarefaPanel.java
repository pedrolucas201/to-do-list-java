package main.gui;

import entidades.Tarefa;
import interfaces.servicos.ITarefaServico;
import repositorios.TarefaRepositorio;
import servicos.TarefaServico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class TarefaPanel extends JPanel {
    private ITarefaServico tarefaServico;
    private DefaultListModel<String> listModel;
    private JList<String> tarefaList;
    private JTextField tituloField;
    private JTextArea descricaoArea;
    private JButton addButton;
    private JButton updateButton;
    private JButton deleteButton;

    public TarefaPanel() {
        tarefaServico = new TarefaServico(new TarefaRepositorio());

        setLayout(new BorderLayout());

        listModel = new DefaultListModel<>();
        tarefaList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(tarefaList);

        JPanel formPanel = new JPanel(new GridLayout(4, 1));
        tituloField = new JTextField();
        descricaoArea = new JTextArea();
        addButton = new JButton("Adicionar");
        updateButton = new JButton("Atualizar");
        deleteButton = new JButton("Deletar");

        formPanel.add(new JLabel("Título:"));
        formPanel.add(tituloField);
        formPanel.add(new JLabel("Descrição:"));
        formPanel.add(new JScrollPane(descricaoArea));

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);

        add(scrollPane, BorderLayout.CENTER);
        add(formPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.SOUTH);

        carregarTarefas();

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String titulo = tituloField.getText();
                String descricao = descricaoArea.getText();
                if (!titulo.isEmpty() && !descricao.isEmpty()) {
                    tarefaServico.criarTarefa(new Tarefa(0, titulo, descricao));
                    carregarTarefas();
                    limparCampos();
                }
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = tarefaList.getSelectedIndex();
                if (selectedIndex != -1) {
                    String titulo = tituloField.getText();
                    String descricao = descricaoArea.getText();
                    Tarefa tarefa = tarefaServico.listarTodasTarefas().get(selectedIndex);
                    tarefa.setTitulo(titulo);
                    tarefa.setDescricao(descricao);
                    tarefaServico.atualizarTarefa(tarefa);
                    carregarTarefas();
                    limparCampos();
                }
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = tarefaList.getSelectedIndex();
                if (selectedIndex != -1) {
                    Tarefa tarefa = tarefaServico.listarTodasTarefas().get(selectedIndex);
                    tarefaServico.deletarTarefa(tarefa.getId());
                    carregarTarefas();
                    limparCampos();
                }
            }
        });

        tarefaList.addListSelectionListener(e -> {
            int selectedIndex = tarefaList.getSelectedIndex();
            if (selectedIndex != -1) {
                Tarefa tarefa = tarefaServico.listarTodasTarefas().get(selectedIndex);
                tituloField.setText(tarefa.getTitulo());
                descricaoArea.setText(tarefa.getDescricao());
            }
        });
    }

    private void carregarTarefas() {
        listModel.clear();
        List<Tarefa> tarefas = tarefaServico.listarTodasTarefas();
        for (Tarefa tarefa : tarefas) {
            listModel.addElement(tarefa.getTitulo());
        }
    }

    private void limparCampos() {
        tituloField.setText("");
        descricaoArea.setText("");
    }
}

