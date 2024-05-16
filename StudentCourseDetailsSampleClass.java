package coursemanagementsystem;

public class StudentCourseDetailsSampleClass {

 String student; String email;  String emailpassword;  String chossenSubject;  String chossenSubjectTitle;  String chossenSubjectSection;    

    public StudentCourseDetailsSampleClass(String student,  String email,  String emailpassword,  String chossenSubject,  String chossenSubjectTitle,  String chossenSubjectSection) {
   
 this.student=student;
 this.email=email;
 this.emailpassword=emailpassword;
 this.chossenSubject=chossenSubject;
 this.chossenSubjectTitle=chossenSubjectTitle;
 this.chossenSubjectSection=chossenSubjectSection;
    
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailpassword() {
        return emailpassword;
    }

    public void setEmailpassword(String emailpassword) {
        this.emailpassword = emailpassword;
    }

    public String getChossenSubject() {
        return chossenSubject;
    }

    public void setChossenSubject(String chossenSubject) {
        this.chossenSubject = chossenSubject;
    }

    public String getChossenSubjectTitle() {
        return chossenSubjectTitle;
    }

    public void setChossenSubjectTitle(String chossenSubjectTitle) {
        this.chossenSubjectTitle = chossenSubjectTitle;
    }

    public String getChossenSubjectSection() {
        return chossenSubjectSection;
    }

    public void setChossenSubjectSection(String chossenSubjectSection) {
        this.chossenSubjectSection = chossenSubjectSection;
    }

   public String toString(){
       
       return this.student+"   "+this.email+"    "+this.emailpassword+"    "+this.chossenSubject+"   "+this.chossenSubjectTitle+"   "+this.chossenSubjectSection+"   ";
       
   }
        
}
