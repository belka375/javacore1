package homework12_13_14;

import java.time.LocalDate;

public class SystemBlock extends Component{
    private int memory;
    private int hardDiskSize;
    private String processor;
    private String graphicCard;
    private OperatingSystem os;

    public SystemBlock(Make make, String model, LocalDate yearOfMake, Color color, int memory, int hardDiskSize, String processor, String graphicCard, OperatingSystem os){
        super(make, model, yearOfMake, color);
        this.memory = memory;
        this.processor = processor;
        this.graphicCard = graphicCard;
        this.os = os;
    }

    public int getMemory() {
        return memory;
    }

    public String getProcessor() {
        return processor;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public OperatingSystem getOs() {
        return os;
    }
}
