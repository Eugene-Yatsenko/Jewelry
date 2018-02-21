package by.yatsenko.jewelry.model;

public class Gem {
	private String type;
	private int weight;
	
	public Gem() {
		type = "Ruby";
		weight = 100;
	}
	
	public Gem(String type, int weight ) {
		this.type = type;
		this.weight = weight;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
}
