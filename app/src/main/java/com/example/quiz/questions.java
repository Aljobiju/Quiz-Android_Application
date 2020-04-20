package com.example.quiz;

public class questions {
    private String txtqs [] = {
            "1.who is the ceo of google",
            "2.who invented java ?",
            "3.Do No Evil is the tagline of??",
            "4.Father of E-mail?",
            "5.Father of World Wide Web"

    };

    private String multiplechoice [][]={
            {"Sergey Brin","Sundar Pichai","Mark Zuckerberg","Mukesh Ambani"},
            {"Bill Joy","Bjarne Stroustrup","James Gosling","Linus Torvalds"},
            {"Google","Facebook","Amazon","Yahoo"},
            {"Elon Musk","Steve Vosniyak","Tim Bernerslee","Ray Tomlinson"},
            {"Tim Bernerslee","Alen Turing","Ray Tomlison","Joseph Theoster"}
    };

    private  String mCorrectAnswers[] = {"Sundar Pichai","James Gosling","Google","Ray Tomlinson","Tim Bernerslee"};

    public   int getLength() {return txtqs.length;}

    public String getquestion(int a) {
        String question=txtqs[a];
        return question;
    }

    public String getchoice(int index,int num) {
        String choice0=multiplechoice[index][num-1];
        return choice0;
    }
    public String getCorrectAnswers(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
