package _hutool;

import cn.hutool.core.util.XmlUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.xpath.XPathConstants;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-05-24 14:11
 */
public class XmlUtilsDemo {
    public static void main(String[] args) {

        Document docResult = XmlUtil.readXML("demo.xml");
        //结果为“ok”
        Object value = XmlUtil.getByXPath("//returnsms/message", docResult, XPathConstants.STRING);
        System.out.println(value);
//        Element uniq = docResult.getElementById("taskID");
//        System.out.println(uniq);
    }
}
