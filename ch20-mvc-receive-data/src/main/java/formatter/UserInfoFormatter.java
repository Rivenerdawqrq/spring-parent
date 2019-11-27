package formatter;

import entity.UserInfo;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

/**自定义格式化器的做法如下:
        * 1.写一个类,实现Formatter接口
        *  parse用来把字符串转换为实现接口时指定的类型实参
        *  print用来把指定的类型实参转换为字符串
        *
        * 2.在控制器类中,利用InitBinder注解给数据绑定器添加自己编写的格式化器
        **/

public class UserInfoFormatter implements Formatter<UserInfo> {
    @Override
    public UserInfo parse(String s, Locale locale) throws ParseException {
        String[] data = s.split(",");

        UserInfo userInfo = new UserInfo();
        userInfo.setName(data[0]);
        userInfo.setGender(data[1]);
        return userInfo;
    }

    @Override
    public String print(UserInfo userInfo, Locale locale) {
        return userInfo.toString();
    }
}
