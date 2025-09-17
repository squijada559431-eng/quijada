package qs;

import java.util.ArrayDeque;
import java.util.Scanner;

 class Container {
	 String id;
	 String description;
	 int weight;
	 
	 public Container(String id, String description, int weight) {
		 this.id = id;
		 this.description = description;
		 this.weight = weight;
	 }
	 
	 public String toString() {
		 return "Container[id=" + ", Desc= " + description + ", Weight=" + "kg]";
		 
	 }
}
 
 class Ship {
	 String name;
	 String captain;
	 
	 public Ship(String name, String captain) {
		 this.name = name;
		 this.captain = captain;
	 }
	 
	 public String toString() {
		 return "MV" + name + " | Capt. " + captain;
		 
	 }
 }
