package Lab3.ex5;



import java.util.ArrayList;
import java.util.List;

//Clasa Course cu atributele title de tip String, description de tip String, students - array de obiecte de tip Student.
////    In clasa Course se va defini o metoda filterYear care returneaza o listă de studenți care sunt intr-un an dat ca parametru.
////    Lista de studenti returnata va fi sortata dupa numele studentului.
public class Course {

    public String title;
    public String descriere;
    public List<Student> studentlist;

    public Course(String title, String descriere, List<Student> studentlist) {
        this.title = title;
        this.descriere = descriere;
        this.studentlist = studentlist;
    }

    public List<Student> filterYear(int year){
      List<Student> list = new ArrayList<>();
       for (Student student : studentlist){
          if(student.getYear() == year){
              list.add(student);
          }
       }
         return list;
    }

}
