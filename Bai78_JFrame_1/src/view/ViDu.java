package view;


import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import javafx.embed.swing.JFXPanel;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class ViDu {
	public static void main(String[] args) {
		
		String videogame = "\"C:\\Users\\bluez\\Videos\\Download.mp4\"";
		JFrame jf = new JFrame();
		 // Tạo một JFXPanel để chứa video
        ImageIcon icon = new ImageIcon("C:\\Users\\bluez\\OneDrive\\Pictures\\a662b37b1701adef68baa2fd7eefe394.jpg");
		
		//Đặt tên cho GUI
		jf.setTitle("FIFA 15");
		
		//Đặt kích thước chiều ngang dọc.
		jf.setSize(600,400);
		
		//Bỏ ảnh vào GUI.
		jf.setIconImage(icon.getImage());
		
		jf.setLocation(550, 200);
		//Thoát ra khỏi chương trình khi đóng cửa sổ
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Cho phép hiển thị cửa sổ
		jf.setVisible(true);
	
		
	}
}
