package Hotel_Management.src.main;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 *  @author   Jirapat Suwanjune ID: 6217410
 *  @author   Kanyarat Nalucupchanchai ID: 6115308
 *
 */


public class SingleRoom implements Serializable {
	String name;
	String contact;
	String gender;


	SingleRoom() {
		this.name = "";
	}

	SingleRoom(String name, String contact, String gender) {
		this.name = name;
		this.contact = contact;
		this.gender = gender;
	}
}
