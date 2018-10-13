package lahey.com;

public class Teacher {

    private static int idCounter = 501;
    private  String teacherName = "";

    public int getIdNumber() {
        return idNumber;
    }

    private int idNumber = 0;

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Teacher(){

        idNumber = idCounter++;

    }

    public String toString() {

        Integer retVal = new Integer(getIdNumber());

        return retVal.toString();
    }

}//end public class lahey.com.Teacher
