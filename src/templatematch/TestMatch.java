package templatematch;
public class TestMatch {
	public static void test1()
	{
		Context context;
		context = new Context(new EnsembleAlgorithm());//���µ��ںϺõ��㷨
		ImageObj imgobj = new ImageObj();//������ͼ�����
		imgobj.setSource("D:\\itestin\\512.png");// ��ͼ����ƥ���ͼ��
		imgobj.setTemplate("D:\\itestin\\512a.png");// Сͼ��ģ��ͼ��
		imgobj.setStartx(376);
		imgobj.setStarty(172);// ��ͼ��ʼ������
		imgobj.setEndx(595);
		imgobj.setEndy(269);//��ͼ�յ�����
		imgobj.setWidth(540);
		imgobj.setHeight(960);//����ͼ������ͼ��Ŀ��
		MatchResult result = context.contextInterface(imgobj);//���ؽ��
		/*			MatchResult �������
		 * result.startx
		 *result.starty // ƥ��Ŀ����ʼ��
		 *result.endx
		 *result.endy   // ƥ��Ŀ���յ�
		 *result.successflag // �ɹ��ı�־
		 * */
		result.dispResult();//������
		imgobj.writeResult(result,"result.jpg");//��ͼ�����ɵ�ĳ��·����
	}
	public static void test2()
	{
		MatchInterface tool = new MatchInterface("3.jpg","a.jpg",63,515,127,708,480,800);
		/*
		 * MatchInterface ���캯��
		 * �����б�
		 * -SourcePath:��ƥ��ͼ��·�� -TemplatePath:ģ��ͼ��·�� 
		 * -Startx -Starty ��ͼ��ʼ������ -Endx -Endy ��ͼ�յ�����
		 * -Width -Height ��ͼ����ͼ��ĳ���
		 */
		MatchResult result = tool.getMatchResult();
		System.out.println(result.startx);
		System.out.println(result.starty);
		System.out.println(result.width);
		System.out.println(result.height);
		System.out.println(result.successflag);
		result.dispResult();
		
	}
	public static void test3()
	{
		Context context;
		context = new Context(new EnsembleAlgorithm());//���µ��ںϺõ��㷨
		ImageObj imgobj = new ImageObj();//������ͼ�����
		imgobj.setSource("D:1.png");// ��ͼ����ƥ���ͼ��
		imgobj.setTemplate("D:a.png");// Сͼ��ģ��ͼ��
		imgobj.setStartx(354);
		imgobj.setStarty(24);// ��ͼ��ʼ������
		imgobj.setEndx(515);
		imgobj.setEndy(87);//��ͼ�յ�����
		imgobj.setWidth(540);
		imgobj.setHeight(960);//����ͼ������ͼ��Ŀ��
		MatchResult result = context.contextInterface(imgobj);//���ؽ��
		/*			MatchResult �������
		 * result.startx
		 *result.starty // ƥ��Ŀ����ʼ��
		 *result.endx
		 *result.endy   // ƥ��Ŀ���յ�
		 *result.successflag // �ɹ��ı�־
		 * */
		result.dispResult();//������
		imgobj.writeResult(result,"result.jpg");//��ͼ�����ɵ�ĳ��·����
	}
	public static void test4()
	{
		MatchInterface tool = new MatchInterface("3.jpg","a.jpg",63,515,127,708,480,800);
		MatchResult result = tool.getMatchResult();
		System.out.println(result.startx);
		System.out.println(result.starty);
		System.out.println(result.width);
		System.out.println(result.height);
		System.out.println(result.successflag);
	}
	
	
	
	    public static void main(String[] args) {
	    	test2();
	}
}
