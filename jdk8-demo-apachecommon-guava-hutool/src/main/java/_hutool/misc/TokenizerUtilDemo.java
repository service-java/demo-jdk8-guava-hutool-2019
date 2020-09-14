package _hutool.misc;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.extra.tokenizer.Result;
import cn.hutool.extra.tokenizer.TokenizerEngine;
import cn.hutool.extra.tokenizer.TokenizerUtil;
import cn.hutool.extra.tokenizer.Word;
import cn.hutool.extra.tokenizer.engine.hanlp.HanLPEngine;

import java.util.Iterator;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-05-24 14:36
 */
public class TokenizerUtilDemo {

    public static void main(String[] args) {
//        需要依赖包  com/hankcs/hanlp/HanLP
        TokenizerEngine engine = new HanLPEngine();

// // 解析文本
// String text = "这两个方法的区别在于返回值";
// Result result = engine.parse(text);
// // 输出：这 两个 方法 的 区别 在于 返回 值
// String resultStr = CollUtil.join((Iterator<Word>)result, " ");
// TokenizerEngine engine = TokenizerUtil.createEngine();

        // 解析文本
        String text = "这两个方法的区别在于返回值";
        Result result = engine.parse(text);
        //输出：这 两个 方法 的 区别 在于 返回 值
        String resultStr = CollUtil.join((Iterator<Word>)result, "+");

        System.out.println(resultStr); // 这+两+个+方法+的+区别+在于+返回+值
    }
}
