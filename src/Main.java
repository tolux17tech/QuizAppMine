public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to 473tech Quiz App!!!");

        QuestionService service = new QuestionService();
        //service.displayQuestion();
        service.playQuiz();
        service.printScore();
    }
}