/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gymframe;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.SoftBevelBorder;
/**
 *
 * @author user
 */
public class GUIFrame extends JFrame{
    //Panels
    private JPanel jpHeading,jpClient,jpName,jpSurname,jpIdNo,jpGender,jpContacts,jpPersonalTrainer,jpMemebership,jpComments,jpButtons,jpHeadingClientCombined,jpMembershipCommentsCombined,jpMain;
    //Labels
    private JLabel jlHeading,jlName,jlSurname,jlIdNo,jlGender,jlPersonalTrainer,jlContractType;
    //TextField
    private JTextField jtfName,jtfSurname,jtfIdNo;
    //combobox
    private JComboBox jcbGender;
    //radio buttons
    private JRadioButton jrbMonthToMonth,jrbSixMonth,jrbAnnual;
    //checkBox
    private JCheckBox jcbPersoalTrainer;
    //ButtonGroup
    private ButtonGroup btnGrp;
    //Text Area
    private JTextArea comments;
    //scrollPane
    private JScrollPane jspScrollable;
    //Button
    private JButton jbApply;
    //Construct The GUI frame
    public GUIFrame() {
        setTitle("Gym Membership");
        setSize(500,500);
        
        //Create Panel
        jpHeading = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        jpClient = new JPanel(new GridLayout(4,1,1,1));
        jpClient.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Client Details"));
        
        jpName = new JPanel(new FlowLayout(FlowLayout.LEFT));
        jpSurname = new JPanel(new FlowLayout(FlowLayout.LEFT));
        jpIdNo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        jpGender = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        jpContacts = new JPanel(new FlowLayout(FlowLayout.LEFT));
        jpPersonalTrainer = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        jpMemebership = new JPanel(new GridLayout(2,1,1,1));
        jpMemebership.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Contract Option"));
        
        jpComments  = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        jpButtons = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        jpHeadingClientCombined = new JPanel(new BorderLayout());
        jpMembershipCommentsCombined = new JPanel(new BorderLayout());
        jpMain = new JPanel(new BorderLayout());
        //Create Label
        jlHeading = new JLabel("Memebership Form");
        jlHeading.setFont(new Font(Font.SANS_SERIF,Font.ITALIC + Font.BOLD,20));
        jlHeading.setForeground(Color.BLUE);
        jlHeading.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        
        jlName = new JLabel("Name: ");
        jlSurname = new JLabel("Surname:  ");
        jlIdNo = new JLabel("Id No: ");
        jlGender = new JLabel("Gender: ");
        jlContractType = new JLabel("Type Of Contract: ");
        jlPersonalTrainer = new JLabel("Sekect the checkBox if you need a Personal Trainer");
        // TextField
        jtfName = new JTextField(30);
        jtfSurname = new JTextField(30);
        jtfIdNo = new JTextField(20);
        //ComboBox
        jcbGender = new JComboBox();
        jcbGender.addItem("Male");
        jcbGender.addItem("Female");
        //Radio Box
        jrbMonthToMonth = new JRadioButton("Month-to-month");
        jrbSixMonth = new JRadioButton("Six Month");
        jrbAnnual = new JRadioButton("Annual");
        //Check Box
        jcbPersoalTrainer = new JCheckBox();
        //Button Group
        btnGrp = new ButtonGroup();
        btnGrp.add(jrbMonthToMonth);
        btnGrp.add(jrbSixMonth);        
        btnGrp.add(jrbAnnual);
        //TextArea
        comments = new JTextArea(20,40);
        comments.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1), "Comments"));
        // ScrollPane
        jspScrollable = new JScrollPane(comments,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        //Button
        jbApply = new JButton("Apply");
        
        //Components  to panel
        jpHeading.add(jlHeading);
        //JPanel Name
        jpName.add(jlName);
        jpName.add(jtfName);
        //surname
        jpSurname.add(jlSurname);
        jpSurname.add(jtfSurname);
        //id
        jpIdNo.add(jlIdNo);
        jpIdNo.add(jtfIdNo);
        //Gender  
        jpGender.add(jlGender);
        jpGender.add(jcbGender);
        //Client
        jpClient.add(jpName);
        jpClient.add(jpSurname);
        jpClient.add(jpIdNo);
        jpClient.add(jpGender);
        //Heading and Client
        jpHeadingClientCombined.add(jpHeading,BorderLayout.NORTH);
        jpHeadingClientCombined.add(jpClient,BorderLayout.CENTER);
        //Contract
        jpContacts.add(jlContractType);
        jpContacts.add(jrbMonthToMonth);
        jpContacts.add(jrbSixMonth);
        jpContacts.add(jrbAnnual);
        //Personal Trainer
        jpPersonalTrainer.add(jlPersonalTrainer);
        jpPersonalTrainer.add(jcbPersoalTrainer);
        //membership
        jpMemebership.add(jpContacts);
        jpMemebership.add(jpPersonalTrainer);
        //Comments
        jpComments.add(jspScrollable);
        //Membershipcomments 
        jpMembershipCommentsCombined.add(jpMemebership,BorderLayout.NORTH);
        jpMembershipCommentsCombined.add(jpComments, BorderLayout.CENTER);
        //Button
        jpButtons.add(jbApply);
        //Main
        jpMain.add(jpHeadingClientCombined,BorderLayout.NORTH);
        jpMain.add(jpMembershipCommentsCombined,BorderLayout.CENTER);
        jpMain.add(jpButtons, BorderLayout.SOUTH);
        //Set Visible
        pack();
        setVisible(true);
    }
    
    
}
