package by.domain;

import lombok.Data;

import java.util.List;

@Data
class Group {
    List<Student> students;
    Double calculateAvgMark(){
        int sum=0;
        double mark=0d;
        int count=0;
        for (Student s:this.getStudents()
                ) {
            for (Integer i:s.getMarks()
                    ) {
                count++;
                sum+=i;
            }
        }
        if(count!=0){
            mark=((double)sum)/count;
        }
        return mark;
    }
}