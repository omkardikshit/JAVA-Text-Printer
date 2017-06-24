import java.io.*;
import java.util.*;
import javax.swing.*;

public class Main {
	public static void main(String args[]) throws IOException{
		
		JFileChooser chooser = new JFileChooser();
		Scanner input = null;
		
		if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
			File selectedFile = chooser.getSelectedFile();
			input  = new Scanner(selectedFile);
			
			while(input.hasNextLine()){
				String line = input.nextLine();
				System.out.println(line );
			}
			if(input.hasNextLine()){
				System.out.println("...");
			}
		}
		
	}
}
