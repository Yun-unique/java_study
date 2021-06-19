package com.exception.demon01;

import org.w3c.dom.ls.LSOutput;

public class Test2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        //Ctrl+Alt+T
        try {
            if (b==0){//主动抛出异常 throw
                throw new ArithmeticException();
            }
            System.out.println(a/b);
        } catch (Error e) {//catch(想要捕获的异常类型！)
            System.out.println("Error");
        } catch (Exception e){
            System.out.println("Exception");
        }catch (Throwable t){
            System.out.println("Throwable");
        }finally {
            System.out.println("finally");
        }
    }
}
