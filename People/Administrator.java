/**
 * This class is used to record the information about the administrator
 */
package People;

import Addition.Date;
import DepartmentCollection.Department;

/**
 * @author Tang, Xintian
 *
 */
public class Administrator extends Person {

	private Department department;
	// Attributes attributes = new Attributes();

	/**
	 * Initialization method to initialize the teacher
	 * 
	 * @param person
	 *            The person information to initialize the teacher
	 */
	public Administrator(Person person) {
		super(person);
	}

	/**
	 * Initialize the information of an administrator by detailed information
	 * 
	 * @param personName
	 *            The name of the administrator
	 * @param personID
	 *            The ID of the administrator
	 * @param sex
	 *            The sex of the administrator
	 * @param birthday
	 *            The birthday of the administrator
	 */
	public Administrator(String personName, String personID, boolean sex, Date birthday) {
		super(personName, personID, sex, birthday);
	}

	/**
	 * Set the school
	 * 
	 * @param school
	 *            The school
	 */
	public void setDepartment(Department department) {
		assert department != null : "The input department cannot be null";
		this.department = department;
	}

	/**
	 * Get the school of the administrator
	 * 
	 * @return The school
	 */
	public Department getDepartment() {
		assert this.department != null : "The department cannot be null";
		return this.department;
	}

}
