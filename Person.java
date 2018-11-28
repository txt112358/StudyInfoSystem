/**
 * This class is used to record the information of a person.
 */

/**
 * @author Tang, Xintian
 *
 */
public class Person {
	private String personName;// Record the name of the person
	private String personID;// Record the ID of the person
	private boolean sex;// TRUE if male, FALSE if female
	private Date birthday;// Record the birthday of the person
	// TODO specific infomation about different type of persons

	/**
	 * Initialize the Person class by detailed information
	 * 
	 * @param personName
	 *            The name of the person
	 * @param personID
	 *            The ID number of the person
	 * @param sex
	 *            The sex of the person
	 * @param birthday
	 *            THe birthday of the person
	 */
	public Person(String personName, String personID, boolean sex, Date birthday) {
		this.setName(personName);
		this.setID(personID);
		this.setSex(sex);
		this.setBirthday(birthday);
	}

	/**
	 * Initialize the Person class by another Person class
	 * 
	 * @param person
	 *            The Person class to be initialized
	 */
	public Person(Person person) {
		assert person != null : "The input Person cannot be null";
		this.setName(person.getName());
		this.setID(person.getID());
		this.setSex(person.isMale());
		this.setBirthday(person.getBirthday());
	}

	/**
	 * @return The name of the person
	 */
	public String getName() {
		assert this.personName != null : "The name field cannot be null";
		return new String(this.personName);
	}

	/**
	 * @param name
	 *            The name of the person
	 */
	public void setName(String name) {
		assert name != null : "The input name cannot be null";
		this.personName = new String(name);
	}

	/**
	 * @return The ID of the person
	 */
	public String getID() {
		assert this.personID != null : "The ID field cannot be null";
		return new String(this.personID);
	}

	/**
	 * @param personID
	 *            The ID of the person
	 */
	public void setID(String personID) {
		assert personID != null : "The input ID cannot be null";
		this.personID = new String(personID);
	}

	/**
	 * @return The sex of the person
	 */
	public boolean isMale() {
		return this.sex;
	}

	/**
	 * @param sex
	 *            The sex of the person
	 */
	public void setSex(boolean sex) {
		this.sex = sex;
	}

	/**
	 * @return Date type birthday
	 */
	public Date getBirthday() {
		return new Date(this.birthday);
	}

	/**
	 * @param birthday
	 *            The birthday to be set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = new Date(birthday);
	}
}
