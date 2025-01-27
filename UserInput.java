import java.io.*;
public class UserInput {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string:");
        String s = br.readLine();
        System.out.println("Enter an Integer:");
        int a = Integer.parseInt(br.readLine());
        System.out.println("String: " + s);
        System.out.println("Integer: " + a);
    }
}

