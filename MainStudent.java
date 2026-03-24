import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //program interaktif untuk memasukkan data siswa
        System.out.print("Masukkan jumlah siswa: ");
        int jumlah = in.nextInt();

        in.nextLine();

        Student[] student = new Student[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Siswa ke-" + (i + 1));
            System.out.print("Masukkan nama: ");
            String name = in.nextLine();
            System.out.print("Masukkan alamat: ");
            String address = in.nextLine();
            System.out.print("Masukkan umur: ");
            int age = in.nextInt();
            System.out.print("Masukkan nilai matematika: ");
            double mathGrade = in.nextDouble();
            System.out.print("Masukkan nilai bahasa Inggris: ");
            double englishGrade = in.nextDouble();
            System.out.print("Masukkan nilai IPA: ");
            double scienceGrade = in.nextDouble();

            student[i] = new Student(name, address, age);
            student[i].setMath(mathGrade);
            student[i].setEnglish(englishGrade);
            student[i].setScience(scienceGrade);

            in.nextLine();
        }

        System.out.println("======================");
        for (int i = 0; i < jumlah; i++) {
            student[i].displayMessage();
            System.out.println("======================");
        }

        Student anna = new Student();
        anna.setName("Anna");
        anna.setAddress("Malang");
        anna.setAge(20);
        anna.setMath(100);
        anna.setEnglish(80);   
        anna.setScience(89);
        anna.displayMessage();

        //menggunakan constructor lain
        System.out.println("======================");
        Student chris = new Student("Chris", "Kediri", 21);
        chris.setMath(70);
        chris.setEnglish(90);
        chris.setScience(60);
        chris.displayMessage();

        //siswa dengan nama anna diubah informasi alamat dan umurnya melalui constructor
        System.out.println("======================");
        anna = new Student("Anna", "Batu", 18);
        anna.setMath(100);
        anna.setEnglish(80);   
        anna.setScience(89);
        anna.displayMessage();

        //siswa dengan nama chris diubah informasi alamat dan umurnya melalui method
        System.out.println("======================");
        chris.setAddress("Surabaya");
        chris.setAge(22);
        chris.displayMessage();

        //constructor nilai-nilai siswa dengan nama haechan
        System.out.println("======================");
        Student haechan = new Student(90, 80, 70);
        haechan.setName("Haechan");
        haechan.setAddress("Seoul");
        haechan.setAge(19);
        haechan.displayMessage();

        Student.jumlahObjek();
    }
}
