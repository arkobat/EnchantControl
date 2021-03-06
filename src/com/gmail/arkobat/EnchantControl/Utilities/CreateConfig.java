package com.gmail.arkobat.EnchantControl.Utilities;

import com.gmail.arkobat.EnchantControl.EnchantControl;
import org.bukkit.configuration.ConfigurationSection;

import java.util.List;

// https://hastebin.com/hozopehiqu.scala
public class CreateConfig {

    private final EnchantControl enchantControl;

    public CreateConfig(EnchantControl enchantControl) {
        this.enchantControl = enchantControl;
    }

    public void configToSection(ConfigurationSection configurationSection) {
        if (configurationSection != null) {
            for (String key : configurationSection.getKeys(true)) {
                enchantControl.enchantConfigSection.put(key, configurationSection.getString(key));
            }
        }
    }

    public void createStandard() {
        addToConfigSection("0.name", "Protection");
        addToConfigSection("0.bukkitName", "PROTECTION_ENVIRONMENTAL");
        addToConfigSection("0.ver", "1.01");
        addToConfigSection("0.maxEnchantLevel", "4");

        addToConfigSection("1.name", "Fire Protection");
        addToConfigSection("1.bukkitName", "PROTECTION_FIRE");
        addToConfigSection("1.ver", "1.01");
        addToConfigSection("1.maxEnchantLevel", "4");

        addToConfigSection("2.name", "Feather Falling");
        addToConfigSection("2.bukkitName", "PROTECTION_FALL");
        addToConfigSection("2.ver", "1.01");
        addToConfigSection("2.maxEnchantLevel", "4");

        addToConfigSection("3.name", "Blast Protection");
        addToConfigSection("3.bukkitName", "PROTECTION_EXPLOSIONS");
        addToConfigSection("3.ver", "1.00");
        addToConfigSection("3.maxEnchantLevel", "4");

        addToConfigSection("4.name", "Projectile Protection");
        addToConfigSection("4.bukkitName", "PROTECTION_PROJECTILE");
        addToConfigSection("4.ver", "1.00");
        addToConfigSection("4.maxEnchantLevel", "4");

        addToConfigSection("5.name", "Respiration");
        addToConfigSection("5.bukkitName", "OXYGEN");
        addToConfigSection("5.ver", "1.00");
        addToConfigSection("5.maxEnchantLevel", "3");

        addToConfigSection("6.name", "Aqua Affinity");
        addToConfigSection("6.bukkitName", "WATER_WORKER");
        addToConfigSection("6.ver", "1.00");
        addToConfigSection("6.maxEnchantLevel", "1");

        addToConfigSection("7.name", "Thorns");
        addToConfigSection("7.bukkitName", "THORNS");
        addToConfigSection("7.ver", "1.00");
        addToConfigSection("8.maxEnchantLevel", "3");

        addToConfigSection("8.name", "Depth Strider");
        addToConfigSection("8.bukkitName", "DEPTH_STRIDER");
        addToConfigSection("8.ver", "1.04");
        addToConfigSection("8.maxEnchantLevel", "3");

        addToConfigSection("9.name", "Frost Walker");
        addToConfigSection("9.bukkitName", "FROST_WALKER");
        addToConfigSection("9.ver", "1.09");
        addToConfigSection("9.maxEnchantLevel", "3");

        addToConfigSection("10.name", "Curse of Binding");
        addToConfigSection("10.bukkitName", "BINDING_CURSE");
        addToConfigSection("10.ver", "1.11");
        addToConfigSection("10.maxEnchantLevel", "1");

        addToConfigSection("16.name", "Sharpness");
        addToConfigSection("16.bukkitName", "DAMAGE_ALL");
        addToConfigSection("16.ver", "1.00");
        addToConfigSection("16.maxEnchantLevel", "5");

        addToConfigSection("17.name", "Smite");
        addToConfigSection("17.bukkitName", "DAMAGE_UNDEAD");
        addToConfigSection("17.ver", "1.00");
        addToConfigSection("17.maxEnchantLevel", "5");

        addToConfigSection("18.name", "Bane of Arthropods");
        addToConfigSection("18.bukkitName", "DAMAGE_ARTHROPODS");
        addToConfigSection("18.ver", "1.00");
        addToConfigSection("18.maxEnchantLevel", "5");

        addToConfigSection("19.name", "Knockback");
        addToConfigSection("19.bukkitName", "KNOCKBACK");
        addToConfigSection("19.ver", "1.00");
        addToConfigSection("19.maxEnchantLevel", "2");

        addToConfigSection("20.name", "Fire Aspect");
        addToConfigSection("20.bukkitName", "FIRE_ASPECT");
        addToConfigSection("20.ver", "1.00");
        addToConfigSection("20.maxEnchantLevel", "2");

        addToConfigSection("21.name", "Looting");
        addToConfigSection("21.bukkitName", "LOOT_BONUS_MOBS");
        addToConfigSection("21.ver", "1.00");
        addToConfigSection("21.maxEnchantLevel", "3");

        addToConfigSection("22.name", "Sweeping Edge");
        addToConfigSection("22.bukkitName", "SWEEPING_EDGE");
        addToConfigSection("22.ver", "1.11");
        addToConfigSection("22.maxEnchantLevel", "3");

        addToConfigSection("32.name", "Efficiency");
        addToConfigSection("32.bukkitName", "DIG_SPEED");
        addToConfigSection("32.ver", "1.00");
        addToConfigSection("32.maxEnchantLevel", "5");

        addToConfigSection("33.name", "Silk Touch");
        addToConfigSection("33.bukkitName", "SILK_TOUCH");
        addToConfigSection("33.ver", "1.00");
        addToConfigSection("33.maxEnchantLevel", "1");

        addToConfigSection("34.name", "Unbreaking");
        addToConfigSection("34.bukkitName", "DURABILITY");
        addToConfigSection("34.ver", "1.00");
        addToConfigSection("34.maxEnchantLevel", "3");

        addToConfigSection("35.name", "Fortune");
        addToConfigSection("35.bukkitName", "LOOT_BONUS_BLOCKS");
        addToConfigSection("35.ver", "1.00");
        addToConfigSection("35.maxEnchantLevel", "3");

        addToConfigSection("48.name", "Power");
        addToConfigSection("48.bukkitName", "ARROW_DAMAGE");
        addToConfigSection("48.ver", "1.01");
        addToConfigSection("48.maxEnchantLevel", "5");

        addToConfigSection("49.name", "Punch");
        addToConfigSection("49.bukkitName", "ARROW_KNOCKBACK");
        addToConfigSection("49.ver", "1.01");
        addToConfigSection("49.maxEnchantLevel", "2");

        addToConfigSection("50.name", "Flame");
        addToConfigSection("50.bukkitName", "ARROW_FIRE");
        addToConfigSection("50.ver", "1.01");
        addToConfigSection("50.maxEnchantLevel", "1");

        addToConfigSection("51.name", "Infinity");
        addToConfigSection("51.bukkitName", "ARROW_INFINITE");
        addToConfigSection("51.ver", "1.01");
        addToConfigSection("51.maxEnchantLevel", "1");

        addToConfigSection("61.name", "Luck of the Sea");
        addToConfigSection("61.bukkitName", "LUCK");
        addToConfigSection("61.ver", "1.07");
        addToConfigSection("61.maxEnchantLevel", "3");

        addToConfigSection("62.name", "Lure");
        addToConfigSection("62.bukkitName", "LURE");
        addToConfigSection("62.ver", "1.07");
        addToConfigSection("62.maxEnchantLevel", "3");

        addToConfigSection("65.name", "Loyalty");
        addToConfigSection("65.bukkitName", "LOYALTY");
        addToConfigSection("65.ver", "1.13");
        addToConfigSection("65.maxEnchantLevel", "3");

        addToConfigSection("66.name", "Impaling");
        addToConfigSection("66.bukkitName", "IMPALING");
        addToConfigSection("66.ver", "1.13");
        addToConfigSection("66.maxEnchantLevel", "5");

        addToConfigSection("67.name", "Riptide");
        addToConfigSection("67.bukkitName", "RIPTIDE");
        addToConfigSection("67.ver", "1.13");
        addToConfigSection("67.maxEnchantLevel", "3");

        addToConfigSection("68.name", "Channeling");
        addToConfigSection("68.bukkitName", "CHANNELING");
        addToConfigSection("68.ver", "1.13");
        addToConfigSection("68.maxEnchantLevel", "1");

        addToConfigSection("70.name", "Mending");
        addToConfigSection("70.bukkitName", "MENDING");
        addToConfigSection("70.ver", "1.09");
        addToConfigSection("70.maxEnchantLevel", "1");

        addToConfigSection("71.name", "Curse of Vanishing");
        addToConfigSection("71.bukkitName", "VANISHING_CURSE");
        addToConfigSection("71.ver", "1.11");
        addToConfigSection("71.maxEnchantLevel", "1");

        // 1.14 Enchants - Theese have no Minecraft ID's

        addToConfigSection("101.name", "Multishot");
        addToConfigSection("101.bukkitName", "MULTSHOT");
        addToConfigSection("101.ver", "1.14");
        addToConfigSection("101.maxEnchantLevel", "1");

        addToConfigSection("102.name", "Piercing");
        addToConfigSection("102.bukkitName", "PIERCING");
        addToConfigSection("102.ver", "1.14");
        addToConfigSection("103.maxEnchantLevel", "4");

        addToConfigSection("103.name", "Quick Charge");
        addToConfigSection("103.bukkitName", "QUICK_CHARGE");
        addToConfigSection("103.ver", "1.14");
        addToConfigSection("103.maxEnchantLevel", "3");
    }

    private void addToConfigSection(String path, String value) {
        String[] keys = path.split("\\.");
        if (!enchantControl.enchantConfigSection.containsValue(path)) {
            enchantControl.enchantConfigSection.put(path, value);
        }
        if (!enchantControl.enchantConfigSectionID.contains(keys[0])) {
            enchantControl.enchantConfigSectionID.add(keys[0]);
        }
    }


}
