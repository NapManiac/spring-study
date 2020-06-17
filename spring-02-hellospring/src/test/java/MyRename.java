import java.io.File;
//修改视频文件名
public class MyRename {
    private static String folderName = "C:\\Users\\13943\\Desktop\\狂神说Java】Spring5\\";
    public static void main(String[] args) {


        File file = new File(folderName);

        File[] files = file.listFiles();
        for (File temp : files) {
            rename(folderName + temp.getName());

        }

//        rename(folderName + "[高清 1080P] 【狂神说Java】Spring5最新完整教程IDEA版通俗易懂_P28_28、总结和回顾.flv");
    }


    public static void rename(String fileName) {

        File oldFile = new File(fileName);
        int idx = oldFile.getName().lastIndexOf("_");
        String newName = oldFile.getName().substring(idx+1);
        System.out.println(newName);
        File newFile = new File(folderName + newName);
        oldFile.renameTo(newFile);
    }
}
