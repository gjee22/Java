package reference;

import access.Student;

class AccessModifier {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName());
        student.setName("New");
        System.out.println(student.getName());

        int[] arr = new int[1];
        System.out.println(arr[0]);
        setArr(arr);
        System.out.println(arr[0]);

        int num = 0;
        System.out.println(num);
        setInt(num);
        System.out.println(num);
    }

    static void setInt(int num) {
        num = 1;
    }

    static void setArr(int[] arr) {
        arr[0] = 1;
    }
}