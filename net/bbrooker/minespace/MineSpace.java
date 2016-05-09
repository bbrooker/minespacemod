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
  	
  	public static final Item BlueCrystal = new BlueCrystal(1200).setUnlocalizedName("BlueCrystal").setMaxStackSize(1);
  	public static final Item RedCrystal = new RedCrystal(1201).setUnlocalizedName("RedCrystal").setMaxStackSize(1);
  	public static final Item GreenCrystal = new GreenCrystal(1202).setUnlocalizedName("GreenCrystal").setMaxStackSize(1);
  	public static final Item YellowCrystal = new YellowCrystal(1203).setUnlocalizedName("YellowCrystal").setMaxStackSize(1);
  	public static final Item OrangeCrystal = new OrangeCrystal(1204).setUnlocalizedName("OrangeCrystal").setMaxStackSize(1);
  	public static final Item PurpleCrystal = new PurpleCrystal(1205).setUnlocalizedName("PurpleCrystal").setMaxStackSize(1);
  	public static final Item PinkCrystal = new PinkCrystal(1206).setUnlocalizedName("PinkCrystal").setMaxStackSize(1);
  	public static final Item BlackCrystal = new BlackCrystal(1207).setUnlocalizedName("BlackCrystal").setMaxStackSize(1);
  	public static final Item WhiteCrystal = new WhiteCrystal(1208).setUnlocalizedName("WhiteCrystal").setMaxStackSize(1);
  	
  	//ADVANCE
  	public static final Item AdvancedBlueCrystal = new AdvancedBlueCrystal(1250).setUnlocalizedName("AdvancedBlueCrystal").setMaxStackSize(1);
  	public static final Item AdvancedRedCrystal = new AdvancedRedCrystal(1251).setUnlocalizedName("AdvancedRedCrystal").setMaxStackSize(1);
  	public static final Item AdvancedGreenCrystal = new AdvancedGreenCrystal(1252).setUnlocalizedName("AdvancedGreenCrystal").setMaxStackSize(1);
  	public static final Item AdvancedPurpleCrystal = new AdvancedPurpleCrystal(1253).setUnlocalizedName("AdvancedPurpleCrystal").setMaxStackSize(1);
  	public static final Item AdvancedPinkCrystal = new AdvancedPinkCrystal(1254).setUnlocalizedName("AdvancedPinkCrystal").setMaxStackSize(1);
  	
  	
  	//WAR HEROES
    	public static final Item BlueWarHeroesCrystal = new BlueWarHeroesCrystal(1260).setUnlocalizedName("BlueWarHeroesCrystal").setMaxStackSize(1);
  	public static final Item RedWarHeroesCrystal = new RedWarHeroesCrystal(1261).setUnlocalizedName("RedWarHeroesCrystal").setMaxStackSize(1);
  	public static final Item GreenWarHeroesCrystal = new GreenWarHeroesCrystal(1262).setUnlocalizedName("GreenWarHeroesCrystal").setMaxStackSize(1);
    	public static final Item PurpleWarHeroesCrystal = new PurpleWarHeroesCrystal(1263).setUnlocalizedName("PurpleWarHeroesCrystal").setMaxStackSize(1);
  	public static final Item OrangeWarHeroesCrystal = new OrangeWarHeroesCrystal(1264).setUnlocalizedName("OrangeWarHeroesCrystal").setMaxStackSize(1);
  	
  
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

		//ITEM NAME REGISTER ITEM METAL, Misc
                LanguageRegistry.addName(Screw, "Screw");
                LanguageRegistry.addName(Wrench, "Wrench");
                LanguageRegistry.addName(Hammer, "Hammer");
                LanguageRegistry.addName(Nails, "Nails");
                LanguageRegistry.addName(Metal, "Metal");
                LanguageRegistry.addName(Titanium, "Titanium Ore");
                LanguageRegistry.addName(Aluminium, "Aluminium Ore");
                LanguageRegistry.addName(Tiberium, "Tiberium Ore");
                LanguageRegistry.addName(Silver, "Silver Ore");
                LanguageRegistry.addName(Voxadium, "Voxadium Gas");
                LanguageRegistry.addName(Fiber, "Fiber");
                LanguageRegistry.addName(NanoFiber, "NanoFiber");


		//ITEM CRYSTAL
                LanguageRegistry.addName(BlueCrystal, "[C]Blue Crystal");
                LanguageRegistry.addName(RedCrystal, "[C]Red Crystal");
                LanguageRegistry.addName(GreenCrystal, "[C]Green Crystal");
                LanguageRegistry.addName(YellowCrystal, "[C]Yellow Crystal");
               	LanguageRegistry.addName(OrangeCrystal, "[C]Orange Crystal");
                LanguageRegistry.addName(PurpleCrystal, "[C]Purple Crystal");
                LanguageRegistry.addName(PinkCrystal, "[C]Pink Crystal");
                LanguageRegistry.addName(BlackCrystal, "[C]Black Crystal");                
                LanguageRegistry.addName(WhiteCrystal, "[C]White Crystal");
                /* ADVANCED */
                LanguageRegistry.addName(AdvancedBlueCrystal, "[AC]Advanced Blue Crystal");
                LanguageRegistry.addName(AdvancedRedCrystal, "[AC]Advanced Red Crystal");
                LanguageRegistry.addName(AdvancedGreenCrystal, "[AC]Advanced Green Crystal");
                LanguageRegistry.addName(AdvancedPurpleCrystal, "[AC]Advanced Purple Crystal");
               	LanguageRegistry.addName(AdvancedPinkCrystal, "[AC]Advanced Pink Crystal");
                /* WARHEROES */                
                LanguageRegistry.addName(BlueWarHeroesCrystal, "[WH]Blue War Heroes Crystal");
                LanguageRegistry.addName(RedWarHeroesCrystal, "[WH]Red War Heroes Crystal");
                LanguageRegistry.addName(GreenWarHeroesCrystal, "[WH]Green War Heroes Crystal");
                LanguageRegistry.addName(PurpleWarHeroesCrystal, "[WH]Purple War Heroes Crystal");
               	LanguageRegistry.addName(OrangeWarHeroesCrystal, "[WH]Pink War Heroes Crystal");



		//ITEM ECON
 		LanguageRegistry.addName(GalacticSilver, "Galactic Silver");
                LanguageRegistry.addName(BlackCoin, "Black Coin");
 		LanguageRegistry.addName(GalaxyGold, "Galaxy Gold");
 		LanguageRegistry.addName(CitizenCoin, "Citizen Coin");
                LanguageRegistry.addName(OutlawCoin, "Outlaw Coin");
 		LanguageRegistry.addName(GuardianCoin, "Guardian Coin");
                LanguageRegistry.addName(SinsCoin, "Sins Coin");
 		LanguageRegistry.addName(ReclassCoin, "Reclass Coin");
 		LanguageRegistry.addName(AirLicense, "Air License");
                LanguageRegistry.addName(WeaponLicense, "Weapon License");
 		LanguageRegistry.addName(LargeWeaponLicense, "LargeWeapon License");
 		LanguageRegistry.addName(SpeederLicense, "Speeder License");
                LanguageRegistry.addName(CitizenID, "Citizen ID");
 		LanguageRegistry.addName(OutlawID, "Outlaw ID");
                LanguageRegistry.addName(PoliceID, "Police ID");
 		LanguageRegistry.addName(GIAID,"GIA ID"); // แก้เป็นตัวใหญ่
 		LanguageRegistry.addName(RebelID,"Rebel ID");
 		LanguageRegistry.addName(LargeShipLicense,"LargeShip License");
 		LanguageRegistry.addName(WingsLicense,"Wings License");
 		LanguageRegistry.addName(RoboticLicense,"Robotic License");
 		LanguageRegistry.addName(NanoFiber,"Nano Fiber");
 		LanguageRegistry.addName(QuarkArmour,"Quark Armour");
 		LanguageRegistry.addName(RoboticCore,"Robotic Core");
 		LanguageRegistry.addName(TitaniumCore,"Titanium Core");
 		LanguageRegistry.addName(IradiumCore,"Iradium Core");
 		LanguageRegistry.addName(IVMetal,"IV Metal");
 		LanguageRegistry.addName(IXTiberiumCore,"IXTiberium Core");
 		LanguageRegistry.addName(IIXNanoFiberMetal,"IIXNanoFiber Metal");
 		LanguageRegistry.addName(BlasterCore,"Blaster Core");
 		LanguageRegistry.addName(VGXBlaster,"VGX Blaster");
 		LanguageRegistry.addName(IradiumBlaster,"Iradium Blaster");
 		LanguageRegistry.addName(TiberiumBlaster,"Tiberium Blaster");
 		LanguageRegistry.addName(VoxiadiumHE,"VoxiadiumHE");
 	


		//ITEM LICENSE
		
		
		

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
