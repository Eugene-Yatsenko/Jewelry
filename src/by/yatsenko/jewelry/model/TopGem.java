package by.yatsenko.jewelry.model;

public class TopGem extends RawGem {
	int edges;
	int value;
	
public TopGem() {
		this.edges = 12;
		this.value = 10;
	}

public TopGem(String type, int weight, int transparency, int value, int edges) {
	super(type, weight, transparency);
	this.edges = edges;
	this.value = value;
}

public int getValue() {
	return value;
}

public void setValue(int value) {
	this.value = value;
}

public TopGem(int edges, int value) {
		super();
		this.edges = edges;
		this.value = value;
	}

public int getEdges() {
		return edges;
	}

public void setEdges(int edges) {
		this.edges = edges;
	}

public void printGem() {
		System.out.print(this.getType() + " ");
		System.out.print("W "+this.getWeight() + " ");
		System.out.print("TR " + this.getTransparency() + " ");
		System.out.print("V" + this.getValue() + " ");
		System.out.println("E" + this.getEdges() + " ");
	}

 
}
