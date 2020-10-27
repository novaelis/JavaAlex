package Shoes;

public class RunningShoe extends Shoe {
	public final double weight;
	
	public RunningShoe(String brand, double size, double weight) {
		super(brand,size);
		this.weight = weight;
	}
}
