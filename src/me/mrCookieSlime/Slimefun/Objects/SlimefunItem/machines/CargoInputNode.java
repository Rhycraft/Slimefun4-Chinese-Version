// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   CargoInputNode.java

package me.mrCookieSlime.Slimefun.Objects.SlimefunItem.machines;

import java.util.UUID;
import me.mrCookieSlime.CSCoreLibPlugin.CSCoreLib;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Localization;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Variable;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ClickAction;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.CSCoreLibPlugin.general.World.CustomSkull;
import me.mrCookieSlime.CSCoreLibPlugin.protection.ProtectionManager;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Lists.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunBlockHandler;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.UnregisterReason;
import me.mrCookieSlime.Slimefun.Setup.Messages;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.mrCookieSlime.Slimefun.api.item_transport.CargoNet;
import me.mrCookieSlime.Slimefun.api.item_transport.ItemTransportFlow;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.MaterialData;

public class CargoInputNode extends SlimefunItem
{

    private static final int border[] = {
        0, 1, 3, 4, 5, 6, 7, 8, 9, 10, 
        11, 12, 13, 14, 17, 18, 22, 23, 26, 27, 
        31, 32, 33, 34, 35, 36, 40, 44, 45, 46, 
        47, 48, 49, 50, 51, 52, 53
    };

    public CargoInputNode(Category category, ItemStack item, String name, RecipeType recipeType, ItemStack recipe[], ItemStack recipeOutput)
    {
        super(category, item, name, recipeType, recipe, recipeOutput);
        new BlockMenuPreset(name, "&3Input Node") {

            final CargoInputNode this$0;

            public void init()
            {
                constructMenu(this);
            }

            public void newInstance(final BlockMenu menu, final Block b)
            {
                try
                {
                    if(!BlockStorage.hasBlockInfo(b) || BlockStorage.getBlockInfo(b, "filter-type") == null || BlockStorage.getBlockInfo(b, "filter-type").equals("whitelist"))
                    {
                        menu.replaceExistingItem(15, new CustomItem(new MaterialData(Material.WOOL), "&7Type: &rWhitelist", new String[] {
                            "", "&e> Click to change it to Blacklist"
                        }));
                        menu.addMenuClickHandler(15, new me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu.MenuClickHandler() {

                            final _cls1 this$1;
                            private final Block val$b;
                            private final BlockMenu val$menu;

                            public boolean onClick(Player p, int arg1, ItemStack arg2, ClickAction arg3)
                            {
                                BlockStorage.addBlockInfo(b, "filter-type", "blacklist");
                                newInstance(menu, b);
                                return false;
                            }

                    
                    {
                        this$1 = _cls1.this;
                        b = block;
                        menu = blockmenu;
                        super();
                    }
                        }
);
                    } else
                    {
                        menu.replaceExistingItem(15, new CustomItem(new MaterialData(Material.WOOL, (byte)15), "&7Type: &8Blacklist", new String[] {
                            "", "&e> Click to change it to Whitelist"
                        }));
                        menu.addMenuClickHandler(15, new me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu.MenuClickHandler() {

                            final _cls1 this$1;
                            private final Block val$b;
                            private final BlockMenu val$menu;

                            public boolean onClick(Player p, int arg1, ItemStack arg2, ClickAction arg3)
                            {
                                BlockStorage.addBlockInfo(b, "filter-type", "whitelist");
                                newInstance(menu, b);
                                return false;
                            }

                    
                    {
                        this$1 = _cls1.this;
                        b = block;
                        menu = blockmenu;
                        super();
                    }
                        }
);
                    }
                    if(!BlockStorage.hasBlockInfo(b) || BlockStorage.getBlockInfo(b, "filter-durability") == null || BlockStorage.getBlockInfo(b, "filter-durability").equals("false"))
                    {
                        menu.replaceExistingItem(16, new CustomItem(new MaterialData(Material.STONE_SWORD, (byte)20), "&7Include Sub-IDs/Durability: &4\u2718", new String[] {
                            "", "&e> Click to toggle whether the Durability has to match"
                        }));
                        menu.addMenuClickHandler(16, new me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu.MenuClickHandler() {

                            final _cls1 this$1;
                            private final Block val$b;
                            private final BlockMenu val$menu;

                            public boolean onClick(Player p, int arg1, ItemStack arg2, ClickAction arg3)
                            {
                                BlockStorage.addBlockInfo(b, "filter-durability", "true");
                                newInstance(menu, b);
                                return false;
                            }

                    
                    {
                        this$1 = _cls1.this;
                        b = block;
                        menu = blockmenu;
                        super();
                    }
                        }
);
                    } else
                    {
                        menu.replaceExistingItem(16, new CustomItem(new MaterialData(Material.GOLD_SWORD, (byte)20), "&7Include Sub-IDs/Durability: &2\u2714", new String[] {
                            "", "&e> Click to toggle whether the Durability has to match"
                        }));
                        menu.addMenuClickHandler(16, new me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu.MenuClickHandler() {

                            final _cls1 this$1;
                            private final Block val$b;
                            private final BlockMenu val$menu;

                            public boolean onClick(Player p, int arg1, ItemStack arg2, ClickAction arg3)
                            {
                                BlockStorage.addBlockInfo(b, "filter-durability", "false");
                                newInstance(menu, b);
                                return false;
                            }

                    
                    {
                        this$1 = _cls1.this;
                        b = block;
                        menu = blockmenu;
                        super();
                    }
                        }
);
                    }
                    if(!BlockStorage.hasBlockInfo(b) || BlockStorage.getBlockInfo(b, "round-robin") == null || BlockStorage.getBlockInfo(b, "round-robin").equals("false"))
                    {
                        menu.replaceExistingItem(24, new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDc4ZjJiN2U1ZTc1NjM5ZWE3ZmI3OTZjMzVkMzY0YzRkZjI4YjQyNDNlNjZiNzYyNzdhYWRjZDYyNjEzMzcifX19"), "&7Round-Robin Mode: &4\u2718", new String[] {
                            "", "&e> Click to enable Round Robin Mode", "&e(Items will be equally distributed on the Channel)"
                        }));
                        menu.addMenuClickHandler(24, new me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu.MenuClickHandler() {

                            final _cls1 this$1;
                            private final Block val$b;
                            private final BlockMenu val$menu;

                            public boolean onClick(Player p, int arg1, ItemStack arg2, ClickAction arg3)
                            {
                                BlockStorage.addBlockInfo(b, "round-robin", "true");
                                newInstance(menu, b);
                                return false;
                            }

                    
                    {
                        this$1 = _cls1.this;
                        b = block;
                        menu = blockmenu;
                        super();
                    }
                        }
);
                    } else
                    {
                        menu.replaceExistingItem(24, new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDc4ZjJiN2U1ZTc1NjM5ZWE3ZmI3OTZjMzVkMzY0YzRkZjI4YjQyNDNlNjZiNzYyNzdhYWRjZDYyNjEzMzcifX19"), "&7Round-Robin Mode: &2\u2714", new String[] {
                            "", "&e> Click to disable Round Robin Mode", "&e(Items will be equally distributed on the Channel)"
                        }));
                        menu.addMenuClickHandler(24, new me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu.MenuClickHandler() {

                            final _cls1 this$1;
                            private final Block val$b;
                            private final BlockMenu val$menu;

                            public boolean onClick(Player p, int arg1, ItemStack arg2, ClickAction arg3)
                            {
                                BlockStorage.addBlockInfo(b, "round-robin", "false");
                                newInstance(menu, b);
                                return false;
                            }

                    
                    {
                        this$1 = _cls1.this;
                        b = block;
                        menu = blockmenu;
                        super();
                    }
                        }
);
                    }
                    if(!BlockStorage.hasBlockInfo(b) || BlockStorage.getBlockInfo(b, "filter-lore") == null || BlockStorage.getBlockInfo(b, "filter-lore").equals("true"))
                    {
                        menu.replaceExistingItem(25, new CustomItem(new MaterialData(Material.EMPTY_MAP), "&7Include Lore: &2\u2714", new String[] {
                            "", "&e> Click to toggle whether the Lore has to match"
                        }));
                        menu.addMenuClickHandler(25, new me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu.MenuClickHandler() {

                            final _cls1 this$1;
                            private final Block val$b;
                            private final BlockMenu val$menu;

                            public boolean onClick(Player p, int arg1, ItemStack arg2, ClickAction arg3)
                            {
                                BlockStorage.addBlockInfo(b, "filter-lore", "false");
                                newInstance(menu, b);
                                return false;
                            }

                    
                    {
                        this$1 = _cls1.this;
                        b = block;
                        menu = blockmenu;
                        super();
                    }
                        }
);
                    } else
                    {
                        menu.replaceExistingItem(25, new CustomItem(new MaterialData(Material.EMPTY_MAP), "&7Include Lore: &4\u2718", new String[] {
                            "", "&e> Click to toggle whether the Lore has to match"
                        }));
                        menu.addMenuClickHandler(25, new me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu.MenuClickHandler() {

                            final _cls1 this$1;
                            private final Block val$b;
                            private final BlockMenu val$menu;

                            public boolean onClick(Player p, int arg1, ItemStack arg2, ClickAction arg3)
                            {
                                BlockStorage.addBlockInfo(b, "filter-lore", "true");
                                newInstance(menu, b);
                                return false;
                            }

                    
                    {
                        this$1 = _cls1.this;
                        b = block;
                        menu = blockmenu;
                        super();
                    }
                        }
);
                    }
                    menu.replaceExistingItem(41, new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjI1OTliZDk4NjY1OWI4Y2UyYzQ5ODg1MjVjOTRlMTlkZGQzOWZhZDA4YTM4Mjg0YTE5N2YxYjcwNjc1YWNjIn19fQ=="), "&bChannel", new String[] {
                        "", "&e> Click to decrease the Channel ID by 1"
                    }));
                    menu.addMenuClickHandler(41, new me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu.MenuClickHandler() {

                        final _cls1 this$1;
                        private final Block val$b;
                        private final BlockMenu val$menu;

                        public boolean onClick(Player p, int arg1, ItemStack arg2, ClickAction arg3)
                        {
                            int channel = Integer.parseInt(BlockStorage.getBlockInfo(b, "frequency")) - 1;
                            if(channel < 0)
                                if(CargoNet.EXTRA_CHANNELS)
                                    channel = 16;
                                else
                                    channel = 15;
                            BlockStorage.addBlockInfo(b, "frequency", String.valueOf(channel));
                            newInstance(menu, b);
                            return false;
                        }

                    
                    {
                        this$1 = _cls1.this;
                        b = block;
                        menu = blockmenu;
                        super();
                    }
                    }
);
                    int channel = BlockStorage.hasBlockInfo(b) && BlockStorage.getBlockInfo(b, "frequency") != null ? Integer.parseInt(BlockStorage.getBlockInfo(b, "frequency")) : 0;
                    if(channel == 16)
                    {
                        menu.replaceExistingItem(42, new CustomItem(SlimefunItems.CHEST_TERMINAL, (new StringBuilder("&bChannel ID: &3")).append(channel + 1).toString()));
                        menu.addMenuClickHandler(42, new me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu.MenuClickHandler() {

                            final _cls1 this$1;

                            public boolean onClick(Player p, int arg1, ItemStack arg2, ClickAction clickaction)
                            {
                                return false;
                            }

                    
                    {
                        this$1 = _cls1.this;
                        super();
                    }
                        }
);
                    } else
                    {
                        menu.replaceExistingItem(42, new CustomItem(new MaterialData(Material.WOOL, (byte)channel), (new StringBuilder("&bChannel ID: &3")).append(channel + 1).toString(), new String[0]));
                        menu.addMenuClickHandler(42, new me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu.MenuClickHandler() {

                            final _cls1 this$1;

                            public boolean onClick(Player p, int arg1, ItemStack arg2, ClickAction clickaction)
                            {
                                return false;
                            }

                    
                    {
                        this$1 = _cls1.this;
                        super();
                    }
                        }
);
                    }
                    menu.replaceExistingItem(43, new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzJmOTEwYzQ3ZGEwNDJlNGFhMjhhZjZjYzgxY2Y0OGFjNmNhZjM3ZGFiMzVmODhkYjk5M2FjY2I5ZGZlNTE2In19fQ=="), "&bChannel", new String[] {
                        "", "&e> Click to increase the Channel ID by 1"
                    }));
                    menu.addMenuClickHandler(43, new me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu.MenuClickHandler() {

                        final _cls1 this$1;
                        private final Block val$b;
                        private final BlockMenu val$menu;

                        public boolean onClick(Player p, int arg1, ItemStack arg2, ClickAction arg3)
                        {
                            int channel = Integer.parseInt(BlockStorage.getBlockInfo(b, "frequency")) + 1;
                            if(CargoNet.EXTRA_CHANNELS)
                            {
                                if(channel > 16)
                                    channel = 0;
                            } else
                            if(channel > 15)
                                channel = 0;
                            BlockStorage.addBlockInfo(b, "frequency", String.valueOf(channel));
                            newInstance(menu, b);
                            return false;
                        }

                    
                    {
                        this$1 = _cls1.this;
                        b = block;
                        menu = blockmenu;
                        super();
                    }
                    }
);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }

            public boolean canOpen(Block b, Player p)
            {
                boolean open = CSCoreLib.getLib().getProtectionManager().canAccessChest(p.getUniqueId(), b) || p.hasPermission("slimefun.cargo.bypass");
                if(!open)
                    Messages.local.sendTranslation(p, "inventory.no-access", true, new Variable[0]);
                return open;
            }

            public int[] getSlotsAccessedByItemTransport(ItemTransportFlow flow)
            {
                return new int[0];
            }

            
            {
                this$0 = CargoInputNode.this;
                super($anonymous0, $anonymous1);
            }
        }
;
        registerBlockHandler(name, new SlimefunBlockHandler() {

            final CargoInputNode this$0;

            public void onPlace(Player p, Block b, SlimefunItem item)
            {
                BlockStorage.addBlockInfo(b, "owner", p.getUniqueId().toString());
                BlockStorage.addBlockInfo(b, "index", "0");
                BlockStorage.addBlockInfo(b, "frequency", "0");
                BlockStorage.addBlockInfo(b, "filter-type", "whitelist");
                BlockStorage.addBlockInfo(b, "filter-lore", "true");
                BlockStorage.addBlockInfo(b, "filter-durability", "false");
                BlockStorage.addBlockInfo(b, "round-robin", "false");
            }

            public boolean onBreak(Player p, Block b, SlimefunItem item, UnregisterReason reason)
            {
                int ai[];
                int j = (ai = getInputSlots()).length;
                for(int i = 0; i < j; i++)
                {
                    int slot = ai[i];
                    if(BlockStorage.getInventory(b).getItemInSlot(slot) != null)
                        b.getWorld().dropItemNaturally(b.getLocation(), BlockStorage.getInventory(b).getItemInSlot(slot));
                }

                return true;
            }

            
            {
                this$0 = CargoInputNode.this;
                super();
            }
        }
);
    }

    protected void constructMenu(BlockMenuPreset preset)
    {
        int ai[];
        int k = (ai = border).length;
        for(int j = 0; j < k; j++)
        {
            int i = ai[j];
            preset.addItem(i, new CustomItem(new MaterialData(Material.STAINED_GLASS_PANE, (byte)9), " ", new String[0]), new me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu.MenuClickHandler() {

                final CargoInputNode this$0;

                public boolean onClick(Player arg0, int arg1, ItemStack arg2, ClickAction clickaction)
                {
                    return false;
                }

            
            {
                this$0 = CargoInputNode.this;
                super();
            }
            }
);
        }

        preset.addItem(2, new CustomItem(new MaterialData(Material.PAPER), "&3Items", new String[] {
            "", "&bPut in all Items you want to", "&bblacklist/whitelist"
        }), new me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu.MenuClickHandler() {

            final CargoInputNode this$0;

            public boolean onClick(Player arg0, int arg1, ItemStack arg2, ClickAction clickaction)
            {
                return false;
            }

            
            {
                this$0 = CargoInputNode.this;
                super();
            }
        }
);
    }

    public int[] getInputSlots()
    {
        return (new int[] {
            19, 20, 21, 28, 29, 30, 37, 38, 39
        });
    }

}
