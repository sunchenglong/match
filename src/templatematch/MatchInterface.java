package templatematch;

public class MatchInterface {
	private MatchResult result;
	MatchInterface(String SourcePath,String TemplatePath,int startx,int endx,int starty,int endy,int width,int height)
	{
		Context context;
		context = new Context(new EnsembleAlgorithm());//���µ��ںϺõ��㷨
		ImageObj imgobj = new ImageObj();//������ͼ�����
		imgobj.setSource(SourcePath);// ��ͼ����ƥ���ͼ��
		imgobj.setTemplate(TemplatePath);// Сͼ��ģ��ͼ��
		imgobj.setStartx(startx);
		imgobj.setStarty(starty);// ��ͼ��ʼ������
		imgobj.setEndx(endx);
		imgobj.setEndy(endy);//��ͼ�յ�����
		imgobj.setWidth(width);
		imgobj.setHeight(height);//����ͼ������ͼ��Ŀ��
		result = context.contextInterface(imgobj);//���ؽ��
		imgobj.writeResult(result,"result.jpg");
	}
	public MatchResult getMatchResult(){return result;}
}
