package net.bbrooker.minespace;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


@Mod(modid=MCSpaceInfo.ID, name=MCSpaceInfo.Name, version=MCSpaceInfo.VERS)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class MineSpace {
  
//////////////////////////////////////////////////////////////////////////////////////////////

/*LIST YOUR MOD HERE [ITEM]
  
	ITEM METERIAL FOR CRAFT (IRON AND ILLUMINIUM */
	
	public static final Item Screw = new Screw(1100).setUnlocalizedName("Screw").setMaxStackSize(100);
	public static final Item Wrech = new Wrech(1101).setUnlocalizedName("Wrech").setMaxStackSize(1);
	public static final Item Hammer = new Hammer(1102).setUnlocalizedName("Hammer").setMaxStackSize(1);
	public static final Item Nails = new Nail(1103).setUnlocalizedName("Nail").setMaxStackSize(100);
	public static final Item Metal = new Metal(1104).setUnlocalizedName("Metal").setMaxStackSize(100);
	public static final Item Titanium = new Titanium(1105).setUnlocalizedName("Titanium").setMaxStackSize(1);
	public static final Item Aluminium = new Aluminium(1106).setUnlocalizedName("Aluminium").setMaxStackSize(1);
	public static final Item Lead = new Lead(1107).setUnlocalizedName("Lead").setMaxStackSize(1);
	public static final Item Iradium = new Iradium(1108).setUnlocalizedName("Iradium").setMaxStackSize(1);
	public static final Item Silver = new Silver(1109).setUnlocalizedName("Silver").setMaxStackSize(1);
	public static final Item Tungsten = new Tungsten(1110).setUnlocalizedName("Tungsten").setMaxStackSize(1);
  	public static final Item Fiber = new Fiber(1111).setUnlocalizedName("Fiber").setMaxStackSize(1);
  	public static final Item Nanometerial = new Nanometerial(1112).setUnlocalizedName("Nanometerial").setMaxStackSize(1);
  	
  	
  	
  	public static final Item CrystalBlue = new CrystalBlue(1200).setUnlocalizedName("CrystalBlue").setMaxStackSize(1);
  	public static final Item CrystalRed = new CrystalRed(1201).setUnlocalizedName("CrystalRed").setMaxStackSize(1);
  	public static final Item CrystalGreen = new CrystalGreen(1202).setUnlocalizedName("CrystalGreen").setMaxStackSize(1);
  	public static final Item CrystalYellow = new CrystalYellow(1203).setUnlocalizedName("CrystalYellow").setMaxStackSize(1);
  	public static final Item CrystalOrange = new CrystalOrange(1204).setUnlocalizedName("CrystalOrange").setMaxStackSize(1);
  	public static final Item CrystalPurple = new CrystalPurple(1205).setUnlocalizedName("CrystalPurple").setMaxStackSize(1);
  	public static final Item CrystalPink = new CrystalPink(1206).setUnlocalizedName("CrystalPink").setMaxStackSize(1);
  	
  	
  	
  	
  	
  
  
  
  
  
  
  
       @Instance("Minespace")
       public static MineSpace instance;
  
       // Says where the client and server 'proxy' code is loaded.
       
      @SidedProxy(clientSide="mrbbook.infectionz.ClientProxy", serverSide="mrbbook.infectionz.CommonProxy")
       public static MineSpaceCommonProxy proxy;
  
          @EventHandler
        public void preInit(FMLPreInitializationEvent event) {

          }

        public void load(FMLInitializationEvent event) {
           	proxy.registerRenderInformation();
        	

        }

        public MineSpace() {

                //LanguageRegistry.addName(BaseballBatNail, "Spike bat");
                //LanguageRegistry.addName(Slayerblade, "Slayerblade");

                // LanguageRegistry.instance().addStringLocalization("container.TestTabsStuff", "Test Stuff");

                //====================================================================//
                //         ANTI HACK/SPY/COPY SYS BY TANAWAT BOONMAK [MRBBOOK]       //
                //==================================================================//
                
                //HOW TO USE ? 
                //1.) Disable // On Mark GameRegistry and ClientRegistry
                //2.) Run server for testing
                //3.) Pack and .Zip File to ClientSide 
                
                
                //********** if this mod is on server side please add "//" in the front of GameRegistry and ClientRegistry ******
                
                
                //GameRegistry.registerTileEntity(TileEntityTrashbin.class, "Trashbin");
                //ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTrashbin.class, new RendererTrashbin());

                //===================================================================//
                //     NO SPY NO KAK GREAN  NO COPY By. FRIDAY ANTIHACK SYSTEM      //
                //=================================================================//

        }
        
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
}
