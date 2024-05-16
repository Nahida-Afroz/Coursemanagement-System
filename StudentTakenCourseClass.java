
package coursemanagementsystem;

import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileWriter;
import java.util.LinkedList;
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
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class StudentTakenCourseClass {
JFrame jFrame=new JFrame("Sign Up Form");
    
String student,emailpassword,email;

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
    
    JButton jButtonUpdate=new JButton("Read Taken Courses");
    
    JButton jButtonDelete=new JButton("Delete Data");

     JList<CourseInformationSampleClassAll> jList=new JList<>();
    
    DefaultListModel<CourseInformationSampleClassAll> defaultListModel=new DefaultListModel<>();
    
   //static JLabel jLabel=new JLabel();
    
    JPanel jPanel=new JPanel();
    
    JSplitPane jSplitPane=new JSplitPane();
    
JScrollBar jScrollBar=new JScrollBar();
    
    FileWriter fileWriter;
    CourseInformationSampleClassAll courseInformationSampleClassAll=new CourseInformationSampleClassAll();
public StudentTakenCourseClass(String student,String emailpassword,String email){
    this.student=student;
    this.emailpassword=emailpassword;
    this.email=email;
}

public void createJrameFrom(){
    
     File file=new File("CourseDetailsInformation.txt");
    
    jList.setModel(defaultListModel);
        try{
            int rownumber=0;
            Scanner scanner1=new Scanner(file);
            Scanner scanner=new Scanner(file);
            
    LinkedList <CourseInformationSampleClassAll> arrayList=new LinkedList<CourseInformationSampleClassAll>();
              
    while(scanner.hasNext()){
        
   String courseName=scanner.nextLine();
        
   String courseTitle=scanner.nextLine();
   
   String courseSection=scanner.nextLine();
        
   String courseFaculty=scanner.nextLine();
   
   String courseStudent=scanner.nextLine();
   
   String line1=scanner.nextLine();
   
   String line2=scanner.nextLine();
   
   defaultListModel.addElement(new CourseInformationSampleClassAll( courseName,  courseTitle,  courseFaculty,  courseSection,  courseStudent));
   
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
jFrame.add(jButtonUpdate);

jButtonUpdate.addMouseListener(new MouseListener(){
                @Override
                public void mouseClicked(MouseEvent me) {
//                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
                actionPerformed();
                
                }

                @Override
                public void mousePressed(MouseEvent me) {
  //                  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public void mouseReleased(MouseEvent me) {
    //                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public void mouseEntered(MouseEvent me) {
      //              throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public void mouseExited(MouseEvent me) {
                   // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

});

jFrame.setVisible(true);
        
jList.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
           @Override
           public void valueChanged(ListSelectionEvent lse) {
          //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                
          CourseInformationSampleClassAll newclass=jList.getSelectedValue();
       
    String chossenSubject=newclass.getCourseName();
    String chossenSubjectTitle=newclass.getCourseTitle();
    String chossenSubjectSection=newclass.getCourseSection();
    String choosenSubjectFaculty=newclass.getCourseFaculty();
  //checkthesectionstudentplace  
  StudentCourseDetails studentCourseDetails=new StudentCourseDetails(student,email,emailpassword,chossenSubject,chossenSubjectTitle,chossenSubjectSection,choosenSubjectFaculty);  
    
  if(studentCourseDetails.checkthesectionstudentplace(newclass.getCourseStudent())==1){
  
      studentCourseDetails.addIntoTheList();    
  
  }else{
      
      JOptionPane.showMessageDialog(null, "Section is already filled");
      
  }
      
     //     JOptionPane.showMessageDialog(null, "Name: "+newclass.getCourseName()+"   "+"Id: "+newclass.getCourseTitle());
          
           }
            
      });

        }catch(Exception exception){
            
   //JOptionPane.showMessageDialog(null, exception);
            
        }
     
}
     
    private void as(String name,String title,String section,String faculty) {
    
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // JOptionPane.showMessageDialog(null, "I am here");
  JOptionPane.showMessageDialog(null, name);
    
   // return null;
    }

    public void actionPerformed() {
    
        //JOptionPane.showMessageDialog(null, "I am here");
   
  //ShowDataOfMyStorage
  
  StudentCourseDetails studentCourseDetails=new StudentCourseDetails(student,emailpassword,email);
  
  studentCourseDetails.ShowDataOfMyStorage();
        
    }

}
