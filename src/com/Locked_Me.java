package com;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Locked_Me {
	static String fileName = "D:\\Advance Java WorkSpace\\LockedMe.com\\MyFiles\\";
	static String dirr = "D:\\Advance Java WorkSpace\\LockedMe.com\\MyFiles";
	public static void main(String[] args) throws Exception{
		
		operation1();
	}

	public static void searchFile() {
		Scanner sc = new Scanner(System.in);
		File dir = new File(dirr);
		if(dir.exists() && dir.isDirectory()) {
			File[] files = dir.listFiles();
			System.out.println("Enter file want to search: ");
			String searchFile = sc.nextLine();
			searchFile = searchFile+".txt";
			int flag = 0;
			for(File file: files) {
				String name = file.getName();
				if(name.equalsIgnoreCase(searchFile)) {
					System.out.println("File found");
					flag =1;
				}
			}
			if(flag == 0) {
				System.out.println("file not found");
			}
		}
		
		
	}

	public static void deleteFile() {
		System.out.println("Enter File name to delete the file: ");
		Scanner sc = new Scanner(System.in);
		String delfile = sc.nextLine();
		String ddlf = fileName+delfile+".txt";
		
		File file = new File(ddlf);
		if(file.exists()) {
			if(file.delete()) {
				System.out.println("file deleted successfully.....");
			}else {
				System.out.println("Sorry, Failed to delete the file...");
			}
		}else {
			System.out.println("File doesn\'t exist.... ");
		}
		
	}

	public static void addFile() throws Exception  {
		System.out.println("Enter File Name: ");
		Scanner sc = new Scanner(System.in);
		String ab = sc.nextLine();
		String creatFile = fileName+ab+".txt";
		File file = new File(creatFile);
		if(!file.exists()) {
			file.createNewFile();
			System.out.println(ab+".txt"+"File Added successfully");
		}
		else {
			System.out.println("File Already Exist");
		}
		
		
	}

	public static void retriveFile() {
		File dir = new File(dirr);
		if(dir.exists() && dir.isDirectory()) {
			File[] files = dir.listFiles();
			System.out.print("Files::::available\n");
			for(File file: files) {
				String name = file.getName();
				System.out.print(name+", ");
				}
			
		}
		
		
		
		
	}
	
	public static void operation1() throws Exception{
    
		System.out.println("Welcome To Locked Me😉");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1-Retrive, 2-Operation on File: ");
		int option1=sc.nextInt();
		
		switch (option1) {
		case 1: {
			retriveFile();
			break;
		}
		case 2:{
			
			System.out.println("Enter 1-Add, 2-Delete, 3-Search, 4-main menu");
			int key = sc.nextInt();
			switch (key) {
			case 1: {
				addFile();
				break;
			}
			case 2:{
				deleteFile();
				break;
			}
			case 3:{
				searchFile();
				break;
			}
			case 4:{
				operation2();
				break;
			}
			default:
				System.out.println("invalid");
			}
			break;
		}
		default:
			System.out.println("invalid");
		}
		
		
		
	}
	public static void operation2() throws Exception {
		System.out.println("Welcome To Locked Me😉");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1-Retrive, 2-Operation on File: ");
		int option1=sc.nextInt();
		
		switch (option1) {
		case 1: {
			retriveFile();
			break;
		}
		case 2:{
			
			System.out.println("Enter 1-Add, 2-Delete, 3-Search, 4-main menu");
			int key = sc.nextInt();
			switch (key) {
			case 1: {
				addFile();
				break;
			}
			case 2:{
				deleteFile();
				break;
			}
			case 3:{
				searchFile();
				break;
			}
			case 4:{
				operation1();
				break;
			}
			default:
				System.out.println("invalid");
			}
			break;
		}
		default:
			System.out.println("invalid");
		}
	}

}
