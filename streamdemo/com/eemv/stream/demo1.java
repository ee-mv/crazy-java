package com.eemv.stream;

import stream.entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Administrator
 */
public class demo1 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "a", 11,"male"));
        list.add(new Student(2, "b", 12,"famale"));
        list.add(new Student(3, "c", 13,"male"));
        list.add(new Student(4, "d", 14,"male"));
        list.add(new Student(5, "e", 15,"famale"));
        list.add(new Student(6, "f", 16,"male"));

        System.out.println(list);

        System.out.println("===========");

        list.stream()
                .distinct()
                .filter(student -> "male".equals(student.getGender()))
                .forEach(System.out::println);

    }
}
