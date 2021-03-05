package Hotel_Management.src.main;

import java.util.Scanner;



/**
 *
 *  @author   Jirapat Suwanjune ID: 6217410
 *  @author   Kanyarat Nalucupchanchai ID: 6115308
 *
 */


public class Hotel {
	static Control control= new Control();
	static Scanner sc = new Scanner(System.in);

	static void CustDetails(int i, int rn) {
		String name, contact, gender; 
		String name2 = null, contact2 = null ;
		String gender2 = "";
		System.out.print("\nEnter customer name: ");
		name = sc.next();
		System.out.print("Enter contact number: ");
		contact = sc.next();
		System.out.print("Enter gender: ");
		gender = sc.next();
		if (i < 3) {
			System.out.print("Enter second customer name: ");
			name2 = sc.next();
			System.out.print("Enter contact number: ");
			contact2 = sc.next();
			System.out.print("Enter gender: ");
			gender2 = sc.next();
		}

		switch (i) {
		case 1:
			control.arr1[rn] = new DoubleRoom(name, contact, gender, name2, contact2, gender2);
			break;
		case 2:
			control.arr2[rn] = new DoubleRoom(name, contact, gender, name2, contact2, gender2);
			break;
		case 3:
			control.arr3[rn] = new SingleRoom(name, contact, gender);
			break;
		case 4:
			control.arr4[rn] = new SingleRoom(name, contact, gender);
			break;
		default:
			System.out.println("Wrong option you have to select again");
			break;
		}
	}

	static void bookroom(int i) {
		int j;
		int rn;
		System.out.println("\nChoose room number from : ");
		switch (i) {
		case 1:
			for (j = 0; j < control.arr1.length; j++) {
				if (control.arr1[j] == null) {
					System.out.print(j + 1 + ",");
				}
			}
			System.out.print("\nEnter room number: ");
			try {
				rn = sc.nextInt();
				rn--;
				if (control.arr1[rn] != null)
					throw new NotAvailable();
				CustDetails(i, rn);
			} catch (Exception e) {
				System.out.println("Invalid Option");
				return;
			}
			break;



		case 2:
			for (j = 0; j < control.arr2.length; j++) {
				if (control.arr2[j] == null) {
					System.out.print(j + 11 + ",");
				}
			}
			System.out.print("\nEnter room number: ");
			try {
				rn = sc.nextInt();
				rn = rn - 11;
				if (control.arr2[rn] != null)
					throw new NotAvailable();
				CustDetails(i, rn);
			} catch (Exception e) {
				System.out.println("Invalid Option");
				return;
			}
			break;



		case 3:
			for (j = 0; j < control.arr3.length; j++) {
				if (control.arr3[j] == null) {
					System.out.print(j + 31 + ",");
				}
			}
			System.out.print("\nEnter room number: ");
			try {
				rn = sc.nextInt();
				rn = rn - 31;
				if (control.arr3[rn] != null)
					throw new NotAvailable();
				CustDetails(i, rn);
			} catch (Exception e) {
				System.out.println("Invalid Option");
				return;
			}
			break;




		case 4:
			for (j = 0; j < control.arr4.length; j++) {
				if (control.arr4[j] == null) {
					System.out.print(j + 41 + ",");
				}
			}
			System.out.print("\nEnter room number: ");
			try {
				rn = sc.nextInt();
				rn = rn - 41;
				if (control.arr4[rn] != null)
					throw new NotAvailable();
				CustDetails(i, rn);
			} catch (Exception e) {
				System.out.println("Invalid Option");
				return;
			}
			break;
		default:
			System.out.println("Enter valid option");
			break;
		}
		System.out.println("Room Booked");
	}

	static void features(int i) {
		switch (i) {
		case 1:
			System.out.println("Double beds : 1\nFree breakfast : Yes\nCharge per day:4500 Baht");
			break;
		case 2:
			System.out.println("Double beds : 1 \nFree breakfast : Yes\nCharge per day:3000 Baht ");
			break;
		case 3:
			System.out.println(" Single beds : 1\nFree breakfast : Yes\nCharge per day:2200 Baht  ");
			break;
		case 4:
			System.out.println(" Single beds : 1\nFree breakfast : Yes\nCharge per day:1200 Baht");
			break;
		default:
			System.out.println("Enter valid option");
			break;
		}
	}

	static void RoomReady(int i) {
		int num, cnt = 0;
		switch (i) {
		case 1:
			for (num = 0; num < 10; num++) {
				if (control.arr1[num] == null)
					cnt++;
			}
			break;
		case 2:
			for (num = 0; num < control.arr2.length; num++) {
				if (control.arr2[num] == null)
					cnt++;
			}
			break;
		case 3:
			for (num = 0; num < control.arr3.length; num++) {
				if (control.arr3[num] == null)
					cnt++;
			}
			break;
		case 4:
			for (num = 0; num < control.arr4.length; num++) {
				if (control.arr4[num] == null)
					cnt++;
			}
			break;
		default:
			System.out.println("Enter valid option");
			break;
		}
		System.out.println("Number of rooms available : " + cnt);
	}


	static void deallocate(int roomnumr, int roomtype) {
		int j;
		char confirm;

		switch (roomtype) {
		case 1:
			if (control.arr1[roomnumr] != null)
				System.out.println("Room used by " + control.arr1[roomnumr].name);
			else {
				System.out.println("Empty Already");
				return;
			}
			System.out.println("Do you want to checkout ?(y/n)");
			confirm = sc.next().charAt(0);
			if (confirm == 'y' || confirm == 'Y') {

				control.arr1[roomnumr] = null;
				System.out.println("Deal was Succesfull");
			}

			break;
		case 2:
			if (control.arr2[roomnumr] != null)
				System.out.println("Room used by " + control.arr2[roomnumr].name);
			else {
				System.out.println("Empty Already");
				return;
			}
			System.out.println(" Do you want to checkout ?(y/n)");
			confirm = sc.next().charAt(0);
			if (confirm == 'y' || confirm == 'Y') {

				control.arr2[roomnumr] = null;
				System.out.println("Deal was Succesfull");
			}

			break;
		case 3:
			if (control.arr3[roomnumr] != null)
				System.out.println("Room used by " + control.arr3[roomnumr].name);
			else {
				System.out.println("Empty Already");
				return;
			}
			System.out.println(" Do you want to checkout ? (y/n)");
			confirm = sc.next().charAt(0);
			if (confirm == 'y' || confirm == 'Y') {

				control.arr3[roomnumr] = null;
				System.out.println("Deal was Succesfull");
			}

			break;
		case 4:
			if (control.arr4[roomnumr] != null)
				System.out.println("Room used by " + control.arr4[roomnumr].name);
			else {
				System.out.println("Empty Already");
				return;
			}
			System.out.println(" Do you want to checkout ? (y/n)");
			confirm = sc.next().charAt(0);
			if (confirm == 'y' || confirm == 'Y') {

				control.arr4[roomnumr] = null;
				System.out.println("Deal was Succesfull");
			}
			break;
		default:
			System.out.println("\nEnter valid option : ");
			break;
		}
	}

	}

