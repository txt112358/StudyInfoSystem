/**
 * This class is used to record the information of a person.
 */

/**
 * @author Tang, Xintian
 *
 */
public abstract class Person {
	private String personName;// Record the name of the person
	private String personID;// Record the ID of the person
	private boolean sex;// TRUE if male, FALSE if female
	private Date birthday;// Record the birthday of the person

	/**
	 * @return The name of the person
	 */
	public String getName() {
		assert this.personName != null : "The name field is null";
		return new String(this.personName);
	}

	/**
	 * @param name
	 *            The name of the person
	 */
	public void setName(String name) {
		this.personName = new String(name);
	}

	/**
	 * @return The ID of the person
	 */
	public String getID() {
		assert this.personID != null : "The ID field is null";
		return new String(this.personID);
	}

	/**
	 * @param personID
	 *            The ID of the person
	 */
	public void setID(String personID) {
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
