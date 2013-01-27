package org.bukkit.craftbukkit.entity;

import net.minecraft.entity.projectile.EntityWitherSkull;

import org.bukkit.craftbukkit.BukkitServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.WitherSkull;

public class BukkitWitherSkull extends BukkitFireball implements WitherSkull {
    public BukkitWitherSkull(BukkitServer server, EntityWitherSkull entity) {
        super(server, entity);
    }

    @Override
    public EntityWitherSkull getHandle() {
        return (EntityWitherSkull) entity;
    }

    @Override
    public String toString() {
        return "BukkitWitherSkull";
    }

    public EntityType getType() {
        return EntityType.WITHER_SKULL;
    }
}
