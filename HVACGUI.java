import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Created by Wolfknightx on 4/10/2016.
 * call information for object controls will be based from the ServiceCall object.
 */
public class HVACGUI extends JFrame {
    private JPanel rootPanel;
    private JList<ServiceCall> lstOpenCalls;
    private JList<ServiceCall> lstClosedCalls;
    private JScrollBar scrollBar1;
    private JScrollBar scrollBar2;
    private JButton btnExit;
    private JButton btnPrintReport;
    private JButton btnResolveSelected;
    private JTextField txtCostOfService;
    private JTextField txtResolutionInfo;
    private JRadioButton rdoFurnace;
    private JRadioButton rdoCentralAC;
    private JRadioButton rdoWaterHeater;
    private JComboBox cmbxCentralACTypes;
    private JComboBox cmbxFurnaceTypes;
    private JComboBox cmbxWaterHeaterTypes;
    private JTextField textField3;
    private JTextField textField4;
    private JButton btnAddCall;
    private JButton btnClearInfo;
    private int serviceCounter; //this will be used to keep track of the tickets being placed into the list.
    Date todaysDate = new Date();

    DefaultListModel<ServiceCall> serviceCallDefaultListModel;
    DefaultListModel<ServiceCall> closedServiceCallDefaultListModel;

    protected HVACGUI(){
        super("Service Call Manager");
        setContentPane(rootPanel);
        setPreferredSize(new Dimension(1500, 750));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

        serviceCallDefaultListModel = new DefaultListModel<>(); //create a new instance of the default list model
        lstOpenCalls.setModel(serviceCallDefaultListModel); //make Open Calls list use the servicecall model.
        lstOpenCalls.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION); //set the selection attribute to single interval selection.

        closedServiceCallDefaultListModel = new DefaultListModel<>();
        lstClosedCalls.setModel(serviceCallDefaultListModel);
        lstClosedCalls.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        //configure the drop down buttons for the different calls
        configureDropDowns();
        //call methods to handle the buttons

    }

    private void configureDropDowns(){
        //set up the dropdowns based on what is selected.
        if (rdoFurnace.isSelected()){
            isDDVisible();
            cmbxFurnaceTypes.addItem("Forced Air");
            cmbxFurnaceTypes.addItem("Boiler");
            cmbxFurnaceTypes.addItem("Octopus");
        }else if (rdoCentralAC.isSelected()){
            cmbxCentralACTypes.addItem("2016 Model X");
            cmbxCentralACTypes.addItem("2014 Model MarkII");
            cmbxCentralACTypes.addItem("2000 Model SmoothAir XI");
        }else if (rdoWaterHeater.isSelected()){
            cmbxWaterHeaterTypes.addItem("0-1 Years");
            cmbxWaterHeaterTypes.addItem("2-4 Years");
            cmbxWaterHeaterTypes.addItem("5+ Years");
        }
    }

    private void isDDVisible(){
        if (rdoWaterHeater.isSelected()){
            cmbxFurnaceTypes.setVisible(false);
            cmbxCentralACTypes.setVisible(false);
            cmbxWaterHeaterTypes.setVisible(true); //make this box visable then fill with
        }else if (rdoFurnace.isSelected()){
            cmbxFurnaceTypes.setVisible(true); //make this box visable then fill with
            cmbxCentralACTypes.setVisible(false);
            cmbxWaterHeaterTypes.setVisible(false);
        }else if (rdoCentralAC.isSelected()){
            cmbxFurnaceTypes.setVisible(false);
            cmbxCentralACTypes.setVisible(true); //make this box visable then fill with
            cmbxWaterHeaterTypes.setVisible(false);
        }
    }

    private void configureButtons(){
        rdoFurnace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        rdoCentralAC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        rdoWaterHeater.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        btnAddCall.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnClearInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        btnResolveSelected.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        btnPrintReport.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }
}
