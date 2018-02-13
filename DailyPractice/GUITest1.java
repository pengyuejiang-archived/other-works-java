/*
这是第一次自己玩GUI，刺激。
跟着文档好好学吧。
*/
import java.awt.*;
import java.awt.event.*;

public class GUITest1 {
	public static void main(String[] args) {
		// 表示新增一个窗口对象：
		Frame frame = new Frame("Test");
		// 设置窗口为可见：
		frame.setVisible(true);
		// 这里先设置窗口大小再调整：
		frame.setSize(1280, 800);
		// 将窗口居中算法：
		frame.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width - frame.getWidth()) / 2, (Toolkit.getDefaultToolkit().getScreenSize().height - frame.getHeight()) / 2);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
