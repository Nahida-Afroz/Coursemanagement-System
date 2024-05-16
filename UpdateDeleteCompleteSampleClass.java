
package coursemanagementsystem;

import java.awt.GridLayout;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UpdateDeleteCompleteSampleClass {

    String subject,section;
    JFrame jFrame=new JFrame("Sign Up Form");
    String subjectTitle,subjectFaculty,subjectStudent;
 //String section;
 
  //String subject;
 
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
    
public UpdateDeleteCompleteSampleClass(String subject,String section,String subjectTitle,String subjectFaculty,String subjectStudent){
    
    this.subject=subject;
    this.section=section;
    this.subjectFaculty=subjectFaculty;
    this.subjectStudent=subjectStudent;
    this.subjectTitle=subjectTitle;

}
public int UpdateFile(){
    
    File file=new File("CourseDetailsInformation.txt");
    File temporaryfile=new File("CourseDetailsInformation1.txt");
    
     try{

       FileWriter  fileWriter=new FileWriter(temporaryfile,true);
            BufferedWriter bf=new BufferedWriter(fileWriter);
            PrintWriter printWriter=new PrintWriter(bf);
         
           //  section=jLabelCourseSection.getText().toString().trim()+" : "+jTextFiledCourseSection.getText().toString().trim();
         //subject=jLabelCourseName.getText().toString().trim()+" : "+jTextFiledCourseName.getText().toString().trim();
            
            Scanner scanner=new Scanner(file);
//Scanner scanner1=new Scanner(temporaryfile);
            LinkedList <CourseInformationSampleClassAll> arrayList=new LinkedList<CourseInformationSampleClassAll>();

            GridLayout gridLayout=new GridLayout();

            gridLayout.setColumns(1);
            gridLayout.setRows(6);

            jFrame.setLayout(gridLayout);

            while(scanner.hasNext()){

                String course=scanner.nextLine();

                //   jFrame.add(jLabelSubjectName);
               
                //            JOptionPane.showMessageDialog(null, ""+course);
                //  arrayList.add(course+"\n");
                String title=scanner.nextLine();

                // jFrame.add(jLabelSubjectTitle);
               
                //          JOptionPane.showMessageDialog(null, ""+title);
                //arrayList.add(title+"\n");
                String section1=scanner.nextLine();

                // jFrame.add(jLabelSubjectSection);
                
                //        JOptionPane.showMessageDialog(null, ""+section);
                //arrayList.add(section+"\n");
                String faculty=scanner.nextLine();

                //jFrame.add(jLabelSubjectFaculty);
                
                //      JOptionPane.showMessageDialog(null, ""+faculty);
                //arrayList.add(faculty+"\n");
                String student=scanner.nextLine();

                //jFrame.add(jLabelSubjectStudent);
                
                //    JOptionPane.showMessageDialog(null, ""+student);
                //arrayList.add(student+"\n");

                String line1=scanner.nextLine();
                //JOptionPane.showMessageDialog(null, ""+line1);

                // String line1=scanner.nextLine();
                String line2=scanner.nextLine();

   if(subject.equalsIgnoreCase(course) && section.equalsIgnoreCase(section1)){
                
       printWriter.print(course+"\n");
  printWriter.print( subjectTitle+"\n");
  printWriter.print(section1+"\n");
  printWriter.print(subjectFaculty+"\n");
  printWriter.print(subjectStudent+"\n"+"\n"+"\n");
       
   }else{
  // JOptionPane.showMessageDialog(null, "I am here");
  
  printWriter.print(course+"\n");
  printWriter.print( title+"\n");
  printWriter.print(section1+"\n");
  printWriter.print(faculty+"\n");
  printWriter.print(student+"\n"+"\n"+"\n");
  
   }
                            
                CourseInformationSampleClassAll courseInformationSampleClassAll=new CourseInformationSampleClassAll(course, title, faculty, section, student);

                arrayList.add(courseInformationSampleClassAll);

                //jFrame.add(jButtonUpdate);
                //jFrame.add(jLabel);
                //jFrame.add(jButtonDelete);

                
                //JOptionPane.showMessageDialog(null, courseInformationSampleClassAll.getCourseName()+"\n"+courseInformationSampleClassAll.getCourseTitle()+"\n"+courseInformationSampleClassAll.getCourseSection()+"\n"+courseInformationSampleClassAll.getCourseFaculty()+"\n"+courseInformationSampleClassAll.getCourseStudent()+"\n");

                // JOptionPane.showMessageDialog(null, arrayList);
            }
          scanner.close();
            printWriter.flush();
printWriter.close();
            //  JOptionPane.showMessageDialog(null, courseInformationSampleClassAll.getCourseName()+"\n"+courseInformationSampleClassAll.getCourseTitle()+"\n"+courseInformationSampleClassAll.getCourseSection()+"\n"+courseInformationSampleClassAll.getCourseFaculty()+"\n"+courseInformationSampleClassAll.getCourseStudent()+"\n");

            file.delete();
            
            File file3=new File("CourseDetailsInformation.txt");
            
            temporaryfile.renameTo(file3);
            
          return 1;  
            
        }catch(Exception exception){

            //JOptionPane.showMessageDialog(null, exception);

        }

    return 0;
}
    //DeleteDelete
public int Delete(){
    
File file=new File("CourseDetailsInformation.txt");
    File temporaryfile=new File("ffCourseDetailsInformation1.txt");
    
     try{

       FileWriter  fileWriter=new FileWriter(temporaryfile,true);
            BufferedWriter bf=new BufferedWriter(fileWriter);
            PrintWriter printWriter=new PrintWriter(bf);
         
           //  section=jLabelCourseSection.getText().toString().trim()+" : "+jTextFiledCourseSection.getText().toString().trim();
         //subject=jLabelCourseName.getText().toString().trim()+" : "+jTextFiledCourseName.getText().toString().trim();
            
            Scanner scanner=new Scanner(file);
//Scanner scanner1=new Scanner(temporaryfile);
            LinkedList <CourseInformationSampleClassAll> arrayList=new LinkedList<CourseInformationSampleClassAll>();

            GridLayout gridLayout=new GridLayout();

            gridLayout.setColumns(1);
            gridLayout.setRows(6);

            jFrame.setLayout(gridLayout);

            while(scanner.hasNext()){

                String course=scanner.nextLine();

                //   jFrame.add(jLabelSubjectName);
               
                //            JOptionPane.showMessageDialog(null, ""+course);
                //  arrayList.add(course+"\n");
                String title=scanner.nextLine();

                // jFrame.add(jLabelSubjectTitle);
               
                //          JOptionPane.showMessageDialog(null, ""+title);
                //arrayList.add(title+"\n");
                String section1=scanner.nextLine();

                // jFrame.add(jLabelSubjectSection);
                
                //        JOptionPane.showMessageDialog(null, ""+section);
                //arrayList.add(section+"\n");
                String faculty=scanner.nextLine();

                //jFrame.add(jLabelSubjectFaculty);
                
                //      JOptionPane.showMessageDialog(null, ""+faculty);
                //arrayList.add(faculty+"\n");
                String student=scanner.nextLine();

                //jFrame.add(jLabelSubjectStudent);
                
                //    JOptionPane.showMessageDialog(null, ""+student);
                //arrayList.add(student+"\n");

                String line1=scanner.nextLine();
                //JOptionPane.showMessageDialog(null, ""+line1);

                // String line1=scanner.nextLine();
                String line2=scanner.nextLine();

   if(subject.equalsIgnoreCase(course) && section.equalsIgnoreCase(section1)){
                
     //  printWriter.print(course+"\n");
  //printWriter.print( subjectTitle+"\n");
  //printWriter.print(section1+"\n");
  //printWriter.print(subjectFaculty+"\n");
  //printWriter.print(subjectStudent+"\n"+"\n"+"\n");
       
   }else{
  // JOptionPane.showMessageDialog(null, "I am here");
  
  printWriter.print(course+"\n");
  printWriter.print( title+"\n");
  printWriter.print(section1+"\n");
  printWriter.print(faculty+"\n");
  printWriter.print(student+"\n"+"\n"+"\n");
  
   }
                            
                CourseInformationSampleClassAll courseInformationSampleClassAll=new CourseInformationSampleClassAll(course, title, faculty, section, student);

                arrayList.add(courseInformationSampleClassAll);

                //jFrame.add(jButtonUpdate);
                //jFrame.add(jLabel);
                //jFrame.add(jButtonDelete);

                
                //JOptionPane.showMessageDialog(null, courseInformationSampleClassAll.getCourseName()+"\n"+courseInformationSampleClassAll.getCourseTitle()+"\n"+courseInformationSampleClassAll.getCourseSection()+"\n"+courseInformationSampleClassAll.getCourseFaculty()+"\n"+courseInformationSampleClassAll.getCourseStudent()+"\n");

                // JOptionPane.showMessageDialog(null, arrayList);
            }
          scanner.close();
            printWriter.flush();
printWriter.close();
            //  JOptionPane.showMessageDialog(null, courseInformationSampleClassAll.getCourseName()+"\n"+courseInformationSampleClassAll.getCourseTitle()+"\n"+courseInformationSampleClassAll.getCourseSection()+"\n"+courseInformationSampleClassAll.getCourseFaculty()+"\n"+courseInformationSampleClassAll.getCourseStudent()+"\n");

            file.delete();
            
            File file3=new File("CourseDetailsInformation.txt");
            
            temporaryfile.renameTo(file3);
            
          return 1;  
            
        }catch(Exception exception){

            //JOptionPane.showMessageDialog(null, exception);

        }
        
    return 0;
}

}
