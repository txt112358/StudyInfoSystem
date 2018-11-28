package People;

import Addition.Date;
import SchoolCollection.School;

/**
 * This class is used to record the type of a student
 */

/**
 * @author Tang, Xintian
 *
 */
public class Student extends Person {
	private School school;
	// Attributes attributes = new Attributes();

	/**
	 * Initialize the information of a student by Person class
	 * 
	 * @param person
	 */
	public Student(Person person) {
		super(person);
	}

	/**
	 * Initialize the information of a student by detailed information
	 * 
	 * @param personName
	 *            The name of the student
	 * @param personID
	 *            The ID of the student
	 * @param sex
	 *            The sex of the student
	 * @param birthday
	 *            The birthday of the student
	 */
	public Student(String personName, String personID, boolean sex, Date birthday) {
		super(personName, personID, sex, birthday);
	}

	/**
	 * Return the type of the student
	 * 
	 * @return PersonType enum variable
	 */
	public PersonType getType() {
		return PersonType.STUDENT;
	}

	/**
	 * Set the school
	 * 
	 * @param school
	 *            The school
	 */
	public void setSchool(School school) {
		this.school = school;
	}

	/**
	 * Get the school of the student
	 * 
	 * @return The school
	 */
	public School getSchool() {
		return this.school;
	}

}
