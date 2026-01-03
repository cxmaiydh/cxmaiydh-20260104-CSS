```java
  public class HelloWorld {
      public static void main(String[] args) {
                // 打印欢迎信息
          System.out.println("Welcome to Java Programming!");

          // 声明变量
          int number = 10;
                double pi = 3.14159;

          // 使用if-else语句
          if (number > 0) {
                        System.out.println("Number is positive.");
          } else {
                        System.out.println("Number is not positive.");
          }

          // 使用for循环
          for (int i = 0; i < 5; i++) {
                        System.out.println("Iteration " + i);
          }

          // 使用switch语句
          int day = 3;
                switch (day) {
                  case 1:
                                    System.out.println("Monday");
                                    break;
                  case 2:
                                    System.out.println("Tuesday");
                                    break;
                  case 3:
                                    System.out.println("Wednesday");
                                    break;
                  default:
                                    System.out.println("Not a valid day.");
                }

          // 使用while循环
          int j = 0;
                while (j < 10) {
                              System.out.println("Value of j: " + j);
                              j++;
                }

          // 使用try-catch块
          try {
                        int result = 10 / 0;
          } catch (ArithmeticException e) {
                        System.out.println("Cannot divide by zero.");
          }

          // 使用String类方法
          String message = "Hello, World!";
                System.out.println("Length of message: " + message.length());

          // 使用Arrays.sort方法
          Integer[] numbersArray = {5, 2, 8, 1, 9};
                Arrays.sort(numbersArray);
                System.out.println("Sorted numbers: " + Arrays.toString(numbersArray));

          // 使用ArrayList
          ArrayList<String> fruits = new ArrayList<>();
                fruits.add("Apple");
                fruits.add("Banana");
                System.out.println("Fruits List: " + fruits);
      }
}
```
