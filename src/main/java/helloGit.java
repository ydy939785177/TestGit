/**
 * @author ydy
 * @create 2019-03-25 22:44
 */
public class helloGit {
    public static void main(String[] args) {
        System.out.println("开始使用");
        getConnection();
        System.out.println("使用完毕");
        close();
    }

    public static void getConnection() {
        System.out.println("helloGit.getConnection");
        System.out.println("true = " + true);
    }
    public static void close(){
     System.out.println("开始关闭资源");
    }
}
