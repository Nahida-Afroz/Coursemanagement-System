
package coursemanagementsystem;

//coursename,coursetitle,coursefcaulty,coursesection,coursestudent
public class CourseInformationSampleClassAll {
    
    String CourseName,CourseTitle,CourseFaculty,CourseSection,CourseStudent;

    public CourseInformationSampleClassAll(){
        
        
    }
    
    
    public CourseInformationSampleClassAll(String CourseName, String CourseTitle, String CourseFaculty, String CourseSection, String CourseStudent) {
        this.CourseName = CourseName+"\n";
        this.CourseTitle = CourseTitle+"\n";
        this.CourseFaculty = CourseFaculty+"\n";
        this.CourseSection = CourseSection+"\n";
        this.CourseStudent = CourseStudent+"\n";
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public String getCourseTitle() {
        return CourseTitle;
    }

    public void setCourseTitle(String CourseTitle) {
        this.CourseTitle = CourseTitle;
    }

    public String getCourseFaculty() {
        return CourseFaculty;
    }

    public void setCourseFaculty(String CourseFaculty) {
        this.CourseFaculty = CourseFaculty;
    }

    public String getCourseSection() {
        return CourseSection;
    }

    public void setCourseSection(String CourseSection) {
        this.CourseSection = CourseSection;
    }

    public String getCourseStudent() {
        return CourseStudent;
    }

    public void setCourseStudent(String CourseStudent) {
        this.CourseStudent = CourseStudent;
    }

    @Override
    public String toString(){
    
    return this.CourseName+"   "+this.CourseSection+"   "+this.CourseTitle+"   "+"   "+this.CourseFaculty+"   "+this.CourseStudent;
    
}

    
}
