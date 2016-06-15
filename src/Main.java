
public class Main {

	public static void main(String[] args) {
		Car cars []= new Car[10];		
		cars [0] = new Automobile(8000,15);
		cars [1] = new Automobile(11500,8);
		cars [2] = new Automobile(15300,11);
		cars [3] = new Automobile(18400,13);
		cars [4] = new Automobile(17000,10);
		cars [5] = new SUV(25000,true);
		cars [6] = new SUV(32000,false);
		cars [7] = new SUV(40000,true);
		cars [8] = new SUV(28000,true);
		cars [9] = new SUV(35000,false);

		for (Car c: cars) {
			c.carsPrice();
		}
	}
}