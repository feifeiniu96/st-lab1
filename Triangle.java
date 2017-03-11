package javaPro;

public class Triangle {
	
	public int triangles(int a, int b, int c){
		if(a+b>c && a+c>b && b+c>a){
			if( a==b&& b==c ){
				System.out.println("This is an equilateral.");
				return 0;
			}else if(a==b || a==c || b==c){
				System.out.println("This is a isosceles.");
				return 1;
			}else{
				System.out.println("This is a scalene.");
				return 2;
			}
		}else{
			System.out.println("This is not a triangle.");
			return 3;
		}
	}
}
