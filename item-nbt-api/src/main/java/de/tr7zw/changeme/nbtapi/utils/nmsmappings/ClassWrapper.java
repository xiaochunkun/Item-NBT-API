package de.tr7zw.changeme.nbtapi.utils.nmsmappings;

import static de.tr7zw.changeme.nbtapi.utils.MinecraftVersion.getLogger;

import java.util.logging.Level;

import org.bukkit.Bukkit;

import de.tr7zw.changeme.nbtapi.utils.MinecraftVersion;

/**
 * Wraps NMS and CRAFT classes
 * 
 * @author tr7zw
 *
 */
@SuppressWarnings("javadoc")
public enum ClassWrapper {
    CRAFT_ITEMSTACK(PackageWrapper.CRAFTBUKKIT, "inventory.CraftItemStack", null, null),
    CRAFT_METAITEM(PackageWrapper.CRAFTBUKKIT, "inventory.CraftMetaItem", null, null),
    CRAFT_ENTITY(PackageWrapper.CRAFTBUKKIT, "entity.CraftEntity", null, null),
    CRAFT_WORLD(PackageWrapper.CRAFTBUKKIT, "CraftWorld", null, null),
    CRAFT_SERVER(PackageWrapper.CRAFTBUKKIT, "CraftServer", null, null),
    CRAFT_PERSISTENTDATACONTAINER(PackageWrapper.CRAFTBUKKIT, "persistence.CraftPersistentDataContainer",
            MinecraftVersion.MC1_14_R1, null),
    NMS_NBTBASE(PackageWrapper.NMS, "NBTBase", null, null, "net.minecraft.nbt", "net.minecraft.nbt.Tag"),
    NMS_TAGTYPE(PackageWrapper.NMS, "NBTTagType", MinecraftVersion.MC1_21_R4, null, "net.minecraft.nbt", "net.minecraft.nbt.TagType"),
    NMS_NBTTAGSTRING(PackageWrapper.NMS, "NBTTagString", null, null, "net.minecraft.nbt",
            "net.minecraft.nbt.StringTag"),
    NMS_NBTTAGINT(PackageWrapper.NMS, "NBTTagInt", null, null, "net.minecraft.nbt", "net.minecraft.nbt.IntTag"),
    NMS_NBTTAGINTARRAY(PackageWrapper.NMS, "NBTTagIntArray", null, null, "net.minecraft.nbt",
            "net.minecraft.nbt.IntArrayTag"),
    NMS_NBTTAGFLOAT(PackageWrapper.NMS, "NBTTagFloat", null, null, "net.minecraft.nbt", "net.minecraft.nbt.FloatTag"),
    NMS_NBTTAGDOUBLE(PackageWrapper.NMS, "NBTTagDouble", null, null, "net.minecraft.nbt",
            "net.minecraft.nbt.DoubleTag"),
    NMS_NBTTAGLONG(PackageWrapper.NMS, "NBTTagLong", null, null, "net.minecraft.nbt", "net.minecraft.nbt.LongTag"),
    NMS_ITEMSTACK(PackageWrapper.NMS, "ItemStack", null, null, "net.minecraft.world.item",
            "net.minecraft.world.item.ItemStack"),
    NMS_NBTTAGCOMPOUND(PackageWrapper.NMS, "NBTTagCompound", null, null, "net.minecraft.nbt",
            "net.minecraft.nbt.CompoundTag"),
    NMS_NBTTAGLIST(PackageWrapper.NMS, "NBTTagList", null, null, "net.minecraft.nbt", "net.minecraft.nbt.ListTag"),
    NMS_NBTCOMPRESSEDSTREAMTOOLS(PackageWrapper.NMS, "NBTCompressedStreamTools", null, null, "net.minecraft.nbt",
            "net.minecraft.nbt.NbtIo"),
    NMS_MOJANGSONPARSER(PackageWrapper.NMS, "MojangsonParser", null, null, "net.minecraft.nbt",
            "net.minecraft.nbt.TagParser"),
    NMS_TILEENTITY(PackageWrapper.NMS, "TileEntity", null, null, "net.minecraft.world.level.block.entity",
            "net.minecraft.world.level.block.entity.BlockEntity"),
    NMS_BLOCKPOSITION(PackageWrapper.NMS, "BlockPosition", MinecraftVersion.MC1_8_R3, null, "net.minecraft.core",
            "net.minecraft.core.BlockPos"),
    NMS_WORLDSERVER(PackageWrapper.NMS, "WorldServer", null, null, "net.minecraft.server.level",
            "net.minecraft.server.level.ServerLevel"),
    NMS_MINECRAFTSERVER(PackageWrapper.NMS, "MinecraftServer", null, null, "net.minecraft.server",
            "net.minecraft.server.MinecraftServer"),
    NMS_WORLD(PackageWrapper.NMS, "World", null, null, "net.minecraft.world.level", "net.minecraft.world.level.Level"),
    NMS_ENTITY(PackageWrapper.NMS, "Entity", null, null, "net.minecraft.world.entity",
            "net.minecraft.world.entity.Entity"),
    NMS_ENTITYTYPES(PackageWrapper.NMS, "EntityTypes", null, null, "net.minecraft.world.entity",
            "net.minecraft.world.entity.EntityType"),
    NMS_REGISTRYSIMPLE(PackageWrapper.NMS, "RegistrySimple", MinecraftVersion.MC1_11_R1, MinecraftVersion.MC1_12_R1),
    NMS_REGISTRYMATERIALS(PackageWrapper.NMS, "RegistryMaterials", null, null, "net.minecraft.core",
            "net.minecraft.core.MappedRegistry"),
    NMS_IREGISTRY(PackageWrapper.NMS, "IRegistry", null, null, "net.minecraft.core", "net.minecraft.core.Registry"),
    NMS_MINECRAFTKEY(PackageWrapper.NMS, "MinecraftKey", MinecraftVersion.MC1_8_R3, null, "net.minecraft.resources",
            "net.minecraft.resources.ResourceKey"),
    NMS_GAMEPROFILESERIALIZER(PackageWrapper.NMS, "GameProfileSerializer", null, null, "net.minecraft.nbt",
            "net.minecraft.nbt.NbtUtils"),
    NMS_IBLOCKDATA(PackageWrapper.NMS, "IBlockData", MinecraftVersion.MC1_8_R3, null,
            "net.minecraft.world.level.block.state", "net.minecraft.world.level.block.state.BlockState"),
    NMS_NBTACCOUNTER(PackageWrapper.NMS, "NBTReadLimiter", MinecraftVersion.MC1_20_R3, null, "net.minecraft.nbt",
            "net.minecraft.nbt.NbtAccounter"),
    NMS_CUSTOMDATA(PackageWrapper.NMS, "CustomData", MinecraftVersion.MC1_20_R4, null,
            "net.minecraft.world.item.component", "net.minecraft.world.item.component.CustomData"),
    NMS_DATACOMPONENTTYPE(PackageWrapper.NMS, "DataComponentType", MinecraftVersion.MC1_20_R4, null,
            "net.minecraft.core.component", "net.minecraft.core.component.DataComponentType"),
    NMS_DATACOMPONENTS(PackageWrapper.NMS, "DataComponents", MinecraftVersion.MC1_20_R4, null,
            "net.minecraft.core.component", "net.minecraft.core.component.DataComponents"),
    NMS_DATACOMPONENTHOLDER(PackageWrapper.NMS, "DataComponentHolder", MinecraftVersion.MC1_20_R4, null,
            "net.minecraft.core.component", "net.minecraft.core.component.DataComponentHolder"),
    NMS_PROVIDER(PackageWrapper.NMS, "HolderLookup$a", MinecraftVersion.MC1_20_R4, null,
            "net.minecraft.core", "net.minecraft.core.HolderLookup$Provider"),
    NMS_SERVER(PackageWrapper.NMS, "MinecraftServer", MinecraftVersion.MC1_20_R4, null,
            "net.minecraft.server", "net.minecraft.server.MinecraftServer"),
    NMS_DATAFIXERS(PackageWrapper.NMS, "DataConverterRegistry", MinecraftVersion.MC1_20_R4, null,
            "net.minecraft.util.datafix", "net.minecraft.util.datafix.DataFixers"),
    NMS_REFERENCES(PackageWrapper.NMS, "DataConverterTypes", MinecraftVersion.MC1_20_R4, null,
            "net.minecraft.util.datafix.fixes", "net.minecraft.util.datafix.fixes.References"),
    NMS_NBTOPS(PackageWrapper.NMS, "DynamicOpsNBT", MinecraftVersion.MC1_20_R4, null,
            "net.minecraft.nbt", "net.minecraft.nbt.NbtOps"),
    GAMEPROFILE(PackageWrapper.NONE, "com.mojang.authlib.GameProfile", MinecraftVersion.MC1_8_R3, null);

    private Class<?> clazz;
    private boolean enabled = false;
    private final String mojangName;

    ClassWrapper(PackageWrapper packageId, String clazzName, MinecraftVersion from, MinecraftVersion to) {
        this(packageId, clazzName, from, to, null, null);
    }

    ClassWrapper(PackageWrapper packageId, String clazzName, MinecraftVersion from, MinecraftVersion to,
            String mojangMap, String mojangName) {
        this.mojangName = mojangName;
        if (from != null && MinecraftVersion.getVersion().getVersionId() < from.getVersionId()) {
            return;
        }
        if (to != null && MinecraftVersion.getVersion().getVersionId() > to.getVersionId()) {
            return;
        }
        enabled = true;
        try {
            if (MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_18_R1) && mojangName != null) {
                // check for Mojmapped enviroment
                try {
                    clazz = Class.forName(mojangName);
                    return;
                } catch (ClassNotFoundException ex) {
                    // ignored, not mojang mapped
                }
            }
            if (MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_17_R1) && mojangMap != null) {
                clazz = Class.forName(mojangMap + "." + clazzName);
            } else if (packageId == PackageWrapper.NONE) {
                clazz = Class.forName(clazzName);
            } else if (MinecraftVersion.isForgePresent() && MinecraftVersion.getVersion() == MinecraftVersion.MC1_7_R4
                    && Forge1710Mappings.getClassMappings().get(this.name()) != null) {
                clazz = Class.forName(clazzName = Forge1710Mappings.getClassMappings().get(this.name()));
            } else if (packageId == PackageWrapper.CRAFTBUKKIT) {
                // this also works for un-remapped Paper 1.20+
                clazz = Class.forName(Bukkit.getServer().getClass().getPackage().getName() + "." + clazzName);
            } else {
                // fallback for old versions pre mojmap and in the nms package
                String version = MinecraftVersion.getVersion().getPackageName();
                clazz = Class.forName(packageId.getUri() + "." + version + "." + clazzName);
            }
        } catch (Throwable ex) {
            getLogger().log(Level.WARNING, "[NBTAPI] Error while trying to resolve the class '" + clazzName + "'!", ex);
        }
    }

    /**
     * @return The wrapped class
     */
    public Class<?> getClazz() {
        return clazz;
    }

    /**
     * @return Is this class available in this Version
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * @return Package+Class name used by Mojang
     */
    public String getMojangName() {
        return mojangName;
    }

}
