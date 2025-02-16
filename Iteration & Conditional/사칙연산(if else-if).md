```java
package java_tutorials;

public class Ch4_nb1 {

	public static void main(String[] args) {
		int num1, num2;
		num1 = 10;
		num2 = 2;
		var res = 0;
		char ops = '+';
		if(ops == '+') {
			res = num1 + num2;
			System.out.print(num1+" + "+num2+" = "+res);
		}
		else if(ops == '-') {
			res = num1 - num2;
			System.out.print(num1+" - "+num2+" = "+res);
		}
		else if(ops == '*') {
			res = num1 * num2;
			System.out.print(num1+" * "+num2+" = "+res);
		}
		else if(ops == '/') {
			res = num1 / num2;
			System.out.print(num1+" / "+num2+" = "+res);
		}
		
		
	}

}
```
