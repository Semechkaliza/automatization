package by.domain;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student a=new Student();
        Group c=new Group();
        Student b=new Student();
        List<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(5);
        a.setMarks(list);
        b.setMarks(list);
        List<Student> l=new ArrayList<>();
        l.add(a);
        l.add(b);
        c.setStudents(l);
        System.out.println(c.calculateAvgMark());
    }
}