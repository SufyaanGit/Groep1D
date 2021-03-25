import java.io.IOException;
import java.util.Scanner;

class Menu {

    private School school;

    public Menu(School school){
        this.school =  school;
    }

    public School getSchool() {
        return school;
    }

    public void backToMenu() throws IOException{
        System.out.println("\n1) Terug naar menu");
        System.out.println("0) exit");
        System.out.print("Uw keuze:");
        
        // Keuze van het menu wordt hier afgehandeld
        Scanner scanner = new Scanner(System.in);
        Integer keuze = scanner.nextInt();
        
        while(keuze > 1){
            System.out.print("Maak uw keuze:");
            keuze = scanner.nextInt();
        }

        if(keuze == 1){
            System.out.println();
            getMenu();
        }
        
        scanner.close();
    }

    public void getMenu() throws IOException{

        System.out.println("1) Lijst met examens");
        System.out.println("2) Lijst met studenten");
        System.out.println("3) Nieuwe student inschrijven");
        System.out.println("4) Student verwijderen");
        System.out.println("5) Examen afnemen");
        System.out.println("6) Is student geslaagd voor test?");
        System.out.println("7) Welke examens heeft student gehaald");
        System.out.println("8) Welke student heeft de meeste examens gehaald?");
        System.out.println("0) exit");
        System.out.print("Uw keuze:");

        // Keuze van het menu wordt hier afgehandeld
        Scanner scanner = new Scanner(System.in);
        Integer keuze = scanner.nextInt();

        while(keuze > 8){
            System.out.print("Maak uw keuze:");
            keuze = scanner.nextInt();
        }
        System.out.println();
        switch (keuze) {
            case 1:
                this.getSchool().showExams();
                break;
            case 2:
                this.getSchool().showStudents();
                break;
            case 3:
                this.getSchool().addStudent();
                this.getSchool().showStudents();
                break;
            case 4:
                this.getSchool().showStudents();
                this.getSchool().deleteStudent();
                this.getSchool().showStudents();
                break;
            case 5:
                System.out.println("Welk student gaat het examen maken?");
                this.getSchool().showStudents();
                int studentcode= scanner.nextInt() - 1;

                System.out.println("welk examen wilt de student maken?");
                this.getSchool().showExams();
                int examNumber = scanner.nextInt() - 1;
                
                this.getSchool().getStudent(studentcode).addMake(examNumber);
                this.getSchool().getStudent(studentcode).getMake(studentcode, examNumber).takeExam();
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

        if(keuze != 0){
            backToMenu();
        }
        scanner.close();
    }
}
