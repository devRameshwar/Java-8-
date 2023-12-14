package in.filteringAnd_Iterating;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GetingDataWithNameStart {
    //Filtering data with help of name
    public static void filterwithName(ArrayList<Students> students) {
        List<Students> collect = students.stream().filter(n -> n.stdName.startsWith("A")).collect(Collectors.toList());
        System.out.println(collect);
    }

    public static void main(String[] args) {
        ArrayList<Students> studentList = new ArrayList<>();
        studentList.add(new Students(101, "Sivi", "Java"));
        studentList.add(new Students(102, "Amala", "Python"));
        studentList.add(new Students(103, "Aditya", ".Net"));
        studentList.add(new Students(102, "Rohit", "Java"));
        filterwithName(studentList);
    }

}

class Students {
    public final Integer stdId;
    public String stdName;
    public String stdCorse;

    public Students(Integer stdId, String stdName, String stdCorse) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.stdCorse = stdCorse;
    }

    @Override
    public String toString() {
        return "stdId=" + stdId + ", stdName='" + stdName + ", stdCorse='" + stdCorse;
    }
}