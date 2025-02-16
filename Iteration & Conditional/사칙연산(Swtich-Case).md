```java
package java_tutorials;

public class Switch_case {

	public static void main(String[] args) {
		int num1, num2;
		num1 = 10;
		num2 = 2;
		var res = 0;
		char ops = '+';
		switch(ops) {
		case '+': res = num1 + num2;
			break;
			
		case '-': res = num1 - num2;
		break;
		
		case '*': res = num1 * num2;
		break;
		
		case '/': res = num1 / num2;
		break;
		}
		System.out.println(res);
	}

}
```
