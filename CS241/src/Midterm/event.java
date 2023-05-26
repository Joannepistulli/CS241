package Midterm;

public class event {
	
	public String name;
	public int minutes;
	public event next;
	public event prev;
	  
	public event(String name, int minutes) { 
	this.name = name;
	this.minutes = minutes;
	
	}
}
