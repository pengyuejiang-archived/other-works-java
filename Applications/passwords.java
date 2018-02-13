// Created in 2016.09.11, Changshu, China. By Pengyue Jiang.
import java.util.Scanner;
public class passwords {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("进入密码查询系统");
		String password;
		do {
			System.out.println("请输入密码来允许次操作：");
			password = in.next();
			if (!password.equals("stzoakhaarlmee")) {
				System.out.println("密码错误");
			}
		} while (!password.equals("stzoakhaarlmee"));
		String search;
		String response;
		System.out.println("您获得了查看密码的权限");
		do {
			System.out.println("请输入要查询的内容");
			search = in.next();
			switch (search) {
				case "126":
					System.out.println("网址：www.126.com");
					System.out.println("账号：pengyuejiang200109@126.com");
					System.out.println("密码：20010913Jiang");
					break;
				case "163":
					System.out.println("网址：mail.163.com");
					System.out.println("账号：13776026793@163.com");
					System.out.println("密码：20010913Jiang");
					break;
				case "4399":
					System.out.println("网址：www.4399.com");
					System.out.println("账号：stzoakhaarlmee");
					System.out.println("密码：20010913Jiang");
					break;
				case "51zxw":
					System.out.println("网址：www.51zxw.net");
					System.out.println("账号：stzoakhaarlmee");
					System.out.println("密码：stzoak");
					break;
				case "adobeid":
					System.out.println("账号：pengyuejiang200109@126.com");
					System.out.println("密码：20010913Jiang");
					break;
				case "appleid1":
					System.out.println("账号：3077781889@qq.com");
					System.out.println("密码：20010913Jiang");
					break;
				case "appleid2":
					System.out.println("账号：pengyuejiang200109@126.com");
					System.out.println("密码：20010913Jiang");
					break;
				case "appleid3":
					System.out.println("账号：pengyuejiang19@student.ssis-suzhou.net");
					System.out.println("密码：20010913Jiang");
					break;
				case "appleid4":
					System.out.println("账号：13776026793@163.com");
					System.out.println("密码：Zhou123!");
					break;
				case "baidu":
					System.out.println("网址：www.baidu.com");
					System.out.println("账号：天上又掉金子了");
					System.out.println("密码：20010913Jiang");
					break;
				case "brainpop":
					System.out.println("网址：www.brainpop.com");
					System.out.println("账号：ssiss");
					System.out.println("密码：ssiss");
					break;
				case "britannica":
					System.out.println("网址：www.global.britannica.com");
					System.out.println("账号：ssis");
					System.out.println("密码：britannica46");
					break;
				case "codeacademy":
					System.out.println("网址：www.codeacademy.com");
					System.out.println("账号：pengyuejiang200109@126.com");
					System.out.println("密码：20010913Jiang");
					break;
				case "conceptispuzzles":
					System.out.println("网址：www.conceptispuzzles.com");
					System.out.println("账号：stzoakhaarlmee");
					System.out.println("密码：20010913Jiang");
					break;
				case "ebscohost":
					System.out.println("网址：search.ebscohost.com");
					System.out.println("账号：ssis");
					System.out.println("密码：ssis");
					break;
				case "facebook":
					System.out.println("网址：www.facebook.com");
					System.out.println("账号：13776026793@163.com");
					System.out.println("密码：20010913Jiang");
					break;
				case "goethe":
					System.out.println("网址：www.goethe.de");
					System.out.println("账号：pyjiang@uwcchina.org");
					System.out.println("密码：20010913Jiang");
					break;
				case "googleid":
					System.out.println("账号：stzoakhaarlmee@gmail.com");
					System.out.println("密码：20010913Jiang");
					break;
				case "hujiang":
					System.out.println("网址：www.hujiang.com");
					System.out.println("账号：pengyuejiang200109@126.com");
					System.out.println("密码：20010913Jiang");
					break;
				case "khanacademy":
					System.out.println("网址：www.khanacademy.org");
					System.out.println("账号：13776026793@163.com");
					System.out.println("密码：20010913Jiang");
					break;
				case "managebac":
					System.out.println("网址：uwccsc.managebac.com");
					System.out.println("账号：pyjiang@uwcchina.org");
					System.out.println("密码：stzoakhaarlmee");
					break;
				case "musescore1":
					System.out.println("网址：musescore.com");
					System.out.println("账号：pengyuejiang200109@126.com");
					System.out.println("密码：20010913Jiang");
					break;
				case "musescore2":
					System.out.println("网址：musescore.com");
					System.out.println("账号：Ray Remdile");
					System.out.println("密码：20010913Jiang");
					break;
				case "musescore3":
					System.out.println("网址：musescore.com");
					System.out.println("账号：stzoakhaarlmee");
					System.out.println("密码：20010913Jiang");
					break;
				case "musescore4":
					System.out.println("网址：musescore.com");
					System.out.println("账号：White Black Key");
					System.out.println("密码：20010913Jiang");
					break;
				case "powerschool":
					System.out.println("账号：stzoakhaarlmee");
					System.out.println("密码：20010913Jiang");
					break;
				case "qqid1":
					System.out.println("账号：3077781889");
					System.out.println("密码：20010131Lu");
					break;
				case "qqid2":
					System.out.println("账号：1247358661");
					System.out.println("密码：20010913Jiang");
					break;
				case "qqid3":
					System.out.println("账号：212751759");
					System.out.println("密码：20010913Jiang");
					break;
				case "quizlet":
					System.out.println("网址：quizlet.com");
					System.out.println("账号：wercoms");
					System.out.println("密码：20010913Jiang");
					break;
				case "segmentfault":
					System.out.println("网址：segmentfault.com");
					System.out.println("账号：stzoakhaarlmee");
					System.out.println("密码：20010913Jiang");
					break;
				case "ssismail":
					System.out.println("网址：student.ssis-suzhou.net");
					System.out.println("账号：pengyuejiang19");
					System.out.println("密码：200109!");
					break;
				case "surveymonkey":
					System.out.println("网址：www.surveymonkey.com");
					System.out.println("账号：stzoakhaarlmee");
					System.out.println("密码：20010913Jiang");
					break;
				case "toeflpractice":
					System.out.println("网址：toeflpractice.ets.org");
					System.out.println("账号：pengyuejiang200109@126.com");
					System.out.println("密码：20010913Jiang");
					break;
				case "trelloid":
					System.out.println("账号：Cargo Cell");
					System.out.println("账号：pyjiang@uwcchina.org");
					System.out.println("密码：20010913Jiang");
					break;
				case "uwcfiles":
					System.out.println("网址：files.uwcchina.org");
					System.out.println("账号：pyjiang");
					System.out.println("密码：20010913Jiang");
					break;
				case "uwcmail":
					System.out.println("网址：mail.uwcchina.org");
					System.out.println("账号：pyjiang@uwcchina.org");
					System.out.println("密码：20010913Jiang");
					break;
				case "vocabulary":
					System.out.println("网址：www.vocabulary.com");
					System.out.println("账号：Pirate_1");
					System.out.println("密码：20010913Jiang");
					break;
				case "websudoku":
					System.out.println("网址：www.websudoku.com");
					System.out.println("账号：pengyuejiang200109@126.com");
					System.out.println("密码：20010913Jiang");
					break;
				case "weiosx":
					System.out.println("网址：www.weiosx.com");
					System.out.println("账号：Cargo_Cell");
					System.out.println("密码：20010913Jiang");
					break;
				case "wideo":
					System.out.println("网址：get.wideo.co");
					System.out.println("账号：pengyuejiang200109@126.com");
					System.out.println("密码：20010913Jiang");
					break;
				case "xgps":
					System.out.println("网址：www.xgps.net");
					System.out.println("账号：姜芃越");
					System.out.println("密码：010913");
					break;
				case "xinliceshi":
					System.out.println("网址：types.yuzeli.com");
					System.out.println("账号：pengyuejiang200109@126.com");
					System.out.println("密码：20010913Jiang");
					break;
				case "showlist":
					System.out.println("126");
					System.out.println("163");
					System.out.println("4399");
					System.out.println("51zxw");
					System.out.println("adobeid");
					System.out.println("appleid1");
					System.out.println("appleid2");
					System.out.println("appleid3");
					System.out.println("appleid4");
					System.out.println("baidu");
					System.out.println("brainpop");
					System.out.println("britannica");
					System.out.println("codeacademy");
					System.out.println("conceptispuzzles");
					System.out.println("ebscohost");
					System.out.println("facebook");
					System.out.println("goethe");
					System.out.println("googleid");
					System.out.println("hujiang");
					System.out.println("khanacademy");
					System.out.println("managebac");
					System.out.println("musescore1");
					System.out.println("musescore2");
					System.out.println("musescore3");
					System.out.println("musescore4");
					System.out.println("powerschool");
					System.out.println("qqid1");
					System.out.println("qqid2");
					System.out.println("qqid3");
					System.out.println("quizlet");
					System.out.println("segmentfault");
					System.out.println("ssismail");
					System.out.println("surveymonkey");
					System.out.println("toeflpractice");
					System.out.println("trelloid");
					System.out.println("uwcfiles");
					System.out.println("uwcmail");
					System.out.println("vocabulary");
					System.out.println("websudoku");
					System.out.println("weiosx");
					System.out.println("wideo");
					System.out.println("xgps");
					System.out.println("xinliceshi");
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
// 1.0.0 Enable user to check passwords.
// 1.1.0 Enable user to check passowrds mutilple times.
// 1.2.0 Enable user to type in passwords mutiple times. Date: 2016.09.14.
// 1.2.1 Deleted unnecessary codes. Date: 2016.09.14.
// 2.0.0 Enable user to check for account list. Date: 2016.10.21.