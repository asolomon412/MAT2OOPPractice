
public class UsedCar extends Car {
	private double mileage;

	// constructor #1
	public UsedCar() {
		super();
		// TODO Auto-generated constructor stub
	}

	// constructor #2
	public UsedCar(String make, String model, int year, double price) {
		super(make, model, year, price);
		// TODO Auto-generated constructor stub
	}
	// constructor #3
	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Used Car: " + super.toString() + "\t" + mileage;
	}

}
