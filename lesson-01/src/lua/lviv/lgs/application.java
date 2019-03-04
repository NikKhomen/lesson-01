package lua.lviv.lgs;

public class application {

	public static void main(String[] args) {
		
	//	int a = 2;
	//	long b = 3;
		
	//	System.out.println("var a = " +a);
	//	System.out.println("var b = " +b);
		
		
		//пример 1 :додавання и виднимання зминных
		
		//int d = 1;
		//int e = 2;
		
		//int res1 = d + e;
		//int res2 = d - e;
		//int res3 = d * e;
		//int res4 = d / e;
		
		//System.out.println("res1 = " + res1);
		//System.out.println("res2 = " + res2);
		//System.out.println("res3 = " + res3);
		//System.out.println("res4 = " + res4);
		
		
		//приклад 2 какой буде результат виведення на екран? (инкремент дикремент)
		//int a = 0;
		//int b = a++;
		//int c = a++;
		//System.out.println("a = " + a + b + c);
		
		//операции з присвоенням
		
		//int f = 1;
		//int g = 2;
		//int h = 3;
		
		//f += 5;// f = f + 5..f = 1 + 5
		//g *= 4;//g=g*4 =) g = 2 * 4 = 8
		//h += f * g;//h = h + f*g =) 3 + 6*8 = 51
		//h %= 6;// h = h % 6 =) h = 51%6 = 3
		
		//System.out.println("f = " + f);
		//System.out.println("g = " + g);
		//System.out.println("h = " + h);
		
		// пример 4 тернарный операторы
		
		//int a = 2;
		
		//int r = a < 0? -3 : 2;
	//.//.a.	System.out.println("r = " + r);
		
		//ример 5 лигоческие операторы
		
		//boolean j = true;
		//boolean k = false;
		//boolean l = j | k;//1 + 0 = 1 is true
		//boolean m = j & k;//1 * 0 = 0 is false
		//boolean n = (!j & k) | (j & !k);//(0*0=0) +(1*1) =0 + 1 =>true
		//boolean o = !j;//0 => false
		
		//System.out.println("j = " + j);
		//System.out.println("k = " + k);
		//System.out.println("l = " + l);
		//System.out.println("m = " + m);
		//System.out.println("n = " + n);
		//System.out.println("o = " + o);
		
		
		//пример 6  операции ровности
		
	//	int t = 5;
	//	int u = 5;
		//String result = (t<u) ? "Yes": "NO";
		//String result2 = (t==u) ? "Yes": "NO";
		//String result3 = (t>=u) ? "Yes": "NO";
		
		//System.out.println("result = " + result);
		//System.out.println("result2 = " + result2);
		//System.out.println("result3 = " + result3);
		
		
		
		
		//пример 7 конструкцыя if-else
		
		//int a1 = 22;
		//int b1 = 3;
		//if(a1 > b1){
			//System.out.println("a1 > b1");
		//}else
		//{
		//System.out.println("a1 < b1");
		//}
		
	//пример 8 конструкцыя if-else-if
	//	
		//int a1 = 3;
		//int b1 = 9;
		//if(a1 * a1 == b1) {
			//System.out.println("1");
		//}
		//else if(a1 * a1 < b1){
			//System.out.println("2");
		//}
		//else {
			//System.out.println("3");
		//}
		
		//конструкцыя switch
		
	//	int k1 = 4;
		
		
		//switch(k1) {
		//case 1: case 3: case 4 :
			//	System.out.println("1,3,4");break;
				//
		//case 2: System.out.println("2");
		//default : System.out.println("default");
		//}
		
		
		//10 цыкл for
		
		//for(int i = 0; i < 10; i++) {
		//	System.out.println("i = " + i);
		//}
		
		
		//11 пример цыкла while
		
	//	int i = 0;
		
	//	while(i < 10) {
	//		System.out.println("i = " + i);
	//		i++;
	//	}
		
		//12 do while
		
	//	int i = 0;
	//	
	//	do {
	//		System.out.println("i = " + i);	
	//		i++;
	//	 }while (i == 10);
		
		
		//10  пример,массивы
		
		//int array1 [] = new int [10];
		//double [] array2 = new double [10];
		//double array3 [] = {1.1, 2.2, 3.3, 4.4, 5.5 };
		//
		//for (int i = 0; i < array1.length; i++) {
			//array1[i] = i;
			//array2[i] = i*i;
		//}
		//for (int i = 0; i < array1.length; i++) {
			//System.out.print(array1[i] + " ->");
			//System.out.println(array2[i]);
		//}
		//for (int i = 0; i < array3.length; i++) {
			//System.out.println(array3[i]);
		//}
		
		
		//пример 13 обложки примитивов wrappers
		
		//Byte a1 = 2;
		//Short a2 = 2;
		//Integer a3 = 2;
		//Long a4 = 2l;
		//
		//int a5 = a1;
		//a3 = a5;
	//	
		//Double b = 2.2;
		//Float b1 = 3.3F;
		
		System.out.println("Byte = " + Byte.MAX_VALUE);
		
		
		
		
		
		
		
		
		
	}
	
}
