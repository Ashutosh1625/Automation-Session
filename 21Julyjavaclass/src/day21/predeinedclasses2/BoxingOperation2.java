package day21.predeinedclasses2;

public class BoxingOperation2 {

public static void main(String[] args) {
		
		char c1='A';	
		Character charObj1=c1;// boxing implicit/auto boxing
		System.out.println(c1==charObj1);//
		Character charObj2='Z';// boxing implicit/auto boxing
		
		Character charObj3='H';// boxing implicit/auto boxing
		
		System.out.println("c1: "+c1);//
		System.out.println("charObj1: "+charObj1);
		System.out.println("charObj2: "+charObj2);
		System.out.println("charObj3: "+charObj3);
		
		//unboxing
		char ch=charObj1.charValue();
		System.out.println("ch :"+ch);
		
		boolean b=true;//
		Boolean bObj=b;//
		System.out.println(bObj==b);
		
		//unboxing
		boolean bn=bObj.booleanValue();
		System.out.println("bn "+bn);
	}
}