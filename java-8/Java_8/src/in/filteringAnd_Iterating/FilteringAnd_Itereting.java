package in.filteringAnd_Iterating;

import java.util.*;
import java.util.stream.Collectors;

public class FilteringAnd_Itereting {

	// Java Stream Example: Filtering and Iterating Collection
	// method to filtering data & Iterating data of Employee with help of name start
	// with a....
	public static void filterAndIterating1(ArrayList<Employee> list) {
		// Collecting data with iterating
		list.stream().filter(n -> n.empName.startsWith("A")).forEach(emp -> System.out.println(emp));
		// collecting data without iterating
		List<Employee> list2 = list.stream().filter(n -> n.empName.endsWith("vi")).collect(Collectors.toList());
		System.out.println(list2);

		// collecting & iterating data only name
		list.stream().filter(n -> n.empName.startsWith("A")).map(n -> n.empName)
				.forEach(emp -> System.out.println(emp));

	}

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(101, "Aman", "Java Developer", 193800));
		list.add(new Employee(102, "Anurag", "Python Developer", 100000));
		list.add(new Employee(103, "sivi", "Java Developer", 200000));
		list.add(new Employee(104, "Laden", "Python Developer", 293800));
		list.add(new Employee(105, "Kamala", "Java Developer", 200800));
		filterAndIterating1(list);
	}
}

//Employee class 
class Employee {
	public int empId;
	public String empName;
	public String degi;
	public double sallary;

	public Employee(int empId, String empName, String degi, double sallary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.degi = degi;
		this.sallary = sallary;
	}

	@Override
	public String toString() {
		return empId + "\t" + empName + "\t" + degi + "\t" + sallary;
	}

}
