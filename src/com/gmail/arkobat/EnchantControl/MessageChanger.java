package com.gmail.arkobat.EnchantControl;

import com.gmail.arkobat.EnchantControl.GUIHandler.SetupGUI;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class MessageChanger {

    private final EnchantControl enchantControl;
    private final SetupGUI setupGUI;

    public MessageChanger(EnchantControl enchantControl, SetupGUI setupGUI) {
        this.enchantControl = enchantControl;
        this.setupGUI = setupGUI;
    }

    public boolean checkMessage(String message, Player p){
        List<String> temp = new ArrayList<>(enchantControl.msgAdd);
        for (String string : temp) {
            if (string.contains(p.getUniqueId().toString())) {
                if (message.equalsIgnoreCase("cancel")) {
                    enchantControl.msgAdd.remove(string);
                    return true;
                }
                String[] path = string.split(":");
                switch (path[1]) {
                    case "prefix":
                        enchantControl.setMessage("prefix", message);
                        setupGUI.defineMessageItems();
                        enchantControl.msgAdd.remove(string);
                        p.sendMessage(enchantControl.prefix + " §3Successfully changed the prefix");
                        p.openInventory(setupGUI.inventory);
                        return true;
                    case "enchantCancel":
                        enchantControl.setMessage("enchantCancel", message);
                        setupGUI.defineMessageItems();
                        enchantControl.msgAdd.remove(string);
                        p.sendMessage(enchantControl.prefix + " §3Successfully changed the message");
                        p.openInventory(setupGUI.inventory);
                        return true;
                    case "removedEnchant":
                        enchantControl.setMessage("removedEnchant", message);
                        setupGUI.defineMessageItems();
                        enchantControl.msgAdd.remove(string);
                        p.sendMessage(enchantControl.prefix + " §3Successfully changed the message");
                        p.openInventory(setupGUI.inventory);
                        return true;
                }
                return true;
            }
        }
        return false;
    }
}