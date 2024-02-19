package headfirst.designpatterns.decorator.starbuzzWithSizesUpdated;

public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "House Blend Coffee";
	}
 
	public double cost() {
		return .89 * this.costAdjustmentBySize();
	}
}

