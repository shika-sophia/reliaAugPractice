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
 *          intよりも doubleの範囲が広いため暗黙の型変換される。
 *          条件を満たすメソッドは２つあるためコンパイルエラー。
 *
 * 〇18. E すべて誤り
 * ×19. A publicなコンストラクタのみ =>〇 D
 *        コンストラクタにアクセス修飾子の制限はない。
 *
 * ×20. D Mainでコンパイルエラー => 〇 A
 *        コンストラクタは戻り値を記述できない。voidも不可。
 *        記述してある場合はクラス名と同じ名前の一般メソッドと解釈される。
 *
 * 〇21. B 「B」「A」
 * ×22. D コンパイルエラー Sampleクラスの要インスタンス => 〇 A
 *        staticフィールド: インスタンスしなくても使える。
 *        初期化子, コンストラクタ
 *          -> 初期化子、コンストラクタでインスタンス生成前に初期化することはできない。
 *          -> 初期化されるのはインスタンス生成時
 *
 *        static初期化子 -> インスタンス生成しなくても初期化
 *
 * ×23. A 「A」=> 〇 D
 * ◆デフォルトコンストラクタ
 * ・コンストラクタの定義を省略して、ひとつも定義しなかった場合に、
 *     コンパイラによって引数なし・処理なしのコンストラクタが暗黙的に追加される。
 * ・コンストラクタをひとつでも記述した場合は、デフォルトコンストラクタは追加されない。
 *
 * ×24. A Sample(null, 0) => 〇 B
 * ◆this(～)
 * ・コンストラクタ中から、別のコンストラクタを呼び出す
 * ・コンストラクタ中の最初に記述しないといけない。(コンパイルエラー)
 *
 * ◆this ２つの用法
 * ・現在のインスタンスそのものの参照を入れる特別な変数
 * ・コンストラクタ内から、オーバーロードされている別のコンストラクタ呼び出し
 *
 * ×25. A 「A」「B」 => 〇 E
 *         上記
 *
 * ×26. B 10 => 〇 D
 *         => Parent.numにはアクセス修飾子がない => パッケージprivate
 *         => 継承関係があっても、別パッケージから参照不可
 *
 * ×27. B 「xxx-x-xxxxxx-xx-x」 => 〇 C
 * ◆UMLクラス図における可視性の記号
 * ・public: +
 * ・protected: #
 * ・(なし): ~
 * ・private: -
 *
 *            => ex27.StoryBookインスタンスが継承によって引き継いだ特徴は
 *            other.Bookクラスで定義されたもの。
 *            printInfo()のprotectedは「otherパッケージか継承関係」の意
 *            ex27.Main.main()からのprintInfo()呼び出しは当てはまらない。
 *
 * 〇28. D
 * 〇29. A 10
 *         => modify(s.num)に渡される引数はフィールドそのもではなく、値をコピーして渡す。
 *         => プリミティブ型(基本型)の変数を渡すときは、いつも値をコピー
 *
 *
 * 〇30. B 20
 *         =>オブジェクト型(参照型)の変数が保持するのはオブジェクトそのものではなく
 *         インスタンスへの参照(リンク情報)。
 *         => 引数にオブジェクト型を渡すと、その参照をコピーして渡す。
 *         値としては異なるが、参照先にあるインスタンスは同じ。
 */

package javaSilver;

public class Chapter06 {

    public static void main(String[] args) {

    }

}
