import javax.swing.*;


public class MainWindow extends JFrame {

    public MainWindow(){
        setTitle("������");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320,320);
        setLocation(400,400);
        add(new GameField());
        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args) { 
    	
			
		
        MainWindow mw = new MainWindow();
    }
}