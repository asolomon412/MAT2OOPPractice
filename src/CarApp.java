import java.util.ArrayList;

public class CarApp {

	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<Car>();

		carList.add(new Car("Ford", "Focus", 2016, 23500.99));
		carList.add(new Car("Ford", "Fiesta", 2017, 18500.99));
		carList.add(new Car("Ford", "Ranger", 2018, 27500.99));
		carList.add(new Car("Ford", "Taurus", 2017, 38500.99));

		carList.add(new UsedCar("Ford", "Focus", 2000, 1500.99, 62500));
		carList.add(new UsedCar("Ford", "Fiesta", 1997, 500.99, 162500));
		carList.add(new UsedCar("Ford", "Ranger", 1996, 1500.99, 262500));

		for (Car c : carList) {
			System.out.println(c.toString());
		}

		// this is modifying the ford fiesta in the first list and adding the
		// charger using the arraylist get mothods and then chaining on the set
		// methods we created in the car class
		carList.get(1).setMake("Dodge");
		carList.get(1).setModel("Charger");
		carList.get(1).setYear(2017);
		carList.get(1).setPrice(42999.99);

		System.out.println();

		for (Car c : carList) {
			System.out.println(c.toString());
		}
	}

}
