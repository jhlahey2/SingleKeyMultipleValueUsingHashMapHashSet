package lahey.com;

import java.util.*;

public class Main {

    public static void main(String [] args){

        Map<Teacher, HashSet<Course>> teacherCourseMap = new HashMap<Teacher, HashSet<Course>>();

        HashSet<Course> courseList = new HashSet<Course>();

        Teacher teacher01 = new Teacher();
        teacher01.setTeacherName("Bob");
        teacherCourseMap.put(teacher01, courseList);


        Teacher teacher02 = new Teacher();
        teacher01.setTeacherName("Betty");
        teacherCourseMap.put(teacher02, new HashSet());


        Course course01 = new Course();
        course01.setCourseName("Math");
        courseList.add(course01);

        Course course02 = new Course();
        course02.setCourseName("Science");
        courseList.add(course02);

        Course course03 = new Course();
        course03.setCourseName("History");
        courseList.add(course03);

        System.out.println(courseList.add(course03) + "\n");


        if( teacher01.equals(teacher01)){

            System.out.println("equals works\n");
        }

        for(Course course : courseList){

            System.out.println("lahey.com.Course ID = " + course.getIdNumber() + " lahey.com.Course Name = " + course.getCourseName());
        }
        System.out.println("\n");

        for( Map.Entry<Teacher, HashSet<Course>>  entry : teacherCourseMap.entrySet()){

            Teacher key = entry.getKey();

            Set<Course> values = entry.getValue();

            System.out.println("Key = " + key);

            System.out.println("Values = " + values);

            System.out.print("\n");

        }


        for( Map.Entry<Teacher, HashSet<Course>>  entry : teacherCourseMap.entrySet()){

            Teacher key = entry.getKey();

            Set<Course> values = entry.getValue();

            for(Course temp : values ){

                System.out.println("Key = " + key + " && Value = " + temp);

            }

            System.out.println("\n");

        }

    }//end public static void main(String [] args)


}//end public class com.lahey.lahey.com.Main
