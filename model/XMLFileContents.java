package model;

import java.util.ArrayList;

public class XMLFileContents {

	private ArrayList<String> titles;
	private ArrayList<String> dates;
	private ArrayList<String> bodies;
	
	public ArrayList<String> getTitles() {
		return titles;
	}
	public ArrayList<String> getDates() {
		return dates;
	}
	public ArrayList<String> getBodies() {
		return bodies;
	}
	public void setTitles(ArrayList<String> titles) {
		this.titles = titles;
	}
	public void setDates(ArrayList<String> dates) {
		this.dates = dates;
	}
	public void setBodies(ArrayList<String> bodies) {
		this.bodies = bodies;
	}
	
	
	
}
