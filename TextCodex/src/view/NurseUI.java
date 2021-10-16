package view;

import controller.NursesCntl;
import model.Abbreviations;
import model.Nurse;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NurseUI extends JFrame {
    public JPanel panelMain;
    private NursesCntl theNursesCntl;
    private JButton updateButton;
    private JButton addItemButton;
    private JButton saveItemButton;
    private JButton removeItemButton;
    private JButton nextItemButton;
    private JButton previousItemButton;
    private JButton exitButton;
    private JLabel abbreviationTitle;
    private JLabel abbreviationItem;
    private JTextField abbreviationItemText;
    private JTextField nurseLevelText;
    private int index = 0;

    public NurseUI(NursesCntl nursesCntl) {
        this.theNursesCntl = nursesCntl;
        this.add(panelMain);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        setUpNurse();
        nextItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (index == theNursesCntl.getTheNurseList().getTheNurseArrayList().size() - 1)
                    index = 0;
                else
                    index++;
                setUpNurse();
            }
        });
        previousItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (index == theNursesCntl.getTheNurseList().getTheNurseArrayList().size() - 1)
                    index = 0;
                else
                    index--;
                setUpNurse();
            }
        });
        addItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                newNurseWindow();
                nextItemButton.setVisible(false);
                addItemButton.setVisible(false);
                saveItemButton.setVisible(true);
            }
        });
        saveItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Nurse nurse = new Nurse(abbreviationItemText.getText(), nurseLevelText.getText());
                theNursesCntl.addNewNurse(nurse);
                saveItemButton.setVisible(false);
                nextItemButton.setVisible(true);
                addItemButton.setVisible(true);
            }
        });
        removeItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("removeItemButton");
            }
        });
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("updateButton");
            }
        });

    }

        public void newNurseWindow(){
            abbreviationItemText.setText("");
            nurseLevelText.setText("");
        }

        public void setUpNurse(){
            Nurse s = theNursesCntl.getTheNurseList().getTheNurseArrayList().get(index);
            abbreviationItemText.setText(s.getUserShortVersion());
            nurseLevelText.setText(s.getLevel());
        }
    }

