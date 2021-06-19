package com.grammar.base;
//文档注释  JavaDoc

/**
 * @author
 * @version
 * @since
 */
public class Doc {

    String name;

    /**
     *
     * @param name
     * @return
     * @throws Exception
     */
    public String test(String name) throws Exception{
        return name;
    }

    //生成命令行生成JavaDoc文档：javadoc -encoding UTF-8 -charset UTF-8 Doc.java
    //学会使用IDEA生成JavaDoc文档
}
