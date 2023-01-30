package CSCI1010;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BrainTeaser {
	
	//private String[] = new String[2];
	private ArrayList<Pair> list = new ArrayList<Pair>();
	
	public void generateList() throws FileNotFoundException {
		//ArrayList<String> array = new ArrayList<String>();
		FileReader fr = new FileReader("myFile.txt");
		BufferedReader bw = new BufferedReader(fr);
		Scanner scan = new Scanner(bw);
		
		while(scan.hasNext()) {
			String word = scan.next();
			String shuffled = this.shuffle(word);
			Pair pair = new Pair(word, shuffled);
			list.add(pair);
		}

		scan.close();	
		
	}
	
	public void display() {
		for(Pair pair: list) {
			System.out.println(pair.getOriginal() + ", " + pair.getShuffled());
		}
	}
	
	public void createFile() throws IOException {
		Scanner input = new Scanner(System.in);
		FileWriter fw = new FileWriter("myFile.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		System.out.println("Enter your word: ");
		while(input.hasNext()) {
			String word = input.next();
			if(word.toLowerCase().equals("done"))
				break;
			pw.println(word);
			System.out.println("Enter your word: ");
		}
		System.out.print("Done");
		pw.close();	
		input.close();
	}
	
	public String shuffle(String str) {
		String result = null;
		
		char chArray[] = new char[str.length()+1];
		Random rand = new Random();
		
		for(int i = 0; i < str.length(); ) {
			int pos = rand.nextInt(str.length());
			if(chArray[pos] == 0x00) {
				chArray[pos] = str.charAt(i);
				i++;
			}
			else
				continue;
		}
		
		chArray[str.length()] = 0x00;
		result = new String(chArray);
		
		return result;
	}
}
