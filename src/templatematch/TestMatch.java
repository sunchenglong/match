package templatematch;
public class TestMatch {
	public static void test1()
	{
		Context context;
		context = new Context(new EnsembleAlgorithm());//最新的融合好的算法
		ImageObj imgobj = new ImageObj();//操作的图像对象
		imgobj.setSource("D:\\itestin\\512.png");// 大图，待匹配的图像
		imgobj.setTemplate("D:\\itestin\\512a.png");// 小图，模板图像
		imgobj.setStartx(376);
		imgobj.setStarty(172);// 截图起始点坐标
		imgobj.setEndx(595);
		imgobj.setEndy(269);//截图终点坐标
		imgobj.setWidth(540);
		imgobj.setHeight(960);//所截图像所在图像的宽高
		MatchResult result = context.contextInterface(imgobj);//返回结果
		/*			MatchResult 结果含义
		 * result.startx
		 *result.starty // 匹配目标起始点
		 *result.endx
		 *result.endy   // 匹配目标终点
		 *result.successflag // 成功的标志
		 * */
		result.dispResult();//输出结果
		imgobj.writeResult(result,"result.jpg");//将图像生成到某个路径中
	}
	public static void test2()
	{
		MatchInterface tool = new MatchInterface("3.jpg","a.jpg",63,515,127,708,480,800);
		/*
		 * MatchInterface 构造函数
		 * 参数列表
		 * -SourcePath:待匹配图像路径 -TemplatePath:模版图像路径 
		 * -Startx -Starty 截图起始点坐标 -Endx -Endy 截图终点坐标
		 * -Width -Height 截图所在图像的长宽
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
		context = new Context(new EnsembleAlgorithm());//最新的融合好的算法
		ImageObj imgobj = new ImageObj();//操作的图像对象
		imgobj.setSource("D:1.png");// 大图，待匹配的图像
		imgobj.setTemplate("D:a.png");// 小图，模板图像
		imgobj.setStartx(354);
		imgobj.setStarty(24);// 截图起始点坐标
		imgobj.setEndx(515);
		imgobj.setEndy(87);//截图终点坐标
		imgobj.setWidth(540);
		imgobj.setHeight(960);//所截图像所在图像的宽高
		MatchResult result = context.contextInterface(imgobj);//返回结果
		/*			MatchResult 结果含义
		 * result.startx
		 *result.starty // 匹配目标起始点
		 *result.endx
		 *result.endy   // 匹配目标终点
		 *result.successflag // 成功的标志
		 * */
		result.dispResult();//输出结果
		imgobj.writeResult(result,"result.jpg");//将图像生成到某个路径中
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
