package Hotel_Management.src.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;


/**
 *
 *  @author   Jirapat Suwanjune ID: 6217410
 *  @author   Kanyarat Nalucupchanchai ID: 6115308
 *
 */





public class Main {
	public static void main(String[] args) {

		try {
			File file = new File("OOP");
			if (file.exists()) {
				FileInputStream fin = new FileInputStream(file);
				ObjectInputStream object = new ObjectInputStream(fin);

				Hotel.control= (Control) object.readObject();
			}
			Scanner sc = new Scanner(System.in);
			int choice1, choice2;
			char GO_ON;
			x: do {

    // Hotel Menu
				System.out.println("\t\t\t-----------------------------------");
				System.out.println("\t\t\t    HOTEL MANAGEMENT SYSTEM"    );
				System.out.println("\t\t\t-----------------------------------");
				System.out.println(
						"\nEnter Your Choice :" +
								"\n1.Room Information" +
								"\n2.Room Availability " +
								"\n3.Book Room" +
								"\n4.Checkout" +
								"\n5.End the program\n");



				choice1 = sc.nextInt();
				switch (choice1) {
				case 1:
					System.out.println(
							"\nEnter Room Type :" +
									"\n1.Luxury Double Bedroom " +
									"\n2.Common Double Bedroom " +
									"\n3.Luxury Single Bedroom " +
									"\n4.Common Single Bedroom \n");
					choice2 = sc.nextInt();
					Hotel.features(choice2);
					break;
				case 2:
					System.out.println(
							"\nEnter Room Type :" +
									"\n1.Luxury Double Bedroom" +
									"\n2.Common Double Bedroom" +
									"\n3.Luxury Single Bedroom" +
									"\n4.Common Single Bedroom\n");
					choice2 = sc.nextInt();
					Hotel.RoomReady(choice2);
					break;
				case 3:
					System.out.println(
							"\nChoose Room Type :" +
									"\n1.Luxury Double Bedroom" +
									"\n2.Common Double Bedroom" +
									"\n3.Luxury Single Bedroom" +
									"\n4.Common Single Bedroom\n");
					choice2 = sc.nextInt();
					Hotel.bookroom(choice2);
					break;

					case 4:
						System.out.print("Room Number");
						choice2 = sc.nextInt();
						if (choice2 > 60)
							System.out.println("Room doesn't exist");
						else if (choice2 > 40)
							Hotel.deallocate(choice2 - 41, 4); //Common Single room
						else if (choice2 > 30)
							Hotel.deallocate(choice2 - 31, 3); //Luxury Single room
						else if (choice2 > 10)
							Hotel.deallocate(choice2 - 11, 2); //Common Double room
						else if (choice2 > 0)
							Hotel.deallocate(choice2 - 1, 1);  //Luxury Double  room
						else
							System.out.println("Room doesn't exist");
						break;
				case 5:
					break x;
				default:
					System.out.println("Booked");
				}
				System.out.println("\nContinue : (y/n)");
				GO_ON = sc.next().charAt(0);

				if (!(GO_ON== 'y' || GO_ON == 'Y' || GO_ON == 'n'
						|| GO_ON == 'N')) {
					System.out.println("INVALID");
					System.out.println("\nContinue : (y/n)");
					GO_ON = sc.next().charAt(0);
				}

			} while (GO_ON == 'y' || GO_ON == 'Y');


		} catch (Exception e) {
			System.out.println("INVALID");
		}
	}
}
