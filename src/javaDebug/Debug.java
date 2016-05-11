package javaDebug;

/**
 * Created by wangwentao on 2016/1/24.
 */
public class Debug {

    private String print(){
        String str;
        try {
            str = "Hello";
         //   return str;
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            str = "World";
        }
        return str;
    }

    public static void main(String[] args){
        Debug debug = new Debug();
        System.out.print(debug.print());
    }
}
