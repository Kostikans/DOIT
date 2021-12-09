package tmDataNew;

public class BitSet {
    String bits = "";

    BitSet(byte[] arr) {
        for (byte b : arr) {
            String s1 = String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0');
            bits = bits + s1;
        }
    }

    BitSet(byte arr) {
        bits = String.format("%8s", Integer.toBinaryString(arr & 0xFF)).replace(' ', '0');
    }

    BitSet() {
    }

    public void append(byte[] arr) {
        for (byte b : arr) {
            String s1 = String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0');
            this.bits = this.bits + s1;
        }
    }

    public void append(byte arr) {
        String s1 = String.format("%8s", Integer.toBinaryString(arr &  0xFF)).replace(' ', '0');
        this.bits = this.bits + s1;

    }

    public void append(BitSet old, int lastIndex) {
        this.bits = old.bits.substring(lastIndex) + bits;
    }

    public void addToEnd(BitSet old, int lastIndex) {
        this.bits = this.bits + old.bits.substring(lastIndex);
    }

    public void append(BitSet old) {
        this.bits = this.bits + old.bits;
    }

    public int getBits(int from, int to) {
        return Integer.parseInt(bits.substring(from, to), 2);
    }

    public long getBitsToLong(int from, int to) {
        return Long.parseLong(bits.substring(from, to), 2);
    }

    public void printBits() {
        System.out.println(this.bits);
    }

    public int size() {
        return bits.length();
    }

    public void reverse() {
        this.bits = new StringBuilder(this.bits).reverse().toString();
    }

    public int get(int index) {
        char c = bits.charAt(index);
        if (c == '1') {
            return 1;
        }
        return 0;

    }

}