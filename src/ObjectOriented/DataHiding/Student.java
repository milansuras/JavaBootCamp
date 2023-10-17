package ObjectOriented.DataHiding;

public class Student {
    private int roll_no;
    private String name;

    // in the above code we make the properties as private so we can't access those
    //properties outside any class so when we try to access those properties it will
    // show error so to intalize or read those properties we use getters and setters
    public void setRoll_no(int roll_no){
        if(roll_no<=0)
            roll_no=0;
        else
            this.roll_no=roll_no;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getRoll_no(){
        return roll_no;
    }

    public String getName(){
        return name;
    }

    public Student(int roll_no,String name){
        this.roll_no=roll_no;
        this.name=name;
    }

    void greeting(){
        System.out.println("Hello " + this.name);
    }
}
