// todo list 등록기능 추가하기
// 제라의 공식
//((21*a/4)+(5*b/4)+(26*(c+1)/10)+d-1)%7;
// a: 연도의 앞 2자리, b : 연도의 뒤 2자리, c : 월, d:일
// ex) 2007년 9월 10일 => a:20 b:7 c:9 d:10
// !notice:c(월)가 1이나 2일경우 연도는 -1, 1은 13, 2는 14로 변경
// 계산 결과 0 : 일, 1 : 월, 2 : 화, ...



package javaCalendar;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

class javaCalendar2{
	private static int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};

	public static HashMap<String, String> todoMap = new HashMap<>();
	public static void main(String[] args) {
		Date today = new Date();
		DateFormat format = DateFormat.getDateInstance(DateFormat.MEDIUM);
		String date = format.format(today);
		Scanner scan = new Scanner(System.in);
		int year = Integer.parseInt(date.substring(0, 4));
		int month = Integer.parseInt(date.substring(6,7));
		getLeafDays(year);
		for(int i = 0; i<MAX_DAYS.length;i++){
			for (int j = 1; j <= MAX_DAYS[i]; j++) {
				String key = year+"-"+i+"-"+j;
				todoMap.put(key, "");
			}
		}
		int menu = 0;
		while (menu != -1) {
			System.out.println("+----------------------+");
			System.out.println("| 1. 일정 등록                                   |");
			System.out.println("| 2. 일정 검색                                   |");
			System.out.println("| 3. 달력 보기                                   |");
			System.out.println("| h. 도움말  q.종료                          |");
			System.out.println("+----------------------+");
			System.out.println("메뉴를 선택하세요.");
			System.out.print("cal>> ");
			menu = scan.nextInt();
			scan.nextLine();
			date = getDate(year, month);
			
			if(menu == -1){
				System.out.println("Bye~");
				break;
			}else if(menu == 1){
				System.out.println("[일정 등록] 날짜를 입력하세요. ex) 2018-04-25");
				System.out.print("> ");
				String key = scan.nextLine();
				System.out.println("[일정 등록] 일정을 입력하세요");
				System.out.print("> ");
				String value = scan.nextLine();
				todoList(key, value);
			}else if(menu == 2){
				System.out.println("[일정 검색] 날짜를 입력하세요. ex) 2018-04-25");
				System.out.print("> ");
				String key = scan.nextLine();
				todoView(key);
			}else if(menu == 3){
				print(year, month, date);
			}else if(menu == 'q'){
				System.out.println("Bye~");
				break;
			}
		}
		scan.close();
	}
	static void print(int year, int month, String date){
		int add = 0;
		if(date.equals("월")){
			add = 1;
		}else if(date.equals("화")){
			add = 2;
		}else if(date.equals("수")){
			add = 3;			
		}else if(date.equals("목")){
			add = 4;
		}else if(date.equals("금")){
			add = 5;
		}else if(date.equals("토")){
			add = 6;
		}
		System.out.printf("     <<%4d년 %3d월>>\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");
		int count=0;
		for (int i = 1; i <= 7; i++) {
			if(add>0){
				System.out.printf("%3s"," ");
				add--;
			}else{
				System.out.printf("%3d",++count);
			}
		}
		int tmp = count++;
		System.out.println();
		for (int i = count; i <= MAX_DAYS[month-1]; i++) {
			System.out.printf("%3d",count++);
			if((i-tmp) % 7 == 0 || i == MAX_DAYS[month-1]){
				System.out.println();
			}
		}
	}
	public static void getLeafDays(int year){
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
			MAX_DAYS[1] = 29;
		}else{
			MAX_DAYS[1] = 28;
		}
	}
	public static String getDate(int year, int month){
		int a, b, c, d;
		if(month == 1 || month == 2){
			year-=1;
			month+=12;
		}
		String tmp;
		tmp = (year+"").substring(0, 2);
		a = Integer.parseInt(tmp);
		tmp = (year+"").substring(2, 4);
		b = Integer.parseInt(tmp);
		c = month;
		d = 1;
		int D = ((21*a/4)+(5*b/4)+(26*(c+1)/10)+d-1)%7;
		switch (D) {
		case 0:
			return "일";
		case 1:
			return "월";
		case 2:
			return "화";
		case 3:
			return "수";
		case 4:
			return "목";
		case 5:
			return "금";
		case 6:
			return "토";
		default:
			return "일";
		}
	}
	// 할 일 목록 저장
	public static void todoList(String key, String value){
		todoMap.put(key, value);
		System.out.println("일정이 등록되었습니다.");
	}
	// 할 일 목록 보기
	public static void todoView(String key){
		if(todoMap.containsKey(key)){
			
			System.out.println(todoMap.get(key) +" 일정이 있습니다.");
		}else{
			System.out.println("일정이 업습니다.");
		}
	}
	
}