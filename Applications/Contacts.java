// Created in 2016.09.11, Changshu, China. By Pengyue Jiang.
// 当我学习了面向对象之后，看到了这个程序就笑了。
import java.util.Scanner;
public class Contacts {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("进入联系人查询系统");
		String password;
		do {
			System.out.println("请输入密码来允许次操作：");
			password = in.next();
			if (!password.equals("contacts.java")) {
				System.out.println("密码错误");
			}
		} while (!password.equals("contacts.java"));
		String search;
		String response;
		System.out.println("您获得了查看联系人的权限");
		do {
			System.out.println("请输入要查找的联系人");
			search = in.next();
			switch (search) {
				case "Chen_Xinyi":
					System.out.println("姓名：陈薪忆");
					System.out.println("性别：女");
					System.out.println("出生日期：2001年10月08日");
					System.out.println("手机号码：13812759773");
					System.out.println("QQ号码：1322562081");
					System.out.println("邮箱地址：1322562081@qq.com");
					break;
				case "Kang_An":
					System.out.println("姓名：康桉");
					System.out.println("性别：男");
					System.out.println("出生日期：2001年10月24日");
					System.out.println("QQ号码：2282615401");
					System.out.println("邮箱地址：2282615401@qq.com");
					break;
				case "Lao_Yi":
					System.out.println("姓名：劳逸");
					System.out.println("性别：女");
					System.out.println("出生日期：2000年10月07日");
					System.out.println("手机号码：15888353366");
					System.out.println("QQ号码：1076840854");
					System.out.println("邮箱地址：1076840854@qq.com");
					break;
				case "Li_Jialuo":
					System.out.println("姓名：李佳洛");
					System.out.println("性别：女");
					System.out.println("出生日期：2001年02月01日");
					System.out.println("手机号码：18324515396");
					System.out.println("QQ号码：2335598677");
					System.out.println("邮箱地址：m2335598677@163.com");
					System.out.println("邮箱地址2：jlli@uwcchina.org");
					break;
				case "Liu_Xinyan":
					System.out.println("姓名：柳欣言");
					System.out.println("性别：女");
					System.out.println("出生日期：2001年02月02日");
					System.out.println("手机号码：13913576513");
					System.out.println("QQ号码：982513144");
					System.out.println("邮箱地址：xyliu@uwcchina.org");
					break;
				case "Lu_Jiaqi":
					System.out.println("姓名：陆佳琪");
					System.out.println("性别：女");
					System.out.println("出生日期：2001年01月31日");
					System.out.println("手机号码：15850091997");
					System.out.println("QQ号码：1164069044");
					System.out.println("邮箱地址：Fearlessviolet@126.com");
					break;
				case "Ni_Xiaoyang":
					System.out.println("姓名：倪潇洋");
					System.out.println("性别：男");
					System.out.println("出生日期：2001年07月04日");
					System.out.println("手机号码：13915579390");
					System.out.println("QQ号码：1739777611");
					System.out.println("邮箱地址：nxyyxn88@gmail.com");
					System.out.println("邮箱地址2：xyni@uwcchina.org");
					System.out.println("邮箱地址3：1739777611@qq.com");
					break;
				case "Shen_Suye":
					System.out.println("姓名：沈苏烨");
					System.out.println("性别：女");
					System.out.println("手机号码：13962120011");
					System.out.println("QQ号码：812179242");
					System.out.println("邮箱地址：suyeshen@gmail.com");
					break;
				case "Sun_MinQian":
					System.out.println("姓名：孙民乾");
					System.out.println("性别：男");
					System.out.println("手机号码：18351036129");
					System.out.println("QQ号码：1276955431");
					System.out.println("邮箱地址：1276955431@qq.com");
					break;
				case "Wang_Yuanhao":
					System.out.println("姓名：王元昊");
					System.out.println("性别：男");
					System.out.println("出生日期：2000年04月02日");
					System.out.println("手机号码：18913532578");
					System.out.println("QQ号码：2272625239");
					System.out.println("邮箱地址：yhwang@uwcchina.org");
					break;
				case "Wang_Zishi":
					System.out.println("姓名：王子实");
					System.out.println("性别：男");
					System.out.println("出生日期：2000年10月15日");
					System.out.println("QQ号码：1010844708");
					System.out.println("邮箱地址：thomaswang90909@gmail.com");
					break;
				case "William_Thomas_Reynolds_III":
					System.out.println("Name: William_Thomas_Reynolds_III");
					System.out.println("Gender: Male");
					System.out.println("Date of birth: September 26, 1980");
					System.out.println("QQID: 3388722648");
					System.out.println("E-mail address: Gaveler5x@hotmail.com");
					System.out.println("Secondary E-mail address: masonmaker0805@yahoo.com");
					break;
				case "Wu_Jing":
					System.out.println("姓名：吴静");
					System.out.println("性别：女");
					System.out.println("出生日期：2002年04月12日");
					System.out.println("手机号码：15850090020");
					System.out.println("QQ号码：898713216");
					System.out.println("邮箱地址：898713216@qq.com");
					break;
				case "Zhou_Sirui":
					System.out.println("姓名：周思睿");
					System.out.println("性别：女");
					System.out.println("出生日期：2001年06月05日");
					System.out.println("手机号码：13913690822");
					System.out.println("QQ号码：1594897946");
					System.out.println("邮箱地址：srzhou@uwcchina.org");
					break;
				case "Zhou_Songling":
					System.out.println("姓名：周凇凌");
					System.out.println("性别：女");
					System.out.println("出生日期：1999年10月23日");
					System.out.println("手机号码：13693578666");
					System.out.println("QQ号码：614035886");
					System.out.println("邮箱地址：slzhou@uwcchina.org");
					break;
				case "Zhu_Qingchuan":
					System.out.println("姓名：朱晴川");
					System.out.println("性别：女");
					System.out.println("出生日期：2001年03月11日");
					System.out.println("手机号码：18915633236");
					System.out.println("QQ号码：3209339769");
					System.out.println("邮箱地址：yootea@126.com");
					System.out.println("邮箱地址2：qczhu@uwcchina.org");
					break;
				default:
					System.out.println("输入无效");
					break;
			}
			System.out.println("是否继续进程？('y'/'n')");
			response = in.next();
		} while (response.equals("y"));
		System.out.println("程序终止");
	}
}
// Update history:
// 1.0.0 Enable user to check contacts.
// 1.1.0 Enable user to check contacts mutilple times.
// 1.2.0 Enable user to type in passwords mutiple times. Date: 2016.09.14.
// 1.2.1 Deleted unnecessary codes. Date: 2016.09.14.
// 1.2.1.1 Updated contact. Date: 2016.09.15.