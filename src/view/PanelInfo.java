package view;

import utils.Constants;

import javax.swing.*;
import java.awt.*;
<<<<<<< HEAD
import java.util.ArrayList;

public class PanelInfo extends JScrollPane {

    private JPanel panelInfo;
    private JLabel labelInfo;
    private String formalism;
    private String initHtml;
    private String finalizeHtml;
    private String tabSpace;
    private String info;
=======
>>>>>>> 6503ca7608f99f62a997cd06eaeb812fc27545cc

    private ArrayList<String> listStates;
    private ArrayList<String> listAlphabet;
    private ArrayList<String> listTransitions;

    public PanelInfo() {
<<<<<<< HEAD
        this.panelInfoFeatures();
        this.panelInfoInstances();
        this.panelInfoInternalContent();
    }

    private void panelInfoFeatures() {
        this.setOpaque(false);
        this.getViewport().setOpaque(false);
        this.setBorder(null);
        //  this.relationsShips.setText("<html> <p align='center' >" + "¡La persona mas popular<br/>" + "es: " +
        //        ""+ social.getMaxFriends().getNickName() + "!</html>");
    }

    private void panelInfoInstances() {
        this.listStates = new ArrayList<>();
        this.listAlphabet = new ArrayList<>();
        this.listTransitions = new ArrayList<>();
        htmlStruct();
        this.labelInfo = labelInfo();
        this.panelInfo = panelInfo();
    }

    private void htmlStruct() {
        this.formalism = "A = { Q, Σ, δ, Q<sub style='font-size:16'>0</sub>, Q<sub style='font-size:16'>f</sub>}";
        this.initHtml = "<html><p>";
        this.finalizeHtml = "<p></html>";
        this.tabSpace = "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
        this.info = "";
    }


    private JPanel panelInfo() {
        JPanel panelInfo = new JPanel(new BorderLayout());
        panelInfo.setOpaque(false);
        return panelInfo;
    }

    private JLabel labelInfo() {
        JLabel labelInfo = new JLabel();
        labelInfoFeatures(labelInfo);
       /* labelInfo.setText(initHtml + formalism +
                "<br/>Q = {1,2,3,4} <br/>Σ = {a,b}<br/>" +
                "δ = {<br/>" +
                tabSpace + "δ (1,a) = 2<br/>" +
                tabSpace + "δ (1,b) = 3 <br/>" +
                tabSpace + "δ (2,b) = 4 <br/>" +
                tabSpace + "δ (3,a) = 4 <br/>}" +
                tabSpace + finalizeHtml);*/
        labelInfo.setText(info);
        return labelInfo;
    }


    private String infoHtml() {
        info = initHtml + formalism + "<br/>Q = {" + this.getString(info, this.listStates) + "}" + "<br>"
                + "<br/>Σ = {" + this.getString(info, this.listAlphabet) + "}";

        return info;
=======
        this.setBackground(Color.WHITE);
>>>>>>> 6503ca7608f99f62a997cd06eaeb812fc27545cc
    }


    private String constructInfo(String state, String alphabet) {
        String info = "";
        return info;
    }

    private String getString(String info, ArrayList<String> listElement) {
        for (int i = 0; i < listElement.size(); i++) {
            if (listElement.size() == 1) {
                info += listElement.get(i);
            } else if (i != 0) {
                info += ", " + listElement.get(i);
            } else {
                info += listElement.get(i);
            }
        }
        return info;
    }

    private void labelInfoFeatures(JLabel labelInfo) {
        labelInfo.setHorizontalTextPosition(JLabel.LEFT);
        labelInfo.setHorizontalAlignment(JLabel.LEFT);
        labelInfo.setFont(new Font("Calibri", Font.PLAIN, 22));
        labelInfo.setForeground(Color.WHITE);
    }

    private void panelInfoInternalContent() {
        this.panelInfo.add(labelInfo, BorderLayout.CENTER);
        this.setViewportView(this.panelInfo);
    }

    public void addElement(ArrayList<String[]> element) {
        for (String[] item : element) {
            if (item[0].equals("1")) {
                this.listStates.add(item[1]);
                System.out.println(item[1]);
                this.labelInfo.setText(infoHtml());
                this.info = "";
            }
            if (item[0].equals("2")) {
                this.listAlphabet.add(item[1]);
                this.labelInfo.setText(infoHtml());
                this.info = "";

            }
            if (item[0].equals("3")) {
                this.listStates.add(item[1]);
                this.labelInfo.setText("Llego una transición");

            }

        }

        this.labelInfo.repaint();
        this.repaint();
    }


}
