package com.deeplake.idealland.item.weapon;

import com.deeplake.idealland.entity.projectiles.EntityIdlProjectile;
import com.deeplake.idealland.entity.projectiles.EntityProjectileBuilder;
import com.deeplake.idealland.entity.projectiles.ProjectileArgs;
import com.deeplake.idealland.item.ItemAdaptingBase;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Enchantments;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemPistolBuilder extends ItemPistolBase {
    public ItemPistolBuilder(String name) {
        super(name);
        setRangedWeapon();
        useable = true;
        base_cd = 1f;
    }

    @Override
    public int getMaxDamage(ItemStack stack) {
        return 256;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack stack)
    {
        return EnumAction.BOW;
    }

    public EntityIdlProjectile getBullet(ItemStack stack, World worldIn, EntityLivingBase entityLiving, int timeLeft) {
        return new EntityProjectileBuilder(worldIn, new ProjectileArgs(5f), entityLiving,
                entityLiving.getLookVec().x * 10,
                entityLiving.getLookVec().y * 10,
                entityLiving.getLookVec().z * 10);
    }

}