package by.yatsenko.jewelry.runner;
import by.yatsenko.jewelry.model.*;
public class Runner {

	public static void main(String[] args) {
		TopGem gem1 = new TopGem("Ruby   ", 5, 23, 200, 25);
		TopGem gem2 = new TopGem("Topaz  ", 3, 42, 150, 20);
		TopGem gem3 = new TopGem("Emerald", 6, 35, 175, 15);
		
		int low = 25;
		int high = 45;
		
		Neck neck = new Neck();
		neck.printAll();
		neck.addGem(gem1);
		neck.addGem(gem2);
		neck.addGem(gem3);
		neck.printAll();
		
		System.out.println("Neck with gems sorted by price ===>");
		System.out.println();
		
		neck.sortSelectionAsc();
		neck.printAll();
		neck.findKosherGems(low, high);

	}

}
