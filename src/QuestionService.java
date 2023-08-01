import java.util.Scanner;

public class QuestionService {
    Question questions[] = new Question[5];
    String selection[] = new String[5];

    public QuestionService(){
        questions[0]= new Question(1, "What is the size of int in Java?", "2","6","4","7","4");
        questions[1]= new Question(2, "What is the sum of 4 and 4?", "0","8","-8","7","8");
        questions[2]= new Question(3, "What is the size of Double in Java", "2","8","4","7","8");
        questions[3]= new Question(4, "What is the size of Char in Java", "2","6","4","7","2");
        questions[4]= new Question(5, "What is the size of Byte in Java", "2","6","1","7","1");
    }


    public void displayQuestion(){
        for(Question question: questions){
            System.out.println(question.toString());
        }
    }

    public void playQuiz(){
        int i =0;
        for (Question q: questions){
            System.out.println("Question "+(i+1)+ " :  ");
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            System.out.println("Type the right answer");
            Scanner sc = new Scanner(System.in);

            selection[i] = sc.nextLine().trim();
            i++;


        }
    }
    public void printScore(){
        int score =0;
        for(String s: selection){
            System.out.println(s);
        }
        for (int i=0; i<5; i++){
            Question q = questions[i];
            String answer = q.getAnswer();
            String selAnswer = selection[i];

            if(answer.equals(selAnswer)){
                score++;
            }
        }
        System.out.println("result: "+ score);
    }


}
