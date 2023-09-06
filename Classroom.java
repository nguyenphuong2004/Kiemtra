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
    private List<Student> listStudent = new ArrayList<>();

public Classroom(){
    
}
public Classroom(int classId, int numberOfStudent){
    this.classId=classId;
    this.numberOfstudent=numberOfStudent;
}

}

