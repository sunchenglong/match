package templatematch;

import org.sikuli.script.*;
import java.awt.*;
import java.awt.event.InputEvent;

public class sikulitest {
	public static void main(String[] args) throws InterruptedException {
		Screen s = new Screen();
		Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			s.mouseMove("pic/sikuli.png"); // 将鼠标移动到sikuli图片处
			s.dragDrop("pic/movebegin.png", "pic/moveto.png"); // 将movebegin拖动到moveto
			s.rightClick("pic/moveto.png"); // 在moveto处点击右键rightClick
			s.click("pic/6san.png", 0); // 在6san处点击左键键，实现模拟点击
			s.find("pic/sikuli.png");
			s.click(s.getLastMatch().right(50)); // 首先找到图片sikuli，然后在sikuli图片右侧偏移50PX处单击左键
			s.find("pic/sikuli.png");
			s.click(s.getLastMatch().left(50)); // 在sikuli图片左侧偏移50PX处单击左键
			s.wait(2000); // sikuli的等待，也可以用 Thread.sleep(2000);
			s.hover("pic/sikulimove.png"); // 移动到sikulimove处，和mouseMove的效果一样，不知道是否有区别
		} catch (FindFailed e) {
			e.printStackTrace();
		}
	}
}