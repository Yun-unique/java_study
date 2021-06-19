package com.IO流.目录拷贝;

import java.io.*;

/*
* 拷贝目录
* */
public class CopyAll {
    public static void main(String[] args) {
        //拷贝源
        File srcFile = new File("C:\\Users\\86187\\Desktop\\Java\\java\\javase_code\\src\\com\\IO流");
        //拷贝目标
        File destFile = new File("C:\\Users\\86187\\Desktop\\Java\\java\\IO流");
        //调用拷贝方法
        copyDir(srcFile,destFile);

    }

    /**
     * 拷贝目录
     * @param srcFile   拷贝源
     * @param destFile  拷贝目标
     */
    private static void copyDir(File srcFile, File destFile) {
        if (srcFile.isFile()){
            //srcFile如果是一个文件的话，递归结束
            //是文件的时候拷贝文件
            //一边读一边写
            FileInputStream in = null;
            FileOutputStream out =null;
            try {
                //读文件
                in = new FileInputStream(srcFile);
                //写文件
                String path = (destFile.getAbsolutePath().endsWith("\\")?destFile.getAbsolutePath():destFile.getAbsolutePath()+"\\")+srcFile.getAbsolutePath().substring(3);
                out = new FileOutputStream(path);
                byte[] bytes = new byte[1024*1024];//一次复制1MB
                int readCount = 0;
                while ((readCount = in.read(bytes))!=-1){
                    out.write(bytes,0,readCount);
                }
                //输出流刷新
                out.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (in!=null){
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (out!=null){
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return;
        }
        //获取源下面的子目录（包括文件）
        File[] files = srcFile.listFiles();
        for (File file:files){
            //获取所有文件的（包括目录和文件）绝对路径
            //System.out.println(file.getAbsolutePath());
            if (file.isDirectory()){
                //新建对应的目录
                //System.out.println(file.getAbsolutePath());
                String srcDir = file.getAbsolutePath();
                String destDir = (destFile.getAbsolutePath().endsWith("\\")?destFile.getAbsolutePath():destFile.getAbsolutePath()+"\\")+srcDir.substring(3);
                File newFile = new File(destDir);
                if (!newFile.exists()){
                    newFile.mkdirs();
                }
            }
            //递归调用
            copyDir(file,destFile);
        }
    }
}
