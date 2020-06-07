public class GoatBranch
{
	public static void GoToGoatBranch(String StartingPosition)
	{
		Stuff.CurrentBranchNumber = 3;
		switch (StartingPosition)
		{
			case "1":
			case "RuralAustralia1":
				RuralAustralia1();
				break;
			case "2":
			case "Mountain":
				Mountain();
				break;
			case "3":
			case "GroceryStore":
				GroceryStore();
				break;
			case "4":
			case "RockOfSelfReflection":
				RockOfSelfReflection();
				break;
			case "5":
			case "Tree":
				Tree();
				break;
			case "6":
			case "RuralAustralia2":
				RuralAustralia2();
				break;
			case "7":
			case "ApuRevenge":
				ApuRevenge();
				break;
			case "8":
			case "TreeHatch":
				TreeHatch();
			case "9":
			case "Town":
				Town();
				break;
			case "10":
			case "Crossroads":
				Crossroads();
				break;
			case "11":
			case "RightOutsideStore":
				RightOutsideStore();
				break;
			case "12":
			case "RightOutsideHatch":
				RightOutsideHatch();
				break;
			case "13":
			case "UpperMountain":
				UpperMountain();
				break;
			case "14":
			case "ManufacturingCenter":
				ManufacturingCenter();
				break;
			case "15":
			case "RightOutsideMountainHatch":
				RightOutsideMountainHatch();
				break;
			case "16":
			case "MountainHatch":
				MountainHatch();
				break;
			case "17":
			case "WaterHole":
				WaterHole();
				break;
			case "18":
			case "Office":
				Office();
				break;
			case "19":
			case "EllipseOffice":
				EllipseOffice();
				break;
			case "20":
			case "RandomHouse":
				RandomHouse();
				break;
			case "21":
			case "RightOutsideHouse":
				RightOutsideHouse();
				break;
			default:
				System.out.println("(Enter) Error 3: The starting area of the goat branch of the story, method GoToGoatBranch, was told to go to " + StartingPosition + ", which isn't a place!");
				Stuff.AwesomeScanner.nextLine();
		}
	}
	
	public static void RuralAustralia1()
	{
		Stuff.CurrentLocationNumber = 1;
		
			if (Stuff.StoryBeginning == true)
			{
				Stuff.TypeLine("And everything is black.");
				Stuff.Wait(2000);
				Stuff.typeln("For a few seconds, at least.");
				Stuff.typeln("Soon enough, you wake up.");
				Stuff.typeln("It is with great surprise that you find Doof's machine didn't harm you.");
				Stuff.typeln ("Well... except that...");
				Stuff.Wait(1000);
				Stuff.typeln ("You are a goat.");
				Stuff.typeln ("That is, despite having the same human (presumably) brain you had before, you now are a goat.");
				Stuff.typeln ("What fun things shall you do first?");
			}
			else
			{
				Stuff.typeln ("Where to go, what to do?");
			}
		
			switch (Stuff.PlayerChoice("climb a mountain", "figure out location", "eat something", "investigate"))
			{
			case "climb a mountain":
				Stuff.typeln ("Fortunately for you, there is a mountain nearby.");
				Stuff.StoryBeginning = false;
				Mountain();
				break;
			case "figure out location":
				Stuff.typeln ("You decide to investigate your location...");
				Stuff.StoryBeginning = false;
				RuralAustralia2();
				break;
			case "eat something":
				Stuff.typeln ("As one often is after time travel, you are quite hungry. Luckily, as a goat, you can eat things you couldn't as a human.");
				Stuff.StoryBeginning = false;
				GroceryStore();
				break;
			case "investigate":
				Stuff.typeln ("Being the inquisitive goat that you are, you decide to investigate just how you came to exist.");
				Stuff.StoryBeginning = false;
				RockOfSelfReflection();
				break;
			}
	}
	
	public static void RuralAustralia2()
	{
		Stuff.CurrentLocationNumber = 6;
		
			Stuff.typeln ("Exploration time, you suppose.");
			Stuff.Wait(1500);
			Stuff.typeln("After a brief walk, you are able to formulate the following map.");
			Stuff.typeln("It's quite messy, which is owed to your lack of thumbs and fingers.");
			Stuff.HitEnter(2);
			ASCII.GoatMap1();
			Stuff.HitEnter(2);
			Stuff.Wait(5000);
			Stuff.typeln("Where ever shall you go? (so many fun locations!)");
			switch (Stuff.PlayerChoice("mountain", "rock", "grocery store", "nowhere"))
			{
			case "mountain":
				Stuff.typeln ("Good choice. You are a goat, after all.");
				Mountain();
				break;
			case "rock":
				Stuff.typeln ("Yes, perhaps the rock will hold some answers...");
				RockOfSelfReflection();
				break;
			case "grocery store":
				Stuff.typeln ("As one often is after time travel, you are quite hungry. Luckily, as a goat, you can eat things you couldn't as a human.");
				GroceryStore();
				break;
			case "nowhere":
				Stuff.typeln ("Turns out the map was a waste of time. You'd like to stay put.");
				Stuff.typeln("A nearby tree provides some shade.");
				Tree();
				break;
			}
		}
	
	public static void Mountain() {
		Stuff.CurrentLocationNumber = 2;
		
		Stuff.typeln ("\"Welcome to the mountain\" says a nearby tree.");
		Stuff.typeln ("\"Hmm,\" you say to yourself, \"I suppose that the trees are sentient here.\"");
		Stuff.typeln ("Maybe the talking tree will have answers for you. Or maybe you should just begin your climb.");
		switch (Stuff.PlayerChoice("climb", "discuss with tree"))
		{
		case "climb":
			Stuff.typeln ("Good choice. You are a goat, after all.");
			break;
		case "discuss with tree":
			Stuff.typeln("\"Why are you able to talk?\" you ask the tree.");
			Stuff.typeln("\"Mate,\" says the tree, \"I have been through the unthinkable.");
			Stuff.typeln("You're not going to want to hear it.\" ");
			Stuff.typeln("\"Yes I am!\" you protest, but alas. The tree has gone back to sleep, leaving you answerless.");
			Stuff.typeln("Or so you think. Until he drops a leaf.");
			Stuff.Wait(1000);
			Stuff.typeln("You examine it carefully. . .  and find that there is text on it!");
			Stuff.HitEnter(2);
			ASCII.GoatLeaf();
			Stuff.HitEnter(2);
			Stuff.Wait(5000);
			Stuff.typeln("Well... either way, time to climb the mountain I suppose.");
			Stuff.TalkedToTree = true;
			break;
		}
		Stuff.Wait(1000);
		UpperMountain();
		
	}
	
	public static void GroceryStore() {
		Stuff.CurrentLocationNumber = 3;
		
		if (Stuff.ApuNerfedYou == false) {
			Stuff.typeln ("\"Welcome to Stop, Shop, and Roll,\" a familiar man says.");
			Stuff.typeln("\"Apu?!\" you exclaim. \"Is that you? The famous cashier from the hit sitcom 'The Simpsons'?\"");
			Stuff.typeln("\"Yes, indeed,\" he replies, \"Please feel free to ask me anything as you shop.\"");
		}
		else {
			Stuff.typeln("\"Now, no more funky business,\" Apu says. \"Shop.\"");
			Stuff.typeln("He returns to the counter.");
			Stuff.ApuNerfedYou = false;
		}
		Stuff.typeln("*shopping*");
		Stuff.Wait(3000);
		Stuff.typeln("So, what do you ask Apu?");
		if (Stuff.TalkedToTree == true) {
			switch (Stuff.PlayerChoice("ask about Ned", "ask anything hehe", "ask to leave"))
			{
			case "ask about ned":
				Stuff.typeln("\"Who is Ned?\" you ask politely.");
				Stuff.typeln("Apu looks up, startled, and gives you a horrified look.");
				Stuff.typeln("\"Look, Mr. Goat,\" he says, \"There are things to joke about and Ned is not one of them.");
				Stuff.typeln("\"I'm not joking,\" you tell him, but it's no use.");
				Stuff.typeln("Get out of my store! I won't tolerate ignoring our leader! Our hero! NED!\"");
				Stuff.typeln("You back towards the door.");
				Stuff.typeln("\"Praise Ned! Praise Ned!\"");
				Stuff.typeln("The door shuts behind you and Apu's praise is silenced.");
				Stuff.NedLoreAcquired = true;
				Stuff.typeln("Where to now...");
				Stuff.Wait(2000);
				Crossroads();
				break;
			case "ask anything hehe":
				Stuff.typeln ("\"Wow, a funny guy, eh.\" Apu draws a gun (NERF of course. NERF or nothing :0), and shoots you in the head.");
				Stuff.typeln("Everything fades to black...");
				Stuff.ApuNerfedYou = true;
				Stuff.Wait(1500);
				ModernBranch.GoToModernBranch("Lab2");
				break;
			case "ask to leave":
				Stuff.typeln("\"Mr. Apu, sir?\" you ask.\"");
				Stuff.typeln("Apu looks up.");
				Stuff.typeln("\"May I leave the store?\"");
				Stuff.typeln("\"Yes,\" he says, \"I suppose you can.\"");
				Stuff.typeln("\"Nice.\"");
				RightOutsideStore();
				break;
			}
		}
		else {
			switch (Stuff.PlayerChoice("ask anything hehe", "ask to leave"))
			{
			case "ask anything hehe":
				Stuff.typeln ("\"Wow, a funny guy, eh.\" Apu draws a gun (NERF of course. NERF or nothing :0), and shoots you in the head.");
				Stuff.typeln("Everything fades to black...");
				Stuff.ApuNerfedYou = true;
				Stuff.Wait(1500);
				ModernBranch.GoToModernBranch("Lab2");
				break;
			case "ask to leave":
				Stuff.typeln("\"Mr. Apu, sir?\" you ask.\"");
				Stuff.typeln("Apu looks up.");
				Stuff.typeln("\"May I leave the store?\"");
				Stuff.typeln("\"Yes,\" he says, \"I suppose you can.\"");
				Stuff.typeln("\"Nice.\"");
				RightOutsideStore();
				break;
			}
		}
	}
	
	public static void RockOfSelfReflection() {
		Stuff.CurrentLocationNumber = 4;
		
		Stuff.typeln("Lucky for you, there was a sick looking rock nearby that should be good for self-reflection.");
		
	}
	
	public static void Tree() {
		Stuff.CurrentLocationNumber = 5;
		
		Stuff.typeln("Sitting under it, you notice that its trunk has an acronym inscribed in it.");
		Stuff.HitEnter(2);
		ASCII.TreeMessage();
		Stuff.HitEnter(2);
		Stuff.Wait(3000);
		if (Stuff.SeenHatch == false) {
			Stuff.typeln("Odd. Peculiar. Yes, it doesn't really make much sense.");
			Stuff.typeln("What ever could it stand for?");
			Stuff.Wait(500);
			Stuff.typeln("You also notice that the letters seem to be a part of a panel.");
		}
		else {
			Stuff.typeln("It's a hatch again!");
		}
		Stuff.typeln("What is your next move?");
		Stuff.SeenHatch = true;
		switch (Stuff.PlayerChoice("push it", "ignore it"))
		{
		case "push it":
			RightOutsideHatch();
			break;
		case "ignore it":
			Stuff.typeln("Well fine then. Don't explore.");
			Stuff.typeln("Stay a goat forever. Fine with me.");
			Stuff.typeln("Anyway, I guess you'll go to the town now.");
			Stuff.Wait(2000);
			Town();
			break;
		}
	}
	
	public static void ApuRevenge() {
		Stuff.CurrentLocationNumber = 7;
		
		Stuff.typeln("You wake up again...");
		Stuff.typeln("And you are, once again, a goat...");
		Stuff.typeln("And standing above you is Apu.");
		Stuff.typeln("\"Have you learned your lesson, now?\" Apu asks you smugly. You note that he is still twirling the NERF gun (NERF or nothing)");
		switch (Stuff.PlayerChoice("yes", "no way"))
		{
		case "yes":
			Stuff.typeln ("\"Good choice,\" Apu says. \"Well, then...");
			Stuff.typeln ("Back to the store with you.\"");
			Stuff.Wait(1000);
			GroceryStore();
			break;
		case "no way":
			Stuff.typeln ("\"You're gone, pal.\" Apu takes out the NERF (NERF is a registered trademark of Hasbro) gun and...");
			Stuff.typeln("Pew, bang, boom, etc.");
			Stuff.typeln("Everything fades to black...");
			Stuff.ApuNerfedYou = true;
			Stuff.Wait(1500);
			ModernBranch.GoToModernBranch("Lab2");
			break;
		}
	}
	
	public static void TreeHatch() {
		Stuff.CurrentLocationNumber = 8;
		
		Stuff.typeln("When you do, you realize that it is pitch-black dark.");
		Stuff.typeln("You can't see or hear anything.");
		Stuff.typeln("I guess your best bet is just going to be to walk in a random direction and see what you find.");
		Stuff.typeln("So, what direction do you walk?");
		switch (Stuff.PlayerChoice("forward", "left", "right", "back"))
		{
		case "forward":
			Stuff.typeln("You advance forward carefully...");
			Stuff.typeln("All of a sudden, the ground is gone beneath you.");
			Stuff.typeln("You fall for a short while...");
			Stuff.Wait(1000);
			Stuff.typeln("And splash down into cold water.");
			Stuff.typeln("It seems you have walked off a ledge into some water.");
			Stuff.typeln("But why is there water in this hatch?");
			WaterHole();
			break;
		case "left":
			Stuff.typeln("You walk left and quickly find a wall.");
			Stuff.typeln("You turn around and head the other direction, but find a wall there too.");
			Stuff.typeln("Forward it is, you suppose.");
			Stuff.typeln("You advance forward carefully...");
			Stuff.typeln("All of a sudden, the ground is gone beneath you.");
			Stuff.typeln("You fall for a short while...");
			Stuff.Wait(1000);
			Stuff.typeln("And splash down into cold water.");
			Stuff.typeln("It seems you have walked off a ledge into some water.");
			Stuff.typeln("But why is there water in this hatch?");
			WaterHole();
			break;
		case "right":
			Stuff.typeln("You walk right and quickly find a wall.");
			Stuff.typeln("You turn around and head the other direction, but find a wall there too.");
			Stuff.typeln("Forward it is, you suppose.");
			Stuff.typeln("You advance forward carefully...");
			Stuff.typeln("All of a sudden, the ground is gone beneath you.");
			Stuff.typeln("You fall for a short while...");
			Stuff.Wait(1000);
			Stuff.typeln("And splash down into cold water.");
			Stuff.typeln("It seems you have walked off a ledge into some water.");
			Stuff.typeln("But why is there water in this hatch?");
			WaterHole();
			break;
		case "back":
			Stuff.typeln("You turn around and walk back from where you landed.");
			Stuff.typeln("It seems this room is either very large or a very long corridor...");
			Stuff.Wait(2000);
			Stuff.typeln("Eventually, you crash into a wall of sorts.");
			Stuff.typeln("Except it's not a wall, it's a door! There's a handle. Poking at it with your nose, you find it's unlocked.");
			Office();
			break;
		}
		
	}
	
	public static void Town() {
		Stuff.CurrentLocationNumber = 9;
		if (Stuff.WentToTown == false) {
		Stuff.typeln("You wander into town, trying to act nonchalant.");
		Stuff.typeln("You whistle a tune, but unfortunately that isn't quite as effective in terms of blending in when. . .");
		Stuff.typeln(". . .well, you're a goat.");
		Stuff.typeln("Several odd stares later, you arrive at the town center where you find a bulletin board.");
		Stuff.HitEnter(2);
		ASCII.BulletinBoard();
		Stuff.HitEnter(2);
		Stuff.Wait(5000);
		Stuff.typeln("That is quite perculiar. Yes, indeed, very weird.");
		Stuff.typeln("You'll have to be sure to report any anti-Ned activity, I suppose.");
		}
		else {
			Stuff.typeln("It's the same town as before. Nothing interesting to see. There is that bulliten board again.");
			Stuff.HitEnter(2);
			ASCII.BulletinBoard();
			Stuff.HitEnter(2);
			Stuff.Wait(5000);
			Stuff.typeln("Well, off you go.");
		}
		Stuff.Wait(1000);
		Stuff.WentToTown = true;
		Crossroads();
	}
	
	public static void Crossroads() {
		Stuff.CurrentLocationNumber = 10;
		
		Stuff.HitEnter(2);
		ASCII.Signpost();
		Stuff.HitEnter(2);
		Stuff.typeln("You arrive at a crossroads.");
		Stuff.typeln("And wow, there's a handy signpost here!");
		Stuff.typeln("It even directs you to seemingly pointless (but actually sinister) locations!"); 
		Stuff.Wait(2500);
		Stuff.typeln("Where to go...");
		while (5 == 2 + 3) {
		switch (Stuff.PlayerChoice("grocery store", "rock", "tree", "mountain"))
		{
		case "grocery store":
			if (Stuff.NedLoreAcquired == false) {
				Stuff.typeln ("Yim yum.");
				Stuff.Wait(1000);
				GroceryStore();
			}
			else {
				Stuff.typeln("Too bad.");
				Stuff.typeln("You already went there.");
				Stuff.typeln("Pick somewhere else.");
			}
			break;
		case "rock":
			Stuff.typeln ("Yes, perhaps the rock will hold some answers...");
			Stuff.Wait(1000);
			RockOfSelfReflection();
			break;
		case "tree":
			Stuff.typeln ("Good choice. It is a cool tree, after all.");
			Stuff.Wait(1000);
			Tree();
			break;
		case "mountain":
			Stuff.typeln ("Exercise your goat abilities. Good idea.");
			Stuff.Wait(1000);
			Mountain();
			break;
		}
		}
	}
	
	public static void RightOutsideStore() {
		Stuff.CurrentLocationNumber = 11;
		
		Stuff.typeln("You head for the door, and as you leave the grocery store, you hear him mutter...");
		Stuff.typeln("\"...Praise Ned. Ned is cool. Praise Ned.\"");
		Stuff.typeln("Now you're intrigued. Maybe you don't want to leave...");
		Stuff.typeln("Or maybe you do. Up to you, really.");
		switch (Stuff.PlayerChoice("go back in", "leave"))
		{
		case "go back in":
			Stuff.TalkedToTree = true;
			Stuff.typeln("You decide that you just need to know what all this is about.");
			Stuff.typeln("Re-enting the store, you approach the checkout counter.");
			Stuff.typeln("\"Who is Ned?\" you ask politely.");
			Stuff.typeln("Apu looks up, startled, and gives you a horrified look.");
			Stuff.typeln("\"Look, Mr. Goat,\" he says, \"There are things to joke about and Ned is not one of them.");
			Stuff.typeln("\"I'm not joking,\" you tell him, but it's no use.");
			Stuff.typeln("\"Get out of my store! I won't tolerate ignoring our leader! Our hero! NED!\"");
			Stuff.typeln("You back towards the door.");
			Stuff.typeln("\"Praise Ned! Praise Ned!\"");
			Stuff.typeln("The door shuts behind you and Apu's praise is silenced.");
			Stuff.NedLoreAcquired = true;
			Stuff.typeln("Where to now...");
			Crossroads();
			break;
		case "leave":
			Stuff.TalkedToTree = true;
			Stuff.typeln("I guess what he said wasn't important then.");
			Stuff.typeln("That's fine, I guess. Gotta leave something for the next playthrough, eh?");
			Stuff.Wait(1000);
			Crossroads();
			break;
		}
	}
	
	public static void RightOutsideHatch() {
		Stuff.CurrentLocationNumber = 12;
		
		Stuff.typeln("As you lift up your front hooves and lean your weight onto it, the panel suddenly falls out from under you.");
		Stuff.typeln("The tree starts to make grinding, metallic sounds, and the bark begins to shift.");
		Stuff.typeln("The sounds are defeaning!");
		Stuff.typeln("Apparently they drew the attention of the nearby town, since a man suddenly runs up.");
		Stuff.typeln("He is masked and wears sunglasses, so it's hard to discern his identity, but he looks upset.");
		Stuff.typeln("\"Ay!\" he calls out to someone else you can't see. \"There's a goat here!\"");
		Stuff.typeln("\"Hold on, I'll shoot it. Darned animals always messing with the hatch.\"");
		Stuff.typeln("You probably don't want to stick around for that. But in case you want to:");
		switch (Stuff.PlayerChoice("go in hatch", "stay"))
		{
		case "go in hatch":
			Stuff.WentInTreeHatch = true;
			Stuff.typeln("Into the hatch you go.");
			Stuff.typeln("You fall for a while.");
			Stuff.Wait(3000);
			Stuff.typeln("Luckily, you eventually land.");
			TreeHatch();
			break;
		case "stay":
			Stuff.typeln("Not a very bright choice, but a choice nonetheless.");
			Stuff.typeln("A few seconds pass.");
			Stuff.Wait(1000);
			Stuff.typeln("The man returns with another. He is holding a NERF gun (registered trademark, NERF or nothing).");
			Stuff.typeln("\"Bye bye, goat,\" the man says...");
			Stuff.typeln("But you fight back!");
			Stuff.typeln("Pow!");
			Stuff.Wait(500);
			Stuff.typeln("Slam!");
			Stuff.Wait(500);
			Stuff.typeln("Boom!");
			Stuff.Wait(500);
			Stuff.typeln("The NERF gun is no match for your horns.");
			Stuff.typeln("With that out of the way, it's time to go see where they came from...");
			Stuff.Wait(1000);
			Town();
			break;
		}
	}
	
	public static void UpperMountain() {
		Stuff.CurrentLocationNumber = 13;
		if (Stuff.GotShirt == true) {
			Stuff.typeln("You already climbed once. We'll spare you the theatrics.");
			Stuff.Wait(3000);
			Stuff.typeln("Hooray you're at the top!");
			Stuff.typeln("Now what...");
		}
		else {
		Stuff.typeln("And so, you begin your climb.");
		Stuff.HitEnter(2);
		ASCII.MountainScene();
		Stuff.HitEnter(2);
		Stuff.Wait(2000);
		Stuff.typeln("And you continue your climb...");
		Stuff.typeln("After 20 grueling days, you reach the top, where there is a gift shop.");
		Stuff.typeln("You walk to the door and enter...");
		Stuff.Wait(500);
		Stuff.typeln("\"Welcome to the gift shop,\" says the woman at the counter.");
		Stuff.typeln("\"We have refreshments and stylish fits.\"");
		Stuff.typeln("\"Anything that will fit someone of my... body type?\" you ask.");
		Stuff.typeln("The woman points you to the goat section.");
		Stuff.Wait(1000);
		Stuff.typeln("...Unfortunately, you realize you have forgotton your wallet.");
		Stuff.Wait(3000);
		Stuff.HitEnter(2);
		ASCII.MountainScene2();
		Stuff.HitEnter(2);
		Stuff.typeln("You are quite displeased with your forgetfulness.");
		Stuff.Wait(2000);
		Stuff.HitEnter(2);
		ASCII.MountainScene();
		Stuff.HitEnter(2);
		Stuff.typeln("And back up you go.");
		Stuff.Wait(2000);
		Stuff.typeln("40 days later, you return to the gift shop.");
		Stuff.typeln("Luckily, you are able to buy yourself a cool Ned-themed shirt.");
		Stuff.GotShirt = true;
		Stuff.Wait(3000);
		Stuff.typeln("With the important things out of the way, it's time to do some pointless lame things.");
		}
		Stuff.typeln("You notice that there is another building that says \"Time Machine Manufacturing Center\" on the door.");
		Stuff.typeln("\"Wow,\" you remark, \"that is quite boring compared to the gift shop.\"");
		Stuff.typeln("You suppose you should enter though.");
		Stuff.typeln("Or should you? Good thing you get to pick.");
		switch (Stuff.PlayerChoice("enter center", "descend mountain"))
		{
		case "enter center":
			Stuff.typeln("Hehe 'enter center' it rhymes");
			Stuff.Wait(500);
			Stuff.typeln("Anyway, in you go...");
			Stuff.Wait(1000);
			ManufacturingCenter();
			break;
		case "descend mountain":
			RightOutsideMountainHatch();
			break;
		}
	}
	public static void ManufacturingCenter() {
		Stuff.CurrentLocationNumber = 14;
		
		Stuff.typeln("\"Welcome!\" a voice calls out.");
		Stuff.typeln("You look over and are taken by surprise.");
		Stuff.typeln("The man is front of you is...");
		Stuff.Wait(2000);
		Stuff.typeln("Dr. Doofenshmirtz.");
		Stuff.typeln("You stare at him for a few seconds.");
		Stuff.typeln("\"Do I know you?\" he asks.");
		Stuff.typeln("Figuring that you shouldn't destroy the entire future, you reply with a no.");
		Stuff.typeln("\"Hey,\" you say, \"Why are you making these?\"");
		Stuff.typeln("He shrugs. \"I dunno. It's fun I guess.\"");
		Stuff.typeln("A few seconds pass as you contemplate your next move.");
		Stuff.Wait(1500);
		Stuff.typeln("\"Hey,\" you inquire, \"Can I have some of the stuff you use to power those?\"");
		Stuff.typeln("\"Sure, you can have some gasoline.\" Dr. Doofenshmirtz hands you a gas can.");
		Stuff.Wait(1000);
		Stuff.typeln("Very odd, you think, since his new ones are powered by Porject Alpha...");
		Stuff.Wait(500);
		Stuff.typeln("\"Anything else I can do for ya?\" he asks.");
		switch (Stuff.PlayerChoice("say no", "use machine", "break future"))
		{
		case "say no":
			Stuff.typeln("\"Nah,\" you say. You turn towards the door and walk out.");
			RightOutsideMountainHatch();
			break;
		case "use machine":
			Stuff.typeln("\"Hey,\" you inquire again.");
			Stuff.typeln("\"Hey, what?\"");
			Stuff.typeln("\"May I use one of the machines?\"");
			Stuff.typeln("\"Well, I guess so.\" The doctor shrugs and steps out of the way.");
			Stuff.typeln("\"Just FYI, if you get hurt, it's not my fault or my problem.\"");
			Stuff.typeln("You nod. You are a goat, so no one should notice you're gone anyway.");
			Stuff.typeln("Into the machine you go.");
			Stuff.typeln("For 1954, it's pretty advanced.");
			Stuff.typeln("You start to turn a dial, but because you have hooves, it's quite difficult.");
			Stuff.typeln("\"Oopsies,\" you remark.");
			Stuff.Wait(1000);
			Stuff.typeln("You have accidentally broken the dial with your hoof.");
			Stuff.typeln("Not wanting to concern Doofenshmirtz or have him ask too many questions, you decide to just wing it.");
			Stuff.typeln("Off you go to whatever year it was set on...");
			Stuff.Wait(3000);
			OldTimeBranch.GoToOldTimeBranch("OuterVillage1");
			break;
		case "break future":
			//idk yet
			break;
		}
	}
	
	public static void RightOutsideMountainHatch() {
		Stuff.CurrentLocationNumber = 15;
		
		Stuff.typeln("You begin to descend when you notice a strange looking panel.");
		Stuff.HitEnter(2);
		ASCII.MountainHatch();
		Stuff.HitEnter(2);
		Stuff.Wait(3000);
		if (Stuff.SeenHatch == false) {
			Stuff.typeln("Odd. Peculiar. Yes, it doesn't really make much sense.");
			Stuff.typeln("What ever could it stand for?");
			Stuff.Wait(500);
			Stuff.typeln("You also notice that the letters seem to be a part of a panel.");
		}
		else {
			Stuff.typeln("It's a hatch again!");
		}
		Stuff.typeln("What is your next move?");
		Stuff.SeenHatch = true;
		switch (Stuff.PlayerChoice("push it", "ignore it"))
		{
		case "push it":
			Stuff.typeln("As you lift up your front hooves and lean your weight onto it, the panel suddenly falls out from under you.");
			Stuff.typeln("The hill starts to make grinding, metallic sounds, and the rock begins to shift.");
			Stuff.typeln("The sounds are defeaning!");
			//add things
			MountainHatch();
			break;
		case "ignore it":
			Stuff.typeln("Well fine then. Don't explore.");
			Stuff.typeln("Stay a goat forever. Fine with me.");
			Stuff.typeln("Anyway, time to descend...");
			Stuff.HitEnter(2);
			ASCII.MountainScene2();
			Stuff.HitEnter(2);
			Stuff.Wait(2000);
			Stuff.typeln("Soon, you are back at the bottom at the signposts.");
			Crossroads();
			break;
		}
	}
	
	public static void MountainHatch() {
		Stuff.CurrentLocationNumber = 16;
		
		//add things (make it go to the same place as that tree one)
	}
	
	public static void WaterHole() {
		Stuff.CurrentLocationNumber = 17;
		
		Stuff.Wait(1500);
		Stuff.typeln("Either way, you need to figure out how to get out. You can't swim forever...");
		Stuff.typeln("All of a sudden, there is a loud clang, and a light shines from above somewhere.");
		Stuff.typeln("You continue to tread water, listening and watching carefully...");
		Stuff.Wait(1500);
		Stuff.typeln("The sound of footsteps approaches and soon enough, a man steps out from behind the light.");
		Stuff.typeln("\"Well, howdy there, goat,\" the voice says.");
		Stuff.HitEnter(2);
		ASCII.WaterScene();
		Stuff.HitEnter(2);
		Stuff.Wait(3000);
		Stuff.typeln("You debate whether it would be better to play dumb - that is, like a normal goat,");
		Stuff.typeln("Or whether he's less likely to hurt you if you are just honest.");
		Stuff.Wait(1500);
		Stuff.typeln("Then you remember you have no free will and it's all up to the player anyway.");
		Stuff.typeln("So, player - what's it gonna be?");
		switch (Stuff.PlayerChoice("be honest", "play dumb"))
		{
		case "be honest":
			Stuff.Wait(1000);
			Stuff.typeln("\"Uh,\" you say with some uncertainty, \"Hello.\"");
			Stuff.typeln("The man is startled by the voice and looks around.");
			Stuff.typeln("\"Who said that?\" he demands.");
			Stuff.typeln("\"It's me,\" you say, louder.");
			Stuff.typeln("\"I was afraid of that,\" the man says solemnly.");
			Stuff.typeln("That doesn't sound good.");
			Stuff.typeln("\"You're gonna have to come with me,\" he says.");
			Stuff.typeln("\"And why would I do that?\" you ask him.");
			Stuff.typeln("\"Well, if you don't, I'm going to have to kill you.\"");
			Stuff.typeln("He turns to you and you notice his round glasses.");
			Stuff.Wait(2000);
			Stuff.typeln("\"Ned, by the way,\" he says, nodding at you.");
			Stuff.typeln("He suddenly pulls out a needle and injects you with it.");
			Stuff.typeln("The world begins to fade as he pulls you up out of the water and slings you over his shoulder.");
			EllipseOffice();
			break;
		case "play dumb":
			Stuff.Wait(1000);
			Stuff.typeln("You decide it's best to stay silent and let the guy figure out what to do without your input.");
			Stuff.typeln("Unfortunately that doesn't work out so well.");
			Stuff.typeln("He pulls out a NERF (or nothin!) gun and points it at you.");
			Stuff.typeln("Not wanting to be shot, you swim away from him. A dart hits the water next to you and splashes your eyes.");
			Stuff.typeln("Blinded and confused, you dive under the surface and frantically swim as deep as you can.");
			Stuff.typeln("You encounter a door of sorts on the bottom.");
			Stuff.Wait(1000);
			Stuff.typeln("It's difficult with hooves and NERF darts whizzing by but you finally manage to pull it open.");
			Stuff.typeln("The water begins to rush in and you are sucked into the door.");
			Stuff.typeln("You crash back and forth with the current through a narrow corridor and suddenly slam against a grate.");
			Stuff.typeln("You open your eyes and see the grate leads to a vacant room.");
			Stuff.typeln("The water begins to pool on the floor and runs out the doorway.");
			Stuff.typeln("You sure wouldn't want to live there, you note,");
			Stuff.typeln("Though you aren't in the best position yourself.");
			Stuff.Wait(2000);
			RandomHouse();
			break;
		}
	}
	
	public static void Office() {
		Stuff.CurrentLocationNumber = 18;
		
		//stuff
	}
	
	public static void EllipseOffice() {
		Stuff.CurrentLocationNumber = 19;
		
		Stuff.typeln("Your eyes open slowly and you find youself in a circular office.");
		Stuff.typeln("The man has removed his helmet and you can tell he looks vaguely familiar.");
		if (Stuff.WentToTown == true) {
			Stuff.typeln("It's Ned!");
			Stuff.typeln("He looks exactly like Ned on the bulletin board!");
		}
		else {
			Stuff.typeln("You're not sure from where though.");
		}
		Stuff.typeln("\"I suppose you'll know who I am,\" the man says with a smirk.");
		Stuff.Wait(2000);
		Stuff.typeln("\"My name is Ned Flanders. And I'm the leader of this here nation.\"");
		if (Stuff.NedLoreAcquired == true) {
			Stuff.typeln("\"Ned!\" you say with feigned joy.");
			Stuff.typeln("You know this is a man you need to respect.");
			Stuff.typeln("\"What a great honor it is to meet you!\"");
			Stuff.typeln("Your friendliness seems to be working, since Ned smiles warmly at you.");
			Stuff.typeln("\"Well, since you're so polite, I almost feel bad killing you!\"");
			Stuff.typeln("Oh dear.");
			Stuff.Wait(1500);
			Stuff.typeln("All of a sudden, the phone rings.");
			Stuff.typeln("Ned picks it up and nods a few times, with a few 'okay's thrown in, and then hang it up.");
			if (Stuff.HasLuckyGauntlet == true) {
				Stuff.typeln("\"That was Apu.\" Ned says with a hint of relief.");
				Stuff.typeln("\"He says you appeared out of nowhere outside his store, but that you seemed harmless.\"");
				Stuff.typeln("\"I was worried,\" Ned laughs, \"That you might have been a spy planted by enemies!\"");
				Stuff.typeln("\"Well, since you're not, I suppose I can let you be on your way.\"");
				Stuff.typeln("He gets up and opens another door.");
				Stuff.typeln("\"In there is a time machine,\" Ned says. \"It should bring you back to your friends.\"");
				Stuff.typeln("You walk into the room and Ned goes to shut the door behind you.");
				Stuff.typeln("\"Just...\" Ned looks behind him. \"Don't tell anyone you were here, okay?\"");
				Stuff.typeln("You nod and enter the machine.");
				Stuff.typeln("You wonder if you should try exploring somewhere else?");
				Stuff.typeln("Or maybe you've done enough for today. Up to you.");
				switch (Stuff.PlayerChoice("go to 2030", "go home"))
				{
				case "go to 2030":
					Stuff.typeln("Why not?");
					Stuff.typeln("Maybe you won't be a goat in 2030. Who knows?");
					Stuff.typeln("Either way, you turn the dial to 2030 and close your eyes as the machine begins to whir.");
					Stuff.typeln("You brace yourself for the adventure ahead...");
					SpaceBranch.GoToSpaceBranch("LaunchPad1");
					break;
				case "go home":
					Stuff.typeln("You decide you've had enough for today.");
					//insert dramatic and emotion ending here (i dont feel like it today lol)
					Stuff.StoryEnding();
					break;
			}
			}
			else {
				//bad things (you perish)
			}
		}
		else {
			//you are rude and perish because you don't know to respect him
			//unless you have the shirt. then he lets you go
		}
	}
	
	public static void RandomHouse() {
		Stuff.CurrentLocationNumber = 20;
		
		Stuff.typeln("After a few minutes of chilling in the grate, water rushing past you and flooding the room below...");
		Stuff.typeln("You hear a voice.");
		Stuff.typeln("\"What's all this water? Why is the family room - honey!\"");
		Stuff.typeln("A fellow enters the room and his wife follows.");
		Stuff.typeln("They look down at their drenched feet with dissatisfaction before noticing you in the wall.");
		Stuff.typeln("\"Woah,\" the woman remarks, \"there's a goat in the wall.\"");
		Stuff.typeln("Her husband looks up.");
		Stuff.typeln("\"So there is\"");
		Stuff.Wait(1000);
		Stuff.typeln("They contemplate the situation for a few seconds before addressing you.");
		Stuff.typeln("\"Mr. Goat? We know you can hear us.\"");
		Stuff.typeln("You decide to reply, remembering what happened five minutes ago when you ignored that other guy.");
		Stuff.typeln("Also, they might have some idea what's going on.");
		Stuff.typeln("\"Yes?\" you say politely.");
		Stuff.typeln("\"We can get you out of there,\" the woman says.");
		Stuff.typeln("\"But you need to trust us.\"");
		Stuff.typeln("It seems like you either trust them or die here.");
		Stuff.typeln("Still, it is a choice.");
		switch (Stuff.PlayerChoice("trust them", "don't"))
		{
		case "trust them":
			Stuff.typeln("You give them a nod and they approach the grate.");
			Stuff.typeln("The man picks up a screwdriver and begins to remove the grate.");
			Stuff.Wait(1000);
			Stuff.typeln("After a minute or two it's off and the couple grabs you and set you down.");
			Stuff.typeln("The water is beginning to rise and fill the home.");
			Stuff.typeln("\"We should probably take this outside,\" the wife says.");
			Stuff.typeln("They carry you down a hall and soon, you find yourself outside.");
			RightOutsideHouse();
			break;
		case "don't":
			Stuff.typeln("You shake your head.");
			Stuff.typeln("\"Why should I trust you?\" you demand.");
			Stuff.typeln("\"You knew I could talk. Where did you get that info?\"");
			Stuff.typeln("You need to escape. You start to climb back up the tunnel, but it's challenging with the water rushing at you.");
			Stuff.typeln("You're beginning to think escape is hopeless when you notice another hatch in the wall.");
			Stuff.typeln("Perhaps that will dump out somewhere without a grate.");
			Stuff.typeln("You pull it open and are suddenly and violently sucked in.");
			Stuff.typeln("You hit your head on the wall and everything goes to black.");
			MountainHatch();
			break;
		}
	}
	
	public static void RightOutsideHouse() {
		Stuff.CurrentLocationNumber = 21;
		
		Stuff.Wait(1500);
		Stuff.typeln("\"Look, we can put you down,\" the man says,");
		Stuff.typeln("\"But you have to promise not to run away.\"");
		Stuff.typeln("\"Okay,\" you promise halfheartedly.");
		Stuff.typeln("They place you on the ground and you weigh your options.");
		Stuff.typeln("You could just stay.");
		Stuff.typeln("After all, if one thing in this world is sacred, it's a goat's word, and you wouldn't want to hurt that reputation.");
		Stuff.typeln("But also, you could make an escape!");
		switch (Stuff.PlayerChoice("run", "stay"))
		{
		case "run":
			Stuff.typeln("You decide to dip.");
			Stuff.typeln("You jump suddenly to the left and they rush to snatch you.");
			Stuff.typeln("But you then dash right and they fall onto the ground.");
			Stuff.typeln("You disappear between two houses and come out in the street. It seems you're back at the crossroads.");
			Crossroads();
			break;
		case "stay":
			//i d k
			break;
		}
	}
}