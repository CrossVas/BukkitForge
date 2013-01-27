package org.bukkit.craftbukkit.entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;

import org.bukkit.craftbukkit.BukkitServer;
import org.bukkit.entity.Creature;
import org.bukkit.entity.LivingEntity;
//import org.bukkit.craftbukkit.BukkitServer;

public class BukkitCreature extends BukkitLivingEntity implements Creature {
    public BukkitCreature(BukkitServer server, EntityCreature entity) {
        super(server, entity);
    }

    public void setTarget(LivingEntity target) {
        EntityCreature entity = getHandle();
        if (target == null) {
            entity.setTarget(null);
        } else if (target instanceof BukkitLivingEntity) {
            entity.setTarget(((BukkitLivingEntity) target).getHandle());
            entity.setPathToEntity(entity.worldObj.getPathEntityToEntity(entity, entity.getAttackTarget(), 16.0F, true, false, false, true));
        }
    }

    public BukkitLivingEntity getTarget() {
        if (getHandle().getAttackTarget() == null) return null;
        if (!(getHandle().getAttackTarget() instanceof EntityLiving)) return null;

        return (BukkitLivingEntity) BukkitEntity.getEntity(this.server, getHandle().getAttackTarget());
    }

    @Override
    public EntityCreature getHandle() {
        return (EntityCreature) entity;
    }

    @Override
    public String toString() {
        return "BukkitCreature";
    }
}
