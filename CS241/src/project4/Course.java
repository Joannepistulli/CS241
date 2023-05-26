package project4;

//Course Class (25%)
public class Course implements Comparable<Course>{
	  public String program = "";
	  public String program_number = "";
	  public String program_name = "";
	  public String full_program_name = "";
	  
public Course(String program, String program_number, String program_name){
	  this.program = program;
	  this.program_number = program_number;
	  this.program_name = program_name;
	  this.full_program_name = program + program_number + program_name;
	  }

	  public String toString(){
	    return full_program_name;
	  }

	  public int compareTo(Course other){
	    return full_program_name.compareTo(other.full_program_name);
	  }
	}
