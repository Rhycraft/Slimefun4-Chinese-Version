package me.mrCookieSlime.Slimefun.Setup;

import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Localization;

public class Messages
{

    public static Localization local;

    public static void setup()
    {
        local.setPrefix("&aSlimefun &7> ");       
        //原文 You do not have enough Knowledge to understand this
        local.setDefault("messages.not-researched", new String[] {
            "&4你没有足够的学识来理解它"
        });
        //原文 You do not have enough XP to unlock this
        local.setDefault("messages.not-enough-xp", new String[] {
            "&4你没有足够的经验来解锁这个研究"
        });
        //原文 You have unlocked &7\"%research%\"
        local.setDefault("messages.unlocked", new String[] {
            "&b你已解锁了 &7\"%research%\""
        });
        //原文 Help me, I am trapped in a Fortune Cookie Factory!", "&7You will die tomorrow...     by a Creeper", "&7At some Point in your Life something bad will happen!!!", "&7Next week you will notice that this is not the real World, you are in a kind of \"Matrix\" or lets call it Computer game. Yes you are in a Computer Game", "&7This Cookie will taste good in a few seconds", "&7You will die soon and the last word you will hear is gonna be \"EXTERMINATE!!!\"", "&7Whatever you do, do not hug a Creeper... I tried it. It feels good, but it's not worth it."});
        local.setDefault("messages.fortune-cookie", new String[] {
            "&7救救我! 我被困在了幸运饼干工厂里!", "&7你明天将会死于...     苦力怕的手下!", "&7在你人生的某时某刻将会有坏事发生!!!", "&7下周你将会发现你不是在现实世界, 而是在游戏里.", "&7这块曲奇将在几秒内变得好吃", "&你很快将会死亡而且你最后听到的词将会是 \"毁灭!!!\"", "&7无论你要做什么, 不要拥抱苦力怕... 我试过了. 感觉不错, 但不值得."
        });
        //原文 Displays this Help Screen
        local.setDefault("commands.help", new String[] {
            "展示这个帮助界面"
        });
        //原文 Allows you to cheat Items
        local.setDefault("commands.cheat", new String[] {
            "允许你通过作弊获取粘液科技物品"
        });
        //原文 Give somebody some Slimefun Items
        local.setDefault("commands.give", new String[] {
            "给某人粘液科技物品"
        });
        //原文 Unlock a Research for a Player
        local.setDefault("commands.research.desc", new String[] {
            "为某位玩家解锁一个研究"
        });
        //原文 Gives yourself a Slimefun Guide
        local.setDefault("commands.guide", new String[] {
            "给你自己一本粘液科技指南"
        });
        //原文 Lag-Info about your Server
        local.setDefault("commands.timings", new String[] {
            "关于服务器的延迟信息"
        });
        //原文 See other Player's Waypoints
        local.setDefault("commands.teleporter", new String[] {
            "看看其他玩家的路径点"
        });
        //原文 Lists all installed Addons
        local.setDefault("commands.versions", new String[] {
            "列出所有安装的粘液科技附属及目前版本号"
        });
        //原文 This Command is only for Players
        local.setDefault("messages.only-players", new String[] {
            "&4这个指令只能在游戏内使用"
        });
        //原文
        local.setDefault("messages.no-permission", new String[] {
            "&4你没有足够的权限去做这个"
        });
        //原文
        local.setDefault("messages.usage", new String[] {
            "&4例子: &c%usage%"
        });
        local.setDefault("messages.not-online", new String[] {
            "&4%player% &c不在线!"
        });
        local.setDefault("messages.not-valid-item", new String[] {
            "&4%item% &c不是一个粘液科技物品!"
        });
        local.setDefault("messages.given-item", new String[] {
            "&b你已被给予了一个 &7\"%item%\""
        });
        local.setDefault("messages.give-item", new String[] {
            "&b你给予了玩家 %player% 一个 &7\"%item%\""
        });
        local.setDefault("messages.not-valid-research", new String[] {
            "&4%research% &c不是一个有效的研究名!"
        });
        local.setDefault("messages.give-research", new String[] {
            "&b你成功解锁了玩家 %player% 的研究 &7\"%research%\""
        });
        local.setDefault("messages.battery.add", new String[] {
            "&2+ &7%charge% J &8(%machine%)"
        });
        local.setDefault("messages.battery.remove", new String[] {
            "&4- &7%charge% J &8(%machine%)"
        });
        local.setDefault("messages.hungry", new String[] {
            "&c你太饿了, 先吃点东西再这么做吧!"
        });
        local.setDefault("messages.mode-change", new String[] {
            "&b%device% 的模式已切换至: &9%mode%"
        });
        local.setDefault("messages.disabled-in-world", new String[] {
            "&4&l这个物品在此世界已被禁用"
        });
        local.setDefault("messages.talisman.anvil", new String[] {
            "&a&o你的护身符拯救了你的工具免于损坏"
        });
        local.setDefault("messages.talisman.miner", new String[] {
            "&a&o你的护身符双倍掉落了矿物"
        });
        local.setDefault("messages.talisman.hunter", new String[] {
            "&a&o你的护身符双倍掉落了掉落物"
        });
        local.setDefault("messages.talisman.lava", new String[] {
            "&a&o你的护身符将你从岩浆中救了出来"
        });
        local.setDefault("messages.talisman.water", new String[] {
            "&a&o你的护身符将你从溺水中救了出来"
        });
        local.setDefault("messages.talisman.angel", new String[] {
            "&a&o你的护身符将你从信仰之跃中救了出来"
        });
        local.setDefault("messages.talisman.fire", new String[] {
            "&a&o你的护身符将你从火焰中救了出来"
        });
        local.setDefault("messages.talisman.magician", new String[] {
            "&a&o你的护身符赠送了你额外的附魔"
        });
        local.setDefault("messages.talisman.traveller", new String[] {
            "&a&o你的护身符使你跑起来更快了"
        });
        local.setDefault("messages.talisman.warrior", new String[] {
            "&a&o你的护身符使你在一段时间内变得很强"
        });
        local.setDefault("messages.talisman.knight", new String[] {
            "&a&o你的护身符给予了你 5 秒的生命恢复"
        });
        local.setDefault("messages.talisman.whirlwind", new String[] {
            "&a&o你的护身符抵挡了所有的弹射物"
        });
        local.setDefault("messages.talisman.wizard", new String[] {
            "&a&o你的护身符提升了一个更好附魔的等级, 但同时其他附魔等级将会下降."
        });
        local.setDefault("messages.broken-leg", new String[] {
            "&c&o看起来你摔断了你的腿, 也许夹板能够帮助你?"
        });
        local.setDefault("messages.fixed-leg", new String[] {
            "&a&o有了夹板的帮助. 感觉好多了."
        });
        local.setDefault("messages.start-bleeding", new String[] {
            "&c&o你开始流血了. 也许绷带能够帮助你?"
        });
        local.setDefault("messages.stop-bleeding", new String[] {
            "&a&o有了绷带的帮助. 流血停止了!"
        });
        local.setDefault("messages.disabled-item", new String[] {
            "&4&l这个物品已被禁用了! 你是怎么得到它的?"
        });
        local.setDefault("messages.research.start", new String[] {
            "&7古老的灵魂正向你诉说神秘的话语!"
        });
        local.setDefault("messages.research.progress", new String[] {
            "&7你开始慢慢理解 &b%research% &e(%progress%)"
        });
        local.setDefault("commands.stats", new String[] {
            "展示一个玩家的统计表"
        });
        local.setDefault("messages.fire-extinguish", new String[] {
            "&7你灭掉了你身上的火"
        });
        local.setDefault("machines.pattern-not-found", new String[] {
            "&e抱歉, 你记错合成表了吧. 这不是一个正确的合成方式."
        });
        local.setDefault("machines.unknown-material", new String[] {
            "&e抱歉, 我无法识别你摆放的合成表. 请使用正确的合成表!"
        });
        local.setDefault("machines.wrong-item", new String[] {
            "&e抱歉, 我无法识别你右键的物品. 检查合成表看看哪些物品可以使用."
        });
        local.setDefault("machines.full-inventory", new String[] {
            "&e抱歉, 我的背包已经满了!"
        });
        local.setDefault("miner.no-ores", new String[] {
            "&e抱歉, 周围找不到矿石了!"
        });
        local.setDefault("backpack.already-open", new String[] {
            "&c抱歉, 这个背包已在别处打开了!"
        });
        local.setDefault("backpack.no-stack", new String[] {
            "&c你不能将背包堆积起来"
        });
        local.setDefault("workbench.not-enhanced", new String[] {
            "&4你不能在原版工作台使用粘液科技物品"
        });
        local.setDefault("anvil.not-working", new String[] {
            "&4你不能在铁砧里使用粘液科技物品"
        });
        local.setDefault("commands.research.reset", new String[] {
            "&c你已重置了 %player% 的所有研究"
        });
        local.setDefault("commands.research.reset-target", new String[] {
            "&c你的所有研究已被重置"
        });
        local.setDefault("machines.in-use", new String[] {
            "&c这个机器正在被其他玩家使用."
        });
        local.setDefault("gps.waypoint.new", new String[] {
            "&e请为你的路径点起名 &7(支持彩色代码!)"
        });
        local.setDefault("gps.waypoint.added", new String[] {
            "&a成功新增了新的路径点"
        });
        local.setDefault("gps.waypoint.max", new String[] {
            "&4你已到达设置路径点的最大上限!"
        });
        local.setDefault("gps.insufficient-complexity", new String[] {
            "&4GPS 网络复杂度不够: &c%complexity%", "&4a) 你还没有设置一个 GPS 网络", "&4b) 你的 GPS 网络复杂度不够, 多设置几个卫星"
        });
        local.setDefault("gps.geo.scan-required", new String[] {
            "&4需要GEO地形扫描! &c请先使用 GEO地形扫描器!"
        });
        local.setDefault("robot.started", new String[] {
            "&7你的机器人重新运行了它的脚本"
        });
        local.setDefault("robot.stopped", new String[] {
            "&7你的机器人暂停了它的脚本"
        });
        local.setDefault("inventory.no-access", new String[] {
            "&4你不允许使用这个方块"
        });
        local.setDefault("machines.ANCIENT_ALTAR.not-enough-pedestals", new String[] {
            "&4基座不足. 目前已摆放的基座: &c(%pedestals% / 8)"
        });
        local.setDefault("machines.ANCIENT_ALTAR.unknown-catalyst", new String[] {
            "&4无效的合成配方! &c请先摆放其他物品再右键!"
        });
        local.setDefault("machines.ANCIENT_ALTAR.unknown-recipe", new String[] {
            "&4未知合成表! &c请使用正确的合成方式!"
        });
        local.setDefault("machines.HOLOGRAM_PROJECTOR.enter-text", new String[] {
            "&7请写下想显示在全息文本上的话. &r(支持颜色代码)"
        });
        local.setDefault("machines.ELEVATOR.no-destinations", new String[] {
            "&4找不到目的地 (检查上/下方是否也放置了电梯)"
        });
        local.setDefault("machines.CARGO_NODES.must-be-placed", new String[] {
            "&4必须放置在箱子或机器上!"
        });
        local.setDefault("android.scripts.already-uploaded", new String[] {
            "&4这个脚本已被上传过了."
        });
        local.setDefault("android.scripts.enter-name", new String[] {
            "", "&e请为你的脚本命名", ""
        });
        local.setDefault("android.scripts.uploaded", new String[] {
            "&b上传中...", "&a成功上传了你的脚本!"
        });
        local.setDefault("android.scripts.rating.own", new String[] {
            "&4你不能评价你自己的脚本!"
        });
        local.setDefault("android.scripts.rating.already", new String[] {
            "&4你已为这个脚本留下评价了!"
        });
        local.save();
    }
}
