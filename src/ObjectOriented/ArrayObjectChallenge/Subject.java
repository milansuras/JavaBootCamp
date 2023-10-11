package ObjectOriented.ArrayObjectChallenge;

public class Subject {
    private String subID;
    private String name;
    private int maxmarks;
    private int marksObtain;

    public Subject(String subID,String name, int maxmarks){
        this.subID=subID;
        this.name=name;
        this.maxmarks=maxmarks;
    }

    public String getSubID(){
        return subID;
    }

    public String getName(){
        return  name;
    }

    public int getMaxMarks(){
        return maxmarks;
    }

    public int getMaxMarksObtain(){
        return marksObtain;
    }

    public void setMaxmarks(int mm){
        maxmarks=mm;
    }

    public void setMarksObtain(int m){
        marksObtain=m;
    }

    boolean isQualified(int m){
        return m>=maxmarks/10*4;
    }

    public String toString(){
        return "\nSubject ID: "+subID+ "\n Name : " +name+ "\n MarksObtained : " +maxmarks;
    }

}
