package server.itens;

import client.Client;
import tools.Randomizer;

public class Gachapon {

    private static final int[] HENESYS = {1002267, 1002393, 1022058, 1041047, 1041062, 1041067, 1050026, 1051009, 1051016, 1061043, 1061054, 1082148, 1102042, 1102082, 1302021, 1302026, 1302063, 1332000, 1332053, 1372008, 1372017, 1382037, 1432006, 1432015, 1432016, 1432038, 1442012, 1442018, 1442039, 1452003, 1452005, 2000005, 2002019, 2022113, 2040008, 2040009, 2040010, 2040011, 2040012, 2040013, 2040304, 2040305, 2040308, 2040309, 2040406, 2040407, 2040508, 2040509, 2040510, 2040511, 2040518, 2040519, 2040520, 2040521, 2040810, 2040811, 2040812, 2040813, 2040814, 2040815, 2040900, 2040902, 2040908, 2040909, 2041026, 2041027, 2041036, 2041037, 2041038, 2041039, 2041040, 2041041, 2043201, 2043301, 2044001, 2044301, 2044401, 2044600, 3010013};
    private static final int[] ELLINIA = {1002028, 1002064, 1002084, 1002143, 1002245, 1040080, 1050003, 1050008, 1050049, 1050054, 1050055, 1050056, 1051017, 1051023, 1051027, 1051047, 1051055, 1061006, 1061083, 1061087, 1092022, 1302019, 1302027, 1312001, 1312030, 1322010, 1332013, 1372003, 1372010, 1382001, 1422005, 1442009, 1442017, 2000005, 2002018, 2022113};
    private static final int[] PERION = {1002021, 1002023, 1002024, 1002048, 1002063, 1002096, 1002100, 1002131, 1002154, 1002160, 1002175, 1002391, 1002392, 1002395, 1040021, 1040037, 1040061, 1040088, 1040089, 1041004, 1041024, 1041044, 1041067, 1041087, 1041088, 1050006, 1050018, 1051014, 1060005, 1060010, 1060018, 1060060, 1060062, 1060064, 1061037, 1061047, 1061087, 1061088, 1061091, 1062001, 1072263, 1082146, 1102012, 1302004, 1302008, 1302010, 1302031, 1312005, 1312006, 1312007, 1312009, 1312014, 1322000, 1322015, 1322022, 1332001, 1332008, 1332009, 1332012, 1372002, 1402000, 1402002, 1402006, 1402010, 1402012, 1402013, 1422003, 1422004, 1432002, 1432003, 1432004, 1432005, 1432006, 1432018, 1442001, 1442005, 1442009, 1442010, 1442017, 1472014, 2000005, 2002017, 2022113, 2040001, 2040002, 2040601, 2040602, 2043201, 2043202, 2043301, 2043302, 2044101, 2044102, 2044402, 2049100, 4001040, 4131006};
    private static final int[] KERNING = {1002005, 1002023, 1002085, 1002117, 1002130, 1002212, 1040081, 1040096, 1041040, 1041060, 1041080, 1041106, 1051010, 1051031, 1051037, 1060051, 1060079, 1060086, 1060087, 1092018, 1302001, 1302013, 1302021, 1322008, 1322010, 1322022, 1332002, 1332015, 1332017, 1472003, 1472009, 1472026, 2000004, 2000005, 2022113, 2022130, 2040402, 4130014};
    private static final int[] SLEEPWOODY = {1002009, 1002013, 1002036, 1002038, 1002150, 1002161, 1002162, 1002163, 1002175, 1032000, 1032001, 1032003, 1032004, 1032008, 1032009, 1032016, 1032018, 1032026, 1040021, 1040044, 1040068, 1041047, 1041048, 1041049, 1041050, 1051017, 1060017, 1060019, 1060057, 1082145, 1082149, 1102014, 1102018, 1302021, 1302022, 1322012, 1322022, 1322023, 1322024, 1322025, 1322027, 1332002, 1332013, 1372002, 1372003, 1402003, 1402014, 1422000, 1422002, 1422004, 1422006, 1432000, 1432008, 1432009, 1432015, 1432018, 1442005, 1442006, 1442007, 1442009, 1442010, 1442015, 1442018, 1442039, 1452000, 1452001, 1452003, 1452004, 1472002, 1472003, 1472004, 2000004, 2000005, 2002002, 2002003, 2012001, 2012002, 2012003, 2020000, 2020002, 2020003, 2020004, 2020005, 2020009, 2020012, 2020013, 2020014, 2020032, 2030000, 2030001, 2030002, 2030003, 2030004, 2030005, 2030006, 2030007, 2030019, 2040302, 2040402, 2040502, 2040702, 2040707, 2040708, 2040804, 2040805, 2040902, 2041011, 2041014, 2041017, 2041020, 2041022, 2043002, 2043302, 2043701, 2043801, 2044001, 2044101, 2044102, 2044402, 2044502, 2044602, 2044701, 2044702, 2048000, 2048003, 2050002, 2050003, 2060001, 2100000, 4004000, 4004002, 4006000, 4006001, 4010004, 4010005, 4010006, 4020001, 4020002, 4020005, 4020007};
    private static final int[] MUSHROOMSHRINE = {1002022, 1002120, 1002136, 1002150, 1002154, 1002165, 1002180, 1002214, 1002246, 1002249, 1002391, 1002392, 1002393, 1002394, 1002395, 1002586, 1002587, 1012106, 1012107, 1032012, 1040058, 1040080, 1040093, 1040100, 1041029, 1041038, 1041048, 1041053, 1041076, 1041086, 1041089, 1050002, 1050029, 1050039, 1050049, 1050056, 1051006, 1051010, 1051015, 1051026, 1051030, 1051055, 1051065, 1060000, 1060016, 1060024, 1060033, 1060044, 1060052, 1060064, 1060078, 1061027, 1061049, 1061054, 1061082, 1061085, 1061094, 1072239, 1072262, 1072264, 1082145, 1082146, 1082147, 1082148, 1082149, 1092004, 1092022, 1102004, 1102040, 1102041, 1102042, 1102043, 1102078, 1112407, 1112408, 1302026, 1312013, 1312014, 1322001, 1322017, 1322021, 1322027, 1332053, 1332054, 1372008, 1372035, 1372036, 1372037, 1372038, 1372039, 1372040, 1372041, 1372042, 1382008, 1382037, 1382048, 1402013, 1402017, 1412004, 1422003, 1422008, 1422030, 1422031, 1432004, 1432013, 1432015, 1442004, 1442017, 1452007, 1472015, 1472021, 1472054, 2002017, 2020012, 2022015, 2022180, 2022182, 2040004, 2040005, 2040008, 2040009, 2040010, 2040011, 2040011, 2040012, 2040014, 2040015, 2040028, 2040030, 2040100, 2040101, 2040103, 2040104, 2040105, 2040106, 2040108, 2040109, 2040200, 2040201, 2040203, 2040204, 2040205, 2040206, 2040304, 2040305, 2040306, 2040307, 2040308, 2040309, 2040320, 2040322, 2040325, 2040327, 2040404, 2040405, 2040406, 2040407, 2040408, 2040409, 2040410, 2040411, 2040508, 2040509, 2040510, 2040511, 2040516, 2040517, 2040518, 2040519, 2040604, 2040605, 2040606, 2040607, 2040608, 2040609, 2040610, 2040611, 2040712, 2040713, 2040715, 2040716, 2040717, 2040727, 2040808, 2040809, 2040810, 2040811, 2040812, 2040813, 2040814, 2040815, 2040904, 2040905, 2040906, 2040907, 2040908, 2040909, 2040916, 2040917, 2040921, 2040922, 2040930, 2040932, 2041030, 2041031, 2041032, 2041033, 2041034, 2041035, 2041036, 2041037, 2041038, 2041039, 2041040, 2041041, 2043004, 2043005, 2043006, 2043007, 2043018, 2043104, 2043105, 2043204, 2043205, 2043304, 2043305, 2043704, 2043705, 2043804, 2043805, 2044004, 2044005, 2044104, 2044105, 2044204, 2044205, 2044304, 2044305, 2044404, 2044405, 2044411, 2044504, 2044505, 2044604, 2044605, 2044704, 2044705, 2044803, 2044804, 2044806, 2044808, 2044903, 2044904, 2049003, 2049100, 2340000, 4000003};
    private static final int[] SHOWASPAM = {1002021, 1002034, 1002035, 1002048, 1002055, 1002088, 1002096, 1002117, 1002120, 1002131, 1002154, 1002178, 1002180, 1002183, 1002214, 1002288, 1012076, 1012077, 1012078, 1012079, 1022058, 1022060, 1032027, 1040007, 1040043, 1040081, 1040082, 1050127, 1051001, 1060019, 1060025, 1060068, 1060088, 1072238, 1072239, 1082147, 1082148, 1102081, 1302013, 1312014, 1322003, 1322009, 1322010, 1322023, 1332011, 1372006, 1382002, 1382003, 1412001, 1422007, 1442004, 1442021, 1452010, 1462007, 1462013, 1472000, 1472003, 1472005, 1472009, 1472016, 2000004, 2022113, 2022195, 2040019, 2040020};
    private static final int[] SHOWASPAF = {1002021, 1002034, 1002035, 1002048, 1002055, 1002088, 1002096, 1002117, 1002120, 1002131, 1002154, 1002178, 1002180, 1002183, 1002214, 1002288, 1032027, 1040007, 1040043, 1040081, 1040082, 1051001, 1051140, 1060019, 1060025, 1060068, 1060088, 1072238, 1072239, 1082147, 1082148, 1102081, 1302013, 1312014, 1322003, 1322009, 1322010, 1322023, 1332011, 1372006, 1382002, 1382003, 1412001, 1422007, 1442004, 1442021, 1452010, 1462007, 1462013, 1472000, 1472003, 1472005, 1472009, 1472016, 2000004, 2022113, 2022195, 2040019, 2040020};
    private static final int[] NLC = {1002012, 1002013, 1002020, 1002033, 1002034, 1002036, 1002072, 1002082, 1002088, 1002096, 1002137, 1002144, 1002153, 1002155, 1002179, 1002218, 1002243, 1002245, 1002246, 1002252, 1002253, 1002254, 1002274, 1002405, 1002634, 1022082, 1032026, 1040019, 1040025, 1040071, 1041020, 1041027, 1041031, 1041053, 1050025, 1050039, 1050047, 1050053, 1050055, 1050056, 1050067, 1050068, 1050069, 1050072, 1050073, 1050074, 1051009, 1051024, 1051025, 1051031, 1051032, 1051033, 1051034, 1051052, 1051054, 1051055, 1060014, 1060057, 1060071, 1060084, 1061036, 1061037, 1061057, 1062000, 1082074, 1082146, 1082147, 1082148, 1082149, 1092011, 1092014, 1092021, 1092022, 1092049, 1092050, 1102011, 1102041, 1102042, 1102043, 1102084, 1102086, 1302003, 1302012, 1302013, 1302017, 1302021, 1302022, 1302026, 1302027, 1302028, 1302049, 1302056, 1312004, 1312011, 1312012, 1322000, 1322003, 1322010, 1322012, 1322015, 1322021, 1322022, 1322024, 1322025, 1322026, 1322027, 1332000, 1332003, 1332015, 1332016, 1332020, 1332030, 1372000, 1372002, 1372005, 1372007, 1372008, 1372040, 1372041, 1372042, 1382001, 1382003, 1382005, 1382006, 1382007, 1382008, 1382010, 1382011, 1382015, 1402000, 1402001, 1402006, 1402009, 1402012, 1412001, 1412004, 1422001, 1422007, 1422008, 1422010, 1432000, 1432001, 1432004, 1432005, 1432013, 1432016, 1432017, 1442000, 1442004, 1442009, 1442010, 1442011, 1442012, 1442014, 1442016, 1442017, 1442018, 1442021, 1442023, 1442025, 1452000, 1452004, 1452005, 1452006, 1452007, 1452008, 1452012, 1452017, 1452023, 1462000, 1462005, 1462006, 1462007, 1462009, 1472002, 1472005, 1472006, 1472007, 1472008, 1472009, 1472010, 1472012, 1472013, 1472019, 1472020, 1472021, 1472022, 1472023, 1472028, 1472033, 1472054, 1492010, 2000004, 2000005, 2020012, 2022027, 2022113, 2022195, 2030007, 2040001, 2040402, 2040702, 2040805, 2040914, 2040915, 2040933, 2041002, 2043702, 2043802, 2049002, 2049003, 2340000};
    private static final int[] NAUTILUS = {1002028, 1002064, 1002084, 1002143, 1002171, 1002245, 1040080, 1050003, 1050008, 1050049, 1050054, 1050055, 1050056, 1051017, 1051023, 1051027, 1051047, 1051055, 1052119, 1052125, 1061083, 1061087, 1072306, 1072309, 1102081, 1302019, 1302027, 1312001, 1312030, 1322010, 1322027, 1332013, 1332016, 1372001, 1372003, 1372004, 1372010, 1382001, 1422005, 1432000, 1442009, 1442017, 1452011, 1462002, 1492005, 2000005, 2002018, 2022113, 2022195};

    public static int getRandItem(int town) {
        int itemId = 0;
        switch (town) {
            case 0:
                itemId = HENESYS[Randomizer.nextInt(HENESYS.length)];
                break;
            case 1:
                itemId = ELLINIA[Randomizer.nextInt(ELLINIA.length)];
                break;
            case 2:
                itemId = PERION[Randomizer.nextInt(PERION.length)];
                break;
            case 3:
                itemId = KERNING[Randomizer.nextInt(KERNING.length)];
                break;
            case 4:
                itemId = SLEEPWOODY[Randomizer.nextInt(SLEEPWOODY.length)];
                break;
            case 5:
                itemId = MUSHROOMSHRINE[Randomizer.nextInt(MUSHROOMSHRINE.length)];
                break;
            case 6:
                itemId = SHOWASPAM[Randomizer.nextInt(SHOWASPAM.length)];
                break;
            case 7:
                itemId = SHOWASPAF[Randomizer.nextInt(SHOWASPAF.length)];
                break;
            case 9:
                itemId = NLC[Randomizer.nextInt(NLC.length)];
                break;
            case 17:
                itemId = NAUTILUS[Randomizer.nextInt(NAUTILUS.length)];
                break;
        }
        return itemId;
    }

    public static int makeRandGachaponItem(Client c, int itemId, int town) {
        int randItem = getRandItem(town);
        int[] items = {itemId, -1, randItem, 1};
   //     MapleInventoryManipulator.addById(c, items, true);
        return randItem;
    }
}