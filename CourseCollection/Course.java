package CourseCollection;
/**
 * This class is used to record the course information
 */

import People.Teacher;

/**
 * @author Tang, Xintian
 *
 */
public class Course {
	private String courseID;
	private String courseName;
	private Teacher teacher;
	// TODO add Classroom

	/**
	 * @return The ID number of the course
	 */
	public String getCourseID() {
		assert this.courseID != null : "This course ID cannot be null";
		return new String(this.courseID);
	}

	/**
	 * @param courseID
	 *            The ID number of the course
	 */
	public void setCourseID(String courseID) {
		assert courseID != null : "The input course ID cannot be null";
		this.courseID = new String(courseID);
	}

	/**
	 * @return The name of the course
	 */
	public String getCourseName() {
		assert this.courseName != null : "The course name cannot be null";
		return new String(courseName);
	}

	/**
	 * @param courseName
	 *            The name of the course
	 */
	public void setCourseName(String courseName) {
		assert courseName != null : "The input course name cannot be null";
		this.courseName = new String(courseName);
	}

	/**
	 * @return The teacher of this course
	 */
	public Teacher getTeacher() {
		assert this.teacher != null : "The teacher cannot be null";
		return new Teacher(this.teacher);
	}

	/**
	 * @param teacher
	 *            The teacher of this course
	 */
	public void setTeacher(Teacher teacher) {
		assert teacher != null : "The input teacher cannot be null";
		this.teacher = teacher;
	}

}
