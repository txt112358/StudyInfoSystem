/**
 * This class is used to record the course information
 */

/**
 * @author Tang, Xintian
 *
 */
public abstract class Course {
	private String courseID;
	private String courseName;
	// TODO add Teacher
	// TODO add Classroom

	/**
	 * @return The ID number of the course
	 */
	public String getCourseID() {
		return new String(this.courseID);
	}

	/**
	 * @param courseID
	 *            The ID number of the course
	 */
	public void setCourseID(String courseID) {
		this.courseID = new String(courseID);
	}

	/**
	 * @return The name of the course
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * @param courseName
	 *            The name of the course
	 */
	public void setCourseName(String courseName) {
		this.courseName = new String(courseName);
	}

}
