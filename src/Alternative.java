class Alternative extends Question {
    private int bonChoix;
    Alternative(String question, String [] reponses, int bonChoix){
        super(question, reponses);
        this.bonChoix = bonChoix;
    }
    boolean bienChoisi() {
        for(int i = 0; i < super.nbchoix(); i++)
            if(estCoche(i) && bonChoix == i || estCoche(i) && bonChoix != i)
                return false;
        return true;
    }

}
