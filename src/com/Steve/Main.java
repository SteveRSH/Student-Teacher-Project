package com.Steve;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();
        student.add(new Student("Alice", "Alison", 1, 1));
        student.add(new Student("Bob", "Roberts", 2, 1));
        student.add(new Student("Charlie", "Charles", 3, 1));
        student.add(new Student("Dave", "Davidson", 4, 1));
        student.add(new Student("Fred", "Fred", 5, 1));
        student.add(new Student("George", "Jefferson", 6, 1));
        student.add(new Student("Harry", "Winslow", 7, 1));
        student.add(new Student("Ingrid", "Ing", 8, 1));
        student.add(new Student("Jackie", "Jackson", 9, 1));
        student.add(new Student("Kate", "Jackson", 10, 1));
        student.add(new Student("Lee", "Majors", 11, 1));
        student.add(new Student("Morgan", "Freemon", 12, 1));
        student.add(new Student("Nancy", "Drew", 13, 1));
        student.add(new Student("Othello", "Brutus", 14, 1));
        student.add(new Student("Ethan", "Hawk", 15, 1));



       // Instantiate 3 Teachers just like you did for Students and add to an ArrayList of teachers.

        List<Teacher> teacher = new ArrayList<>();
        teacher.add(new Teacher("Luke", "Skywalker", 100, 1));
        teacher.add(new Teacher("Obi", "Kenobi", 500, 1));
        teacher.add(new Teacher("Minch", "Yoda", 1000, 1));

        Map<Teacher, Set<Student>> district = new HashMap<>();

        district.put(teacher.get(0), new HashSet<>());
        district.get(teacher.get(0)).add(student.get(0));
        district.get(teacher.get(0)).add(student.get(1));
        district.get(teacher.get(0)).add(student.get(2));
        district.get(teacher.get(0)).add(student.get(3));
        district.get(teacher.get(0)).add(student.get(4));

        district.put(teacher.get(1), new HashSet<>());
        district.get(teacher.get(1)).add(student.get(5));
        district.get(teacher.get(1)).add(student.get(6));
        district.get(teacher.get(1)).add(student.get(7));
        district.get(teacher.get(1)).add(student.get(8));
        district.get(teacher.get(1)).add(student.get(9));

        district.put(teacher.get(2), new HashSet<>());
        district.get(teacher.get(2)).add(student.get(10));
        district.get(teacher.get(2)).add(student.get(11));
        district.get(teacher.get(2)).add(student.get(12));
        district.get(teacher.get(2)).add(student.get(13));
        district.get(teacher.get(2)).add(student.get(14));

        //Print out the map keys in a for loop (use the keySet() method).
        // Print out the map values in a for loop (use the values() method).

        Set<Teacher> professor = district.keySet();

        for (Teacher prof: district.keySet()) {
            System.out.println(prof + " " + district.get(prof));
        }
//        for (Set<Student> pupils: district.values()) {
//            System.out.println(pupils);
//        }

    }
}


//In the main() method of Main create an ArrayList of 15 students which represents all the
// 1st grade students at an elementary school. Make sure the ids are unique and set the grade to 1. DONE


