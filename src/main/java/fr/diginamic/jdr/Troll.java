package fr.diginamic.jdr;

public class Troll extends Monstre{
	
	int vieMax = 30;
	int vieMin = 20;
	
	int forceMax = 15;
	int forceMin = 10;
	
	int valScore = 5;

	public Troll(){
		force = AleatoireStats.Rand(forceMin, forceMax);
		pointsDeVie = AleatoireStats.Rand(vieMin, vieMax);
		score = valScore;
		nomMonstre = "Troll";
	}



	public String affichageMonstre() {
		// TODO Auto-generated method stub
		return "         ,     .\r\n" + 
				"        /(     )\\               A\r\n" + 
				"   .--.( `.___.' ).--.         /_\\\r\n" + 
				"   `._ `%_&%#%$_ ' _.'     /| <___> |\\\r\n" + 
				"      `|(@\\*%%/@)|'       / (  |L|  ) \\\r\n" + 
				"       |  |%%#|  |       J d8bo|=|od8b L\r\n" + 
				"        \\ \\$#%/ /        | 8888|=|8888 |\r\n" + 
				"        |\\|%%#|/|        J Y8P\"|=|\"Y8P F\r\n" + 
				"        | (.\".)%|         \\ (  |L|  ) /\r\n" + 
				"    ___.'  `-'  `.___      \\|  |L|  |/\r\n" + 
				"  .'#*#`-       -'$#*`.       / )|\r\n" + 
				" /#%^#%*_ *%^%_  #  %$%\\    .J (__)\r\n" + 
				" #&  . %%%#% ###%*.   *%\\.-'&# (__)\r\n" + 
				" %*  J %.%#_|_#$.\\J* \\ %'#%*^  (__)\r\n" + 
				" *#% J %$%%#|#$#$ J\\%   *   .--|(_)\r\n" + 
				" |%  J\\ `%%#|#%%' / `.   _.'   |L|\r\n" + 
				" |#$%||` %%%$### '|   `-'      |L|\r\n" + 
				" (#%%||` #$#$%%% '|            |L|\r\n" + 
				" | ##||  $%%.%$%  |            |L|\r\n" + 
				" |$%^||   $%#$%   |  VK/cf     |L|\r\n" + 
				" |&^ ||  #%#$%#%  |            |L|\r\n" + 
				" |#$*|| #$%$$#%%$ |\\           |L|\r\n" + 
				" ||||||  %%(@)$#  |\\\\          |L|\r\n" + 
				" `|||||  #$$|%#%  | L|         |L|\r\n" + 
				"      |  #$%|$%%  | ||l        |L|\r\n" + 
				"      |  ##$H$%%  | |\\\\        |L|\r\n" + 
				"      |  #%%H%##  | |\\\\|       |L|\r\n" + 
				"      |  ##% $%#  | Y|||       |L|\r\n" + 
				"      J $$#* *%#% L  |E/\r\n" + 
				"      (__ $F J$ __)  F/\r\n" + 
				"      J#%$ | |%%#%L\r\n" + 
				"      |$$%#& & %%#|\r\n" + 
				"      J##$ J % %%$F\r\n" + 
				"       %$# * * %#&\r\n" + 
				"       %#$ | |%#$%\r\n" + 
				"       *#$%| | #$*\r\n" + 
				"      /$#' ) ( `%%\\\r\n" + 
				"     /#$# /   \\ %$%\\\r\n" + 
				"    ooooO'     `Ooooo";
	}

}
