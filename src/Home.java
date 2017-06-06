
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import utils.Utils;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

import client.ClientThread;
import client.ClientUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;

public class Home extends JFrame {

	JMenuBar menubar;
	JMenu select_menu;
	JButton btChat;

	static JFrame frame;
	public ClientThread server;
	public ClientUI ui;
	public static String username;

	public Home(final String user) {
		username = user;
		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout()); // 设置布局管理器
		frame.setTitle("聊天系统模拟软件"); // 给窗口设置标题
		frame.setFont(Utils.f1);
		frame.setSize(400, 250); // 设置窗体大小
		frame.setLocationRelativeTo(null);//窗口忌口显示
		frame.setResizable(false);// 设置为窗体不可改变大小
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置当关闭窗口时，保证JVM也退出
		frame.setVisible(true); // 显示窗体
		frame.setIconImage(new ImageIcon(this.getClass().getClassLoader().getResource("images/tittle.png")).getImage());
		Container content = frame.getContentPane();// 获得JFrame的默认面板rootPane
		content.setLayout(new FlowLayout());
		
		JLabel jbl0 = new JLabel("昵称：");
		JLabel jbl1 = new JLabel(user);
		JLabel jbl2 = new JLabel("签名：");
		JLabel jbl3 = new JLabel("惶者生存，偏执者成功！");
		JLabel jbl4 = new JLabel("生日：");
		JLabel jbl5 = new JLabel("2000-2-31");
		
		
		JPanel panel01 = new JPanel(new GridLayout(3, 2));
		JPanel panel02 = new JPanel();
		content.add(panel01);
		content.add(panel02);
		
		JPanel panel11= new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel panel12= new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel panel21= new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel panel22= new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel panel31= new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel panel32= new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		panel01.add(panel11);
		panel01.add(panel12);
		panel01.add(panel21);
		panel01.add(panel22);
		panel01.add(panel31);
		panel01.add(panel32);
		
		panel11.add(jbl0);
		panel12.add(jbl1);
		panel21.add(jbl2);
		panel22.add(jbl3);
		panel31.add(jbl4);
		panel32.add(jbl5);
		
		btChat = new JButton("进入聊天室");
		panel02.add(btChat);
		
		Border lineBorder = BorderFactory.createLineBorder(Color.gray);
		Border border1 = BorderFactory.createTitledBorder(lineBorder, "个人信息");// 为该面板设置一个边框，将按钮，输入框包括起来
		panel01.setBorder(border1);
		
		btChat.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ClientUI client = new ClientUI(user);
			}
			
		});
	}

}
