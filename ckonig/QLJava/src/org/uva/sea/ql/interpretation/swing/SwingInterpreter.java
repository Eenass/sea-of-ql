package org.uva.sea.ql.interpretation.swing;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import org.uva.sea.ql.interpretation.swing.components.TopPanel;

public class SwingInterpreter extends JFrame {
    private static final long serialVersionUID = -1942492887122279651L;
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;
    private static final int TOP_HEIGHT = 100;
    private static final int LEFT_WIDTH = 100;
    private static final int CENTER_WIDTH = 400;
    private static final int CENTER_HEIGHT = 400;
    private static final int BOTTOM_HEIGHT = 100;

    private TopPanel topPanel;
    private JPanel leftPanel;
    private JPanel bottomPanel;
    private JPanel centerPanel;
    private JTextArea log;
    private SwingHelper helper;

    public SwingInterpreter() {
        super("QL Interpreter");
        createComponents();
        setSizes();
        setLayout();
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setVisible(true);
    }

    private void setSizes() {
        this.leftPanel.setBackground(Color.red);
        this.topPanel.setSize(WINDOW_WIDTH, TOP_HEIGHT);
        this.centerPanel.setBackground(Color.green);
        this.centerPanel.setSize(CENTER_WIDTH, CENTER_HEIGHT);
        this.bottomPanel.setSize(WINDOW_WIDTH, BOTTOM_HEIGHT);
        this.leftPanel.setSize(LEFT_WIDTH, CENTER_HEIGHT);
        this.log.setSize(LEFT_WIDTH, CENTER_HEIGHT);
        this.log.setText("");
    }

    private void createComponents() {

        this.bottomPanel = new JPanel();
        this.leftPanel = new JPanel();
        this.centerPanel = new JPanel();
        this.log = new JTextArea();
        this.topPanel = new TopPanel(this.helper, this.log, this.centerPanel);
        this.log.setLineWrap(true);
        this.leftPanel.add(this.log);
    }

    private void setLayout() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new GridBagLayout());
        final GridBagConstraints c = new GridBagConstraints();
        addToContentPane(0, 0, 2, this.topPanel, c);
        addToContentPane(0, 1, 1, this.leftPanel, c);
        addToContentPane(1, 1, 1, this.centerPanel, c);
        addToContentPane(0, 2, 2, this.bottomPanel, c);

    }

    private void addToContentPane(int x, int y, int gridwidth, JPanel p,
            GridBagConstraints c) {
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = x;
        c.anchor = GridBagConstraints.FIRST_LINE_START;
        c.gridy = y;
        c.gridwidth = gridwidth;
        getContentPane().add(p, c);
    }

}
