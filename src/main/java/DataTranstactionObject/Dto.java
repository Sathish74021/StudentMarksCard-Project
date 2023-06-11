package DataTranstactionObject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Student_Marks_Card")
public class Dto {
    @Id
	private int Roll_number;
    private String Name_of_the_candidate ;
    private String Date_of_birth;
    private String Father_name;
    private int Tamil;
    private int English;
    private int Mathematics;
	private int Science;
    private int Social_science;
    private int Total_marks;
    private double Percentage;
	public int getRoll_number() {
		return Roll_number;
	}
	public void setRoll_number(int roll_number) {
		Roll_number = roll_number;
	}
	public String getName_of_the_candidate() {
		return Name_of_the_candidate;
	}
	public void setName_of_the_candidate(String name_of_the_candidate) {
		Name_of_the_candidate = name_of_the_candidate;
	}
	public String getDate_of_birth() {
		return Date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth) {
		Date_of_birth = date_of_birth;
	}
	public String getFather_name() {
		return Father_name;
	}
	public void setFather_name(String father_name) {
		Father_name = father_name;
	}
	public int getTamil() {
		return Tamil;
	}
	public void setTamil(int tamil) {
		Tamil = tamil;
	}
	public int getEnglish() {
		return English;
	}
	public void setEnglish(int english) {
		English = english;
	}
	public int getMathematics() {
		return Mathematics;
	}
	public void setMathematics(int mathematics) {
		Mathematics = mathematics;
	}
	public int getScience() {
		return Science;
	}
	public void setScience(int science) {
		Science = science;
	}
	public int getSocial_science() {
		return Social_science;
	}
	public void setSocial_science(int social_science) {
		Social_science = social_science;
	}
	public int getTotal_marks() {
		return Total_marks;
	}
	public void setTotal_marks(int total_marks) {
		Total_marks = total_marks;
	}
	public double getPercentage() {
		return Percentage;
	}
	public void setPercentage(double percentage) {
		Percentage = percentage;
	}
	@Override
	public String toString() {
		return "Dto [Roll_number=" + Roll_number + ", Name_of_the_candidate=" + Name_of_the_candidate
				+ ", Date_of_birth=" + Date_of_birth + ", Father_name=" + Father_name + ", Tamil=" + Tamil
				+ ", English=" + English + ", Mathematics=" + Mathematics + ", Science=" + Science + ", Social_science="
				+ Social_science + ", Total_marks=" + Total_marks + ", Percentage=" + Percentage + "]";
	}
   
	
	
    
    
	
}
