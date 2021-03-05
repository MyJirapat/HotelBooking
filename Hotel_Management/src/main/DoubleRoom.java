package Hotel_Management.src.main;

import java.io.Serializable;

/**
 *
 *  @author   Jirapat Suwanjune ID: 6217410
 *  @author   Kanyarat Nalucupchanchai ID: 6115308
 *
 */


public class DoubleRoom extends SingleRoom  {
	String name2;
	String name;
	String contact2;
	String gender2;

	DoubleRoom() {
		this.name = "";
		this.name2 = "";
	}

	DoubleRoom(String name, String contact, String gender, String name2, String contact2, String gender2) {
		this.name = name;
		this.contact = contact;
		this.gender = gender;
		this.name2 = name2;
		this.contact2 = contact2;
		this.gender2 = gender2;
	}
}