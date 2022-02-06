/***************************************************************************************************************
 * File        :  RegistrationForm.java
 * Description :  Java Program to create a registration form and display the entered details in the console 
 * Author      :  Emy Joshy
 * Version     :  2.0
 * Date        :  4/2/2022
 * *************************************************************************************************************/

import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends Frame implements ActionListener,ItemListener{

    
    TextField name,address,phoneNum,email,password;
    Choice department;
    CheckboxGroup gender = new CheckboxGroup();
    Checkbox chkMale,chkFemale;


    public RegistrationForm(){

        //FRAME SETTINGS
        setTitle("Registration Form");
        setSize(600,600);
        setLayout(null);
        setVisible(true);
        setBackground(Color.LIGHT_GRAY);
        
        //Label & TextField for name       
        Label label1 = new Label();
        label1.setText("Name           :   ");
        label1.setBounds(60,50,100,80);
        add(label1);

        name = new TextField(20);
        name.setText("name");
        name.setBounds(200,75,250,30);
        add(name);

    
        //Label & TextField for Address
        Label label2 = new Label();
        label2.setText("Address        :   ");
        label2.setBounds(60,100,100,80);
        add(label2);

        address = new TextField(20);
        address.setText("enter address here..");
        address.setBounds(200,125,250,30);
        add(address);



        //Label & TextField for PhoneNumber
        Label label3 = new Label();
        label3.setText("Phone No     :   ");
        label3.setBounds(60,150,100,80);
        add(label3);

        phoneNum = new TextField(20);
        phoneNum.setText("123456890");
        phoneNum.setBounds(200,175,250,30);
        add(phoneNum);


        //Label & TextField for EmailID
        Label label4 = new Label();
        label4.setText("Email Id       :   ");
        label4.setBounds(60,200,100,80);
        add(label4);

        email= new TextField(20);
        email.setText("abc123@def.com");
        email.setBounds(200,225,250,30);
        add(email);


        //Label & CheckBox for Password      
        Label label5 = new Label();
        label5.setText("Password      :   ");
        label5.setBounds(60,250,100,80);
        add(label5);

        password= new TextField(20);
        password.setText("***********");
        password.setBounds(200,275,250,30);
        add(password);



        //Label & CheckBox for Gender
        Label label6 = new Label();
        label6.setText("Gender      :   ");
        label6.setBounds(60,300,100,80);
        add(label6);

        
        CheckboxGroup gender = new CheckboxGroup();

        Checkbox chkMale = new Checkbox("Male",gender,false);
        chkMale.setBounds(210, 315, 50, 50);
        add(chkMale);
        Checkbox chkFemale = new Checkbox("Female",gender,true);
        chkFemale.setBounds(310,315,60,50);
        add(chkFemale);

        chkMale.addItemListener(this);
        chkFemale.addItemListener(this);

        



       // Label & List for DepartmentName
        Label labelDept = new Label();
        labelDept.setText("Department      :   ");
        labelDept.setBounds(60,350,100,80);
        add(labelDept);

        
        Choice department = new Choice();
        department.setBounds(250,375,70,60);
        department.add("CSE");  
        department.add("AI");
        department.add("CE");     
        department.add("ME");
        department.add("ECE");
        department.add("EEE");
        add(department);

        department.addItemListener(this);


        //Button Settings
        Button button = new Button("Register");
        button.setBackground(Color.WHITE);
        button.setBounds(210,500,100,35);
        add(button);    
        
        button.addActionListener(this);
       


    }

    
    public void actionPerformed(ActionEvent e){
        System.out.println("\nName         :     "+name.getText());
        System.out.println("Address      :    "+address.getText());
        System.out.println("PhoneNumber  :    "+phoneNum.getText());
        System.out.println("Email Id     :    "+email.getText());
        System.out.println("Password     :    "+password.getText());

    
    }   
        
    

    public void itemStateChanged(ItemEvent e){
        
    }      


    public static void main(String[] args){
        RegistrationForm demo = new RegistrationForm();
    }  

}
