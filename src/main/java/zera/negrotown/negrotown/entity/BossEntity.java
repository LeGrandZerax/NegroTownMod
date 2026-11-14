package zera.negrotown.negrotown.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.monster.Monster;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.Level;


public class BossEntity extends Monster {

    public BossEntity(EntityType<? extends Monster> type, Level level) {
        super(type, level);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
                .add(Attributes.MAX_HEALTH, 200)
                .add(Attributes.ATTACK_DAMAGE, 30)
                .add(Attributes.MOVEMENT_SPEED, 0.3)
                .add(Attributes.ARMOR, 20)
                .add(Attributes.KNOCKBACK_RESISTANCE, 1);
    }
}
