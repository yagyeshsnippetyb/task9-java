import java.util.*;

public class StudentApp {

    public static void main(String[] args) {

        // 1. Store students in ArrayList
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Aman", 85));
        students.add(new Student(102, "Riya", 92));
        students.add(new Student(103, "Aman", 85)); // duplicate
        students.add(new Student(104, "Neha", 78));

        // 2. Remove duplicates using Set
        Set<Student> uniqueStudents = new HashSet<>(students);

        // 3. Fast lookup using HashMap
        Map<Integer, Student> studentMap = new HashMap<>();
        for (Student s : uniqueStudents) {
            studentMap.put(s.getId(), s);
        }

        // 4. Sorting using Comparator
        List<Student> sortedList = new ArrayList<>(uniqueStudents);
        sortedList.sort(new StudentComparator());

        // 5. Enhanced for loop + formatted report
        System.out.println("\n----- STUDENT REPORT -----");
        for (Student s : sortedList) {
            System.out.println(s);
        }

        // 6. Lookup demo
        System.out.println("\nStudent with ID 102:");
        System.out.println(studentMap.get(102));
    }
}
