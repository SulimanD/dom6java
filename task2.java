public class Notebook {
    private String name;
    private int ram;
    private int hdd;
    private String os;
    private String colour;
    private double diagonal;

    public Notebook(String name, int ram, int hdd, String os, String colour, double diagonal) {
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.colour = colour;
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return String.format(
                "Name: %s \n RAM: %d Gb \n HDD(or SSD): %d Gb \n OS: %s \n Colour: %s \n Display size: %.1f \n",
                this.name, this.ram, this.hdd, this.os, this.colour, this.diagonal);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Notebook) {
            return this.name.equals(((Notebook) obj).name) && this.ram == ((Notebook) obj).ram
                    && this.hdd == ((Notebook) obj).hdd && this.os.equals(((Notebook) obj).os)
                    && this.colour.equals(((Notebook) obj).colour) && this.diagonal == ((Notebook) obj).diagonal;
        }
        return false;

    }

    public int getRam() {
        return this.ram;
    }

    public int getStorageCap() {
        return this.hdd;
    }

    public String getOS() {
        return this.os;
    }

    public double getDiagonal() {
        return this.diagonal;
    }

}