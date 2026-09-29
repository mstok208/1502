import os

# from filename import Classname
from applicant import Applicant

INPUT_DATA_FOLDER = "data/input/"
OUTPUT_DATA_FOLDER = "data/output/"
SCORE_THRESHOLD = 67

def main() -> None:
    # create object of class
    #apoorve = Applicant("Apoorve", "Chokshi", 60, "Married", 6, 9, 9, 8, True, 
    #                    "Professional degree needed to practice in a licensed profession", 0, True, True, False, False, True, False, False, True)

    # call class method
    #print(f"{apoorve=}")

    # read the file
    input_filename = input(f"Please provide the name of the input file (to be located in {INPUT_DATA_FOLDER}): ")
    output_filename = input(f"Please provide the name of the output file (to be placed in {OUTPUT_DATA_FOLDER}): ")

    applicant_list = read_file(input_filename, "\t")

    ########################################################### code stub to students ends here....

    # convert list to object list
    applicant_list = convert_list_to_list_of_applicants(applicant_list)
    # print(f"{applicant_list=}")

    ########################################################### or, code stub to students ends here...

    # score language skills
    # print("\nscore language skills:")
    score_language_skills(applicant_list)
    
    # score education
    # print("\nscore education:")
    score_education(applicant_list)

    # score work experience
    # print("\nscore work experience:")    
    score_work_experience(applicant_list)

    # score age
    # print("\nscore age:")
    score_age(applicant_list)

    # score employment
    # print("\nscore employment:")
    score_employment(applicant_list)

    # score adapdability
    # print("\nscore adaptability:")
    score_adaptability(applicant_list)

    # print the list of people who made the cut
    print_qualified_applicants(output_filename, applicant_list)

def print_qualified_applicants(filename: str, applicant_list: list) -> None:
    """
    This function will take the name of the file, writes to that file

    Attribute
        - filename: the name of the file (i.e. qualified_applicants.txt) that the programmer wants to write to.
        The assumption is that the file will be placed within a specified folder DATA_FOLDER
    """
    # build the file path

    # 1. get the location of the current file
    absolute_path = os.path.dirname(__file__)
    
    # 2. indicate the relative folder path and file we are trying to work with
    relative_path = OUTPUT_DATA_FOLDER  + filename

    # 3. create the full path
    full_path = os.path.join(absolute_path, relative_path)
    #print(f"results to be found in: {full_path}")

    qualified_applicants = 0
    with open(full_path, "w") as output_file:
        print(f"First Name          |Last Name           |  Age|Score", file=output_file)
        print(f"--------------------+--------------------+-----+-----", file=output_file)

        for applicant in applicant_list:
            if applicant.score >= SCORE_THRESHOLD:
                print(f"{applicant}", file=output_file)
                qualified_applicants += 1
    
    print(f"\nThere were {qualified_applicants} qualified applicants")

def convert_to_boolean(answer: str) -> bool:
    """
    """
    value_boolean = False
    if answer == "yes":
        value_boolean = True
    
    return value_boolean

def score_language_skills(applicant_list: list) -> None:
    """
    """
    # print("\nscore_language_skills")
    for i in range(len(applicant_list)):
        applicant = applicant_list[i]
        language_score = 0

        # speaking
        if applicant.speak_1 == 7:
            language_score += 4
        elif applicant.speak_1 == 8:
            language_score += 5
        elif applicant.speak_1 >= 9:
            language_score += 6

        # listening
        if applicant.listen_1 == 7:
            language_score += 4
        elif applicant.listen_1 == 8:
            language_score += 5
        elif applicant.listen_1 >= 9:
            language_score += 6

        # reading
        if applicant.read_1 == 7:
            language_score += 4
        elif applicant.read_1 == 8:
            language_score += 5
        elif applicant.read_1 >= 9:
            language_score += 6

        # writing
        if applicant.write_1 == 7:
            language_score += 4
        elif applicant.write_1 == 8:
            language_score += 5
        elif applicant.write_1 >= 9:
            language_score += 6

        # secondary language
        if applicant.all_2 == True:
            language_score += 4
        else:
            language_score += 0

        applicant.score += language_score

        #print(f"{applicant}")


def score_education(applicant_list: list) -> None:
    """
    """
    #print("\nscore_education")
    for i in range(len(applicant_list)):
        applicant = applicant_list[i]

        if applicant.education == "Secondary school (high school diploma)":
            applicant.score += 5

        elif applicant.education == "One-year degree, diploma or certificate":
            applicant.score += 15

        elif applicant.education == "Two-year degree, diploma or certificate":
            applicant.score += 19

        elif applicant.education == "Bachelor's degree or other programs (three or more years)":
            applicant.score += 21

        elif applicant.education == "Two or more certificates, diplomas, or degrees":
            applicant.score += 22

        elif applicant.education == "Professional degree needed to practice in a licensed profession":
            applicant.score += 23

        elif applicant.education == "University degree at the Master's level":
            applicant.score += 23

        elif applicant.education == "University degree at the Doctoral (PhD) level":
            applicant.score += 25

        #print(f"{applicant}")


def score_work_experience(applicant_list: list) -> None:
    """
    """
    #print("\nwork_experience")
    for i in range(len(applicant_list)):
        applicant = applicant_list[i]

        if applicant.work_experience == 1:
            applicant.score += 9

        elif applicant.work_experience == 2 or applicant.work_experience == 3:
            applicant.score += 11

        elif applicant.work_experience == 4 or applicant.work_experience == 5:
            applicant.score += 13

        elif applicant.work_experience >5:
            applicant.score += 15

        #print(f"{applicant}")


def score_age(applicant_list: list) -> None:
    """
    """
    #print("\nage")
    for i in range(len(applicant_list)):
        applicant = applicant_list[i]

        if applicant.age < 18:
            applicant.score += 0

        elif applicant.age >= 18 and applicant.age <= 35:
            applicant.score += 12

        elif applicant.age == 36:
            applicant.score += 11

        elif applicant.age == 37:
            applicant.score += 10

        elif applicant.age == 38:
            applicant.score += 9

        elif applicant.age == 39:
            applicant.score += 8

        elif applicant.age == 40:
            applicant.score += 7

        elif applicant.age == 41:
            applicant.score += 6

        elif applicant.age == 42:
            applicant.score += 5

        elif applicant.age == 43:
            applicant.score += 4

        elif applicant.age == 44:
            applicant.score += 3

        elif applicant.age == 45:
            applicant.score += 2

        elif applicant.age == 46:
            applicant.score += 1

        elif applicant.age >= 47:
            applicant.score += 0

     #   print(f"{applicant}")



def score_employment(applicant_list: list) -> None:
    """
    """
    #print("\nemployment")
    for i in range(len(applicant_list)):
        applicant = applicant_list[i]

        if applicant.arranged_employment == True:
            applicant.score += 10

     #   print(f"{applicant}")


def score_adaptability(applicant_list: list) -> None:
    """
    there are a number of factors here, however the maximum score that this
    place can carry is 10 points, so this is prime place for mistakes to take place
    """
    #print("\nadaptability")
    for i in range(len(applicant_list)):
        applicant = applicant_list[i]

        adaptabiliyt_score = 0

        if applicant.adaptability_spouse_language == True:
            adaptabiliyt_score += 5
            
        if applicant.adaptability_spouse_education == True:
            adaptabiliyt_score += 5
            
        if applicant.adaptability_spouse_work == True:
            adaptabiliyt_score += 5

        if applicant.adaptability_you_education == True:
            adaptabiliyt_score += 5

        if applicant.adaptability_you_work == True:
            adaptabiliyt_score += 10

        if applicant.adaptability_you_employment == True:
            adaptabiliyt_score += 5

        if applicant.adaptability_relatives == True:
            adaptabiliyt_score += 5

        if adaptabiliyt_score >= 10:
            applicant.score += 10
        else:
            applicant.score += adaptabiliyt_score

     #   print(f"{applicant}")

def convert_list_to_list_of_applicants(applicant_list: list) -> list:
    """
    """
    counter = 0
    object_applicant_list = []
    for line in applicant_list :
        #
        # build a list of applicant objects
        #
        if counter > 0:

            first_name = str(line[0]).strip()
            last_name = str(line[1]).strip()
            age = int(line[2])
            marital_status = str(line[3]).strip()
            speak_1	= int(line[4])
            listen_1 = int(line[5])
            read_1 = int(line[6])
            write_1 = int(line[7])
            all_2 = convert_to_boolean(line[8])

            education = str(line[9]).strip()
            work_experience = int(line[10])

            arranged_employment = convert_to_boolean(line[11])
            adaptability_spouse_language = convert_to_boolean(line[12])	
            adaptability_spouse_education = convert_to_boolean(line[13])
            adaptability_spouse_work = convert_to_boolean(line[14])
            adaptability_you_education = convert_to_boolean(line[15])
            adaptability_you_work = convert_to_boolean(line[16])
            adaptability_you_employment = convert_to_boolean(line[17])
            adaptability_relatives = convert_to_boolean(line[18])

            applicant = Applicant(
                first_name, last_name, age, marital_status,
                speak_1, listen_1, read_1, write_1, all_2, 
                education, work_experience, arranged_employment, 
                adaptability_spouse_language, adaptability_spouse_education, adaptability_spouse_work,   
                adaptability_you_education, adaptability_you_work, adaptability_you_employment, adaptability_relatives 
            )

            object_applicant_list.append(applicant)

        counter += 1

    return object_applicant_list


def read_file(filename: str, delimeter: str) -> list:
    """
    This function will take the name of the file, read that file line by line, and then return the file as a list of strings

    Attribute
        - filename: the name of the file (i.e. dataset-10.txt) that the programmer wants to read. The assumption is that the filename is found within
        a specified folder DATA_FOLDER

        - delimeter: the delimeter that was used in the datafile to separate the different columns of data
    """
    # build the file path

    # 1. get the location of the current file
    absolute_path = os.path.dirname(__file__)
    
    # 2. indicate the relative folder path and file we are trying to work with
    relative_path = INPUT_DATA_FOLDER  + filename

    # 3. create the full path
    full_path = os.path.join(absolute_path, relative_path)
    # print(f"{full_path=}")
    
    lines_list = []
    #
    # one line at-a-time reading file
    #
    with open(full_path, 'r') as reader:
    # Read and print the entire file line by line
        line = reader.readline()
        while line != '':  # The EOF char is an empty string
            line = line.strip().split(delimeter)
            lines_list.append(line)

            # get the next line
            line = reader.readline()
    reader.close()

    return lines_list


main()