package Hibernet.HibernetBasics;
import javax.persistence.Entity;
import javax.persistence.Id;

	//@Entity(name = "emp_details")
	public class Emp {
		
		//@Id
		private int empId;
		private String empName;
		private double salary;
		private int age;
		
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		public Emp(int empId, String empName, double salary, int age) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.salary = salary;
			this.age = age;
		}
		public Emp() {  // default constructor is required while fetching the data from db using hibernate's get method
			super();
			// TODO Auto-generated constructor stub
		}
		

		/**
		 * hibernate configuration file -- holds database configuration stuff along with mapping file path
		 * mapping file has  -- which table which class which column which member field
		 * 
		 */

	}

