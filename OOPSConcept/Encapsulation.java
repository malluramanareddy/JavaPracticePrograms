package OOPSConcept;
import java.util.*;
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //DEF : Binding the methods and Variables together in to a single unit or entity.		
       Area A=new Area(2,3);
       A.getArea();
        	
        }
}
	class Area{
		int l;
		int b;
		public Area(int l,int b) {
			this.l=l;
			this.b=b;
		}
		void getArea() {
			int area=l*b;
			System.out.println(area);
		}
		
		
	}


