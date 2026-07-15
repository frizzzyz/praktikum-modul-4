package modul4.poli;

public class NonPlayableChar extends Character {
    public NonPlayableChar(Character ch) {
        this.name = ch.name;
    }
    @Override
    public void doWork() {
        System.out.println("NonPlayableChar " + this.name + " is doing nothing.");
    }
}
//Maulana Ilham Al Amin
//25515040711109