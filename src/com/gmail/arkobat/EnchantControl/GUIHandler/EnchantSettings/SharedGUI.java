package com.gmail.arkobat.EnchantControl.GUIHandler.EnchantSettings;

import com.gmail.arkobat.EnchantControl.EnchantControl;
import com.gmail.arkobat.EnchantControl.Utilities.GetEnchant;
import com.gmail.arkobat.EnchantControl.XMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class SharedGUI {

    private final EnchantControl enchantControl;
    private final GetEnchant getEnchant;
    private final MendingGUI mendingGUI;

    public SharedGUI(EnchantControl enchantControl, GetEnchant getEnchant, MendingGUI mendingGUI) {
        this.enchantControl = enchantControl;
        this.getEnchant = getEnchant;
        this.mendingGUI = mendingGUI;
    }

    public Inventory setupInv(String id) {
        String invID = id.replace("", "").trim();
        Inventory inv = Bukkit.createInventory(null, 18, "§b§lEC §a§lSettings" + "§¾§¯§¿" + "§_" + invID);
        int[] fillerPlace = {9, 10, 11, 12, 13, 14, 15, 16, 17};
        int[] comingSoonPlace = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        ItemStack comingSoon = defineComingSoonItem();
        for (int loc : comingSoonPlace) {
            inv.setItem(loc, comingSoon);
        }
        for (int loc : fillerPlace) {
            inv.setItem(loc, enchantControl.fillerItem);
        }
        inv.setItem(13, defineBackItem());
        inv.setItem(0, defineMaxLevelItem(id));
        inv = checkIndividualSettings(inv, id);
        return inv;

    }

    private Inventory checkIndividualSettings(Inventory inventory, String id) {
        if (id.equals("70")) {
            inventory = mendingGUI.applyMendingSettings(inventory);
        }
        return inventory;
    }

    private ItemStack defineBackItem() {
        ItemStack backItem = new ItemStack(XMaterial.ARROW.parseItem());
        ItemMeta backItemMeta = backItem.getItemMeta();
        backItemMeta.setDisplayName("§c§lBack");
        backItem.setItemMeta(backItemMeta);
        return backItem;
    }

    private ItemStack defineComingSoonItem() {
        ItemStack comingSoon = new ItemStack(XMaterial.GRAY_STAINED_GLASS_PANE.parseItem());
        ItemMeta comingSoonMeta = comingSoon.getItemMeta();
        comingSoonMeta.setDisplayName("§r");
        List<String> comingSoonLore = new ArrayList<>();
        comingSoonLore.add("§b More settings will");
        comingSoonLore.add("§b be added regularly");
        comingSoonLore.add("§r");
        comingSoonMeta.setLore(comingSoonLore);
        comingSoon.setItemMeta(comingSoonMeta);
        return comingSoon;
    }

    private ItemStack defineMaxLevelItem(String id) {
        ItemStack itemStack = new ItemStack(XMaterial.BOOK.parseMaterial(), 1);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("§6§lMax level");

        List<String> lore = new ArrayList<>();
        lore.add("§a Define max allowed level of an enchant");
        lore.add("§a If an item has an enchant with a higher");
        lore.add("§a level, the level will be set to Max Level");
        lore.add("§c§m-----------------------");
        lore.add("§b Left-click §ato §bincrease");
        lore.add("§b Right-click §ato §cdecrease");
        lore.add("§b Shift-left-click §ato set to §b1");
        lore.add("§b Shift-right-click §ato §cdisable");
        lore.add("§c§m-----------------------");
        lore.add("§a Current max level: §b§l" + getCurrentMaxLevel(id));
        lore.add("§c§m-----------------------");

        itemMeta.setLore(lore);

        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    private String getCurrentMaxLevel(String id) {
        return  enchantControl.enchantConfigSection.getOrDefault((id + ".maxLevel"), "Not set");
    }

}
