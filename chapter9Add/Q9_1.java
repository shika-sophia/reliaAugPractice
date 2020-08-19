/**
 * @title chapter9Add / Additional Quest / Q9_1
 * @contents Array
 * @author Oshika
 * @date 2020-08-19 / 9:30-10:30
 */

/*
    String[6][2]で確保した二次元配列に以下の要素を入れて、二重for文を使って出力してください。
    for文の条件には、必ず「.length」を利用してください


    0		1
0	監督名		作品名
1	小津安二郎	東京物語
2	黒澤明		七人の侍
3	成瀬巳喜男	浮雲
4	川島雄三	幕末太陽傳
5	深作欣二	仁義なき戦い


    [実行結果]
    監督名	作品名
    小津安二郎　東京物語　
    黒澤明　七人の侍　
    成瀬巳喜男　浮雲　
    川島雄三　幕末太陽傳　
    深作欣二　仁義なき戦い　
*/
package chapter9Add;

public class Q9_1 {
  public static void main(String[] args) {
      String[][] movie = {
        {"監督名","作品名"},
        {"小津安二郎","東京物語"},
        {"黒澤 明","七人の侍"},
        {"成瀬巳喜男","浮雲"},
        {"川島雄三","幕末太陽傳"},
        {"深作欣二","仁義なき戦い"},
      };

      for (int i = 0; i < movie.length; i++) {
          for (int j = 0; j < movie[i].length; j++) {
              System.out.print(movie[i][j] + "  ");
          }//for j
          System.out.println();

      }//for i
  }//main()

}//class
/*
//====== Result ======
監督名  作品名
小津安二郎  東京物語
黒澤 明  七人の侍
成瀬巳喜男  浮雲
川島雄三  幕末太陽傳
深作欣二  仁義なき戦い

*/