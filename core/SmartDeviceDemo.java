public class SmartDeviceDemo {
    interface Camera {
        void takePhoto();
    }

    interface MusicPlayer {
        void playMusic();
    }

    static class SmartPhone implements Camera, MusicPlayer {
        String phoneModel;

        SmartPhone(String phoneModel) {
            this.phoneModel = phoneModel;
        }

        @Override
        public void takePhoto() {
            System.out.println(phoneModel + " : Camera clicked! Captured 108MP high-resolution photo.");
        }

        @Override
        public void playMusic() {
            System.out.println(phoneModel + " : Music Player active! Playing track in Dolby Atmos audio.");
        }

        public void displayInfo() {
            System.out.println("Device Model : " + phoneModel);
        }
    }

    public static void main(String[] args) {
        System.out.println("================ Demonstration of Multiple Inheritance Using Interface ================");
        
        SmartPhone myPhone = new SmartPhone("Apple iPhone 15 Pro");
        myPhone.displayInfo();
        System.out.println("----------------------------------------------------------------------------------");

        System.out.println("Calling Camera functionality:");
        myPhone.takePhoto();

        System.out.println("\nCalling MusicPlayer functionality:");
        myPhone.playMusic();
        System.out.println("==================================================================================");
    }
}
