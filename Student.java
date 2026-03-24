public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;

    private static int jumlahObjek = 0;
    
    public Student() {
        name = "";
        address = "";
        age = 0;
        jumlahObjek++;
    }

    public Student (String n, String a, int ag) {
        name = n;
        address = a;
        age = ag;
        jumlahObjek++;
    }

    public Student(double math, double english, double science) {
        mathGrade = math;
        englishGrade = english;
        scienceGrade = science;
        jumlahObjek++;
    }

    public static void jumlahObjek() {
        System.out.println("Jumlah objek yang telah dibuat: " + jumlahObjek);
    }

    public void setName(String n) {
        name = n;
    }

    public void setAddress(String a) {
        address = a;
    }

    public void setAge(int ag) {
        age = ag;
    }

    public void setMath(double math) {
        mathGrade = math;
    }

    public void setEnglish(double english) {
        englishGrade = english;
    }

    public void setScience(double science) {
        scienceGrade = science;
    }

    private double getAverage() {
        double result = 0;
        result = (mathGrade + englishGrade + scienceGrade) / 3;
        return result;
    }

    public boolean statusAkhir() {
        if (getAverage() >= 61) {
            return true;
        } else {
            return false;
        }
    }

    public void displayMessage() {
        System.out.println("Siswa dengan nama " + name);
        System.out.println("beralamat di " + address);
        System.out.println("berumur " + age);
        System.out.println("mempunyai nilai rata-rata " + getAverage());
        if (statusAkhir()) {
            System.out.println("dinyatakan lulus");
        } else {
            System.out.println("dinyatakan tidak lulus");
        }
    }
}