package homeWork14;

public class Work {
    public static void main(String[] args) {
        System.out.println("#1");
        Storage storage=new Storage("32GB DDR4", "512GB SSD", "2TB HDD", "GeForce RTX 2080 8GB");
        Monitor monitor=new Monitor("ASUS", "ProArt PA32UCX ", Color.SILVER, 32, 6, 3, "4K");
        String[] ports=new String[]{"1 x Mic in / Headphone out", "2x USB3.1", "1x HDMI", "2x USB Type-C"};
        SystemBlock systemBlock=new SystemBlock("ASUS", "ROG Strix GL12CX-DH981 Gaming Desktop", Color.BLACK, 37, 24.3,
                1, "Windows Pro 10 (64bit)", " Intel Core i9-9900K", ports, storage);
        String keyboard=new String("ROG Strix Flare K/B");
        String mouse= new String("ROG Gladius II Mouse");

        PC asus= new PC(systemBlock, monitor, keyboard, mouse);

        asus.printPC();

        System.out.println(" -------------------------------------------------------------------------------------------------------------------------" +"\n#2");

        String gpu= asus.getSystemBlock().getStorage().getGpu();
        System.out.println(gpu);

        String hdd= asus.getSystemBlock().getStorage().getStorage_hdd();
        System.out.println("Storage- " + hdd);




    }
}
