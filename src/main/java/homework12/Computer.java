package homework12;


    public class Computer {

        private Monitor monitor;
        private Keyboard keyboard;
        private Mouse mouse;
        private SystemBlock sb;

        public Computer(Keyboard keyboard, Mouse mouse, SystemBlock sb, Monitor monitor) {

           this.monitor=monitor;
            this.keyboard = keyboard;
            this.mouse = mouse;
            this.sb = sb;
        }

        public Monitor getMonitor() {
            return monitor;
        }


        public Keyboard getKeyboard() {
            return keyboard;
        }

        public Mouse getMouse() {
            return mouse;
        }

        public SystemBlock getSb() {
            return sb;
        }


        public void printComputerInfo() {
            sb.printSystemBlockInfo();
            keyboard.printKeyboardInfo();
            mouse.printMouseInfo();
            monitor.printMonitor();
            }
        }












