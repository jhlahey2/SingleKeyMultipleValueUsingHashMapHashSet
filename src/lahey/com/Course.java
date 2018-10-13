package lahey.com;

public class Course {

    private static  int idCounter = 3001;
    private int idNumber = 100;

    public int getIdNumber() {
        return idNumber;
    }


    public Course() {

        idNumber = idCounter;
        idCounter++;

    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    private String courseName = "";

    public String toString() {

        Integer retVal = new Integer(getIdNumber());

        return retVal.toString();
    }

}

