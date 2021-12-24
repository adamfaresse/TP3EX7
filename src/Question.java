abstract class Question{
    private String question;
    private String [] reponses;
    private boolean [] coches;

    Question(String question, String [] reponses) {
        this.question = question;
        this.reponses = reponses;

        coches = new boolean[reponses.length];
    }


    void coche(int i) {
        coches[i] = true;
    }
    boolean estCoche(int i) {
        return coches[i];
    }
    abstract  boolean bienChoisi() ;


    int nbchoix(){
        return reponses.length;
    }
    boolean nonTraitee() {

        for(int i = 0; i < coches.length; i++)
            if(coches[i])
                return false;
        return true;
    }

}