package Mingress.common;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class MingressTab extends CreativeTabs
 {
	public MingressTab(String label)
	{
		super(label);
	}
 
	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem()
	{
		return MingressCore.XmpBurster;
	}
 
	@Override
	@SideOnly(Side.CLIENT)
	public String getTranslatedTabLabel()
	{
		return "Mingress";
	}

}
