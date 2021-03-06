package genericminecraftmod.item.tools;


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import genericminecraftmod.GenericMinecraftMod;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemSpade;

public class ItemGenericShovel extends ItemSpade {

    public ItemGenericShovel() {
        this(GenericMinecraftMod.genericToolMaterial, "genericShovel");
    }

    public ItemGenericShovel(ToolMaterial mat, String name) {
        super(mat);
        setCreativeTab(GenericMinecraftMod.TAB);
        setUnlocalizedName(name);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IIconRegister par1IconRegister) {
        this.itemIcon = par1IconRegister.registerIcon(GenericMinecraftMod.MODID + ":" + getUnlocalizedName());
    }
}
