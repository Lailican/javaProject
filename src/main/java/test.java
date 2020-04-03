import com.alibaba.fastjson.JSONObject;

import java.lang.reflect.Field;

public class test {
    public static void main(String[] args) throws IllegalAccessException {
        user a = new user();
        a.setAddress("杭州滨江");
        a.setId("dasdasdadgxcwertqw");
        a.setName("来利灿");
        //dev改动 哈哈哈
        JSONObject.toJSON(a);
       String ad= JSONObject.toJSONString(a);
        System.out.println(ad);
        //master改动
        Class<user> userClass = user.class;
        Field[] declaredFields = userClass.getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++) {
            Field declaredField = declaredFields[i];
            System.out.println(declaredField.getName());
            //dev改动 哈哈哈5
            System.out.println(declaredField.get(a));
        }
        //dev改动 哈哈哈2

    }
}
