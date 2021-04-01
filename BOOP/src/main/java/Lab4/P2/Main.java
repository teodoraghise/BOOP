package Lab4.P2;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Profesor profesor = new Profesor("Popescu","Fizica");
        Profesor profesor2 = new Profesor("Ionescu","Chimie");
        Student student = new Student("Ana",9);
        Student student2 = new Student("Ana",9);


        System.out.println(profesor.toString());
        System.out.println(student.toString());
        System.out.println(student.equals(student2));

        Vector vector = new Vector();
        vector.add(student);
        vector.add(student2);
        vector.add(profesor);
        vector.add(profesor2);

        System.out.println(vector.toString());

    }
}
