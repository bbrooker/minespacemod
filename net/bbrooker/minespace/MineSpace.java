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

    	///////////////////////
	ITEM METERIAL FOR CRAFT (IRON, METAL etc)*/
  	///////////////////////	
  	
	public static final Item Screw = new Screw(1100).setUnlocalizedName("Screw").setMaxStackSize(100);
	public static final Item Wrech = new Wrech(1101).setUnlocalizedName("Wrech").setMaxStackSize(1);
	public static final Item Hammer = new Hammer(1102).setUnlocalizedName("Hammer").setMaxStackSize(1);
	public static final Item Nails = new Nail(1103).setUnlocalizedName("Nail").setMaxStackSize(100);
	public static final Item Metal = new Metal(1104).setUnlocalizedName("Metal").setMaxStackSize(100);
	public static final Item Titanium = new Titanium(1105).setUnlocalizedName("Titanium").setMaxStackSize(1);
	public static final Item Aluminium = new Aluminium(1106).setUnlocalizedName("Aluminium").setMaxStackSize(1);
	public static final Item Tiberium = new Tiberium(1107).setUnlocalizedName("Tiberium").setMaxStackSize(1);
	public static final Item Iradium = new Iradium(1108).setUnlocalizedName("Iradium").setMaxStackSize(1);
	public static final Item Silver = new Silver(1109).setUnlocalizedName("Silver").setMaxStackSize(1);
	public static final Item Voxadium = new Voxadium(1110).setUnlocalizedName("Voxadium").setMaxStackSize(1);
  	public static final Item Fiber = new Fiber(1111).setUnlocalizedName("Fiber").setMaxStackSize(1);
  	public static final Item Nanometerial = new Nanometerial(1112).setUnlocalizedName("Nanometerial").setMaxStackSize(1);
  	
/*LIST YOUR MOD HERE [CRYSTAL]*/  	
	
	///////////////////////
  	//Crystal for crafting Lightsaber 
  	///////////////////////
  	
  	public static final Item CrystalBlue = new CrystalBlue(1200).setUnlocalizedName("CrystalBlue").setMaxStackSize(1);
  	public static final Item CrystalRed = new CrystalRed(1201).setUnlocalizedName("CrystalRed").setMaxStackSize(1);
  	public static final Item CrystalGreen = new CrystalGreen(1202).setUnlocalizedName("CrystalGreen").setMaxStackSize(1);
  	public static final Item CrystalYellow = new CrystalYellow(1203).setUnlocalizedName("CrystalYellow").setMaxStackSize(1);
  	public static final Item CrystalOrange = new CrystalOrange(1204).setUnlocalizedName("CrystalOrange").setMaxStackSize(1);
  	public static final Item CrystalPurple = new CrystalPurple(1205).setUnlocalizedName("CrystalPurple").setMaxStackSize(1);
  	public static final Item CrystalPink = new CrystalPink(1206).setUnlocalizedName("CrystalPink").setMaxStackSize(1);
  	public static final Item CrystalBlack = new CrystalBlack(1207).setUnlocalizedName("CrystalBlack").setMaxStackSize(1);
  	public static final Item CrystalWhite = new CrystalWhite(1208).setUnlocalizedName("CrystalWhite").setMaxStackSize(1);
  	
  	//ADVANCE
  	public static final Item AdvancedCrystalBlue = new AdvancedCrystalBlue(1250).setUnlocalizedName("AdvancedCrystalBlue").setMaxStackSize(1);
  	public static final Item AdvancedCrystalRed = new AdvancedCrystalRed(1251).setUnlocalizedName("AdvancedCrystalRed").setMaxStackSize(1);
  	public static final Item AdvancedCrystalGreen = new AdvancedCrystalGreen(1252).setUnlocalizedName("AdvancedCrystalGreen").setMaxStackSize(1);
  	public static final Item AdvancedCrystalPurple = new AdvancedCrystalPurple(1253).setUnlocalizedName("AdvancedCrystalPurple").setMaxStackSize(1);
  	public static final Item AdvancedCrystalPink = new AdvancedCrystalPink(1254).setUnlocalizedName("AdvancedCrystalPink").setMaxStackSize(1);
  	
  	
  	//WAR HEROES
    	public static final Item WarHeroesCrystalBlue = new WarHeroesCrystalBlue(1260).setUnlocalizedName("WarHeroesCrystalBlue").setMaxStackSize(1);
  	public static final Item WarHeroesCrystalRed = new WarHeroesCrystalRed(1261).setUnlocalizedName("WarHeroesCrystalRed").setMaxStackSize(1);
  	public static final Item WarHeroesCrystalGreen = new WarHeroesCrystalGreen(1262).setUnlocalizedName("WarHeroesCrystalGreen").setMaxStackSize(1);
    	public static final Item WarHeroesCrystalPurple = new WarHeroesCrystalPurple(1263).setUnlocalizedName("WarHeroesCrystalPurple").setMaxStackSize(1);
  	public static final Item WarHeroesCrystalOrange = new WarHeroesCrystalOrange(1264).setUnlocalizedName("WarHeroesCrystalOrange").setMaxStackSize(1);
  	
  
    	///////////////////////
  	/*  ECONOMIC ITEM    */
    	///////////////////////
  
  	//USE ALL OVER THE GALAXY
     	public static final Item GalacticSilver = new GalacticSilver(1300).setUnlocalizedName("GalacticSilver").setMaxStackSize(1024);
  
  	//OTHER ECON
  	public static final Item BlackCoin = new BlackCoin(1301).setUnlocalizedName("BlackCoin").setMaxStackSize(1024);
  	public static final Item GalaxyGold = new GalaxyGold(1302).setUnlocalizedName("BlackCoin").setMaxStackSize(1);
  
  	//Class + Quest ECON
  	public static final Item CitizenCoin = new CitizenCoin(1303).setUnlocalizedName("CitizenCoin").setMaxStackSize(1);
    	public static final Item OutlawCoin = new OutlawCoin(1304).setUnlocalizedName("OutlawCoin").setMaxStackSize(1);
  	public static final Item GuardianCoin = new GuardianCoin(1305).setUnlocalizedName("GuardianCoin").setMaxStackSize(1);
    	public static final Item SinsCoin = new SinsCoin(1305).setUnlocalizedName("SinsCoin").setMaxStackSize(1);
    	
    	//RESTAT ECON
        public static final Item ReclassCoin = new ReclassCoin(1307).setUnlocalizedName("ReclassCoin").setMaxStackSize(1);
  
  
      	///////////////////////
  	/*  LICENSE ITEM    */
    	///////////////////////
  
  	//vehicle license
        public static final Item AirLicense = new AirLicense(1400).setUnlocalizedName("AirLicense").setMaxStackSize(1);
        public static final Item WeaponLicense = new WeaponLicense(1401).setUnlocalizedName("OutlawID").setMaxStackSize(1);
  	public static final Item LargeWeaponLicense = new LargeWeaponLicense(1402).setUnlocalizedName("OutlawID").setMaxStackSize(1);
  	public static final Item SpeederLicense = new SpeederLicense(1403).setUnlocalizedName("SpeederLicense").setMaxStackSize(1);
  	
  	//ID Card
        public static final Item CitizenID = new CitizenID(1406).setUnlocalizedName("CitizenID").setMaxStackSize(1);
        public static final Item OutlawID = new OutlawID(1405).setUnlocalizedName("OutlawID").setMaxStackSize(1);

  
  	//Goverment ID
  	public static final Item PoliceID = new PoliceID(1406).setUnlocalizedName("PoliceID").setMaxStackSize(1);
  	public static final Item GiaID = new GiaID(1407).setUnlocalizedName("GiaID").setMaxStackSize(1);
  	
  	//REBEL ID
  	public static final RebelID = new RebelID(1408).setUnlocalizedName("RebelID").setMaxStackSize(1);
  	
  	// === CASH LICENSE ===
  	public static final LargeShipLicense = new LargeShipLicense(1409).setUnlocalizedName("LargeShipLicense").setMaxStackSize(1);
  	public static final WingsLicense = new WingsLicense(1410).setUnlocalizedName("LargeShipLicense").setMaxStackSize(1);
   	public static final RoboticLicense = new RoboticLicense(1411).setUnlocalizedName("RoboticLicense").setMaxStackSize(1);
  
  
  
        ///////////////////////////////////////////////
  	/*  METERIAL FOR ITEM ARMOUR & WEAPON       */
    	///////////////////////////////////////////////
  
  	//ARMOUR
    	public static final NanoFiber = new NanoFiber(1500).setUnlocalizedName("NanoFiber").setMaxStackSize(1); 
  	public static final QuarkArmour = new QuarkArmour(1501).setUnlocalizedName("QuarkArmour").setMaxStackSize(1); 
   	public static final RoboticCore = new RoboticCore(1502).setUnlocalizedName("RoboticCore").setMaxStackSize(1); //Need to craft Armour material
     	public static final TitaniumCore = new TitaniumCore(1503).setUnlocalizedName("TitaniumCore").setMaxStackSize(1); //Titanium
     	public static final IradiumCore = new IradiumCore(1504).setUnlocalizedName("IradiumCore").setMaxStackSize(1); //Iradium 
     	public static final IVMetal = new IVMetal(1505).setUnlocalizedName("IVMetal").setMaxStackSize(1); //Silver
     	public static final IXTiberiumCore = new IXTiberiumCore(1505).setUnlocalizedName("IXTiberiumCore").setMaxStackSize(1); //Tiberium
     	public static final IIXNanoFiberMetal = new IIXNanoFiberMetal(1505).setUnlocalizedName("IIXNanoFiberMetal").setMaxStackSize(1); //Aluminium
     	
     	//WEAPONS AMMO
	
	/** public static final RoboticCore = new RoboticCore(1502).setUnlocalizedName("RoboticCore").setMaxStackSize(1); */
	//public static final RoboticCore = new RoboticCore(1502).setUnlocalizedName("RoboticCore").setMaxStackSize(1); //Need to craft Armour material
     	//public static final TitaniumCore = new TitaniumCore(1503).setUnlocalizedName("TitaniumCore").setMaxStackSize(1);
	// ^^ use for core crafting ^^
	
	public static final BlasterCore = new BlasterCore(1550).setUnlocalizedName("BlasterCore").setMaxStackSize(45);
	public static final VBXBlaster = new VGXBlaster(1551).setUnlocalizedName("VGXBlaster").setMaxStackSize(45); //BLUE VBX Blaster
	public static final IradiumBlaster = new IradiumBlaster(1552).setUnlocalizedName("IradiumBlaster").setMaxStackSize(45); //RED Iradium Blaster
  	public static final TiberiumBlaster = new TiberiumBlaster(1553).setUnlocalizedName("TiberiumBlaster").setMaxStackSize(45); //GREEN Tiberium Blaster
  	public static final VoxiadiumHE = new VoxiadiumHE(1554).setUnlocalizedName("VoxiadiumHE").setMaxStackSize(1);
  
  
  
  
  
  
  
  
  
  
  
  
  
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
