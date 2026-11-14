package zera.negrotown.negrotown.entity;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import zera.negrotown.negrotown.NegroTownMod;

public class ModEntity {

    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(Registries.ENTITY_TYPE, NegroTownMod.MODID);

    public static final DeferredHolder<EntityType<?>, EntityType<BossEntity>> BOSS =
            ENTITIES.register("boss_final", () -> EntityType.Builder
                    .of(BossEntity::new, MobCategory.MONSTER)
                    .sized(4.5F, 5.5F)
                    .build("boss_final"));

}
