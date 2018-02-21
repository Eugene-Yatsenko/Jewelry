package by.yatsenko.jewelry.model;

public class Neck {
	
	public static final int FramePrice = 100;
	private int gemCounter = 0;
	private int totalPrice = FramePrice;
	private int totalWeight = 0;
	private TopGem[] gems;

	public int getTotalWeight() {
		return totalWeight;
	}
	public void setTotalWeight(int totalWeight) {
		this.totalWeight = totalWeight;
	}
	
	public int getGemCounter() {
		return gemCounter;
	}
	public void setGemCounter(int gemCounter) {
		this.gemCounter = gemCounter;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public void addGem(TopGem gem) {
		if(this.gems != null) {
			if(gemCounter < this.gems.length) {
				gems[gemCounter] = gem;
				gemCounter ++ ;
				this.setTotalPrice(this.getTotalPrice()+gem.getValue());
				this.setTotalWeight(this.getTotalWeight() + gem.getWeight());
			} else {
				TopGem[] gems = new TopGem[this.gems.length +10];
				for(int i = 0; i < this.gems.length; i++) {
					gems[i] = this.gems[i];
				}
				this.gems = gems;
				this.gems[gemCounter] = gem;
				gemCounter++;
				this.setTotalPrice(this.getTotalPrice()+gem.getValue());
				this.setTotalWeight(this.getTotalWeight() + gem.getWeight());
			}
		} else {
			this.gems = new TopGem[10];
			this.gems[0] = gem;
			gemCounter ++;
			this.setTotalPrice(this.getTotalPrice()+gem.getValue());
			this.setTotalWeight(this.getTotalWeight() + gem.getWeight());
		}
		
	}
	
	public void swapGems(int a, int b) {
		TopGem tmp = new TopGem();
		tmp = this.gems[a];
		this.gems[a] = this.gems[b];
		this.gems[b] = tmp;
	}
	
	public void printAll() {
		if (gemCounter == 0) {
			System.out.println("Frame costs " + FramePrice);
			System.out.println("You have no gems in frame");
			System.out.println("----------------------------------------");
			System.out.println();
		} else {
			System.out.println("Frame costs " + FramePrice);
			System.out.println("You have following gems:");
			System.out.println();
			for(int i = 0; i < gemCounter; i++) {
				System.out.print(gems[i].getType() + " ");
				System.out.print("W " + gems[i].getWeight() + " ");
				System.out.print("TR S" + gems[i].getTransparency() + " ");
				System.out.print("V " + gems[i].getValue() + " ");
				System.out.println("E " + gems[i].getEdges());
				System.out.println("----------------------------------------");
			}
			System.out.println();
			System.out.println("Total price " + this.getTotalPrice());
			
			System.out.println();
			System.out.println("Total weight " + this.getTotalWeight());
			
			System.out.println();
		}
	}
	
	public void sortSelectionAsc() {	
		for (int min = 0; min < gemCounter - 1; min++) {
				int least = min;
				for (int j= min + 1; j < gemCounter; j++) {
					if (gems[j].getValue() < gems[least].getValue()) {
						least = j;
					}
				}
				swapGems(least, min);			
			}
		}
	
	public void findKosherGems(int low, int high) {
		
		System.out.println("Kosher gems are:");
		for(int i = 0; i < gemCounter; i++) {
			if(gems[i].checkTransparency(low, high)) {
				gems[i].printGem();
			}
			
		}
				
	}
	

	

}
