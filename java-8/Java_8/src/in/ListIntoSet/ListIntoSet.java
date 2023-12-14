package in.ListIntoSet;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListIntoSet {
	// Java Stream Example : Convert List into Set
	public static void listintoSet(ArrayList<Employee> employees) {
		List<Employee> collect = employees.stream().filter(n -> n.empName.startsWith("A")).collect(Collectors.toList());
		System.out.println(collect);
		// Filtering data getting only sallary in the Set form
		Set<Double> set = employees.stream().filter(s -> s.sallary < 200000).map(s -> s.sallary)
				.collect(Collectors.toSet());
		System.out.println(set);
		// getting only data sallary is 200000 in Map form
		Set<Employee> empSet = employees.stream().filter(s -> s.sallary == 200000).collect(Collectors.toSet());
		System.out.println(empSet);
		//Add all employee sallary 
		DoubleSummaryStatistics sum = employees.stream().collect(Collectors.summarizingDouble(s->s.sallary));
		System.out.println(sum.getSum());
	}

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Rameshwar", "Developer", 200000));
		empList.add(new Employee("Sivi", "Tester", 100000));
		empList.add(new Employee("Ananya", "Developer", 200000));
		empList.add(new Employee("Sonam", "HR", 150000));
		empList.add(new Employee("Abhishek", "Desiner", 200000));
		// System.out.println(empList);
		listintoSet(empList);
	}

}

//Employee class
class Employee {
	public String empName;
	public String role;
	public double sallary;

	public Employee(String empName, String role, double sallary) {
		super();
		this.empName = empName;
		this.role = role;
		this.sallary = sallary;
	}

	@Override
	public String toString() {
		return empName + "\t" + role + "\t" + sallary;
	}

}