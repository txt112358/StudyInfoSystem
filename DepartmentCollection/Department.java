/**
 * 
 */
package DepartmentCollection;

/**
 * @author Tang, Xintian
 *
 */
public abstract class Department {
	private String departmentName;
	private String departmentID;

	/**
	 * @return The name of the department
	 */
	public String getName() {
		assert this.departmentName != null : "The departmaent name cannot be null";
		return new String(this.departmentName);
	}

	/**
	 * @param departmentName
	 *            the departmentName to set
	 */
	public void setName(String departmentName) {
		assert departmentName != null : "The input department name cannot be null";
		this.departmentName = new String(departmentName);
	}

	/**
	 * @return The ID number of the department
	 */
	public String getID() {
		assert this.departmentID != null : "The department ID cannot be null";
		return new String(departmentID);
	}

	/**
	 * @param departmentID
	 *            The ID number of the department
	 */
	public void setID(String departmentID) {
		assert departmentID != null : "The input department ID cannot be null";
		this.departmentID = new String(departmentID);
	}
}
