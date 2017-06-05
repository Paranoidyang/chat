
/* 
 * 功能：聊天系统
 * 步骤1：登录界面的静态实现 
 * 步骤2：添加对各个组件的监听。  
 */

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import utils.Utils;

public class Login extends JFrame implements ActionListener {

	// 定义组件

	JPanel jp1, jp2, jp3, jp4 = null;
	static JTextField userName_jtf = null;
	static JPasswordField password_jtf = null;

	private JLabel logoLabel, userNameLabel, passwordLabel;
	private JButton login_btn, reset_btn;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Login();
	}

	public Login() {

		Container container = this.getContentPane();
		this.setLayout(null);//

		// 创建标签
		logoLabel = new JLabel("聊天系统模拟软件");
		logoLabel.setIcon(new ImageIcon(this.getClass().getClassLoader()
				.getResource("images/logo.png")));
		logoLabel.setFont(Utils.f1);// utils是一个工具类，里面自定义了一个字体的类
		logoLabel.setBounds(150, 50, 200, 40);
		container.add(logoLabel);
		// 创建用户名标签
		userNameLabel = new JLabel("用户名：");
		userNameLabel.setIcon(new ImageIcon(this.getClass().getClassLoader()
				.getResource("images/user.png")));
		userNameLabel.setFont(Utils.f2);
		userNameLabel.setBounds(120, 140, 80, 40);
		container.add(userNameLabel);
		// 创建用户名输入框
		userName_jtf = new JTextField(10);
		userName_jtf.setBounds(220, 148, 150, 20);
		container.add(userName_jtf);
		// 创建密码标签
		passwordLabel = new JLabel("密码：");
		passwordLabel.setIcon(new ImageIcon(this.getClass().getClassLoader()
				.getResource("images/password.png")));
		passwordLabel.setFont(Utils.f2);
		passwordLabel.setBounds(120, 180, 80, 40);
		container.add(passwordLabel);
		// 创建密码输入框
		password_jtf = new JPasswordField(10);
		password_jtf.setBounds(220, 188, 150, 20);
		container.add(password_jtf);

		// 创建登录按钮
		login_btn = new JButton("登录");
		login_btn.setFont(Utils.f2);
		login_btn.setIcon(new ImageIcon(this.getClass().getClassLoader()
				.getResource("images/login.png")));
		login_btn.setBounds(100, 260, 90, 30);
		container.add(login_btn);

		// 创建重置按钮
		reset_btn = new JButton("重置");
		reset_btn.setFont(Utils.f2);
		reset_btn.setIcon(new ImageIcon(this.getClass().getClassLoader()
				.getResource("images/reset.png")));
		reset_btn.setBounds(300, 260, 90, 30);
		container.add(reset_btn);

		// 为按钮设置监听
		login_btn.addActionListener(this);
		reset_btn.addActionListener(this);

		// 给窗口设置标题
		this.setTitle("聊天系统模拟软件");
		this.setIconImage(new ImageIcon(this.getClass().getClassLoader()
				.getResource("images/tittle.png")).getImage());

		// 设置为窗体不可改变大小
		this.setResizable(false);
		// 设置窗体大小
		this.setSize(500, 400);
		/*
		 * 实现窗体局中显示，为什么无效果？
		 * 必须要在设置完窗体大小后调用才能在中间显示，否则就会显示在右下角。参数为null时该方法是将窗体的中心移到屏幕的中央
		 * ，如果一开始未指定窗体的大小，那就是一个点，
		 * 在这时候调用此函数，相当于把窗体的左上角移到中间，然后在此基础上再添加其他组件，使窗体变大，所以就显示在右下方了
		 */
		this.setLocationRelativeTo(null);
		// 设置当关闭窗口时，保证JVM也退出
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 显示窗体
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand() == "登录") {
			if(userName_jtf.getText().equals("1")&&password_jtf.getText().equals("1")){
			System.out.println("登录成功");
			JOptionPane.showMessageDialog(null, "登录成功！", "提示消息",
					JOptionPane.WARNING_MESSAGE);
			 clear();
			 // 关闭当前界面
			 dispose();
			 //创建一个新界面
			 Home home = new Home();
			}else if (userName_jtf.getText().isEmpty()
					&& password_jtf.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "请输入用户名和密码！", "提示消息",
						JOptionPane.WARNING_MESSAGE);
			} else if (userName_jtf.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "请输入用户名！", "提示消息",
						JOptionPane.WARNING_MESSAGE);
			} else if (password_jtf.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "请输入密码！", "提示消息",
						JOptionPane.WARNING_MESSAGE);
			}
		}  else if (e.getActionCommand() == "重置") {
			clear();
		}

	}

	// 清空文本框和密码框
	public static void clear() {
		userName_jtf.setText("");
		password_jtf.setText("");
	}

}