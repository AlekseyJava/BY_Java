public class Student {
    private String fullName;
    private int groupNumber;
    private int[] arrayEstimation = new int[5];
    public static void main(String[] args) {
        Student[] students = new Student[10];
        int[] arrayEstimationStudent1 = {1,2,3,4,5};
        int[] arrayEstimationStudent2 = {9,9,10,10,9};
        students[0] = new Student("Name", 1, arrayEstimationStudent1);
        for(int i = 1; i < students.length; i++){
            students[i] = new Student("Name " + (i +1) , i+1, arrayEstimationStudent2);
        }

        int countEstimation = 0;
        for(int i = 0; i < students.length; i++){
            for (int j = 0; j < 5; j++){
                if (students[i].arrayEstimation[j] > 8) countEstimation++;
            }
            if (countEstimation == 5) System.out.println(students[i].fullName);
            countEstimation = 0;

        }


    }

    public Student(String fullName, int groupNumber, int[] arrayEstimation){
        this.fullName = fullName;
        this.groupNumber = groupNumber;
        this.arrayEstimation = arrayEstimation;
    }
}
