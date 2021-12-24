class QCM {
    private Question[] questions;
    private EvaluationQuestion evaluationQuestion;
    QCM(Question[] questions,EvaluationQuestion evaluationQuestion) {
        this.questions = questions;
        this.evaluationQuestion = evaluationQuestion;
    }
    void coche(int question, int choix) {
        questions[question].coche(choix);
    }
    int note() {
        int note = 0;
        for(int i = 0; i < questions.length; i++)
            note = note + evaluationQuestion.evalue(questions[i]);
        return note;
    }
}
