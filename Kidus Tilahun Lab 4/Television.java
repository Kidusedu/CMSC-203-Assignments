package Television;

public class Television
{
    final String manufacturer;
    final int screen_size;
    boolean powerOn;
    int channel;
    int volume;

    public Television(String brand, int size)
    {

        manufacturer = brand;
       screen_size = size;
        powerOn = false;
        volume = 20;
        channel = 2;


    }
    public void setChannel(int station) { channel = station; }

    public int getVolume() { return volume; }

    public int getChannel() { return channel; }

    public String getManufacturer() { return manufacturer; }

    public int getScreenSize () { return screen_size;}

    public void power ()
    {
        if (powerOn)
            if (!powerOn==false)
            {
                powerOn=true;
            }

        powerOn=!powerOn;
    }


    public void increaseVolume ()
    {
       volume+=1;
    }

    public void decreaseVolume ()
    {
        volume-=1;
    }
}
