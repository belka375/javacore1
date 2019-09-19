package hw12;

public class Work {
    public static void main(String[] args) {

        Mouse logitechm510 = new Mouse("m510", "Logitech", 7, true);
        Mouse madCatzRAT8 = new Mouse("RAT8+", "Mad Catz", 11, false);

        Keyboard redragonK552 = new Keyboard("k552", "Redragon", 87, Collors.BLACK);
        Keyboard tartarusv2 = new Keyboard("TartarusV2", "Razer", 32, Collors.NEON_GREEN);

        Monitor asusVG245H = new Monitor("VG245H", "Asus", new int[]{1920,1080}, 75);
        Monitor samsungUE570 = new Monitor("UE570", "Samsung", new int[]{3840,2160}, 60);

        Kishki kishkiOK = new Kishki("3.2 GHz AMD R", "good", "16 GB DDR4", "1 TB HDD 7200 rpm", "NVIDIA GeForce GTX 1050 Ti", "SUPERPOWER!");
        Kishki kishkineOK = new Kishki("3.1 GHz Intel Core i3", "bad", "8 GB DDR3", "500 GB HDD 7200 rpm", "Integrated Graphics", "Littlebitpower");

        SystemBlock skyTechShadow2 = new SystemBlock("Shadow 2","Sky Tech", "Tower", Collors.RED, new Kishki[]{kishkiOK});
        SystemBlock dellOptiple = new SystemBlock("Opiplex","Dell", "Desctop", Collors.BLACK, new Kishki[]{kishkineOK});

        Computer bestPC = new Computer("Best Personal Computer",samsungUE570,skyTechShadow2,redragonK552,madCatzRAT8);
        Computer worstPC = new Computer("Worst Personal Computer",asusVG245H,dellOptiple,tartarusv2,madCatzRAT8);

        bestPC.printPC();
        worstPC.printPC();
    }
}
