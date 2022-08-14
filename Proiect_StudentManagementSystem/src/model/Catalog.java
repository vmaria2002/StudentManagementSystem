package model;
import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<Student> studentList;
    private  List <Profesor> profesors;

    public Catalog(){
        this.profesors=new ArrayList<>();
        this.studentList=new ArrayList<>();
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Profesor> getProfesors() {
        return profesors;
    }

    public void setProfesors(List<Profesor> profesors) {
        this.profesors = profesors;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "studentList=" + studentList +
                ", profesors=" + profesors +
                '}';
    }


}
