public class ArgsLineCommand { 
    public static void main(String[] args) {
            if(args.length == 0) {
                System.out.println("Hello and Welcome to games help, please if you are asking to 'fifa', 'uncharted' please write in command line the option!");
            }
            if(args[0].equalsIgnoreCase("fifa")){
                int year = Integer.parseInt(args[1]);
                    if (year == 2022){
                        System.out.println("Featuring new customization options to make your club stand out in the stands and on the pitch, a new player growth system to develop your Virtual JP, and streamlined social gameplay");
                        }
                    if(year == 2021){
                        System.out.println("The pacing is too slow, sometimes it hurts to play with players that take so long to respond to controls. Nothing needs to be said about the graphics, 2021 and they still look like plasticine players. Licenses became the only thing that matters to EA.");
                    }


            }

            if(args[0].equalsIgnoreCase("uncharted")){
                int num = Integer.parseInt(args[1]);
                    if (num == 1){
                        System.out.println("Nathan Drake is a bounty hunter who has just found something he has been searching for years: the coffin of his ancestor Sir Francis Drake. He is accompanied by the journalist Elena Fisher, who has decided to record a documentary of the expedition");
                    }
                    else if(num == 2){
                        System.out.println("Set two years after the events of \"Drake's Fortune,\" \"The Kingdom of Thieves\" follows Nathan Drake and Chloe Frazer as they search for the entrance to the lost city of Shambhala and the legendary Cintamani Stone in a race against Serbian war criminal Zoran Lazarević");
                    }
                    else if(num == 3){
                        System.out.println("The story centers around Nathan Drake and his mentor Victor Sullivan who travel the world in search of a legendary lost city that will ultimately lead them to the Arabian Peninsula and the vast Rub al-Khali desert.");
                    }
                    else if(num == 4) {
                        System.out.println("In the midst of a storm, Nathan Drake drives a speedboat out to sea with his brother, Samuel Drake, while being chased by a group of mercenaries. But his attempts to escape are in vain and his launch is shot down by a ship.");
                    }else {
                        System.out.println("Please select the number of the uncharted game");
                    }
            }

        }
}

