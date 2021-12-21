package ru.mirea.task12.opt3;

import ru.mirea.task12.Student;

import java.util.ArrayList;

public class TestStudentMerge {
    public static void main(String[] args) {

        Student[] students = new Student[]{
                new Student(12, 4),
                new Student(10, 5),
                new Student(189, 81),
                new Student(2, 320)
        };

        for (Student s : students) {
            System.out.println(s);
        }

        // merge sort
        System.out.println();
        Student[] students2 = new Student[]{
                new Student(35, 412),
                new Student(16, 105),
                new Student(18, 128),
                new Student(222, 201)
        };

        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println();

        Student[] allStudents = new Student[students.length + students2.length];
        System.arraycopy(students, 0, allStudents,0,students.length);
        System.arraycopy(students2, 0, allStudents,students.length, students2.length);
        mergeSort(allStudents, allStudents.length);
        for (Student s : allStudents) {
            System.out.println(s);
        }
    }


    public static void mergeSort(Student[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];

        System.arraycopy(a, 0, l, 0, mid);
        System.arraycopy(a, mid, r, 0, n - mid);
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }
    public static void merge(
            Student[] a, Student[] l, Student[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].compareTo(r[j]) <= 0) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

}
