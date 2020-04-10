import java.util.ArrayList;

public class Student {
	String index;
	String firstName;
	String lastName;
	ArrayList<Integer> grades;

	//TODO constructor
	public Student(String index, String firstName, String lastName, ArrayList<Integer> grades) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grades =  grades;
	}

	//TODO seters & getters
	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public ArrayList<Integer> getGrades() {
		return grades;
	}

	public void setGrades(ArrayList<Integer> grades) {
		this.grades =  grades;
	}

	public double getAverage() {
		//TODO
		double vkupno=0.0;
		for (int grade:grades)
		{
			vkupno+=grade;
		}
		return vkupno/ grades.size();
	}

	public int ECTSCredits() {
		//TODO
		int predmeti =0;
		for(int grade: grades)
		{
			if (grade>5 && grade<=10)
			{
				predmeti+=1;
			}
		}
		return predmeti*6;
	}
}
