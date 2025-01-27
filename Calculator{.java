public class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = ac.nextInt();
        char op = sc.nextChar();
        int result;
        switch(op){
            case '+':
                result = a+b;
                break;
            case '-':
                result = (a>b ? a-b : b-a);
                break;
            case '*':
                result = a*b;
                break;
            case '/':
                result = (a/b ? b!=0: "Can't divide when denominator is zero");
                break;
        }
        System.out.println(a + op + b + "  = " + result);
    }
}