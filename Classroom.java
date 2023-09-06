/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;
import java.util.*;
/**
 *
 * @author nguye
 */
public class Classroom {
    private int classId;
    private int numberOfstudent;
    private List<Student> listStudents = new ArrayList<>();

public Classroom(){
    
}
public Classroom(int classId, int numberOfStudent){
    this.classId=classId;
    this.numberOfstudent=numberOfStudent;
}

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getNumberOfstudent() {
        return numberOfstudent;
    }

    public void setNumberOfstudent(int numberOfstudent) {
        this.numberOfstudent = numberOfstudent;
    }

    public List<Student> getListStudent() {
        return listStudent;
    }

    public void setListStudent(List<Student> listStudent) {
        this.listStudent = listStudent;
    }
    public void input (Scanner sc){
        System.out.print("Nhap ID lop: ");
        classId=sc.nextInt();
        System.out.print("Nhap so luong hoc sinh: ");
        numberOfstudent=sc.nextInt();
            List<Student> listStudents= new ArrayList<>();
         for (int i =0; i <  numberOfStudent; i++){
             Student st = new Student();
             st.input(sc);
             listStudent.add(st);
         }
    }
    public void output(){
        System.out.println("ID lop: "+this.classId);
        System.out.println("Si so: "+this.numberOfstudent);
        int i= 1;
        for (Student a: listStudents){
            System.out.println("Thong tin hoc sinh thu" + i + ": ");
            a.output();
            i++;
        }
    }

}

