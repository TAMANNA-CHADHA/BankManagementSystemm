
package bankmanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;;


public class SignUpTwo extends JFrame implements ActionListener{
    
     
        JTextField panTextField,aadharTextField; 
        JButton next;
        JRadioButton syes,sno,eyes,eno;
        JComboBox religion, category,occupation,education,income;
        String formno;
       
         
         SignUpTwo(String formno){
        this.formno = formno;
        setLayout(null);
       setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
      
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details ");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,40);
        add(additionalDetails);
        
          JLabel sreligion = new JLabel("Religion:");
        sreligion.setFont(new Font("Raleway",Font.BOLD,20));
        sreligion.setBounds(100,140,100,30);
        add(sreligion);
         
        String ValReligion[] = {"Hindu","Muslim","Sikh","Christan","Other"}; 
         religion = new JComboBox(ValReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
         add( religion);
        
        
        
      
        
        JLabel scategory = new JLabel("Category");
         scategory.setFont(new Font("Raleway",Font.BOLD,20));
        scategory.setBounds(100,190,200,30);
        add(scategory);
        
        String ValCategory[]= {"General","OBC","SC","ST","Other"};
         category = new JComboBox(ValCategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
         
        
        
        
        JLabel sincome = new JLabel("Income:");
        sincome.setFont(new Font("Raleway",Font.BOLD,20));
        sincome.setBounds(100,240,200,30);
        add(sincome);
        
        String incomeCategory[]= {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
         income = new JComboBox(incomeCategory);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);
        

        
        JLabel seducation = new JLabel("Educational:");
       seducation.setFont(new Font("Raleway",Font.BOLD,20));
        seducation.setBounds(100,290,200,30);
        add(seducation);
       
        
        JLabel squalification = new JLabel("Qualification:");
         squalification.setFont(new Font("Raleway",Font.BOLD,20));
        squalification.setBounds(100,315,200,30);
        add( squalification);
        
        String educationValue[]= {"Non-Graduation","Graduate","Post-Graduation","Doctrate","Other"};
        education = new JComboBox(educationValue);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.WHITE);
        add(education);
        
        
     
        
        JLabel soccupation = new JLabel("Occupation:");
        soccupation.setFont(new Font("Raleway",Font.BOLD,20));
        soccupation.setBounds(100,390,200,30);
        add(soccupation);
        
        String occupationalValue[]= {"Salried","Self-Employed","Bussiness","Student","Retired"};
        occupation = new JComboBox(occupationalValue);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        
        
        JLabel pan = new JLabel("PAN Number:");
        pan.setFont(new Font("Raleway",Font.BOLD,20));
        pan.setBounds(100,440,200,30);
        add(pan);
        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway",Font.BOLD,14));
        panTextField.setBounds(300,440,400,30);
        add( panTextField);
        
                
        JLabel aadhar = new JLabel("Aadhar No.:");
        aadhar.setFont(new Font("Raleway",Font.BOLD,20));
        aadhar.setBounds(100,490,200,30);
        add(aadhar);
        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway",Font.BOLD,14));
        aadharTextField.setBounds(300,490,400,30);
        add( aadharTextField);
        
        
        JLabel state = new JLabel("Senior Citizen:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add( state);
        
        syes = new JRadioButton("YES");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno= new JRadioButton("No");
       sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
     
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);
        
        
        JLabel Pincode = new JLabel("Existing Account:");
        Pincode .setFont(new Font("Raleway",Font.BOLD,20));
        Pincode .setBounds(100,590,200,30);
        add(Pincode );
        
         eyes = new JRadioButton("YES");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno= new JRadioButton("No");
       eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
     
        ButtonGroup eaccountgroup = new ButtonGroup();
        eaccountgroup.add(eyes);
        eaccountgroup.add(eno);
       
     
        
        
       next = new JButton("Next");
       next.setBackground(Color.BLACK);
       next.setForeground(Color.WHITE);
       next.setFont(new Font("Raleway",Font.BOLD,14));
       next.setBounds(620,660,80,30);
       next.addActionListener(this);
       add(next);
                
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
         @Override
         public void actionPerformed(ActionEvent ae){
            String sreligion = (String) religion.getSelectedItem();
             String scategory = (String) category.getSelectedItem();
             String sincome = (String) income.getSelectedItem();
             String seducation = (String) education.getSelectedItem();
             String soccupation = (String) occupation.getSelectedItem();
             String span = panTextField.getText();
             String saadhar = aadharTextField.getText();



             String seniorcitizen = null;
             if(syes.isSelected()){
                 seniorcitizen="Yes";  
             }
             else if(sno.isSelected()){
              seniorcitizen = "No";   
             }
             
              String existingaccount = null;
             if(eyes.isSelected()){
                 existingaccount="Yes";  
             }
             else if(eno.isSelected()){
              existingaccount = "No";   
             }
                         
            try{
                

                    Conn c= new Conn();
               String query ="insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
                   c.s.executeUpdate(query);
                   //SignUpThree Object
                setVisible(false);
                new SignUpThree(formno).setVisible(true);
            } catch(Exception e){
                System.out.println(e);
            }
            
            
            
            
         }
    
    public static void main(String args[])
    {
        
        new SignUpTwo("");
    }    

    
}