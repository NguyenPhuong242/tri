public class Tribull {
    public static void tri_bulle(Suite suite) {
      for (int i = suite.size() - 1; i > 0; i--) {
        for (int j = 0; j < i; j++) {
          if (suite.get(j) > suite.get(j+1)) {
            suite.permute(j, j+1);
          }
        }
      }
    }
  }

    


