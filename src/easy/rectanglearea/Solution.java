package easy.rectanglearea;

public class Solution {

  /**
   * Compute rectangle area by rectangles: [(A, B), (C, D)] and [(E, F), (G, H)]
   * bottom left corner and top right corner.
   * @param A 
   * @param B
   * @param C
   * @param D
   * @param E
   * @param F
   * @param G
   * @param H
   * @return the area
   */
  public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
    int iwidth = (C - A) + (G - E) - (Math.max(C, G) - Math.min(A, E));
    int iheight = (D - B) + (H - F) - (Math.max(D, H) - Math.min(B, F));
    int sum = (D - B) * (C - A) + (G - E) * (H - F);
    if (iwidth <= 0 || iheight <= 0) {
      return sum;
    } else {
      return sum - iwidth * iheight;
    }
  }
}
