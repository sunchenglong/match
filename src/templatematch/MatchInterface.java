package templatematch;

public class MatchInterface {
	private MatchResult result;
	MatchInterface(String SourcePath,String TemplatePath,int startx,int endx,int starty,int endy,int width,int height)
	{
		Context context;
		context = new Context(new EnsembleAlgorithm());//最新的融合好的算法
		ImageObj imgobj = new ImageObj();//操作的图像对象
		imgobj.setSource(SourcePath);// 大图，待匹配的图像
		imgobj.setTemplate(TemplatePath);// 小图，模板图像
		imgobj.setStartx(startx);
		imgobj.setStarty(starty);// 截图起始点坐标
		imgobj.setEndx(endx);
		imgobj.setEndy(endy);//截图终点坐标
		imgobj.setWidth(width);
		imgobj.setHeight(height);//所截图像所在图像的宽高
		result = context.contextInterface(imgobj);//返回结果
		imgobj.writeResult(result,"result.jpg");
	}
	public MatchResult getMatchResult(){return result;}
}
