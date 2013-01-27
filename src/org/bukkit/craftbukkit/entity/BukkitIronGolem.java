package org.bukkit.craftbukkit.entity;

import net.minecraft.entity.monster.EntityIronGolem;

import org.bukkit.craftbukkit.BukkitServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.IronGolem;
//import org.bukkit.craftbukkit.BukkitServer;

public class BukkitIronGolem extends BukkitGolem implements IronGolem {
	private boolean playerCreated = false;
    public BukkitIronGolem(BukkitServer server, EntityIronGolem entity) {
        super(server, entity);
    }

    @Override
    public EntityIronGolem getHandle() {
        return (EntityIronGolem) entity;
    }

    @Override
    public String toString() {
        return "BukkitIronGolem";
    }

    public boolean isPlayerCreated() {
    	// FIXME: Stub
        return playerCreated;
    }

    public void setPlayerCreated(boolean playerCreated) {
    	// FIXME: Stub
        this.playerCreated = playerCreated;
    }

    @Override
    public EntityType getType() {
        return EntityType.IRON_GOLEM;
    }
}
