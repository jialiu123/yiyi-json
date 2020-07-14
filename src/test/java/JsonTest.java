import com.yiyi.JsonObject;
import com.yiyi.exception.JsonException;
import com.yiyi.parse.DefaultJsonLexer;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;

/**
 * 测试解析json
 *
 * @author ：liujia
 * @date ：Created in 2020/7/14 9:17
 * @version: 1.0
 */
//@Slf4j(topic = "jsonTest")
public class JsonTest {

    @Test
    public void testJson() throws JsonException {
        String jsonString = "{\"name\":\"战三\",\"age\":23,\"sex\":false}";
        Reader reader = new StringReader(jsonString);

        new JsonObject().parse(jsonString, new DefaultJsonLexer(reader));
    }


}
