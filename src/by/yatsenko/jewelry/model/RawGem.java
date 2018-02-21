package by.yatsenko.jewelry.model;

public class RawGem extends Gem{
	
	private int transparency;
		
	public RawGem() {
		this.transparency = 1;
	}

	public RawGem(String type, int weight, int transparency) {
		super(type, weight);
		this.transparency = transparency;
	}

	public int getTransparency() {
		return transparency;
	}

	public void setTransparency(int transparency) {
		this.transparency = transparency;
	}

	public boolean checkTransparency(int low, int high) {
		if ((low <= this.getTransparency()) && (this.getTransparency() <= high)) {
			return true;
		} else {
			return false;
		}
	}
	

}
