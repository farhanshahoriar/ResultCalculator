package com.farhanshahoriar.resultcalculator;

public class IndividualResult implements Comparable{
    public String nickName,fullName;
    public int oldRoll,newRoll,totalSubjects;
    public double totalMarks,averageMarks;
    public double []marks = new double[10];

    public void setDatadata(String str) {
        int s=0,ln=str.length(),dcnt=0;
        String part;

        totalSubjects = 0;
        totalMarks = 0;
        for(int i=0;i<ln;i++) {
            if(str.charAt(i)==',') {
                part= str.substring(s, i);
                s=i+1;

                switch (dcnt){
                    case 0:
                        oldRoll = Integer.parseInt(part);
                        break;

                    case 1:
                        newRoll = Integer.parseInt(part);
                        break;
                    case 2:
                        nickName = part;
                        break;

                        default:
                            marks[dcnt-3] = Integer.parseInt(part);
                            totalSubjects++;
                            totalMarks+=marks[dcnt-3];
                }

                dcnt++;
            }
        }

    }


    @Override
    public int compareTo(Object o) {
        return (int) (((IndividualResult)o).totalMarks-totalMarks);//fix this tiny bug******
    }
}