package com.codeuv.SortStudentUsingComparator;

import java.util.Comparator;

public class Student implements Comparator<Student>,Comparable<Student> {
    int rollNo ;
    int marks;
    int rank;

    public Student(int marks, int rank, int rollNo) {
        this.marks = marks;
        this.rank = rank;
        this.rollNo = rollNo;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.marks - o2.marks;
    }




    @Override
    public String toString() {
        return "Student{" +
               "marks=" + marks +
               ", rollNo=" + rollNo +
               ", rank=" + rank +
               '}';
    }

    @Override
    public int compareTo(Student o) {
        return (int)this.marks - o.marks;
    }
}
