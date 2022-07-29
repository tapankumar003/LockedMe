package LockedMe.com;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class File_System {
	static File file;

	public static void main(String[] args) throws IOException {
		//addFile();
		//delFile();
		//SearchFile();
		//mainMenu();
		//fileList();
		System.out.println("Enter 1- for files in ascending order."
				+ "\n2- User Interface such as - add, del, serach file : ");
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		switch (select) {
		case 1:
			fileList();
			break;
		case 2:
			prevMenu();
			break;
		default:
			System.out.println("Wrong input..");
		}
		
	}
	public static void prevMenu() throws IOException {
		System.out.println("Enter option: [1.add, 2.delete, 3.search, 4.prev_menu, 5.main_menu, 6.exit] :");
		Scanner sc = new Scanner(System.in);
		int choise = sc.nextInt();
		
		switch (choise) {
		case 1:
			addFile();
			break;
		case 2:
			delFile();
			break;
		case 3:
			SearchFile();
			break;
		case 4:
			prevMenu();
			break;
		case 5:
			main(null);
			break;
		case 6:
			break;

		default:
			System.out.println("Wrong input..");
		}
		
	}
	
	public static void fileList() {
		File dir = new File("C:\\Users\\tapan\\Desktop\\LockedMe");
		String[] flist = dir.list();
		ArrayList<String> filelist = new ArrayList<String>();
		for(int i=0;i<flist.length;i++) {
			filelist.add(flist[i]);
			
		}
		if(filelist!=null) {
			Collections.sort(filelist);
			System.out.println("Sorted file List:-");
			System.out.println(filelist);
			
		}
		else {
			System.out.println("Files Not Available..");
		}
		
		
		
	}
	
	
	
	public static void addFile() throws IOException {
		System.out.println("Enter file to add:(eg. abc.txt)");
		Scanner sc= new Scanner(System.in);
		
		String f1 = sc.nextLine();
		String name = "C:\\Users\\tapan\\Desktop\\LockedMe\\"+f1;
		file = new File(name);
		
		if(file.exists()) {
			System.out.println("Already exist this file..");
		}
		else {
			file.createNewFile();
			System.out.println("File added successfully..");
		} 
	}
		
	
	
	public static void delFile() throws IOException {
		System.out.println("Enter File to delete:(eg. abc.txt)");
		Scanner sc = new Scanner(System.in);
		String f1 = sc.nextLine();
		String name = "C:\\Users\\tapan\\Desktop\\LockedMe\\"+f1;
		file = new File(name); 
		if(!file.exists()) {
			System.out.println("File Not Found..");
		}
		else {
			file.delete();
			System.out.println("File Deleted successfully..");
		}
		
		
	}
	
	public static void SearchFile() {
		File dir = new File("C:\\Users\\tapan\\Desktop\\LockedMe");
		String[] flist = dir.list();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file to search: (eg. abc.txt)");
		String name = sc.nextLine();
		for(int i=0; i<flist.length;i++) {
			String filename = flist[i];
			if(filename.equalsIgnoreCase(name)) {
				System.out.println(name+" File Found..");
				
			}
		}
		
	}
	
	
	
	

}
