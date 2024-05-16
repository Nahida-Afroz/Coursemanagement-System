package coursemanagementsystem;

import java.awt.GridLayout;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextField;

public class StudentCourseDetails {

    JFrame jFrame=new JFrame("Sign Up Form");
    
    JTextField jTextFiledSubjectName=new JTextField();
    
    JTextField jTextFiledSubjectTitle=new JTextField();
    
    JTextField jTextFiledSubjectSection=new JTextField();
    
    JTextField jTextFiledSubjectFaculty=new JTextField();
    
    JTextField jTextFiledSubjectStudent=new JTextField();
   
    JLabel jLabelSubjectName=new JLabel("Course Name");
    
    JLabel jLabelSubjectTitle=new JLabel("Course Title");
    
    JLabel jLabelSubjectSection=new JLabel("Section");
    
    JLabel jLabelSubjectFaculty=new JLabel("Faculty");
    
    JLabel jLabelSubjectStudent=new JLabel("Student");
    
    JLabel jLabel=new JLabel();

JList<StudentCourseDetailsSampleClass> jList=new JList<StudentCourseDetailsSampleClass>();
    
    DefaultListModel<StudentCourseDetailsSampleClass> defaultListModel=new DefaultListModel<>();
    
   //static JLabel jLabel=new JLabel();
    
    JPanel jPanel=new JPanel();
    
    JSplitPane jSplitPane=new JSplitPane();
    
JScrollBar jScrollBar=new JScrollBar();
    
    JButton jButtonUpdate=new JButton("Update Data");
    
    JButton jButtonDelete=new JButton("Delete Data");
    
    
    public static int alreadyhave=0;
static String student; static String email; static String emailpassword; static String chossenSubject; static String chossenSubjectTitle; static String chossenSubjectSection;    
   String choosenSubjectFaculty; 
    StudentCourseDetails(String student, String email, String emailpassword, String chossenSubject, String chossenSubjectTitle, String chossenSubjectSection,String choosenSubjectFaculty) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    this.student=student;
    this.email=email;
    this.emailpassword=emailpassword;
    this.chossenSubject=chossenSubject;
    this.chossenSubjectTitle=chossenSubjectTitle;
    this.chossenSubjectSection=chossenSubjectSection;
    this.choosenSubjectFaculty=choosenSubjectFaculty;
    //JOptionPane.showMessageDialog(null, "I am in the constructor");
    }

    public StudentCourseDetails(){
        
    }

    StudentCourseDetails(String student, String emailpassword, String email) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    this.student=student;
    this.emailpassword=emailpassword;
    this.email=email;
    
    }
    
    void addIntoTheList() {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
     File file=new File("StudentCourseDetails.txt");    
    
    try{
        
     FileWriter   fileWriter=new FileWriter(file,true);
            BufferedWriter bf=new BufferedWriter(fileWriter);
            PrintWriter printWriter=new PrintWriter(bf);
       
     printWriter.println(student);
     printWriter.println(email);       
     printWriter.println(emailpassword);
     printWriter.print(chossenSubject);
     printWriter.print(chossenSubjectTitle);
     printWriter.print(chossenSubjectSection);
     printWriter.print(choosenSubjectFaculty);
     printWriter.println();
     printWriter.println();
     
     printWriter.close();
     
     JOptionPane.showMessageDialog(null, "The data is stored succesfully");
     
    }catch(Exception exception){
        
        JOptionPane.showMessageDialog(null, exception);
    }
          
    }
    
    public int checkthesectionstudentplace(String chossenstudent){
        
        try{
    try{    
   File file=new File("StudentCourseDetails.txt");    
    //         JOptionPane.showMessageDialog(null, "chossen subject: "+chossenSubject);
  //JOptionPane.showMessageDialog(null, "choosen section"+chossenSubjectSection);
             Scanner scanner=new Scanner(file);
      ArrayList<String> arrayList=new ArrayList<>();    
   while(scanner.hasNext()){
       String ChossenSubjectChosser=scanner.nextLine();
      // JOptionPane.showMessageDialog(null, ChossenSubjectChosser);
       String ChossenSubjectChosserEmail=scanner.nextLine();
       //JOptionPane.showMessageDialog(null, ChossenSubjectChosserEmail);
      String ChossenSubjectChosserEmailPassword=scanner.nextLine();
      //JOptionPane.showMessageDialog(null, ChossenSubjectChosserEmailPassword);
       String ChossenSubject=scanner.nextLine();
     //JOptionPane.showMessageDialog(null, "choosen subject entire: "+ChossenSubject);  
     arrayList.add(ChossenSubject);
     String ChossenSubjectTitle=scanner.nextLine();
       //JOptionPane.showMessageDialog(null, ChossenSubjectTitle); 
       String ChossenSubjectSection=scanner.nextLine();
       //JOptionPane.showMessageDialog(null, ChossenSubjectSection);
      // JOptionPane.showMessageDialog(null, "choosen subject entire: "+ChossenSubjectSection);  
       arrayList.add(ChossenSubjectSection);
       String ChossenSubjectFaculty=scanner.nextLine();
       //JOptionPane.showMessageDialog(null, ChossenSubjectFaculty);
       String line1=scanner.nextLine();
       //JOptionPane.showMessageDialog(null, line1);
       String line2=scanner.nextLine();
   //JOptionPane.showMessageDialog(null, line2);
     // JOptionPane.showMessageDialog(null, "arrayList subject: "+arrayList.get(0).toString().trim());
      //JOptionPane.showMessageDialog(null, "arrayList section: "+arrayList.get(1).toString().trim());
  int value1=equalitychecking(ChossenSubject.trim(),chossenSubject); 
   int value2= equalitychecking(ChossenSubjectSection.trim(),chossenSubjectSection);  
      //JOptionPane.showMessageDialog(null, "value1: "+value1);
      //JOptionPane.showMessageDialog(null, "Value2: "+value2);
   if( (value1>0) ){
       //JOptionPane.showMessageDialog(null, "I am here at the condition1");
          if( (value2>0)){
              //String []x=ChossenSubjectSection.split(" ",-1);
           arrayList.clear();
  //int y=Integer.parseInt(x[2]);
  
  //JOptionPane.showMessageDialog(null, "I am here at the condition");
  
  alreadyhave++;
              
          }
  
   }
      
   }
   scanner.close();
   
    }catch(Exception exception){
        
        JOptionPane.showMessageDialog(null, "Exception at the first: "+exception);
        
    }
   
    JOptionPane.showMessageDialog(null, "Already have: "+alreadyhave);
    
   File file1=new File("CourseDetailsInformation.txt");     
       
   Scanner scan=new Scanner(file1);
   int capacity=0;
   while(scan.hasNext()){
       
       String MySubject=scan.nextLine();
       
       String MySubjectTitle=scan.nextLine();
       String MySubjectSection=scan.nextLine();
       String MySubjectFaculty=scan.nextLine();
       String MySubjectStudent=scan.nextLine();
   String line3=scan.nextLine();
   String line4=scan.nextLine();
  // String line5=scan.nextLine();
  int value3=equalitychecking(this.chossenSubject,MySubject);
  int value4=equalitychecking(this.chossenSubjectSection,MySubjectSection);
  //int value5=equalitychecking(this.emailpassword,ChossenSubjectChosserEmailPassword);
   if(value3>0){
       
       if(value4>0){
       
           String []x1=MySubjectStudent.split(" ", -1);
       
       capacity=Integer.parseInt(x1[2]);
           
       }
              
   }
   
   }
        scan.close();
   JOptionPane.showMessageDialog(null, "Capacity have: "+capacity);
   if(capacity+1>alreadyhave && capacity!=0){
       
       return 1;
       
   }else{
       return 0;
   }
   
        }catch(Exception exception){
            
            JOptionPane.showMessageDialog(null, exception);
            
        }
        
        return 0;
    }
    
    public void ShowDataOfMyStorage(){
        
        File file=new File("StudentCourseDetails.txt");    
             try{
   Scanner scanner=new Scanner(file);
          
   jList.setModel(defaultListModel);
   
   while(scanner.hasNext()){
       String ChossenSubjectChosser=scanner.nextLine();
//       JOptionPane.showMessageDialog(null, ChossenSubjectChosser);
       String ChossenSubjectChosserEmail=scanner.nextLine();
  //     JOptionPane.showMessageDialog(null, ChossenSubjectChosserEmail);
       String ChossenSubjectChosserEmailPassword=scanner.nextLine();
    //   JOptionPane.showMessageDialog(null, ChossenSubjectChosserEmailPassword);
       String ChossenSubject=scanner.nextLine();
      // JOptionPane.showMessageDialog(null, ChossenSubject);
       String ChossenSubjectTitle=scanner.nextLine();
       //JOptionPane.showMessageDialog(null, ChossenSubjectTitle);
       String ChossenSubjectSection=scanner.nextLine();
       //JOptionPane.showMessageDialog(null, ChossenSubjectSection);
  String line1=  scanner.nextLine();      
//JOptionPane.showMessageDialog(null, line1);
       String line2=scanner.nextLine();
       scanner.nextLine();
  // JOptionPane.showMessageDialog(null, line2);
  //JOptionPane.showMessageDialog(null, this.student);
  
  int value3=equalitychecking(this.student,ChossenSubjectChosser);
  int value4=equalitychecking(this.email,ChossenSubjectChosserEmail);
  int value5=equalitychecking(this.emailpassword,ChossenSubjectChosserEmailPassword);
  
   try{    
   if(this.student.equals(ChossenSubjectChosser) && this.email.equalsIgnoreCase(ChossenSubjectChosserEmail) && this.emailpassword.equals(ChossenSubjectChosserEmailPassword)){
         try{
 //JOptionPane.showMessageDialog(null, ChossenSubjectChosser+"\n"+ChossenSubjectChosserEmail+"\n"+ChossenSubjectChosserEmailPassword+"\n"+ChossenSubject+"\n"+ChossenSubjectTitle+"\n"+ChossenSubjectSection+"\n"+"\n");
   defaultListModel.addElement(new StudentCourseDetailsSampleClass(  student,   email,   this.emailpassword,   ChossenSubject,   ChossenSubjectTitle,   ChossenSubjectSection));
         
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Exception in the entire1: "+e);
         }

jSplitPane.setLeftComponent(new JScrollPane(jList));
       
       jPanel.add(jLabel);
       
       jSplitPane.setRightComponent(jPanel);
       
   GridLayout gridLayout=new GridLayout();
    
    gridLayout.setColumns(1);
gridLayout.setRows(3);
        
jFrame.setLayout(gridLayout);

//jFrame.add(jList);
    jFrame.pack();
    jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
jFrame.setSize(900, 600);
jFrame.add(jSplitPane);
jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jFrame.show();

   }
   }catch(Exception e){
  //     JOptionPane.showMessageDialog(null, "Exception in the entire: "+e);
   }
   }
   scanner.close();
             }catch(Exception e){
                 
//                 JOptionPane.showMessageDialog(null, e);
                 
         } 
             
             }
    
public int equalitychecking(String string1,String string2){
    int y=0;
    //JOptionPane.showMessageDialog(null, "string1: "+string1);
    //JOptionPane.showMessageDialog(null, "string2 "+string2);
    if(string1.trim().equalsIgnoreCase(string2.trim())){
        y=1;
       //JOptionPane.showMessageDialog(null, "I am if condition: "+y);
    }else{
       y=0; 
      // JOptionPane.showMessageDialog(null, "I am else condition: "+y);
    }
    return y;
}

}
