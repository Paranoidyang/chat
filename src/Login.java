
/* 
 * ���ܣ�����ϵͳ
 * ����1����¼����ľ�̬ʵ�� 
 * ����2����ӶԸ�������ļ�����  
 */

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import utils.Utils;

public class Login extends JFrame implements ActionListener {

	// �������

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

		// ������ǩ
		logoLabel = new JLabel("����ϵͳģ�����");
		logoLabel.setIcon(new ImageIcon(this.getClass().getClassLoader()
				.getResource("images/logo.png")));
		logoLabel.setFont(Utils.f1);// utils��һ�������࣬�����Զ�����һ���������
		logoLabel.setBounds(150, 50, 200, 40);
		container.add(logoLabel);
		// �����û�����ǩ
		userNameLabel = new JLabel("�û�����");
		userNameLabel.setIcon(new ImageIcon(this.getClass().getClassLoader()
				.getResource("images/user.png")));
		userNameLabel.setFont(Utils.f2);
		userNameLabel.setBounds(120, 140, 80, 40);
		container.add(userNameLabel);
		// �����û��������
		userName_jtf = new JTextField(10);
		userName_jtf.setBounds(220, 148, 150, 20);
		container.add(userName_jtf);
		// ���������ǩ
		passwordLabel = new JLabel("���룺");
		passwordLabel.setIcon(new ImageIcon(this.getClass().getClassLoader()
				.getResource("images/password.png")));
		passwordLabel.setFont(Utils.f2);
		passwordLabel.setBounds(120, 180, 80, 40);
		container.add(passwordLabel);
		// �������������
		password_jtf = new JPasswordField(10);
		password_jtf.setBounds(220, 188, 150, 20);
		container.add(password_jtf);

		// ������¼��ť
		login_btn = new JButton("��¼");
		login_btn.setFont(Utils.f2);
		login_btn.setIcon(new ImageIcon(this.getClass().getClassLoader()
				.getResource("images/login.png")));
		login_btn.setBounds(100, 260, 90, 30);
		container.add(login_btn);

		// �������ð�ť
		reset_btn = new JButton("����");
		reset_btn.setFont(Utils.f2);
		reset_btn.setIcon(new ImageIcon(this.getClass().getClassLoader()
				.getResource("images/reset.png")));
		reset_btn.setBounds(300, 260, 90, 30);
		container.add(reset_btn);

		// Ϊ��ť���ü���
		login_btn.addActionListener(this);
		reset_btn.addActionListener(this);

		// ���������ñ���
		this.setTitle("����ϵͳģ�����");
		this.setIconImage(new ImageIcon(this.getClass().getClassLoader()
				.getResource("images/tittle.png")).getImage());

		// ����Ϊ���岻�ɸı��С
		this.setResizable(false);
		// ���ô����С
		this.setSize(500, 400);
		/*
		 * ʵ�ִ��������ʾ��Ϊʲô��Ч����
		 * ����Ҫ�������괰���С����ò������м���ʾ������ͻ���ʾ�����½ǡ�����Ϊnullʱ�÷����ǽ�����������Ƶ���Ļ������
		 * �����һ��ʼδָ������Ĵ�С���Ǿ���һ���㣬
		 * ����ʱ����ô˺������൱�ڰѴ�������Ͻ��Ƶ��м䣬Ȼ���ڴ˻�������������������ʹ���������Ծ���ʾ�����·���
		 */
		this.setLocationRelativeTo(null);
		// ���õ��رմ���ʱ����֤JVMҲ�˳�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ��ʾ����
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand() == "��¼") {
			if(userName_jtf.getText().equals("1")&&password_jtf.getText().equals("1")){
			System.out.println("��¼�ɹ�");
			JOptionPane.showMessageDialog(null, "��¼�ɹ���", "��ʾ��Ϣ",
					JOptionPane.WARNING_MESSAGE);
			 clear();
			 // �رյ�ǰ����
			 dispose();
			 //����һ���½���
			 Home home = new Home();
			}else if (userName_jtf.getText().isEmpty()
					&& password_jtf.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "�������û��������룡", "��ʾ��Ϣ",
						JOptionPane.WARNING_MESSAGE);
			} else if (userName_jtf.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "�������û�����", "��ʾ��Ϣ",
						JOptionPane.WARNING_MESSAGE);
			} else if (password_jtf.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "���������룡", "��ʾ��Ϣ",
						JOptionPane.WARNING_MESSAGE);
			}
		}  else if (e.getActionCommand() == "����") {
			clear();
		}

	}

	// ����ı���������
	public static void clear() {
		userName_jtf.setText("");
		password_jtf.setText("");
	}

}