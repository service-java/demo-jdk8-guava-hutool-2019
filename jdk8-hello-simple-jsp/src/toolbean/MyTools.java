package toolbean;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyTools {
	// static 直接通过类名访问
	public static String change(String str){
		str=str.replace("<","&lt;");
		str=str.replace(">","&gt;");
		return str;
	}



	/**
	 * @功能 转换字符串中属于HTML语言中的特殊字符
	 * @参数 source为要转换的字符串
	 * @返回值 String型值
	 */
	public static String changeHTML(String source){
		String changeStr="";
		changeStr=source.replace("&","&amp;");			//转换字符串中的“&”符号
		changeStr=changeStr.replace(" ","&nbsp;");		//转换字符串中的空格
		changeStr=changeStr.replace("<","&lt;");		//转换字符串中的“<”符号
		changeStr=changeStr.replace(">","&gt;");		//转换字符串中的“>”符号
		changeStr=changeStr.replace("\r\n","<br>");		//转换字符串中的回车换行
		return changeStr;
	}
    /**
     * @功能 将Date型日期转换成指定格式的字符串形式，如“yyyy-MM-dd HH:mm:ss”
     * @参数 date为要被转换的Date型日期
     * @返回值 String型值
     */
	public static String changeTime(Date date) {
		//创建一个格式化日期的SimpleDateFormat类对象，并同时指定日期最终被转换成的样式
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return format.format(date);			//调用format()方法格式化日期
	}
	/**
	 * @功能 解决通过提交表单产生的中文乱码
	 * @参数 value为要转换的字符串
	 * @返回值 String型值
	 */
    public  static String  toChinese(String str) {
		if(str==null)
			str="";
		try {
			str=new String(str.getBytes("ISO-8859-1"),"utf-8");
		} catch (UnsupportedEncodingException e) {
			str="";
			e.printStackTrace();
		}
		return str;
	}

	public  static String[]  toChinese(String[] str) {
		if(str == null)
			str = new String[1];
		try {
			for(int i=0; i < str.length; i++) {
				str[i] = new String(str[i].getBytes("ISO-8859-1"),"utf-8");
			}

		} catch (UnsupportedEncodingException e) {
			str = new String[1];
			e.printStackTrace();
		}
		return str;
	}


	public static int strToint(String str){			//将String型数据转换为int型数据的方法
		if(str==null||str.equals(""))
			str="0";
		int i=0;
		try{
			i=Integer.parseInt(str);
		}catch(NumberFormatException e){
			i=0;
			e.printStackTrace();
		}
		return i;		
	}

	public static String strArrToStr(String[] s) {
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < s.length; i++){
			sb.append(s[i] + " ");
		}
		String str = sb.toString();
		return str;
	}

}
