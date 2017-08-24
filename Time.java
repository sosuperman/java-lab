import java.util.Scanner;
public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter First Time");
		int h1 = in.nextInt();
		int m1 = in.nextInt();
		int s1 = in.nextInt();
		Time24 t1 = new Time24(h1, m1, s1);
		System.out.println("Enter Second Time");
		int h2 = in.nextInt();
		int m2 = in.nextInt();
		int s2 = in.nextInt();
		Time24 t2 = new Time24(h2, m2, s2);
		Time24 addRes = Time24.add(t1, t2);
		System.out.println("Resultant of\nTime: "+t1.h+":"+t1.m+":"+t1.s+" and\nTime: "+t2.h+":"+t2.m+":"+t2.s+" is = "+addRes.h+":"+addRes.m+":"+addRes.s);
		//INCREMENT
		System.out.println("How Many Mins you want to increase??");
		int min = in.nextInt();
		Time24 inc = t1.incremnet(min);
		System.out.println("Incremented Time is: "+inc.h+":"+inc.m+":"+inc.s);
		//DECREMENT`	`	`		
		System.out.println("How Many Mins you want to increase??");
		int minD = in.nextInt();
		Time24 dec = t2.incremnet(minD);
		System.out.println("Incremented Time is: "+dec.h+":"+dec.m+":"+dec.s);
		
		in.close();
	}

}
class Time24{
	int h, m, s;
	Time24(){
		h = 0;
		m = 0;
		s = 0;
	}
	Time24(int h, int m, int s){
		this.h = h;
		this.m = m;
		this.s = s;
	}
	public static Time24 add(Time24 t1, Time24 t2){
		int hh = t1.h+t2.h;
		int mm = t1.m+t2.m;
		int ss = t1.s+t2.s;
		if(ss>60){
			ss = ss%60;
			mm = mm+1;
		}
		if(mm>60){
			mm = mm%60;
			hh = hh+1;
		}
		if(hh==24)
			hh = 0;
		else if(hh>24){
			hh = 0; 
			mm = 0; 
			ss = 0;
		}
		return new Time24(hh,mm,ss);
	}
	public Time24 incremnet(int min){
		m = m+min;
		if(m>60){
			m = m % 60;
			h = h+1;
		}
		if(h==24)
			h = 0;
		else if(h>24){
			h = 0; 
			m = 0; 
			s = 0;
		}
		return new Time24(h,m,s);
	}
	public Time24 decrement(int min){
		m = m - min;
		return new Time24(h,m,s);
	}
}
