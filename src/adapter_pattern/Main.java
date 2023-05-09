package adapter_pattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Gallery_App gallery_app=new Gallery_App();

        Scanner scanner=new Scanner(System.in);
        Scanner scanner1=new Scanner(System.in);
                while (true){
        System.out.println("Enter image format:");
        String image=scanner.nextLine();
        System.out.println("Enter File Name:");
        String Name=scanner1.nextLine();

        gallery_app.Show(image,Name);}




    }
}