package basicDay3Assignment4;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String args[]){
        Student ref1 = new Student(23,'F',"Aditya","Namburi");
        Student student;
        student = ref1;

        student.setStudentID(34);
        student.setStudentType('D');
        student.setStudentName("Akash","Arora");

        System.out.println(student.getStudentID()+ " "+student.getStudentType()+" "+student.getStudentName());

        Student ref2 = new Student(56,'S',"John","Doe");
        student = ref2;   //after doing this ref1 stores values set by student reference and loses its old details(23,F,Aditya,Namburi).

        System.out.println(ref1.getStudentID()+ " "+ref1.getStudentType()+ " " +ref1.getStudentName());
        System.out.println(student.getStudentID()+ " "+student.getStudentType()+" "+student.getStudentName());


    }
}
