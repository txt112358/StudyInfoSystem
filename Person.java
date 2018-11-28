/**
 * This class is used to record the information of a person.
 */

/**
 * @author Tang, Xintian
 *
 */
public class Person<diff extends PersonModel> {
	private String personName;// Record the name of the person
	private String personID;// Record the ID of the person
	private boolean sex;// TRUE if male, FALSE if female
	private Date birthday;// Record the birthday of the person

	/**
	 * Initialize the Person class by another Person class
	 * 
	 * @param person
	 *            The Person class to be initialized
	 */
	public Person(Person person) {
		this.setName(person.getName());
		this.setID(person.getID());
		this.setSex(person.isMale());
		this.setBirthday(person.getBirthday());
	}

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
		assert name != null : "The input name cannot be null";
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
