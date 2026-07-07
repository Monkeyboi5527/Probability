
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

    /// Uses random to return an integer thats either a 0(heads) or a 1(tails)
    public int coinFlip(Random random) {
        return random.nextInt(0,2);
    }
    
    /// Probability formula: # of favorable outcomes/ # of total outcomes 
    public float probability(float a, float b) {
        return a/b;
    }
