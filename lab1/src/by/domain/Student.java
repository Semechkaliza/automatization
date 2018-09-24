package by.domain;

import lombok.Data;

import java.util.List;

@Data
public class Student {
    private String name;
    private Double avgMark;
    private List<Integer> marks;

    public Double calculateAvgMark(){
        Integer count=this.getMarks().size();
        Double mark=0d;
        if(count!=null){
            mark= ((double) this.getMarks().stream().mapToInt(i -> i).sum())/count;
        }
        return mark;
    }


}