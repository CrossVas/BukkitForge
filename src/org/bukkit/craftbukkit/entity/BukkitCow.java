package org.bukkit.craftbukkit.entity;

import net.minecraft.entity.passive.EntityCow;

import org.bukkit.craftbukkit.BukkitServer;
import org.bukkit.entity.Cow;
import org.bukkit.entity.EntityType;
//import org.bukkit.craftbukkit.CraftServer;

public class BukkitCow extends BukkitAnimals implements Cow {

    public BukkitCow(BukkitServer server, EntityCow entity) {
        super(server, entity);
    }

    @Override
    public EntityCow getHandle() {
        return (EntityCow) entity;
    }

    @Override
    public String toString() {
        return "BukkitCow";
    }

    public EntityType getType() {
        return EntityType.COW;
    }
}
