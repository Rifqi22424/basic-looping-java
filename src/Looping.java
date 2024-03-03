public class Looping {
    int base;
    int start;
    int loop_count;

    public Looping(int base, int start, int loop_count) {
        this.base = base;
        this.start = start;
        this.loop_count = loop_count;
    }

    public void Loop() {
        for (int i = 0; i < this.loop_count; i++) {
            int by = start + i;
            int hasil = base * by;
            System.out.println(base + " x " + by + " = " + hasil);
        }
    }
}
