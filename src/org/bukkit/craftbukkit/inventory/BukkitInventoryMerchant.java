package org.bukkit.craftbukkit.inventory;

import net.minecraft.inventory.InventoryMerchant;

import org.bukkit.inventory.MerchantInventory;

public class BukkitInventoryMerchant extends BukkitInventory implements MerchantInventory {
    public BukkitInventoryMerchant(InventoryMerchant merchant) {
        super(merchant);
    }
}
