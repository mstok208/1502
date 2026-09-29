package compgroup;

import compgroup.Applicant; // Applicant
import java.util.Scanner;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.*;

public class assign0 {
	
	final String INPUT_DATA_FOLDER = "";  
	final String OUTPUT_DATA_FOLDER = "";
	final int SCORE_THRESHOLD = 67;
	
	public static Scanner input = new Scanner (System.in);

//🌼 MAIN	
	public static void main(String[] args) {
		
		//read the file 
		System.out.print("Please provide the name of the input file (to be located in Input Data Folder) ");
		String inputFileName = input.nextLine();
			
		System.out.print("Please provide the name of the output file (to be places in Ouput Data Folder) ");
		String outputFileName = input.nextLine();
		
		// convert list to object list
		ArrayList<Applicant> applicantList = readFile(inputFileName + "\t");
		
		applicantList = convertListToListOfApplicants(applicantList);
		
		System.out.println("\n score language skills: ");
		scoreLanguageSkills(applicantList);		
	
		System.out.println("\n score education: ");
		scoreEducation(applicantList);
		
		
		System.out.println("\n scoreWork education:" );
		scoreWorkEducation(applicantList);
		
		System.out.println("\n score age:");
		scoreAge(applicantList);
	
		System.out.println("\n score employment");
		scoreEmployment(applicantList);
		
		System.out.println("\n score adapatability");
		scoreAdaptability(applicantList);
		
		PrintQualifiedApplicants(outputFileName, applicantList);
	}
	//🌼 PRINT QUALIFIED APPLICANTS
	public static ArrayList<Applicant> convertListToListOfApplicants (ArrayList<Applicant> applicantList){
		int counter = 0;
		ArrayList<Applicant> objectApplicantList = new ArrayList<>();
		for(String[] line: applicantList) {
			if (counter > 0) {
				String firstName = line[0].trim();
				String lastName = line[1].trim();
				int age = Integer.parseInt(line[2]);
				String maritalStatus = line[3].trim();
				int speak1 = Integer.parseInt(line[4]);
				int listen1 = Integer.parseInt(line[5]);
				int read1 = Integer.parseInt(line[6]);
				int write1 = Integer.parseInt(line[7]);
				boolean all2 = convertToBoolean(line[8]);
				String education = line[9].trim();
				int workExperience = Integer.parseInt(line[10]);
				boolean arrangedEmployment = convertToBoolean(line[11]);
				boolean adaptabilitySpouseLanguage = convertToBoolean(line[12]);
				boolean adaptabilitySpouseEducation = convertToBoolean(line[13]);
				boolean adaptabilitySpouseWork = convertToBoolean(line[14]);
				boolean adaptabilityYouEducation = convertToBoolean(line[15]);
				boolean adaptabilityYouWork = convertToBoolean(line[16]);
				boolean adaptabilityYouEmployment = convertToBoolean(line[17]);
				boolean adaptabilityRelatives = convertToBoolean(line[18]);
				
				Applicant applicant = new Applicant (firstName,  lastName,  age,  maritalStatus,
						speak1,  listen1,  read1,  write1,  all2,
						education,  workExperience,  arrangedEmployment,
						adaptabilitySpouseLanguage,  adaptabilitySpouseEducation,  adaptabilitySpouseWork,
						adaptabilityYouEducation,  adaptabilityYouWork,  adaptabilityYouEmployment,
						adaptabilityRelatives);
			
				objectApplicantList.add(applicant);

			}
		counter++;
		}
		return objectApplicantList;
	}
//🌼 CONVERT TO BOOLEAN
		public static boolean convertToBoolean(String answer) {
			boolean valueBoolean = false;
			if (answer == "yes") {
				valueBoolean = true;
			}
			return valueBoolean;
		}
//🌼 SC0RE_LANGUAGE_SKILLS
public static void scoreLanguageSkills(ArrayList<Applicant> currentApplicant) {
	int languageScore = 0;
	
	if (applicant.speak1 >= 9) {
		languageScore += 6;
	}
}

//🌼 SCORE_EDUCATION
	public static void scoreEducation (ArrayList<Applicant> currenApplicant) {
			int points = 0;
			ArrayList<Applicant> objectApplicantList = new ArrayList<>();
			if (education == "Seondary School") {
				points += 5;	
			} else if (education == "One-year degree, diploma or certificate") {
				points +=15;
			} else if (education == "Two-year degree, diploma or certificate") {
				points += 19;
			} else if (education == "Bachelor's degree or other programs (three or more years)") {
				points += 21;
			} else if (education == "Two or more certificates, diplomas, or degrees") {
				points +=22;
			} else if (education == "Professional degree needed to practice in a licensed profession") {
				points += 23;
			} else if (education == "University degree at the Master's level") {
				points += 23;
			} else if (education == "University degree at the Doctoral (PhD) level") {
				points += 25;
			}
			System.out.print(applicant);
			}
//🌼 SCORE_AGE
	public static void scoreAge(ArrayList<Applicant> applicantList) {
		int score =0;
		ArrayList<Applicant> objectApplicantList = new ArrayList<>();
			for(String[] line: applicantList) {
				int age = Integer.parseInt(line[2]);
				
		for (int i=0; i < Applicant.size(); i++ ) {
			if (age < 18) {
				score += 0;
			} else if (age >= 18 && age <= 35) {
				score +=12;
			} else if (age == 36) {
				score += 11;
			} else if (age == 37) {
				score += 10;
			} else if (age == 38) {
				score += 9;
			} else if (age == 39) {
				score += 8;
			} else if (age == 40) {
				score += 7;
			} else if (age == 41) {
				score += 6;
			} else if (age == 42) {
				score += 5;
			} else if (age == 43) {
				score += 4;
			} else if (age == 44) {
				score += 3;
			} else if (age == 45) {
				score += 2;
			} else if (age == 46) {
				score += 1;
			} else if (age == 47) {
				score += 0;
			}
		}
			}
		} 
	
//🌼 SCORE_EMPLOYMENT
	public void scoreEmployment(ArrayList <applicant> applicantList) {
	//print("\nemployment")
			for (int i = 0;applicantList; i++);
		        applicant = applicantList.get(i);
		        if (applicant.get(i)== True) {
		        	 applicant.score += 10;
		        	 System.out.printf(applicant);
			        }
		}

//🌼 SCORE_ADAPTABILITY
	 public void scoreAdaptability(ArrayList <applicant> applicantList) {
	    // there are a number of factors here, however the maximum score that this
	    // place can carry is 10 points, so this is prime place for mistakes to take place
	   
	    // print("\n adaptability")
	    for (int i = 0; applicantList(); i++) {
	        applicant = applicantList.get(i);
	        int adaptabiliytScore = 0;
	        if (applicant.adaptability_spouse_language == True) {
	        	adaptabiliytScore += 5;
	           
	        } else if ( applicant.adaptabilitySpouseEducation == True) {
	        	 adaptabiliytScore += 5;
	       
	        } else if (applicant.adaptabilitySpouseWork == True) {
	            adaptabiliytScore += 5;
	       
	        } else if (applicant.adaptabilityYouEducation == True) {
	            adaptabiliytScore += 5;
	        } else if (applicant.adaptabilityYouWork == True) {
	            adaptabiliytScore += 10;
	        } else if ( applicant.adaptabilityYouEmployment == True) {
	            adaptabiliytScore += 5;
	        } else if (applicant.adaptabilityRelatives == True) {
	            adaptabiliytScore += 5;
	        } else if (adaptabiliytScore >= 10) {
	            applicant.Score += 10;
	       
	        } else {
	         applicant.score += adaptabiliytScore;
	         System.out.printf(applicant);
	        }
	    }
//🌼 CONVERT_LIST_TO_LIST_OF_APPLICANTS
	    
//🌼 SCORE_WORK_EXPERIENCE
		
	public static void scoreWorkExpirience (ArrayList<Applicant> currenApplicant) {
		for (int i = 0; workExpirience(); i++) {
		applicant = applicant.get(i);
			
		if (applicant.get(i)== 1) {
			applicant.score =+9;
		} else if (applicant.get(i) ==2 || applicant.workexpirience() ==3) {
			applicant.score =+11;
		} else if (applicant.get(i) ==4 || applicant.workexpirience() ==5) {
			applicant.score =+13;
		} else if (applicant.get(i) >5) {                                                                                                                      				} else if (applicant.get(i) ==2 || applicant.workexpirience() ==3) {
			applicant.score =+13;
		}
			
//🌼 READ_FILE
	// Source: https://www.w3schools.com/java/java_arraylist.asp
	// Source: https://www.w3schools.com/java/java_files_read.asp
	public static ArrayList<Applicant> readFile (String path) {
		ArrayList<Applicant> applicants = new ArrayList<>();
		//String name = input.nextLine();
		
		File file = new File (path);
		try(Scanner myReader = new Scanner (file)) {
			while (myReader.hasNextLine()) {
			 String data = myReader.nextLine();
		
			 }
		} catch (FileNotFoundException e) {
			System.out.println ("An error has occured");
			e.printStackTrace();
			return null;	
			}
		return applicants;
	}
		}
