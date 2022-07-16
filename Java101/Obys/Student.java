package Java101.Obys;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    double matAvg;
    double fizikAvg;
    double kimyaAvg;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    public void addBulkSozluNote(int matSozlu, int fizikSozlu, int kimyaSozlu) {

        if (matSozlu >= 0 && matSozlu <= 100) {
            this.mat.sozlu = matSozlu;
        }

        if (fizikSozlu >= 0 && fizikSozlu <= 100) {
            this.fizik.sozlu = fizikSozlu;
        }

        if (kimyaSozlu >= 0 && kimyaSozlu <= 100) {
            this.kimya.sozlu = kimyaSozlu;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        matAvg = this.mat.note * 0.8 + this.mat.sozlu * 0.2;
        fizikAvg = this.fizik.note * 0.8 + this.fizik.sozlu * 0.2;
        kimyaAvg = this.kimya.note * 0.8 + this.kimya.sozlu * 0.2;
        this.avarage = (matAvg + fizikAvg + kimyaAvg) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.matAvg);
        System.out.println("Fizik Notu : " + this.fizikAvg);
        System.out.println("Kimya Notu : " + this.kimyaAvg);
    }

}
