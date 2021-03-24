import java.util.Scanner;

class Menu {

    public void getMenu(){

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
                Exam.printExams();
                // willen we dat na deze "keuze" de gebruiker opnieuw iets kan invoeren?
                break;
            case 2:
                School.showStudents();
                break;
            case 3:
                System.out.println("Wat is de studentcode van de student");
                int number = scanner.nextInt();

                scanner.nextLine();

                System.out.println("Wat is de naam van de student?");
                String name = scanner.nextLine();

                School.addStudent(number, name);
                System.out.println("Student is toegevoegd");

                School.showStudents();
                break;
            case 4:
                School.showStudents();
                School.deleteStudent();
                break;
            case 5:
                System.out.println("Welk student gaat het examen maken?");
                School.showStudents();
                int studentcode= scanner.nextInt() - 1;

                System.out.println("welk examen wilt de student maken?");
                Exam.printExams();
                int examNumber = scanner.nextInt() - 1;
                Exam.getExams().get(examNumber);
                School.getStudent(studentcode).addMake(Exam.getExams().get(examNumber));

                System.out.println(School.getStudent(studentcode).getMake().getExam().getName());
                

                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        scanner.close();
    }
}
