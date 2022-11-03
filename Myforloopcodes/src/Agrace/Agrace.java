package Agrace;

import java.util.*;

public class Agrace{

	public static void main(String[] args) {
		//motivating a child to love java programming//
		String Student_name;
		String Class ;
		String Age ;
		int score = 0;
		Scanner in =  new Scanner(System.in);
		
		System.out.println("Enter Student name: ");
		Student_name = in.nextLine();
		
		if(Student_name.equals("Lucy")) {
			System.out.println("she is a  girl, " + Student_name + " is Student  name.");
			score++;
		}else {
			System.out.println("is a boy " + Student_name + " is not your Student name");
		}
		
		System.out.println("Enter Class: ");
		Class = in.nextLine();
		if(Class.equals("senior four")) {
			System.out.println("yes, " + Class + " im in senior four.");
			score++;
		}else {
			System.out.println("no " + Class + " im not in senior four");
		}
		
		System.out.println("Enter your age: ");
		Age= in.nextLine();
		if(Age.equals("18")) {
			System.out.println("Thats right, " + Age + " its my age.\"");
			score++;
		}else {
			System.out.println("It's a lie...!!!! " + Age + " its not my age");
		}
		
		System.out.print("Hei, " + Student_name + "you gat " + score + " questions right!!");
		
		
		
		

	}

}
