import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

// Student class for holding student details
class Student {
    String name;
    String regNumber;
    String subject;
    String date;
    String timing;

    public Student(String name, String regNumber, String subject) {
        this.name = name;
        this.regNumber = regNumber;
        this.subject = subject;
        setDateAndTiming(); // Set the exam date and timing based on the subject
    }

    private void setDateAndTiming() {
        switch (subject.toLowerCase()) {
            case "maths":
                date = "5 May 2024";
                timing = "10:00 AM to 12:30 PM";
                break;
            case "english":
                date = "6 May 2024";
                timing = "10:00 AM to 12:30 PM";
                break;
            case "social science":
                date = "7 May 2024";
                timing = "10:00 AM to 12:30 PM";
                break;
            case "science":
                date = "8 May 2024";
                timing = "10:00 AM to 12:30 PM";
                break;
            default:
                date = "Unknown";
                timing = "Unknown";
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Register Number: " + regNumber + ", Subject: " + subject + ", Date: " + date + ", Timing: " + timing;
    }
}

// Class for exam questions
class Question {
    private String questionText;
    private List<String> choices;
    private String correctAnswer;

    public Question(String questionText, List<String> choices, String correctAnswer) {
        this.questionText = questionText;
        this.choices = choices;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<String> getChoices() {
        return choices;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Question: ").append(questionText).append("\n");
        if (choices != null && !choices.isEmpty()) {
            for (int i = 0; i < choices.size(); i++) {
                sb.append((i + 1)).append(". ").append(choices.get(i)).append("\n");
            }
        }
        return sb.toString();
    }
}

// Class for student's answer to a question
class Answer {
    private Question question;
    private String studentAnswer;

    public Answer(Question question, String studentAnswer) {
        this.question = question;
        this.studentAnswer = studentAnswer;
    }

    public boolean isCorrect() {
        return question.getCorrectAnswer().equalsIgnoreCase(studentAnswer);
    }

    @Override
    public String toString() {
        return "Question: " + question.getQuestionText() + "\nYour Answer: " + studentAnswer + "\nCorrect Answer: " + question.getCorrectAnswer();
    }
}

// StudentResult class for storing student results
class StudentResult {
    Student student;
    int mark;

    public StudentResult(Student student, int mark) {
        this.student = student;
        this.mark = mark;
    }

    public boolean isPass() {
        return mark >= 50; // 50 is the passing mark
    }

    public void displayResult() {
        System.out.println("Result for Student: " + student.name);
        System.out.println("Subject: " + student.subject);
        System.out.println("Mark: " + mark);
        System.out.println("Status: " + (isPass() ? "Pass" : "Fail"));
    }
}

// Main program for the online examination system
public class Online {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        List<StudentResult> results = new ArrayList<>();
        List<Question> questions = createSampleQuestions();

        // Add some students
        System.out.print("Enter the number of students writing the online examination: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Registration Number: ");
            String regNumber = scanner.nextLine();
            System.out.print("Subject: ");
            String subject = scanner.nextLine();
            students.add(new Student(name, regNumber, subject));
        }

        // Menu to perform various operations
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    showAllStudentDetails(students);
                    break;
                case 2:
                    showStudentDetails(students, scanner);
                    break;
                case 3:
                    showStudentsByNameStartingLetter(students, scanner);
                    break;
                case 4:
                    showStudentsBySubject(students, scanner);
                    break;
                case 5:
                    addOrUpdateStudentResult(students, results, scanner);
                    break;
                case 6:
                    answerExamQuestions(questions, scanner);
                    break;
                case 7:
                    showStudentResult(results, scanner);
                    break;
                case 8:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\nOptions:");
        System.out.println("1. Show details of all students");
        System.out.println("2. Show details of a specific student");
        System.out.println("3. Retrieve Student Details by Starting Letter of Name");
        System.out.println("4. Retrieve Student Details by Subject");
        System.out.println("5. Add/Update Student Exam Result");
        System.out.println("6. Answer Questions in Exam");
        System.out.println("7. Show Student Exam Result");
        System.out.println("8. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void showAllStudentDetails(List<Student> students) {
        System.out.println("\nDetails of all students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static void showStudentDetails(List<Student> students, Scanner scanner) {
        System.out.print("Enter the registration number of the student: ");
        String regNumber = scanner.nextLine();
        Student foundStudent = findStudentByRegNumber(students, regNumber);
        if (foundStudent == null) {
            System.out.println("Student not found.");
        } else {
            System.out.println(foundStudent);
        }
    }

    private static void showStudentsByNameStartingLetter(List<Student> students, Scanner scanner) {
        System.out.print("Enter Starting Letter of Name: ");
        String letter = scanner.nextLine();
        for (Student s : students) {
            if (s.name.toLowerCase().startsWith(letter.toLowerCase())) {
                System.out.println(s);
            }
        }
    }

    private static void showStudentsBySubject(List<Student> students, Scanner scanner) {
        System.out.print("Enter Subject to Retrieve Details: ");
        String subject = scanner.nextLine();
        for (Student s : students) {
            if (s.subject.equalsIgnoreCase(subject)) {
                System.out.println(s);
            }
        }
    }

    private static void addOrUpdateStudentResult(List<Student> students, List<StudentResult> results, Scanner scanner) {
        System.out.print("Enter the registration number of the student to add/update result: ");
        String regNumber = scanner.nextLine();
        Student student = findStudentByRegNumber(students, regNumber);
        if (student == null) {
            System.out.println("Student not found.");
        } else {
            System.out.print("Enter the mark for the exam: ");
            int mark = scanner.nextInt();
            results.add(new StudentResult(student, mark));
        }
    }

    private static void answerExamQuestions(List<Question> questions, Scanner scanner) {
        System.out.println("Answering Questions in Exam:");
        for (Question q : questions) {
            System.out.println(q);
            System.out.print("Enter your answer: ");
            String answer = scanner.nextLine();
            Answer ans = new Answer(q, answer);
            System.out.println("Your answer is " + (ans.isCorrect() ? "correct" : "incorrect"));
        }
    }

    private static void showStudentResult(List<StudentResult> results, Scanner scanner) {
        System.out.print("Enter the registration number of the student to see the exam result: ");
        String regNumber = scanner.nextLine();
        boolean resultFound = false;
        for (StudentResult result : results) {
            if (result.student.regNumber.equals(regNumber)) {
                result.displayResult();
                resultFound = true;
                break;
            }
        }
        if (!resultFound) {
            System.out.println("Result not found.");
        }
    }

    private static List<Question> createSampleQuestions() {
        return Arrays.asList(
                new Question("What is 2 + 2?", Arrays.asList("1", "2", "3", "4"), "4"),
                new Question("Which is the largest planet?", Arrays.asList("Earth", "Mars", "Jupiter", "Venus"), "Jupiter"),
                new Question("What is the capital of France?", Arrays.asList("Paris", "London", "Berlin", "Madrid"), "Paris")
        );
    }

    private static Student findStudentByRegNumber(List<Student> students, String regNumber) {
        for (Student student : students) {
            if (student.regNumber.equals(regNumber)) {
                return student;
            }
        }
        return null; // No student found with the given registration number
    }
}