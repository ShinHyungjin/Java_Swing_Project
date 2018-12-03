package halla.Shin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class StudentMap {
	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();

		studentList.add(new Student("s1", 13, "a", "b"));
		studentList.add(new Student("s1", 13, "a", "b"));   // ArrayList로 구현한 학생정보
		studentList.add(new Student("s3", 13, "a", "b"));
		studentList.add(new Student("s4", 13, "a", "b"));
		studentList.add(new Student("s5", 13, "a", "b"));
		studentList.add(new Student("s6", 13, "a", "b"));

		Iterator<Student> iter = studentList.iterator();
		while (iter.hasNext()) {
			Student s = iter.next();
			System.out.println(s);
		}

		HashMap<String, Student> studentMap = new HashMap<String, Student>();
		studentMap.put("s1", new Student("s1", 13, "a", "b"));   // HashMap으로 구현한 학생정보
	}
}