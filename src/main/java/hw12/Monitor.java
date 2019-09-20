package hw12;

public class Monitor {
    private int size;
    private MonitorType monitorType;
    private MonitorPorts monitorPorts;

    public Monitor(int size, MonitorType monitorType, MonitorPorts monitorPorts){
        this.size=size;
        this.monitorType=monitorType;
        this.monitorPorts=monitorPorts;
    }

    public int getSize() {
        return size;
    }

    public MonitorType getMonitorType() {
        return monitorType;
    }

    public MonitorPorts getMonitorPorts() {
        return monitorPorts;
    }
    public void printMonitorInfo(){
        System.out.println("Monitor size in inches="+size+"\nMonitor type: "+monitorType+"\nMonitor ports: "+monitorPorts);
    }
}
