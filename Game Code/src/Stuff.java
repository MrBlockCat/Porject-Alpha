import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Stuff
{
	//Scanners
	public static Scanner AwesomeScanner = new Scanner(System.in);
	
	//Variables
	public static final String GameVersion = "0.2.1a";
	public static final int CopyrightYear = 2020;
	public static final int SaveVersion = 7;
	public static boolean DebugMode = false;
	public static boolean QuickMenus = false;
	public static int FancyTypingSpeed = 1;
	public static int TurnCount = 0;
	public static boolean GameBeginning = true;
	public static boolean StoryBeginning = true;
	/* Doesn't need to be saved to save file */ public static boolean TempInstantText = false;
	public static int CurrentBranchNumber = 0;
	//The branch is the different classes, or story branches (ie. SpaceBranch), and the location is the area within the story branch (ie. Launchpad)
	public static int CurrentLocationNumber = 0;
	public static boolean HasPorjectAlpha = false;
	public static boolean HasLuckyGauntlet = false;
	public static boolean TimeinatorWorks = true;
	public static boolean TalkedToTree = false;
	public static int FavoriteGame = 0;
	public static boolean FoundTrapdoor = false;
	public static boolean ApuNerfedYou = false;
	/* Add to SaveVersion 8 */ public static boolean SeenRuins = false;
	/* Add to SaveVersion 8 */ public static boolean RoulletteSpin = false;
	/* Add to SaveVersion 8 */ public static boolean HasEmeraldSword = false;
	/* Add to SaveVersion 8 */ public static boolean NedLoreAcquired = false;
	/* Add to SaveVersion 8 */ public static boolean HelpingHand = false;
	/* Add to SaveVersion 8 */ public static boolean MetHarold = false;
	
	//Miscellaneous weirdness
	Desktop AwesomeDesktop = Desktop.getDesktop();
	
	//Methods
	public static void HitEnter(int NumberOfEnters)
	{
		for (int Counter = 0; Counter != NumberOfEnters; Counter++)
		{
			System.out.println();
		}
	}
	
	public static void Divider()
	{
		//That's 110 dashes, so between 55 and 56 characters gives you the middle
		System.out.println("--------------------------------------------------------------------------------------------------------------");
	}
	
	public static void PotentialDebugMenu()
	{
		if (DebugMode == true)
		{
			Divider();
			TypeLine("Debug Menu");
			HitEnter(1);
			TypeLine("GameVersion: " + GameVersion);
			TypeLine("HasLuckyGauntlet: " + HasLuckyGauntlet);
			TypeLine("TurnCount: " + TurnCount);
			TypeLine("CurrentBranchNumber: " + CurrentBranchNumber);
			TypeLine("CurrentLocationNumber: " + CurrentLocationNumber);
		}
	}
	
	public static void ScreenSizeRecommendation()
	{
		//50 enters standard as a buffer
		HitEnter(50);
		//40 lines on screen
		Divider();
		HitEnter(4);
		ASCII.CalibrationScreen();
		HitEnter(5);
		System.out.println("Please resize your window so the dashes below are just visible, and there's one extra line above the top.");
		System.out.println("                                                   --------");
		System.out.println("                                                   | Cen  |");
		System.out.println("                                                   |  ter |");
		System.out.println("                                                   --------");
		HitEnter(6);
		if (GameBeginning == true)
		{
			System.out.println("When options on the left in () are on screen, you can type them and hit enter to choose them.");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("  \\./");
		}
		else
		{
			HitEnter(4);
		}
		TypeLine("(Enter) Go to the main menu of Porject Alpha");
		HitEnter(6);
		System.out.print("--------------------------------------------------------------------------------------------------------------");
		AwesomeScanner.nextLine();
	}
	
	public static void SettingsMenu()
	{
		String Input = "";
		do
		{
			if (QuickMenus == false)
			{
				HitEnter(50);
				ASCII.SettingsGear2();
				HitEnter(22);
				Wait(1000);
				
				HitEnter(50);
				ASCII.SettingsGear1();
				HitEnter(17);
				Wait(350);
				
				HitEnter(50);
				ASCII.SettingsGear2();
				HitEnter(12);
				Wait(350);
				
				HitEnter(50);
				ASCII.SettingsGear1();
				HitEnter(7);
				Wait(350);
			}
			
			HitEnter(50);
			ASCII.SettingsGear2();
			HitEnter(1);
			ASCII.SettingsTitle();
			Divider();
			
			if (QuickMenus == true)
			{
				TempInstantText = true;
			}
			
			TypeLine("To change a setting, type the setting's name plus the new setting you wanna change it to.");
			TypeLine("For example, \"Text Speed 2\" would change the speed all the text is written on screen.");
			Divider();
			HitEnter(1);
			//FancyTypingSpeed
			TypeLine("Text Speed: 0, 1, 2, or 3 (Currently " + FancyTypingSpeed + ")");
			TypeLine(" This is how fast text shows up on screen. 0 makes it instant, 3 is slowest.");
			//QuickMenus
			if (QuickMenus == false)
			{
				TypeLine("Quick Menus: On or off (Currently off)");
			}
			else
			{
				TypeLine("Quick Menus: On or off (Currently on)");
			}
			TypeLine(" This makes menus show up much faster. On is instant, off uses overall Text Speed.");

			if (QuickMenus == true)
			{
				TempInstantText = false;
			}
			
			TypeLine("(Enter) Leave the settings menu.");
			HitEnter(1);
			
			Input = AwesomeScanner.nextLine().toLowerCase();
			
			//FancyTypingSpeed
			if (Input.length() == 12 && Input.startsWith("text speed "))
			{
				if (!(Input.charAt(11) == '0' || Input.charAt(11) == '1' || Input.charAt(11) == '2' || Input.charAt(11) == '3'))
				{
					TypeLine("(Enter) Text Speed can be set to 0, 1, 2, or 3.");
					HitEnter(1);
					AwesomeScanner.nextLine();
				}
				else
				{
					Type("(Enter) Your Text Speed went from " + FancyTypingSpeed);
					FancyTypingSpeed = StringToInt(Input.charAt(11) + "");
					TypeLine(" to " + FancyTypingSpeed + ".");
					HitEnter(1);
					AwesomeScanner.nextLine();
				}
			}
			
			//QuickMenus
			if ((Input.length() == 14 || Input.length() == 15) && Input.startsWith("quick menus "))
			{
				if ((Input.charAt(12) == 'o') && !((Input.charAt(13) == 'n' && Input.length() == 15) || (Input.charAt(13) == 'f' && Input.length() == 14) || (Input.charAt(13) != 'n' && Input.length() == 14)))
				{
					if (Input.charAt(13) == 'f' && Input.charAt(14) != 'f')
					{
						TypeLine("(Enter) Quick Menus can be set to on or off.");
						HitEnter(1);
						AwesomeScanner.nextLine();
					}
					else
					{
						if (QuickMenus == false)
						{
							Type("(Enter) Quick Menus went from off");
						}
						else
						{
							Type("(Enter) Quick Menus went from on");
						}
						if (Input.charAt(13) == 'n')
						{
							QuickMenus = true;
						}
						else
						{
							QuickMenus = false;
						}
						
						if (QuickMenus == false)
						{
							TypeLine(" to off.");
						}
						else
						{
							TypeLine(" to on.");
						}
						HitEnter(1);
						AwesomeScanner.nextLine();
					}
				}
				else
				{
					TypeLine("(Enter) Quick Menus can be set to on or off.");
					HitEnter(1);
					AwesomeScanner.nextLine();
				}
			}
		}
		while (Input.length() != 0);
	}
	
	public static void Credits()
	{
		HitEnter(50);
		
		Scanner CreditsScanner = null;
		
		try
		{
			CreditsScanner = new Scanner(new File("Game Code/Credits.txt"));
		}
		catch (FileNotFoundException NoFileException)
		{
			System.out.println("(Enter) Error 5: Looks like the \"Porject-Alpha/Game Code/Credits.txt\" file isn't in the game code, but it should be! Please make sure your runtime looks at the main Porject-Alpha folder.");
			NoFileException.printStackTrace();
			AwesomeScanner.nextLine();
		}
		
		while (CreditsScanner.hasNext())
		{
			TypeLine(CreditsScanner.nextLine());
		}
		
		CreditsScanner.close();
		
		Wait(2000);
		HitEnter(1);
		Divider();
		TypeLine("(Enter) Leave the credits.");
		HitEnter(1);
		AwesomeScanner.nextLine();
	}
	
	public static void AboutMenu()
	{
		String Input = "";
		do
		{
			if (QuickMenus == false)
			{
				HitEnter(50);
				ASCII.AboutIcon();
				HitEnter(22);
				Wait(1000);
				
				HitEnter(50);
				ASCII.AboutIcon();
				HitEnter(17);
				Wait(350);
				
				HitEnter(50);
				ASCII.AboutIcon();
				HitEnter(12);
				Wait(350);
				
				HitEnter(50);
				ASCII.AboutIcon();
				HitEnter(7);
				Wait(350);
			}
			
			HitEnter(50);
			ASCII.AboutIcon();
			HitEnter(1);
			ASCII.AboutTitle();
			Divider();
			
			if (QuickMenus == true)
			{
				TempInstantText = true;
			}
			
			TypeLine("Porject Alpha Version: " + GameVersion);
			HitEnter(1);
			TypeLine("(Credits) Shows the credits");
			TypeLine("(Changelog) Release notes of versions of this game");
			
			if (QuickMenus == true)
			{
				TempInstantText = false;
			}
			
			TypeLine("(Enter) Leave the about menu");
			Input = AwesomeScanner.nextLine().toLowerCase();
			
			switch (Input)
			{
				case "credits":
					Credits();
					break;
				case "changelog":
					PorjectAlpha.Changelog();
					HitEnter(1);
					Divider();
					TypeLine("(Enter) Leave the changelog");
					HitEnter(1);
					AwesomeScanner.nextLine();
					break;
				case "hackery stuff":
					HitEnter(50);
					
					if (QuickMenus == true)
					{
						TempInstantText = true;
					}
					
					TypeLine("Porject Alpha Version: " + GameVersion);
					TypeLine("Save Version: " + SaveVersion);
					TypeLine("Current Branch Number: " + CurrentBranchNumber);
					TypeLine("Current Location Number: " + CurrentLocationNumber);
					HitEnter(1);
					TypeLine("(Enter) Leave the secret hackery stuff menu");
					
					if (QuickMenus == true)
					{
						TempInstantText = false;
					}
					
					HitEnter(1);
					AwesomeScanner.nextLine();
					break;
				case "easter egg":
					HitEnter(50);
					ASCII.EasterEgg();
					HitEnter(3);
					TypeLine("The best games have easter eggs");
					TypeLine("This is an easter egg");
					Wait(1000);
					TypeLine("You're welcome");
					HitEnter(1);
					TypeLine("(Enter) Leave the super secret easter egg");
					HitEnter(1);
					AwesomeScanner.nextLine();
					break;
				default:
					break;
			}
		}
		while (Input.length() != 0);
	}
	
	public static void SaveGame()
	{
		SaveGame(false);
	}
	
	public static void SaveGame(boolean BeKindaQuiet)
	{
		//Makes Saves folder if need be
		File SaveFolder = new File("Saves");
		SaveFolder.mkdir();
		
		//Location of Save file
		File SaveFile = new File("Saves/Save.txt");
		
		try
		{
			//Creates or locks into the save file
			if (SaveFile.createNewFile())
			{
				//If true created new save file
				if (BeKindaQuiet == false)
				{
					System.out.println("A new save file was created! You can find it at \"Game Code/Saves/Save.txt\".");
				}
			}
			else
			{
				//If false save file already existed and was locked onto
				if (BeKindaQuiet == false)
				{
					System.out.println("A save file already exists, saving to it...");
				}
			}
			
			FileWriter SaveFileWriter = new FileWriter(SaveFile, false);
			
			/* Line 1  */ SaveFileWriter.write(SaveVersion + "\n");
			/* Line 2  */ SaveFileWriter.write(BooleanToInt(DebugMode) + "\n");
			/* Line 3  */ SaveFileWriter.write(BooleanToInt(QuickMenus) + "\n");
			/* Line 4  */ SaveFileWriter.write(FancyTypingSpeed + "\n");
			/* Line 5  */ SaveFileWriter.write(TurnCount + "\n");
			/* Line 6  */ SaveFileWriter.write(BooleanToInt(GameBeginning) + "\n");
			/* Line 7  */ SaveFileWriter.write(BooleanToInt(StoryBeginning) + "\n");
			/* Line 8  */ SaveFileWriter.write(CurrentBranchNumber + "\n");
			/* Line 9  */ SaveFileWriter.write(CurrentLocationNumber + "\n");
			/* Line 10 */ SaveFileWriter.write(BooleanToInt(HasPorjectAlpha) + "\n");
			/* Line 11 */ SaveFileWriter.write(BooleanToInt(HasLuckyGauntlet) + "\n");
			/* Line 12 */ SaveFileWriter.write(BooleanToInt(TimeinatorWorks) + "\n");
			/* Line 13 */ SaveFileWriter.write(BooleanToInt(TalkedToTree) + "\n");
			/* Line 14 */ SaveFileWriter.write(FavoriteGame + "\n");
			/* Line 15 */ SaveFileWriter.write(BooleanToInt(FoundTrapdoor) + "\n");
			/* Line 16 */ SaveFileWriter.write(BooleanToInt(ApuNerfedYou) + "\n");
			
			SaveFileWriter.close();
			if (BeKindaQuiet == false)
			{
				TypeLine("(Enter) Save successful! Hit enter and we'll open the folder for you to copy your save file if you'd like.");
				HitEnter(1);
				AwesomeScanner.nextLine();
				
				Desktop AwesomeDesktop = Desktop.getDesktop();
				File FolderToOpen = null;
				try
				{
					FolderToOpen = new File("Saves");
					AwesomeDesktop.open(FolderToOpen);
				}
				catch (IllegalArgumentException IAE)
				{
					System.out.println("(Enter) Error 7: The save file's folder (at \"Porject-Alpha/Saves\") wasn't found and couldn't be made!");
					AwesomeScanner.nextLine();
				}
			}
		}
		catch (IOException IOException)
		{
			System.out.println("(Enter) Error 6: There was an IOException when saving your game. Please make sure your runtime looks at the main Porject-Alpha folder.");
			IOException.printStackTrace();
			AwesomeScanner.nextLine();
		}
	}
	
	public static void ResetSave()
	{
		//Makes Saves folder if need be
		File SaveFolder = new File("Saves");
		SaveFolder.mkdir();
		
		//Locations of Save and Default Save files
		File SaveFile = new File("Saves/Save.txt");
		File DefaultSaveFile = new File("Game Code/Default Save.txt");
		
		boolean OldQuickMenus = QuickMenus;
		int OldFancyTypingSpeed = FancyTypingSpeed;
		
		try
		{
			//Creates or locks onto the save file
			if (SaveFile.createNewFile())
			{
				//If true created new save file
			    System.out.println("A new save file was created to reset! You can find it at \"Porject-Alpha/Saves/Save.txt\".");
			}
			else
			{
				//If false save file already existed and was locked onto
			    System.out.println("A save file already exists, resetting it...");
			}
			
			try
			{
				//Replaces the values in Save.txt with DefaultSave.txt's values
				Scanner DefaultSaveFileScanner = new Scanner(DefaultSaveFile);
				FileWriter SaveFileWriter = new FileWriter(SaveFile, false);
				while (DefaultSaveFileScanner.hasNextLine())
				{
					SaveFileWriter.write(DefaultSaveFileScanner.nextLine() + "\n");
				}
				DefaultSaveFileScanner.close();
				SaveFileWriter.close();
				
				//Loads the values in Save.txt
				LoadSaveFile();
				
				//Readds settings
				QuickMenus = OldQuickMenus;
				FancyTypingSpeed = OldFancyTypingSpeed;
				
				//Saves to solidify the readding settings
				SaveGame(true);
			}
			catch (FileNotFoundException NoDefaultSaveFileException)
			{
				TypeLine("(Enter) Error 8: Something went wrong: There's no default save file (at \"Porject-Alpha/Game Code/Default Save.txt\") to load!");
				AwesomeScanner.nextLine();
			}
		}
		catch (IOException NoSaveFileException)
		{
			TypeLine("(Enter) Error 9: Sorry, but there's no save file (at \"Porject-Alpha/Saves/Save.txt\") to reset and one couldn't be made!");
			AwesomeScanner.nextLine();
		}
	}
	
	public static boolean LoadSaveFile()
	{
		return LoadSaveFile(false);
	}
	
	public static boolean LoadSaveFile(boolean BeQuiet)
	{
		File SaveFile = new File("Saves/Save.txt");
		
		try
		{
			Scanner AwesomeFile = new Scanner(SaveFile);
			
			try
			{
				//The save file's Line 1 is the save version
				int FileSaveVersion = StringToInt(AwesomeFile.nextLine());
				if (FileSaveVersion < 3)
				{
					if (BeQuiet == false)
					{
						TypeLine("(Enter) Error 10: Sorry, either that's not a save file at \"Saves/Save.txt\" or it got corrupted!");
						AwesomeScanner.nextLine();
					}
					AwesomeFile.close();
					return false;
				}
				else
				{
					if (FileSaveVersion > SaveVersion)
					{
						if (BeQuiet == false)
						{
							TypeLine("(Enter) Sorry, this save file uses version " + FileSaveVersion + ", while we can load at the newest version " + SaveVersion + ". Please update your game!");
							HitEnter(1);
							AwesomeScanner.nextLine();
						}
						AwesomeFile.close();
						return false;
					}
					else
					{
						//These lines replace the variables in game with the values in Save.txt
						//Left is save versions 5 and below, right is 6 and above
						/* File Line 2      */ DebugMode = IntToBoolean(StringToInt(AwesomeFile.nextLine()));
						if (FileSaveVersion >= 6)
						{
							/* File Line 3  */ QuickMenus = IntToBoolean(StringToInt(AwesomeFile.nextLine()));
						}
						else
						{
							QuickMenus = false;
						}
						/* File Line 3  | 4  */ FancyTypingSpeed = StringToInt(AwesomeFile.nextLine());
						/* File Line 4  | 5  */ TurnCount = StringToInt(AwesomeFile.nextLine());
						/* File Line 5  | 6  */ GameBeginning = IntToBoolean(StringToInt(AwesomeFile.nextLine()));
						/* File Line 6  | 7  */ StoryBeginning = IntToBoolean(StringToInt(AwesomeFile.nextLine()));
						/* File Line 7  | 8  */ CurrentBranchNumber = StringToInt(AwesomeFile.nextLine());
						/* File Line 8  | 9  */ CurrentLocationNumber = StringToInt(AwesomeFile.nextLine());
						if (FileSaveVersion >= 7)
						{
							/* File Line       10 */ HasPorjectAlpha = IntToBoolean(StringToInt(AwesomeFile.nextLine()));
						}
						else
						{
							HasPorjectAlpha = false;
						}
						/* File Line 9  | 10 | 11 */ HasLuckyGauntlet = IntToBoolean(StringToInt(AwesomeFile.nextLine()));
						if (FileSaveVersion >= 4)
						{
						/* File Line 10 | 11 | 12 */ TimeinatorWorks = IntToBoolean(StringToInt(AwesomeFile.nextLine()));
						}
						else
						{
							TimeinatorWorks = true;
						}
						if (FileSaveVersion >= 5)
						{
						/* File Line 11 | 12 | 13 */ TalkedToTree = IntToBoolean(StringToInt(AwesomeFile.nextLine()));
						}
						else
						{
							TalkedToTree = false;
						}
						if (FileSaveVersion >= 7)
						{
							/* File Line       14 */ FavoriteGame = StringToInt(AwesomeFile.nextLine());
							/* File Line       15 */ FoundTrapdoor = IntToBoolean(StringToInt(AwesomeFile.nextLine()));
							/* File Line       16 */ ApuNerfedYou = IntToBoolean(StringToInt(AwesomeFile.nextLine()));
						}
						else
						{
							FavoriteGame = 0;
							FoundTrapdoor = false;
							ApuNerfedYou = false;
						}
						
						if ((SaveVersion > FileSaveVersion) && (BeQuiet == false))
						{
							TypeLine("(Enter) Just so you know, your save file was from an older version of this game, so some stuff was added or may have been reset.");
							HitEnter(1);
							AwesomeScanner.nextLine();
						}

						AwesomeFile.close();
						return true;
					}
				}
			}
			catch (RuntimeException NoNewLineException)
			{
				if (BeQuiet == false)
				{
					System.out.println("(Enter) Error 11: Woah there! You seem to have a save file at \"Porject-Alpha/Saves/Save.txt\", but it has missing lines!");
					AwesomeScanner.nextLine();
				}
				return false;
			}
		}
		catch (FileNotFoundException NoSaveFileException)
		{
			if (BeQuiet == false)
			{
				TypeLine("(Enter) You tried to load a save, but there's no save file (at \"Game Code/Saves/Save.txt\") to load!)");
				HitEnter(1);
				AwesomeScanner.nextLine();
			}
			return false;
		}
	}
	
	public static int StringToInt(char Number)
	{
		return StringToInt(Number + "");
	}
	
	public static int StringToInt(String Number)
	{
		while ((Number.length() != 1) && Number.startsWith("0"))
		{
			if (Number.startsWith("0"))
			{
				Number = Number.substring(1);
			}
		}
		
		for (int Cursor = 0; Cursor < Number.length(); Cursor++)
		{
			if (!Character.isDigit(Number.charAt(Cursor)))
			{
				System.out.println("(Enter) Error 12: Sorry, something went wrong, StringToInt was given " + Number + ", while the accepted values are integers in the String variable type.");
				AwesomeScanner.nextLine();
				return 0;
			}
		}
		
		return Integer.parseInt(Number);
	}
	
	public static int BooleanToInt(Boolean TheBoolean)
	{
		if (TheBoolean == true)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	public static boolean IntToBoolean(int TheBoolean)
	{
		if (TheBoolean == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Can have 1 to 4 options for the player
	public static String PlayerChoice(String Choice1)
	{
		return PlayerChoice(Choice1, null, null, null);
	}
	
	public static String PlayerChoice(String Choice1, String Choice2)
	{
		return PlayerChoice(Choice1, Choice2, null, null);
	}

	public static String PlayerChoice(String Choice1, String Choice2, String Choice3)
	{
		return PlayerChoice(Choice1, Choice2, Choice3, null);
	}
	
	public static String PlayerChoice(String Choice1, String Choice2, String Choice3, String Choice4)
	{
		HitEnter(1);
		Divider();
		if (Choice1 == null)
		{
			TempInstantText = false;
			System.out.println("(Enter) Error 13: Sorry, something went wrong, we almost just tried to give you a choice with no options!");
			AwesomeScanner.nextLine();
			return null;
		}
		else
		{
			switch (RandomInt(1, 3))
			{
				case 1:
					Type("You can choose ");
					break;
				case 2:
					Type("You can decide between ");
					break;
				case 3:
					Type("Your options seem to be ");
					break;
				default:
					Type("Your choices seem to be ");
					break;
			}
			
			Type(Choice1);
			
			if (Choice2 != null)
			{
				if (Choice3 != null)
				{
					Type(", ");
				}
				else
				{
					Type(" or ");
				}
				Type(Choice2);
			}
			
			if (Choice3 != null)
			{
				if (Choice4 != null)
				{
					Type(", ");
				}
				else
				{
					Type(", or ");
				}
				Type(Choice3);
			}
			
			if (Choice4 != null)
			{
				Type(", or " + Choice4);
			}
			
			System.out.println(".");
			if (CurrentBranchNumber == 1 && CurrentLocationNumber == 1)
			{
				TypeLine("(Menu) Also, you can always go to the main menu. You can save your progress there.");
			}
			else
			{
				Type("(Menu) You may also go to the main menu. ");
				
				switch (RandomInt(1,4))
				{
					case 1:
						TypeLine("You can save your progress there.");
						break;
					case 2:
						TypeLine("Legends say it's a good place to save your progress, whatever that means.");
						break;
					case 3:
						TypeLine("That's a good place to save your progress.");
						break;
					case 4:
						TypeLine("You'll find it's a good spot to save your progress.");
						break;
				}
			}
			HitEnter(1);
			
			String Choice;
			if (Choice2 == null)
			{
				do
				{
					PotentialDebugMenu();
					Choice = AwesomeScanner.nextLine().toLowerCase();
				}
				while (!Choice.equals(Choice1.toLowerCase()) && !Choice.equals("menu"));
			}
			else
			{
				if (Choice3 == null)
				{
					do
					{
						PotentialDebugMenu();
						Choice = AwesomeScanner.nextLine().toLowerCase();
					}
					while (!Choice.equals(Choice1.toLowerCase()) && !Choice.equals(Choice2.toLowerCase()) && !Choice.equals("menu"));
				}
				else
				{
					if (Choice4 == null)
					{
						do
						{
							PotentialDebugMenu();
							Choice = AwesomeScanner.nextLine().toLowerCase();
						}
						while (!Choice.equals(Choice1.toLowerCase()) && !Choice.equals(Choice2.toLowerCase()) && !Choice.equals(Choice3.toLowerCase()) && !Choice.equals("menu"));
					}
					else
					{
						do
						{
							PotentialDebugMenu();
							Choice = AwesomeScanner.nextLine().toLowerCase();
						}
						while (!Choice.equals(Choice1.toLowerCase()) && !Choice.equals(Choice2.toLowerCase()) && !Choice.equals(Choice3.toLowerCase()) && !Choice.equals(Choice4.toLowerCase()) && !Choice.equals("menu"));
					}
				}
			}
			
			TempInstantText = false;
			
			if (Choice.equals("menu"))
			{
				PorjectAlpha.TitleScreen();
				return Choice;
			}
			else
			{
				String CapitalChoice = "";
				
				if (Choice.length() > 0)
				{
					CapitalChoice = Choice.charAt(0) + "";
				}
				
				if (Character.isLetter(Choice.charAt(0)) && Choice.length() > 1)
				{
					CapitalChoice = CapitalChoice.toUpperCase().concat(Choice.substring(1));
				}
				else
				{
					CapitalChoice = Choice;
				}
				
				switch (RandomInt(1, 3))
				{
					case 1:
						TypeLine(CapitalChoice + " it is.");
						break;
					case 2:
						TypeLine("Very well, " + Choice + " it is.");
						break;
					case 3:
						TypeLine("You chose " + Choice + ".");
						break;
					default:
						TypeLine("You decided on " + Choice + ".");
						break;
				}
				TurnCount ++;
				
				return Choice;
			}
		}
	}
	
	public static void StoryEnding()
	{
		TempInstantText = false;
		Wait(1250);
		HitEnter(1);
		Divider();
		Type("(Enter) ");
		switch (RandomInt(1, 3))
		{
			case 1:
				Type("That's all, folks!");
				break;
			case 2:
				Type("Aaaand cut!");
				break;
			case 3:
				Type("That's the story!");
				break;
			default:
				Type("That's it for this tale!");
		}
		TypeLine(" You made " + TurnCount + " choices. Return to the main menu whenever you're ready.");
		HitEnter(1);
		AwesomeScanner.nextLine();
		PorjectAlpha.TitleScreen();
	}
	
	public static void typeln(String Phrase)
	{
		TypeLine(Phrase);
	}
	
	public static void TypeLine(String Phrase)
	{
	    Type(Phrase);
	    System.out.println();
	}
	
	public static void type(String Phrase)
	{
		Type(Phrase);
	}
	
	public static void Type(String Phrase)
	{
		if (FancyTypingSpeed != 0 && TempInstantText == false)
		{
			for (int Counter = 0; Counter < Phrase.length(); Counter++)
			{
				System.out.print(Phrase.charAt(Counter));
				if (Phrase.charAt(Counter) == '!' || Phrase.charAt(Counter) == '.' || Phrase.charAt(Counter) == '?' || Phrase.charAt(Counter) == ';' || Phrase.charAt(Counter) == ':')
				{
					boolean Gloss = false;
					
					if (Phrase.charAt(Counter) == '.' && !(Counter == Phrase.length() - 1))
					{
						if (Phrase.charAt(Counter + 1) != ' ')
						{
							Gloss = true;
						}
						
						if (!(Counter == 0 || Counter == 1 || Counter == 2))
						{
							if ((Phrase.substring(Counter - 2, Counter).toLowerCase().equals("mr")) || (Phrase.substring(Counter - 2, Counter).toLowerCase().equals("ms")) || (Phrase.substring(Counter - 2, Counter).toLowerCase().equals("dr")))
							{
								Gloss = true;
							}
						}
						
						if (!(Counter == 0 || Counter == 1 || Counter == 2 || Counter == 3))
						{
							if ((Phrase.substring(Counter - 2, Counter).toLowerCase().equals("mrs")))
							{
								Gloss = true;
							}
						}
					}
					
					if (!(Gloss))
					{
						Wait(95 + (FancyTypingSpeed * 60));
					}
				}
				
				if (Phrase.charAt(Counter) == ',')
				{
					Wait(30 + (FancyTypingSpeed * 30));
				}
				
				Wait(5 + (FancyTypingSpeed * 15));
			}
		}
		else
		{
			System.out.print(Phrase);
		}
	}
	
	public static int RandomInt()
	{
		return RandomInt(1, 10);
	}
	
	public static int RandomInt(int MinimumInt, int MaximumInt)
	{
		return (((int) (Math.random() * ((MaximumInt - MinimumInt) + 1))) + MinimumInt);
	}
	
	public static void Wait(int Milliseconds)
	{
		if (TempInstantText == false)
		{
			try
			{
				Thread.sleep(Milliseconds);
			}
			catch (InterruptedException Exception)
			{
				System.out.println("(Enter) Error 14: Everything was by design supposed to stop for " + Milliseconds + " milliseconds here. We don't know what happened.");
				Exception.printStackTrace();
				AwesomeScanner.nextLine();
			}
		}
	}
}