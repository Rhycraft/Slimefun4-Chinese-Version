package me.mrCookieSlime.Slimefun.Setup;

import java.io.File;
import java.io.PrintStream;

public class Files
{

    public static File RESEARCHES = new File("plugins/Slimefun/Researches.yml");
    public static File CONFIG = new File("plugins/Slimefun/config.yml");
    public static File ITEMS = new File("plugins/Slimefun/Items.yml");
    public static File DATABASE = new File("data-storage/Slimefun/Players");
    public static File WHITELIST = new File("plugins/Slimefun/whitelist.yml");

    public Files()
    {
    }

    public static void cleanup()
    {
        if(!RESEARCHES.exists())
        {
            System.err.println("################################################");
            System.err.println("################################################");
            System.err.println("#################### = - 错误 - = ##################");
            System.err.println("################################################");
            System.err.println("################################################");
            System.err.println("      ");
            System.err.println("Slimefun 警告:");
            System.err.println("         ");
            System.err.println("Slimefun 检测到你的文件已过期或不存在.);
            System.err.println("我们创建了新的文件以确保 Slimefun 可以工作.");
            System.err.println("如果您曾经使用过粘液科技, 你原来的设置将会丢失");
            System.err.println("但 Slimefun 会正常工作了 :)");
            System.err.println("        ");
            System.err.println("################################################");
            System.err.println("################################################");
            System.err.println("#################### = - 错误 - = ##################");
            System.err.println("################################################");
            System.err.println("################################################");
            delete(new File("plugins/Slimefun"));
            delete(new File("data-storage/Slimefun"));
        }
        if(!DATABASE.exists())
            DATABASE.mkdirs();
    }

    public static void delete(File folder)
    {
        File files[] = folder.listFiles();
        if(files != null)
        {
            File afile[];
            int j = (afile = files).length;
            for(int i = 0; i < j; i++)
            {
                File current = afile[i];
                if(current.isDirectory())
                    delete(current);
                else
                    current.delete();
            }

        }
        folder.delete();
    }

}
