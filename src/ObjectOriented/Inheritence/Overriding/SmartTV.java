package ObjectOriented.Inheritence.Overriding;

public class SmartTV extends TV{

    @Override
    public void SwitchON(){
        System.out.println("SmartTV Switched on");
    }
    @Override
    public void ChangeChannel(){
        System.out.println("SmatTV channel is changed");
    }

    public void Browse(){
        System.out.println("Browse option");
    }
}
