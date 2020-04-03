import com.alibaba.fastjson.JSONObject;

import java.lang.reflect.Field;

public class test {
    public static void main(String[] args) throws IllegalAccessException {
        user a = new user();
        a.setAddress("杭州滨江");
        a.setId("dasdasdadgxcwertqw");
        a.setName("来利灿");
        JSONObject.toJSON(a);
       String ad= JSONObject.toJSONString(a);
        System.out.println(ad);
        Class<user> userClass = user.class;
        Field[] declaredFields = userClass.getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++) {
            Field declaredField = declaredFields[i];
            System.out.println(declaredField.getName());
            System.out.println(declaredField.get(a));
        }
//dev分支

    }
}
