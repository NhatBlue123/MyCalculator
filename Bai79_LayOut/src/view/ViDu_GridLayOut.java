package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_GridLayOut extends JFrame{
	public ViDu_GridLayOut()
	{
		ImageIcon AnhFiFa = new ImageIcon("C:\\Users\\bluez\\OneDrive\\Pictures\\a662b37b1701adef68baa2fd7eefe394.jpg");
		//đặt tiêu đề cho GUI
		this.setTitle("Bàn phím nokia");
		//kích thước cho GUI
		this.setSize(300, 200);
		//gắn icon vào GUI
		this.setIconImage(AnhFiFa.getImage());
		//căn giữa cửa sổ chương trình
		this.setLocationRelativeTo(null);
		
		//Tạo flowLayOut
		GridLayout gridlayout_1 = new GridLayout();
		GridLayout gridlayout_2 = new GridLayout(4,3);
		GridLayout gridlayout_3 = new GridLayout(4,3,25,25);
        
		BorderLayout borderlayout = new BorderLayout();
		FlowLayout flowlayout = new FlowLayout();
		//thêm latout vào Gui
		this.setLayout(gridlayout_2);
		
	    for(int i = 1 ; i < 13 ; i++)
	    {
	    	if(i == 10)
	    	{
	    		JButton button2 = new JButton("#");
	    		this.add(button2);
	    	}
	    	if(i == 11)
	    	{
	    		JButton button3 = new JButton("0");
	    		this.add(button3);
	    	}
	    	if(i == 12)
	    	{
	    		JButton button4 = new JButton("*");
	    		this.add(button4);
	    	}
	    	if(i < 10)
	    	{
	    	JButton button = new JButton(i +"");
	    	this.add(button);
	    	}
	    	
	    }
		
		//thoát chương trình
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//cho phép tạo cửa sổ
		this.setVisible(true);
	}
	public static void main(String[] args) {
	  new ViDu_GridLayOut();	
	}

}
