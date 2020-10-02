/**
 * @title javaSilver / Chapter06 / 第６章 インスタンスとメソッド
 * @content class, 参照型, ガベージコレクション, static,
 *           メソッド, オーバーロード, 可変長引数, return, コンストラクター,
 *           アクセス修飾子, カプセル化, 値渡しと参照渡し
 *
 * @see 志賀澄人『徹底攻略 Java SE11 Silver 問題集[1ZO-815]』(黒本),インプレス, 2019
 * @date 2020-09-20 / 2020-09-30
 * @correctRate ① 16 / 30 = 53.3％
 */
/* 〇1. B 10
 * ×2. D 「banana, 200」=> 〇B「banana, 100」
 * ×3. A Object obj = null; => 〇F
 *         obj = null;で参照なしのオブジェクトを生成可。printlnで「null」を表示。
 *         題意「NULL」は解なし。リテラルNULLは不可。
 *         ""は文字数0のStringオブジェクトを生成する。
 *
 * 〇4. B 4行目だけ
 *
 * ×5. D Main3行目でコンパイルエラー => 〇C
 *     static領域: static
 *     ヒープ領域: それ以外のインスタンス
 *
 *     staticなフィールドはインスタンスを作らなくても使える
 *
 * 6. 〇D, ×F => 〇E
 *     staticでないメソッドからは、staticなメンバにアクセス可能。
 *
 * 〇7. E sample.hello()
 * 〇8. D コンパイルエラー => main:4 add(a, b)に add(a)しか入っていない
 * 〇9. A, B
 * 〇10. E void sample(){ }
 * 〇11. A Main: 4でコンパイルエラー => setValue(value)はvoid
 *        戻り値をreturnするメソッドを呼び出す際、必ずしも戻り値を代入する式を記述しなくても良い。
 *
 * 〇12. B float, C double
 * 〇13. C 問8と同じ理由
 *         たくさんの引数をわたさなければいけない場合、それらの引数をフィールドに持つオブジェクト１つを
 *         引数に渡すほうが、簡潔で変更にも強くなる
 *
 * ×14. B int... => 〇G
 *         可変長引数の宣言は、最終項にひとつだけ、同一型のみデータ型に「...」を付与。
 *         コンパイラにより配列に置換。可変長引数の値をメソッド内で扱うときは[]を用う。
 *
 * ×15. A コンパイルエラー Sample.method: 3 : voidにreturn文は不可 => 〇C
 *        ◆return ・値を戻す
 *                 ・制御を呼び出し元に返す(void内にも記述可)
 *
 *        到達不能コードがある場合はコンパイルエラー
 *
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
