/**
 * This class is used to record the date
 */

/**
 * @author Tang, Xintian
 *
 */
public class Date {
	private int year;
	private int month;
	private int day;

	/**
	 * Initialize method to set the detailed information of the date
	 * 
	 * @param yyyy
	 *            The year of the date
	 * @param mm
	 *            The month of the date
	 * @param dd
	 *            The day of the date
	 */
	public Date(int yyyy, int mm, int dd) {
		this.setDay(yyyy, mm, dd);
	}

	/**
	 * Initialize the class by Date
	 * 
	 * @param date
	 *            The date to be initialized
	 */
	public Date(Date date) {
		this.setDay(date.getYear(), date.getMonth(), date.getDay());
	}

	/**
	 * This method is used to set the year, month and day of the Date
	 * 
	 * @param yyyy
	 *            The year of the date
	 * @param mm
	 *            The month of the date
	 * @param dd
	 *            The day of the date
	 */
	public void setDay(int yyyy, int mm, int dd) {
		assert DateRule.METHODS.checkDate(yyyy, mm, dd) : "The input date information has some problems";
		this.year = yyyy;
		this.month = mm;
		this.day = dd;
	}

	/**
	 * This method is used to get the year field
	 * 
	 * @return integer type year
	 */
	public int getYear() {
		return this.year;
	}

	/**
	 * This method is used to get the month field
	 * 
	 * @return integer type month
	 */
	public int getMonth() {
		return this.month;
	}

	/**
	 * This method is used to get the day field
	 * 
	 * @return integer type day
	 */
	public int getDay() {
		return this.day;
	}

}
