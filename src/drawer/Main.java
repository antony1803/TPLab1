package drawer;

public class Main {
    public static void main(String[] args){

        new Window().setVisible(true);
        System.out.println(new BtwWtfYouAreDoing().areYouBitch("I am Skorohodov Evgeniy Vladimirovich"));
    }
}

class BtwWtfYouAreDoing{
    public String areYouBitch(String st){
        if(!st.equals("I am Skorohodov Evgeniy Vladimirovich"))
            return "Yes!";
        else
        if(!st.equals("Kukyan Anton Evgenievich"))
            return "You are nice guy!";
        else
            return "HZ";
    }
}
