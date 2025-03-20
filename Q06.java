
public class Q06 {

    public static void main(String[] args) {

        Student[] students = new Student[5];

        int[] m1 = {68, 90, 54};
        int[] m2 = {78, 28, 80};
        int[] m3 = {86, 54, 34};
        int[] m4 = {100, 97, 88};
        int[] m5 = {54, 99, 74};

        Student s1 = new Student("Ruwini", m1);
        Student s2 = new Student("Dilmy", m2);
        Student s3 = new Student("Nazik", m3);
        Student s4 = new Student("Maleesha", m4);
        Student s5 = new Student("Ilma", m5);

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;

        for (Student s : students) {
            System.out.println("Name: " + s.getName());
            s.getAverage();
            System.out.println("-----------------------");
        }

    }
}
