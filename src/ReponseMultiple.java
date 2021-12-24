public class ReponseMultiple extends Question{
    private int[] bonChoix;
    ReponseMultiple(String question, String [] reponses, int[] bonChoix){
        super(question, reponses);
        this.bonChoix = bonChoix;
    }
    boolean bienChoisi() {
        for(int i = 0; i < nbchoix(); i++)
            for (int j = 0; j < bonChoix.length; j++) {
                if(estCoche(i) &&   bonChoix[j] == i || estCoche(i) && bonChoix[j] != i)
                    return false;
            }

        return true;
    }
}
