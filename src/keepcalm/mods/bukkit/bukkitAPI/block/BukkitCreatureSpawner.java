package keepcalm.mods.bukkit.bukkitAPI.block;

import keepcalm.mods.bukkit.bukkitAPI.BukkitWorld;
import net.minecraft.tileentity.TileEntityMobSpawner;

import org.bukkit.block.Block;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.entity.CreatureType;
import org.bukkit.entity.EntityType;
//import org.bukkit.craftbukkit.BukkitWorld;

public class BukkitCreatureSpawner extends BukkitBlockState implements CreatureSpawner {
    private final BukkitWorld world;
    private final TileEntityMobSpawner spawner;

    public BukkitCreatureSpawner(final Block block) {
        super(block);

        world = (BukkitWorld) block.getWorld();
        spawner = (TileEntityMobSpawner) world.getTileEntityAt(getX(), getY(), getZ());
    }

    @Deprecated
    public CreatureType getCreatureType() {
        return CreatureType.fromName(spawner.getMobEntity().getEntityName());
    }

    public EntityType getSpawnedType() {
        return EntityType.fromName(spawner.getMobID());
    }

    @Deprecated
    public void setCreatureType(CreatureType creatureType) {
        spawner.setMobID(creatureType.getName());
    }

    public void setSpawnedType(EntityType entityType) {
        if (entityType == null || entityType.getName() == null) {
            throw new IllegalArgumentException("Can't spawn EntityType " + entityType + " from mobspawners!");
        }

        spawner.setMobID(entityType.getName());
    }

    @Deprecated
    public String getCreatureTypeId() {
        return spawner.getMobEntity().getEntityName();
    }

    @Deprecated
    public void setCreatureTypeId(String creatureName) {
        setCreatureTypeByName(creatureName);
    }

    public String getCreatureTypeName() {
        return spawner.getMobEntity().getEntityName();
    }

    public void setCreatureTypeByName(String creatureType) {
        // Verify input
        EntityType type = EntityType.fromName(creatureType);
        if (type == null) {
            return;
        }
        setSpawnedType(type);
    }

    public int getDelay() {
        return spawner.delay;
    }

    public void setDelay(int delay) {
        spawner.delay = delay;
    }

}
