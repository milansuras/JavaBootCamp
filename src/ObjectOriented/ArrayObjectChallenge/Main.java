package ObjectOriented.ArrayObjectChallenge;

public class Main {
    public static void main(String[] args){
       Subject sub[]=new Subject[3];
       sub[0]=new Subject("s01", "Data Structures & Algorithms", 100);
       sub[1]=new Subject("s02","Operating System",100);
       sub[2]=new Subject("s03","Java " , 100);

       for(Subject s: sub){
           System.out.println(s);
       }


    }
}
