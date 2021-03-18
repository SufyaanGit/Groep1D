class Assignment {
    private String question;
    private String answer;
    
    public Assignment(String question, String answer){
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion(){
        return this.question;
    }
    
    public String getAnswer(){
        return this.answer;
    }
}
