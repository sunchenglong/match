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
			s.mouseMove("pic/sikuli.png"); // ������ƶ���sikuliͼƬ��
			s.dragDrop("pic/movebegin.png", "pic/moveto.png"); // ��movebegin�϶���moveto
			s.rightClick("pic/moveto.png"); // ��moveto������Ҽ�rightClick
			s.click("pic/6san.png", 0); // ��6san������������ʵ��ģ����
			s.find("pic/sikuli.png");
			s.click(s.getLastMatch().right(50)); // �����ҵ�ͼƬsikuli��Ȼ����sikuliͼƬ�Ҳ�ƫ��50PX���������
			s.find("pic/sikuli.png");
			s.click(s.getLastMatch().left(50)); // ��sikuliͼƬ���ƫ��50PX���������
			s.wait(2000); // sikuli�ĵȴ���Ҳ������ Thread.sleep(2000);
			s.hover("pic/sikulimove.png"); // �ƶ���sikulimove������mouseMove��Ч��һ������֪���Ƿ�������
		} catch (FindFailed e) {
			e.printStackTrace();
		}
	}
}