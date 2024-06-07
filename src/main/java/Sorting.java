// Copyright (c) avijit bhattacharjee 2024
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Student implements Comparable<Student>{

    int age;
    String name;
    
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
    
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Student that) {
        if(this.age > that.age) {
            return 1;
        } else {
            return -1;
        }
    }


    
}

public class Sorting {
    public static void main(String[] args) {

        Comparator<Integer> comparator = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if(i%10 > j%10) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        Comparator<Student> comparator2 = (i, j) -> i.age > j.age?1:-1;
        

        List<Integer> nums = new ArrayList<Integer>();

        nums.add(4);
        nums.add(2);
        nums.add(8);
        nums.add(1);

        // comparater helps to sort with your own logic
        // here it is to sort with the last digit
        Collections.sort(nums, comparator);

        System.out.println(nums);


        List<Student> students = new ArrayList<>();
        students.add(new Student(10, "avijit"));
        students.add(new Student(20, "arijit"));
        students.add(new Student(15, "abhishek"));
        students.add(new Student(8, "abhireet"));


        Collections.sort(students, comparator2);

        // we can simply use the below line as we implemenetd tocompare() in the class
        Collections.sort(students);

        for(Student s: students) {
            System.out.println(s);
        }



    }
}
