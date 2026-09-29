package compgroup;

public class Applicant {

	//public static ArrayList<String> applicant = new ArrayList<String>();
	
	public String firstName;
	public String lastName;
	public int age;
	public String maritalStatus;
	public int speak1;
	public int listen1;
	public int read1;
	public int write1;
	public int all2;
	public String education;
	public int workExperience;
	public boolean arrangedEmployment;
	public int adaptabilitySpouseLanguage;
	public int adaptabilitySpouseEducation;
	public int adaptabilitySpouseWork;
	public int adaptabilityYouEducation;
	public int adaptabilityYouWork;
	public int adaptabilityYouEmployment;
	public int adaptabilityRelatives;
	public int score;
	
		
   public Applicant(String firstName, String lastName, int age, String maritalStatus,
           int speak1, int listen1, int read1, int write1, int all2,
           String education, int workExperience, boolean arrangedEmployment,
           int adaptabilitySpouseLanguage, int adaptabilitySpouseEducation, int adaptabilitySpouseWork,
           int adaptabilityYouEducation, int adaptabilityYouWork, int adaptabilityYouEmployment,
           int adaptabilityRelatives) {
      
	   this.firstName = firstName;
       this.lastName = lastName;
       this.age = age;
       this.maritalStatus = maritalStatus;
       this.speak1 = speak1;
       this.listen1 = listen1;
       this.read1 = read1;
       this.write1 = write1;
       this.all2 = all2;
       this.education = education;
       this.workExperience = workExperience;
       this.arrangedEmployment = arrangedEmployment;
       this.adaptabilitySpouseLanguage = adaptabilitySpouseLanguage;
       this.adaptabilitySpouseEducation = adaptabilitySpouseEducation;
       this.adaptabilitySpouseWork = adaptabilitySpouseWork;
       this.adaptabilityYouEducation = adaptabilityYouEducation;
       this.adaptabilityYouWork = adaptabilityYouWork;
       this.adaptabilityYouEmployment = adaptabilityYouEmployment;
       this.adaptabilityRelatives = adaptabilityRelatives;
	      
       this.score = 0;
	   }

}
