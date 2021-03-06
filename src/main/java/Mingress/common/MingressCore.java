package Mingress.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

@Mod(modid = MingressCore.MODID, version = MingressCore.VERSION)
public class MingressCore {
	public static final String MODID = "mingressmod";
    public static final String VERSION = "1.0";

    public static final CreativeTabs MingressTab = new MingressTab("Mingress");
    //上はタブ、下はアイテムの登録
    //機能についてはhttp://aganism.com/game/ingress/item/参照
    public static Item XmpBurster;
    public static Item UltraStryke;
    public static Item JARVISVirus;
    public static Item ADARefactor;
    public static Item PortalShield;
    public static Item LinkAmp;
    public static Item HeatSink;
    public static Item MultiHack;
    public static Item ForceAmp;
    public static Item Turret;
    public static Item Resonator;
    public static Item PowerCube;
    public static Item Capsule;
    public static Item PortalKey;
    
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		//すごく汚いですがまとまりを重視してコピペ
		//コメントアウト部分も編集しやすいよう放置しました
		
		//アイテムのインスタンス生成
		XmpBurster = new Item()
		.setCreativeTab(MingressTab)/*クリエイティブのタブ*/
		.setUnlocalizedName("XmpBurster")/*システム名の登録*/
		.setTextureName("mingress:xmpburster")/*テクスチャの指定*/
		/*.setHasSubtypes(true)*//*ダメージ値等で複数の種類のアイテムを分けているかどうか。デフォルトfalse*/
		/*.setMaxDamage(256)*//*耐久値の設定。デフォルト0*/
		/*.setFull3D()*//*３D表示で描画させる。ツールや骨、棒等。*/
		/*.setContainerItem(Items.stick)*//*クラフト時にアイテムを返却できるようにしている際の返却アイテムの指定。*/
		/*.setPotionEffect(PotionHelper.ghastTearEffect)*//*指定文字列に対応した素材として醸造台で使える。PotionHelper参照のこと。*/
		/*.setNoRepair()*//*修理レシピを削除し、金床での修繕を出来なくする*/
		.setMaxStackSize(64);/*スタックできる量。デフォルト64*/
		//アイテムの登録。登録文字列はMOD内で被らなければ何でも良い。
		GameRegistry.registerItem(XmpBurster, "xmpburster");
		
		UltraStryke = new Item()
		.setCreativeTab(MingressTab)/*クリエイティブのタブ*/
	    .setUnlocalizedName("UltraStruke")/*システム名の登録*/
		.setTextureName("mingress:ultrastryke")/*テクスチャの指定*/
		/*.setHasSubtypes(true)*//*ダメージ値等で複数の種類のアイテムを分けているかどうか。デフォルトfalse*/
		/*.setMaxDamage(256)*//*耐久値の設定。デフォルト0*/
		/*.setFull3D()*//*３D表示で描画させる。ツールや骨、棒等。*/
		/*.setContainerItem(Items.stick)*//*クラフト時にアイテムを返却できるようにしている際の返却アイテムの指定。*/
		/*.setPotionEffect(PotionHelper.ghastTearEffect)*//*指定文字列に対応した素材として醸造台で使える。PotionHelper参照のこと。*/
	    /*.setNoRepair()*//*修理レシピを削除し、金床での修繕を出来なくする*/
		.setMaxStackSize(64);/*スタックできる量。デフォルト64*/
		//アイテムの登録。登録文字列はMOD内で被らなければ何でも良い。
		GameRegistry.registerItem(UltraStryke, "ultrastryke");
		
		JARVISVirus = new Item()
		.setCreativeTab(MingressTab)/*クリエイティブのタブ*/
	    .setUnlocalizedName("JARVISVirus")/*システム名の登録*/
		.setTextureName("mingress:jarvisvirus")/*テクスチャの指定*/
		/*.setHasSubtypes(true)*//*ダメージ値等で複数の種類のアイテムを分けているかどうか。デフォルトfalse*/
		/*.setMaxDamage(256)*//*耐久値の設定。デフォルト0*/
		/*.setFull3D()*//*３D表示で描画させる。ツールや骨、棒等。*/
		/*.setContainerItem(Items.stick)*//*クラフト時にアイテムを返却できるようにしている際の返却アイテムの指定。*/
		/*.setPotionEffect(PotionHelper.ghastTearEffect)*//*指定文字列に対応した素材として醸造台で使える。PotionHelper参照のこと。*/
	    /*.setNoRepair()*//*修理レシピを削除し、金床での修繕を出来なくする*/
		.setMaxStackSize(64);/*スタックできる量。デフォルト64*/
		//アイテムの登録。登録文字列はMOD内で被らなければ何でも良い。
		GameRegistry.registerItem(JARVISVirus, "jarvisvirus");
		
		ADARefactor = new Item()
		.setCreativeTab(MingressTab)/*クリエイティブのタブ*/
	    .setUnlocalizedName("ADARefactor")/*システム名の登録*/
		.setTextureName("mingress:adarefactor")/*テクスチャの指定*/
		/*.setHasSubtypes(true)*//*ダメージ値等で複数の種類のアイテムを分けているかどうか。デフォルトfalse*/
		/*.setMaxDamage(256)*//*耐久値の設定。デフォルト0*/
		/*.setFull3D()*//*３D表示で描画させる。ツールや骨、棒等。*/
		/*.setContainerItem(Items.stick)*//*クラフト時にアイテムを返却できるようにしている際の返却アイテムの指定。*/
		/*.setPotionEffect(PotionHelper.ghastTearEffect)*//*指定文字列に対応した素材として醸造台で使える。PotionHelper参照のこと。*/
	    /*.setNoRepair()*//*修理レシピを削除し、金床での修繕を出来なくする*/
		.setMaxStackSize(64);/*スタックできる量。デフォルト64*/
		//アイテムの登録。登録文字列はMOD内で被らなければ何でも良い。
		GameRegistry.registerItem(ADARefactor, "adarefactor");
		
		PortalShield = new Item()
		.setCreativeTab(MingressTab)/*クリエイティブのタブ*/
	    .setUnlocalizedName("PortalShield")/*システム名の登録*/
		.setTextureName("mingress:portalshield")/*テクスチャの指定*/
		/*.setHasSubtypes(true)*//*ダメージ値等で複数の種類のアイテムを分けているかどうか。デフォルトfalse*/
		/*.setMaxDamage(256)*//*耐久値の設定。デフォルト0*/
		/*.setFull3D()*//*３D表示で描画させる。ツールや骨、棒等。*/
		/*.setContainerItem(Items.stick)*//*クラフト時にアイテムを返却できるようにしている際の返却アイテムの指定。*/
		/*.setPotionEffect(PotionHelper.ghastTearEffect)*//*指定文字列に対応した素材として醸造台で使える。PotionHelper参照のこと。*/
	    /*.setNoRepair()*//*修理レシピを削除し、金床での修繕を出来なくする*/
		.setMaxStackSize(64);/*スタックできる量。デフォルト64*/
		//アイテムの登録。登録文字列はMOD内で被らなければ何でも良い。
		GameRegistry.registerItem(PortalShield, "portalshield");
		
		LinkAmp = new Item()
		.setCreativeTab(MingressTab)/*クリエイティブのタブ*/
	    .setUnlocalizedName("LinkAmp")/*システム名の登録*/
		.setTextureName("mingress:linkamp")/*テクスチャの指定*/
		/*.setHasSubtypes(true)*//*ダメージ値等で複数の種類のアイテムを分けているかどうか。デフォルトfalse*/
		/*.setMaxDamage(256)*//*耐久値の設定。デフォルト0*/
		/*.setFull3D()*//*３D表示で描画させる。ツールや骨、棒等。*/
		/*.setContainerItem(Items.stick)*//*クラフト時にアイテムを返却できるようにしている際の返却アイテムの指定。*/
		/*.setPotionEffect(PotionHelper.ghastTearEffect)*//*指定文字列に対応した素材として醸造台で使える。PotionHelper参照のこと。*/
	    /*.setNoRepair()*//*修理レシピを削除し、金床での修繕を出来なくする*/
		.setMaxStackSize(64);/*スタックできる量。デフォルト64*/
		//アイテムの登録。登録文字列はMOD内で被らなければ何でも良い。
		GameRegistry.registerItem(LinkAmp, "linkamp");
		
		HeatSink = new Item()
		.setCreativeTab(MingressTab)/*クリエイティブのタブ*/
	    .setUnlocalizedName("HeatSink")/*システム名の登録*/
		.setTextureName("mingress:heatsink")/*テクスチャの指定*/
		/*.setHasSubtypes(true)*//*ダメージ値等で複数の種類のアイテムを分けているかどうか。デフォルトfalse*/
		/*.setMaxDamage(256)*//*耐久値の設定。デフォルト0*/
		/*.setFull3D()*//*３D表示で描画させる。ツールや骨、棒等。*/
		/*.setContainerItem(Items.stick)*//*クラフト時にアイテムを返却できるようにしている際の返却アイテムの指定。*/
		/*.setPotionEffect(PotionHelper.ghastTearEffect)*//*指定文字列に対応した素材として醸造台で使える。PotionHelper参照のこと。*/
	    /*.setNoRepair()*//*修理レシピを削除し、金床での修繕を出来なくする*/
		.setMaxStackSize(64);/*スタックできる量。デフォルト64*/
		//アイテムの登録。登録文字列はMOD内で被らなければ何でも良い。
		GameRegistry.registerItem(HeatSink, "heatsink");
		
		MultiHack = new Item()
		.setCreativeTab(MingressTab)/*クリエイティブのタブ*/
	    .setUnlocalizedName("MultiHack")/*システム名の登録*/
		.setTextureName("mingress:multihack")/*テクスチャの指定*/
		/*.setHasSubtypes(true)*//*ダメージ値等で複数の種類のアイテムを分けているかどうか。デフォルトfalse*/
		/*.setMaxDamage(256)*//*耐久値の設定。デフォルト0*/
		/*.setFull3D()*//*３D表示で描画させる。ツールや骨、棒等。*/
		/*.setContainerItem(Items.stick)*//*クラフト時にアイテムを返却できるようにしている際の返却アイテムの指定。*/
		/*.setPotionEffect(PotionHelper.ghastTearEffect)*//*指定文字列に対応した素材として醸造台で使える。PotionHelper参照のこと。*/
	    /*.setNoRepair()*//*修理レシピを削除し、金床での修繕を出来なくする*/
		.setMaxStackSize(64);/*スタックできる量。デフォルト64*/
		//アイテムの登録。登録文字列はMOD内で被らなければ何でも良い。
		GameRegistry.registerItem(MultiHack, "multihack");
		
		ForceAmp = new Item()
		.setCreativeTab(MingressTab)/*クリエイティブのタブ*/
	    .setUnlocalizedName("ForceAmp")/*システム名の登録*/
		.setTextureName("mingress:forceamp")/*テクスチャの指定*/
		/*.setHasSubtypes(true)*//*ダメージ値等で複数の種類のアイテムを分けているかどうか。デフォルトfalse*/
		/*.setMaxDamage(256)*//*耐久値の設定。デフォルト0*/
		/*.setFull3D()*//*３D表示で描画させる。ツールや骨、棒等。*/
		/*.setContainerItem(Items.stick)*//*クラフト時にアイテムを返却できるようにしている際の返却アイテムの指定。*/
		/*.setPotionEffect(PotionHelper.ghastTearEffect)*//*指定文字列に対応した素材として醸造台で使える。PotionHelper参照のこと。*/
	    /*.setNoRepair()*//*修理レシピを削除し、金床での修繕を出来なくする*/
		.setMaxStackSize(64);/*スタックできる量。デフォルト64*/
		//アイテムの登録。登録文字列はMOD内で被らなければ何でも良い。
		GameRegistry.registerItem(ForceAmp, "forceamp");
		
		Turret = new Item()
		.setCreativeTab(MingressTab)/*クリエイティブのタブ*/
	    .setUnlocalizedName("Turret")/*システム名の登録*/
		.setTextureName("mingress:turret")/*テクスチャの指定*/
		/*.setHasSubtypes(true)*//*ダメージ値等で複数の種類のアイテムを分けているかどうか。デフォルトfalse*/
		/*.setMaxDamage(256)*//*耐久値の設定。デフォルト0*/
		/*.setFull3D()*//*３D表示で描画させる。ツールや骨、棒等。*/
		/*.setContainerItem(Items.stick)*//*クラフト時にアイテムを返却できるようにしている際の返却アイテムの指定。*/
		/*.setPotionEffect(PotionHelper.ghastTearEffect)*//*指定文字列に対応した素材として醸造台で使える。PotionHelper参照のこと。*/
	    /*.setNoRepair()*//*修理レシピを削除し、金床での修繕を出来なくする*/
		.setMaxStackSize(64);/*スタックできる量。デフォルト64*/
		//アイテムの登録。登録文字列はMOD内で被らなければ何でも良い。
		GameRegistry.registerItem(Turret, "turret");
		
		Resonator = new Item()
		.setCreativeTab(MingressTab)/*クリエイティブのタブ*/
	    .setUnlocalizedName("Resonator")/*システム名の登録*/
		.setTextureName("mingress:resonator")/*テクスチャの指定*/
		/*.setHasSubtypes(true)*//*ダメージ値等で複数の種類のアイテムを分けているかどうか。デフォルトfalse*/
		/*.setMaxDamage(256)*//*耐久値の設定。デフォルト0*/
		/*.setFull3D()*//*３D表示で描画させる。ツールや骨、棒等。*/
		/*.setContainerItem(Items.stick)*//*クラフト時にアイテムを返却できるようにしている際の返却アイテムの指定。*/
		/*.setPotionEffect(PotionHelper.ghastTearEffect)*//*指定文字列に対応した素材として醸造台で使える。PotionHelper参照のこと。*/
	    /*.setNoRepair()*//*修理レシピを削除し、金床での修繕を出来なくする*/
		.setMaxStackSize(64);/*スタックできる量。デフォルト64*/
		//アイテムの登録。登録文字列はMOD内で被らなければ何でも良い。
		GameRegistry.registerItem(Resonator, "resonator");
		
		PowerCube = new Item()
		.setCreativeTab(MingressTab)/*クリエイティブのタブ*/
	    .setUnlocalizedName("PowerCube")/*システム名の登録*/
		.setTextureName("mingress:powercube")/*テクスチャの指定*/
		/*.setHasSubtypes(true)*//*ダメージ値等で複数の種類のアイテムを分けているかどうか。デフォルトfalse*/
		/*.setMaxDamage(256)*//*耐久値の設定。デフォルト0*/
		/*.setFull3D()*//*３D表示で描画させる。ツールや骨、棒等。*/
		/*.setContainerItem(Items.stick)*//*クラフト時にアイテムを返却できるようにしている際の返却アイテムの指定。*/
		/*.setPotionEffect(PotionHelper.ghastTearEffect)*//*指定文字列に対応した素材として醸造台で使える。PotionHelper参照のこと。*/
	    /*.setNoRepair()*//*修理レシピを削除し、金床での修繕を出来なくする*/
		.setMaxStackSize(64);/*スタックできる量。デフォルト64*/
		//アイテムの登録。登録文字列はMOD内で被らなければ何でも良い。
		GameRegistry.registerItem(PowerCube, "powercube");
		
		Capsule = new Item()
		.setCreativeTab(MingressTab)/*クリエイティブのタブ*/
	    .setUnlocalizedName("Capsule")/*システム名の登録*/
		.setTextureName("mingress:capsule")/*テクスチャの指定*/
		/*.setHasSubtypes(true)*//*ダメージ値等で複数の種類のアイテムを分けているかどうか。デフォルトfalse*/
		/*.setMaxDamage(256)*//*耐久値の設定。デフォルト0*/
		/*.setFull3D()*//*３D表示で描画させる。ツールや骨、棒等。*/
		/*.setContainerItem(Items.stick)*//*クラフト時にアイテムを返却できるようにしている際の返却アイテムの指定。*/
		/*.setPotionEffect(PotionHelper.ghastTearEffect)*//*指定文字列に対応した素材として醸造台で使える。PotionHelper参照のこと。*/
	    /*.setNoRepair()*//*修理レシピを削除し、金床での修繕を出来なくする*/
		.setMaxStackSize(64);/*スタックできる量。デフォルト64*/
		//アイテムの登録。登録文字列はMOD内で被らなければ何でも良い。
		GameRegistry.registerItem(Capsule, "capsule");
		
		PortalKey = new Item()
		.setCreativeTab(MingressTab)/*クリエイティブのタブ*/
	    .setUnlocalizedName("PortalKey")/*システム名の登録*/
		.setTextureName("mingress:portalkey")/*テクスチャの指定*/
		/*.setHasSubtypes(true)*//*ダメージ値等で複数の種類のアイテムを分けているかどうか。デフォルトfalse*/
		/*.setMaxDamage(256)*//*耐久値の設定。デフォルト0*/
		/*.setFull3D()*//*３D表示で描画させる。ツールや骨、棒等。*/
		/*.setContainerItem(Items.stick)*//*クラフト時にアイテムを返却できるようにしている際の返却アイテムの指定。*/
		/*.setPotionEffect(PotionHelper.ghastTearEffect)*//*指定文字列に対応した素材として醸造台で使える。PotionHelper参照のこと。*/
	    /*.setNoRepair()*//*修理レシピを削除し、金床での修繕を出来なくする*/
		.setMaxStackSize(64);/*スタックできる量。デフォルト64*/
		//アイテムの登録。登録文字列はMOD内で被らなければ何でも良い。
		GameRegistry.registerItem(PortalKey, "portalkey");
		
		
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		LanguageRegistry.addName(XmpBurster, "Xmp Burster");
		LanguageRegistry.instance().addNameForObject(XmpBurster, "ja_JP", "Xmpバースター");
		
		LanguageRegistry.addName(UltraStryke, "Ultra Stryke");
		LanguageRegistry.instance().addNameForObject(UltraStryke, "ja_JP", "ウルトラストライク");
		
		LanguageRegistry.addName(JARVISVirus, "JARVIS Virus");
		LanguageRegistry.instance().addNameForObject(JARVISVirus, "ja_JP", "ジャービス");
		
		LanguageRegistry.addName(ADARefactor, "ADA Refactor");
		LanguageRegistry.instance().addNameForObject(ADARefactor, "ja_JP", "エイダ");
		
		LanguageRegistry.addName(PortalShield, "Portal Shield");
		LanguageRegistry.instance().addNameForObject(PortalShield, "ja_JP", "ポータルシールド");
		
		LanguageRegistry.addName(LinkAmp, "Link Amp");
		LanguageRegistry.instance().addNameForObject(LinkAmp, "ja_JP", "リンクアンプ");
		
		LanguageRegistry.addName(HeatSink, "Heat Sink");
		LanguageRegistry.instance().addNameForObject(HeatSink, "ja_JP", "ヒートシンク");
		
		LanguageRegistry.addName(MultiHack, "Multi-hack");
		LanguageRegistry.instance().addNameForObject(MultiHack, "ja_JP", "マルチハック");
		
		LanguageRegistry.addName(ForceAmp, "Force Amp");
		LanguageRegistry.instance().addNameForObject(ForceAmp, "ja_JP", "フォースアンプ");
		
		LanguageRegistry.addName(Turret, "Turret");
		LanguageRegistry.instance().addNameForObject(Turret, "ja_JP", "タレット");
		
		LanguageRegistry.addName(Resonator, "Resonator");
		LanguageRegistry.instance().addNameForObject(Resonator, "ja_JP", "レゾネーター");
		
		LanguageRegistry.addName(PowerCube, "Power Cube");
		LanguageRegistry.instance().addNameForObject(PowerCube, "ja_JP", "パワーキューブ");
		
		LanguageRegistry.addName(Capsule, "Capsule");
		LanguageRegistry.instance().addNameForObject(Capsule, "ja_JP", "カプセル");
		
		LanguageRegistry.addName(PortalKey, "Portal Key");
		LanguageRegistry.instance().addNameForObject(PortalKey, "ja_JP", "ポータルキー");
	}

    //SubClass群はとりあえず置いとく感じなのでご自由に
}
