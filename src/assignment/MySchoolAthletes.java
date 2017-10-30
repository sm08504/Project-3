package assignment;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.lang.StringBuilder;

public class MySchoolAthletes {

	public static void main(String[] args) throws IOException {
		MySchoolAthletes gsu = new MySchoolAthletes();
		gsu.readFromFile("WarnerBrosUStudentAthletes.txt");
		gsu.displayTop5SoccerGoalsScoredPercentage();
		gsu.displayNamesOfTwoSportsAthletesByGender();
		gsu.writeToFile("test.txt");

	}
	
	public int readFromFile(String file) throws IOException {
		if (new File(file) != null) {
		BufferedReader br = Files.newBufferedReader(Paths.get(file));
		String line = br.readLine();
		while (line != null) {
			System.out.println(line);
			}
		}
	return 0;
	}
	
	public int writeToFile(String fileName, String textToAdd) throws IOException {
		File f = new File("src/" + fileName + ".txt");
		if (!f.exists()) {
		BufferedWriter bw = Files.newBufferedWriter(Paths.get(fileName), StandardOpenOption.CREATE);
		bw.write(textToAdd);
		bw.close();
		return 1;
		}
		else {
			BufferedWriter bw = Files.newBufferedWriter(Paths.get(fileName), StandardOpenOption.APPEND);
			bw.write(textToAdd);
			bw.close();
			return 1;
		}
	}

	public void displayTop5SoccerGoalsScoredPercentage() {
		
	}
	
	public boolean createPlayer(String player) {
		String fName = "																												";
		String lName = "																												";
		String eagleID = "																												";
		int position = 0;
		for (int i = 0; i < player.length()-1; i++) {
			if (player.charAt(i) != ' ') {
				fName.replace(' ', player.charAt(i));
			}
			else {
				position = i;
				break;
			}
			
			
		}
		return true;
	}
	
	public void displayNamesOfTwoSportsAthletesByGender() {
		
	}
	
}
