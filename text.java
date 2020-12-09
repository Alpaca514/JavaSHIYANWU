package HuaQ;
import java.io.*;
import java.util.Objects;
import java.util.Scanner;
public class text {
    public static void main(String[] agrs){
        Scanner z=new Scanner(System.in);
        student a=new student("wu","wu");
        System.out.println("把你的姓名，学号大声的说出来！！！");
        String b= z.next();
        a.setName(b);
        String c= z.next();
        a.setNumber(c);
        try {
            BufferedReader in =new BufferedReader(new FileReader("E:\\《1》"));
            String d= in.readLine();
            String e="(.{7})";
            d=d.replaceAll(e,"$1,");
            StringBuffer f=new StringBuffer(d);
            for (int i=15;i<289;i=i+17){
                f.replace(i,i+1,"。\n");
            }
            System.out.println(f);
            System.out.println(a);
            FileWriter writer=new FileWriter("E:\\《2》.txt");
            writer.write(String.valueOf(a));
            writer.write(String.valueOf(f));
            writer.flush();
            writer.close();
            System.out.println("整挺好");
            Scanner h=new Scanner(System.in);
            String[] j=d.split("");
            System.out.println("1.字，2。词，3。结束");
            for (int x=0;x<99999;x++){
                int v=h.nextInt();
                switch (v){
                    case(1):
                        System.out.println("查啥字？？？");
                        Scanner m=new Scanner(System.in);
                        String m1=m.nextLine();
                        int q=0;
                        for (int i=0;i<99999;i++){
                            if (Objects.equals(j[i],m1)){
                                q++;
                            }
                            System.out.println("有："+q);
                            System.out.println("1.字，2。词，3。结束");
                        }
                    case (2):
                        System.out.println("查啥词？？？");
                        Scanner r=new Scanner(System.in);
                        String r1= r.nextLine();
                        int t=0;
                        int n=0;
                        while ((n=d.indexOf(r1,n))!=-1){
                            n=n+r1.length();
                            t++;
                    }
                    System.out.println("词数为："+t);
                    System.out.println("1.字，2。词，3。结束");
                    break;
                    case (3):
                        break ;
                }
            }
        }catch (Exception e){
            System.out.println("你有问题");
        }
    }
} 
