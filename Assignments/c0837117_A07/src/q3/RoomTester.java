package q3;

import java.util.Scanner;

public class RoomTester {

	public static void main(String[] args) {
		
		double totalArea = 0;
		double totalPerimeter = 0;
		
		double trimCostPerMeter = 0;
		double carpetCostPerSqrMeter = 0;
		
		double totalCarpetCost = 0;
		double totalTrimCost = 0;
		double totalCost = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter the cost of carpert per square meter: $");
		carpetCostPerSqrMeter = in.nextDouble();
		
		System.out.print("Please enter the cost of wooden trim per meter: $");
		trimCostPerMeter = in.nextDouble();
		
		Room[] house = new Room[5]; //A house consists of rooms
		Room[] copyHouse = new Room[5]; //copy
		
		Circle circle1 = new Circle(0, 0, 5);
		Room cellar = new Room("Cellar", circle1);
		house[0] = cellar;
		
		Shape oval1 = new Ellipse(3, 2, 10, 5);
		Room ovalOffice = new Room("Oval Office", oval1);
		house[1] = ovalOffice;
		
		Parallelogram prlg = new Parallelogram(5, 5, 10, 3, 60, 120);
		Room bedroom = new Room("Master Bedroom", prlg);
		house[2] = bedroom;
		
		Rectangle rct = new Rectangle(7, 7 , 10, 20);
		Room kitchen = new Room("Main Floor - Kitchen", rct);
		house[3] = kitchen;
		
		Square sqr = new Square(10, 10, 6);
		Room bathroom = new Room("Bathroom", sqr);
		house[4] = bathroom;
		
		//This loop ensures our clone methods work properly
		for(int i = 0; i < house.length; i++) {
			copyHouse[i] = house[i].clone();
		}
		
		System.out.println("\n*******ROOMS********");
		for (Room rm : copyHouse) {
			totalArea += rm.getArea();
			totalPerimeter += rm.getPerimeter();
			System.out.println(rm); //calls toString()
			System.out.printf("Area: %f sqaured meters%n", rm.getArea());
			System.out.printf("Perimeter: %f meters%n", rm.getPerimeter());
			System.out.println("********************");
		}
		
		totalCarpetCost = totalArea * carpetCostPerSqrMeter;
		totalTrimCost = totalPerimeter * trimCostPerMeter;
		totalCost = totalCarpetCost + totalTrimCost;
		
		System.out.println("\n*******TOTALS*******");
		System.out.println(String.format("Carpet Required: %f squared meters", totalArea));
		System.out.println(String.format("Trim Required: %f meters", totalPerimeter));
		
		System.out.println("\n*******COST*********");
		System.out.println(String.format("Carpet Cost: $%.2f", totalCarpetCost));
		System.out.println(String.format("Trim Cost: $%.2f", totalTrimCost));
		System.out.println(String.format("Total Cost: $%.2f", totalCost));	
	}

}
