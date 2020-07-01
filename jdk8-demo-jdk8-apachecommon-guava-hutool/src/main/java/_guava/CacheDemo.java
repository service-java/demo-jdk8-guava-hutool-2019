package _guava;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.Lists;
import org.apache.commons.collections.CollectionUtils;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2019-12-26 10:37
 */
public class CacheDemo {

    public static void main(String[] args) {
        TestCache testCache = new TestCache();
        String cacheKey = testCache.buildKey("dateKey");
        System.out.println(testCache.getIfPresent(cacheKey));
        System.out.println(testCache.getCache(cacheKey));
        testCache.putCache(cacheKey, Arrays.asList(1L,2L,3L,4L,5L));
        System.out.println(testCache.getIfPresent(cacheKey));
        System.out.println(testCache.getCache(cacheKey));
    }

    static class TestCache {

        public static LoadingCache<String, List<Long>> loadingCache = null;

        public TestCache(){
            init();
        }

        public void init(){
            loadingCache = CacheBuilder.newBuilder()
                    .expireAfterWrite(5, TimeUnit.MINUTES) // 5分钟自动过期
                    .build(new CacheLoader<String, List<Long>>() {
                        @Override
                        public List<Long> load(String key) throws Exception {
                            return Lists.newArrayList(); // 默认数据不存在的获取方法
                        }
                    });
        }

        //获取数据，如果不存在返回null
        public List<Long> getIfPresent(String key){
            return loadingCache.getIfPresent(key);
        }

        //获取数据，如果数据不存在则通过cacheLoader获取数据，缓存并返回
        public List<Long> getCache(String key){
            try {
                return loadingCache.get(key);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        //直接向缓存put数据
        public void putCache(String key, List<Long> value){
            if(CollectionUtils.isEmpty(value)){
                return;
            }
            loadingCache.put(key, value);
        }

        // 构建缓存Key
        public String buildKey(String cacheKey){
            return cacheKey;
        }
    }

}
