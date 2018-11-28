/**
 * This class is used to record the information about teacher
 */
package People;

import Addition.Date;
import SchoolCollection.School;

/**
 * @author Tang, Xintian
 *
 */
public class Teacher extends Person {
	private School school;
	// Attributes attributes = new Attributes();

	/**
	 * Initialization method to initialize the teacher
	 * 
	 * @param person
	 *            The person information to initialize the teacher
	 */
	public Teacher(Person person) {
		super(person);
	}

	/**
	 * Initialize the information of a teacher by detailed information
	 * 
	 * @param personName
	 *            The name of the teacher
	 * @param personID
	 *            The ID of the teacher
	 * @param sex
	 *            The sex of the teacher
	 * @param birthday
	 *            The birthday of the teacher
	 */
	public Teacher(String personName, String personID, boolean sex, Date birthday) {
		super(personName, personID, sex, birthday);
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
	 * Get the school of the teacher
	 * 
	 * @return The school
	 */
	public School getSchool() {
		return this.school;
	}

}
