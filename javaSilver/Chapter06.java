/**
 * @title javaSilver / Chapter06 / 第６章 インスタンスとメソッド
 * @content class, 参照型, ガベージコレクション, static,
 *           メソッド, オーバーロード, 可変長引数, return, コンストラクター,
 *           アクセス修飾子, カプセル化, 値渡しと参照渡し
 *
 * @see 志賀澄人『徹底攻略 Java SE11 Silver 問題集[1ZO-815]』(黒本),インプレス, 2019
 * @date 2020-09- /
 * @correctRate ① 16 / 30 = 53.3％
 */
/* 〇1. B 10
 * ×2. D 「banana, 200」=> 〇B
 * ×3. A Object obj = null; => 〇F
 * 〇4. B 4行目だけ
 * ×5. D Main3行目でコンパイルエラー => 〇C
 * 6. 〇D, ×F => 〇E
 * 〇7. E sample.hello()
 * 〇8. D コンパイルエラー => main:4 add(a, b)に add(a)しか入っていない
 * 〇9. A, B
 * 〇10. E void sample(){ }
 * 〇11. A Main: 4でコンパイルエラー => setValue(value)はvoid
 * 〇12. B float, C double
 * 〇13. C 問8と同じ理由
 * ×14. B int... => 〇G
 * ×15. A コンパイルエラー Sample.method: 3 : voidにreturn文は不可 => 〇C
 * 〇16. B, D
 * 〇17. A 4行目コンパイルエラー
 * 〇18. E すべて誤り
 * ×19. A publicなコンストラクタのみ =>〇 D
 * ×20. D Mainでコンパイルエラー => 〇 A
 * 〇21. B 「B」「A」
 * ×22. D コンパイルエラー Sampleクラスの要インスタンス => 〇 A
 * ×23. A 「A」=> 〇 D
 * ×24. A Sample(null, 0) => 〇 B
 * ×25. A 「A」「B」 => 〇 E
 * ×26. B 10 => 〇 D
 * ×27. B 「xxx-x-xxxxxx-xx-x」 => 〇 C
 * 〇28. D
 * 〇29. A 10
 * 〇30. B 20
 */
package javaSilver;

public class Chapter06 {

    public static void main(String[] args) {

    }

}
