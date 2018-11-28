/**
 * This class is used to record the information about school
 */

/**
 * @author Tang, Xintian
 *
 */
public abstract class School {
	private String schoolName;
	private String schoolID;
	//TODO add schoolLeader, schoolViceLeader[];
	
	
	/**
	 * @return The name of the school
	 */
	public String getSchoolName() {
		assert this.schoolName != null : "The name field of School cannot be null";
		return new String(this.schoolName);
	}

	/**
	 * @param schoolName
	 *            The name of the school
	 */
	public void setSchoolName(String schoolName) {
		assert schoolName != null : "The name of the School cannot be null";
		this.schoolName = schoolName;
	}

	/**
	 * @return The ID number of the school
	 */
	public String getSchoolID() {
		assert this.schoolID != null : "The ID field cannot be null";
		return new String(this.schoolID);
	}

	/**
	 * @param schoolID
	 *            The ID number of the school
	 */
	public void setSchoolID(String schoolID) {
		assert schoolID != null : "The input school ID cannot be null";
		this.schoolID = new String(schoolID);
	}
}
