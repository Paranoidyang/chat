

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import utils.Utils;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;

public class Home extends JFrame implements ActionListener {

	JMenuBar menubar;
	JMenu select_menu;
	JButton btServer,btClient;

	static JFrame frame;

	public static void main(String args[]) {

	}

	public Home() {

		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout()); // ���ò��ֹ�����
		frame.setTitle("����ϵͳģ�����"); // ���������ñ���
//		frame.setFont(Utils.f1);
		frame.setSize(400, 500); // ���ô����С
		frame.setLocationRelativeTo(null);//���ڼɿ���ʾ
		frame.setResizable(false);// ����Ϊ���岻�ɸı��С
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���õ��رմ���ʱ����֤JVMҲ�˳�
		frame.setVisible(true); // ��ʾ����
		frame.setIconImage(new ImageIcon(this.getClass().getClassLoader().getResource("images/tittle.png")).getImage());
		Container content = frame.getContentPane();// ���JFrame��Ĭ�����rootPane
		// JPanel p1 = new JPanel();
		// frame.add(p1);//���p1��rootPane��ƽ���ģ�����ģ����Ի�����ֱ����Ĭ�ϵĺ���

		btServer = new JButton("����������");
		btClient = new JButton("ģ���¼�ͻ���");
		content.add(btServer);
		content.add(btClient);
		
//		menubar = new JMenuBar();
//		select_menu = new JMenu("�ҵĺ���");
//		select_menu.setFont(Utils.f2);
//		menubar.add(select_menu);
//		content.add(menubar, BorderLayout.NORTH);// �˵���λ�ڱ������Ϸ�
		
//		// ���ر���ͼƬ
//		ImageIcon bg = new ImageIcon(this.getClass().getClassLoader().getResource("images/background.jpg"));
//		// ��ͼƬ��С���óɴ��ڴ�С
//		Image temp = bg.getImage().getScaledInstance(frame.getWidth(), frame.getHeight(), bg.getImage().SCALE_DEFAULT);
//		bg = new ImageIcon(temp);
//		// �ѱ���ͼƬ��ʾ��һ����ǩ��
//		JLabel label = new JLabel(bg);
//		// �ѱ�ǩ�Ĵ�Сλ������ΪͼƬ�պ����������
//		label.setBounds(0, 0, bg.getIconWidth(), bg.getIconHeight());
//		// ���ͼƬ��frame�ĵڶ���
//		frame.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
//		// ��ȡframe�����ϲ����Ϊ�������䱳����ɫ��JPanel������͸���ķ�����
//		// JPanel jp=(JPanel)frame.getContentPane();
//		((JComponent) content).setOpaque(false); // ����͸��
//		// �����õ�JPane
	}

		
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
