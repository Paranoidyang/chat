

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
		frame.setLayout(new FlowLayout()); // 设置布局管理器
		frame.setTitle("聊天系统模拟软件"); // 给窗口设置标题
//		frame.setFont(Utils.f1);
		frame.setSize(400, 500); // 设置窗体大小
		frame.setLocationRelativeTo(null);//窗口忌口显示
		frame.setResizable(false);// 设置为窗体不可改变大小
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置当关闭窗口时，保证JVM也退出
		frame.setVisible(true); // 显示窗体
		frame.setIconImage(new ImageIcon(this.getClass().getClassLoader().getResource("images/tittle.png")).getImage());
		Container content = frame.getContentPane();// 获得JFrame的默认面板rootPane
		// JPanel p1 = new JPanel();
		// frame.add(p1);//这个p1跟rootPane是平级的，多余的，所以还不如直接用默认的好了

		btServer = new JButton("启动服务器");
		btClient = new JButton("模拟登录客户端");
		content.add(btServer);
		content.add(btClient);
		
//		menubar = new JMenuBar();
//		select_menu = new JMenu("我的好友");
//		select_menu.setFont(Utils.f2);
//		menubar.add(select_menu);
//		content.add(menubar, BorderLayout.NORTH);// 菜单条位于北方即上方
		
//		// 加载背景图片
//		ImageIcon bg = new ImageIcon(this.getClass().getClassLoader().getResource("images/background.jpg"));
//		// 将图片大小设置成窗口大小
//		Image temp = bg.getImage().getScaledInstance(frame.getWidth(), frame.getHeight(), bg.getImage().SCALE_DEFAULT);
//		bg = new ImageIcon(temp);
//		// 把背景图片显示在一个标签里
//		JLabel label = new JLabel(bg);
//		// 把标签的大小位置设置为图片刚好填充整个面
//		label.setBounds(0, 0, bg.getIconWidth(), bg.getIconHeight());
//		// 添加图片到frame的第二层
//		frame.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
//		// 获取frame的最上层面板为了设置其背景颜色（JPanel有设置透明的方法）
//		// JPanel jp=(JPanel)frame.getContentPane();
//		((JComponent) content).setOpaque(false); // 设置透明
//		// 测试用的JPane
	}

		
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
