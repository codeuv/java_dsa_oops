import com.codeuv.DS.ArrayListY;
import com.codeuv.SortStudentUsingComparator.Student;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Student s = new Student(123,32312,789);
        Student s1 = new Student(153,19189,689);
        Student s2 = new Student(128,7987,688);
        Student s3 = new Student(113,82112,609);
        Student s4 = new Student(103,92112,789);

        Student[] students = new Student[5];
//
//        students[0] = s;
//        students[1] = s1;
//        students[2] = s2;
//        students[3] = s3;
//        students[4] = s4;
//
//        for(int i =0; i< students.length ;i++){
//            System.out.println(students[i]);
//        }
//
//        Arrays.sort(students);
//        System.out.println("*".repeat(10));
//        for(int i =0; i< students.length ;i++){
//            System.out.println(students[i]);
//        }

         ArrayList<Integer> arr = new ArrayList();
         List<Integer> arr1 = new LinkedList<>();

         for(int i = 1 ; i < 11 ;i++){
             arr.add(i);
         }

         arr.forEach((item)->{
             System.out.println(item * item * item);;
         });

    }

}
