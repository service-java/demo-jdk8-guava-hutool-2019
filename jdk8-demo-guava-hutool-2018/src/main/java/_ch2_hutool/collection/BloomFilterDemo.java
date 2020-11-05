package _ch2_hutool.collection;

import cn.hutool.bloomfilter.BitMapBloomFilter;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-05-24 14:46
 */
public class BloomFilterDemo {

    public static void main(String[] args) {

        BitMapBloomFilter filter = new BitMapBloomFilter(10);
        filter.add("123");
        filter.add("abc");
        filter.add("ddd");

        // 查找
        System.out.println(filter.contains("abc"));
        System.out.println(filter.contains("abc3"));
    }
}
