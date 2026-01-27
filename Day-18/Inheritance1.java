import javax.swing.*;



//JFrame ---> super class, parent class, base class
//Calculator ----> Sub class, child class, derived class

class Calculator extends JFrame{

    private JButton exitButton; //from JFrame

    private JButton yesButton;

    private JButton noButton;

    Calculator(){
        setSize(400,400);
        setTitle("My Cal");

        exitButton=new JButton("Exit");
        add(exitButton);

        yesButton=new JButton("Yes");
        add(yesButton);

        noButton=new JButton("no");
        add(noButton);
    }
}

class Demo {

    public static void main(String[] args) {
        Calculator c1=new Calculator();
        c1.setVisible(true);
    }
}
