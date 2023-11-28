package in.streamApis;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringData {

	// Java Stream Example: Filtering Collection by using Stream

	// method to filtering data using stream with name start with
	public static void filtring(ArrayList<Student> stuList) {
		List<String> list = stuList.stream().filter(n -> n.stuName.startsWith("A")).map(n -> n.stuName)
				.collect(Collectors.toList());
		System.out.println(list);
		// Getting All fields Data..
		List<Student> collect = stuList.stream().filter(n -> n.stuName.startsWith("S")).collect(Collectors.toList());
		System.out.println(collect);
	}

	// method to filtering data using stream with marks..
	public static void filteringWithMarks(ArrayList<Student> list) {
		List<Integer> marksList = list.stream().filter(m -> m.marks > 70).map(m -> m.marks)
				.collect(Collectors.toList());
		System.out.println(marksList);
	}

	// method to count data using stream with cores..
	public static void filterWithCorse(ArrayList<Student> list) {
		long corselist = list.stream().filter(c -> c.corse.equalsIgnoreCase("Java")).count();
		System.out.println(corselist);
	}

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		/*
		 * list.add((Student)Stream.of(new Student(101, "Aman", "Java", 90), new
		 * Student(102, "Sonam", "Java", 70), new Student(102, "Alok", "Java", 70), new
		 * Student(102, "Sivi", "Python", 80), new Student(102, "Anurag", ".Net",
		 * 750)));
		 */
		list.add(new Student(101, "Aman", "Java", 90));
		list.add(new Student(102, "Sonam", "Java", 70));
		list.add(new Student(103, "alok", "Java", 70));
		list.add(new Student(104, "Sivi", "Python", 80));
		list.add(new Student(105, "Anurag", ".Net", 75));
		filtring(list);
		filteringWithMarks(list);
		filterWithCorse(list);

	}
}

//Student class 
class Student {
	public int stuId;
	public String stuName;
	public String corse;
	public int marks;

	public Student(int stuId, String stuName, String corse, int marks) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.corse = corse;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return stuId + "\t" + stuName + "\t" + corse + "\t" + marks;
	}

}