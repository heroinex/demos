package com.inspur.ssr.server.asset.util;

/**

 */
public class ClassUtils
{
    private ClassUtils()
    {

    }

    public static <T> T forClass(Class<T> clase)
    {
        T t = null;
        try
        {
            t = clase.newInstance();
        }
        catch (InstantiationException e)
        {
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }
        return t;
    }
}
