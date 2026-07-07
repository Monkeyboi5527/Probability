
/// A project meant to learn how to take in data and predict what will come next
void main() {

   Random random = new Random();
   int[] flips = flipper(random, 100);
   int f = (int) Arrays.stream(flips).filter(flip -> flip == 0).count();
   System.out.println(Arrays.toString(flips));
   System.out.println(probability(f,flips.length));
   
}

    public int[] flipper(Random random, int n) {
        return IntStream.range(0, n).map(i -> coinFlip(random)).toArray();
    }

    public int coinFlip(Random random) {
        return random.nextInt(0,2);
    }
    
    public float probability(float a, float b) {
        return a/b;
    }
