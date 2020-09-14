/**
 * @title book2General / Free Product / BattleGame
 * @title 浅井長政の野望 ～姉川の戦い～
 * @content super, extends, interface, implements, Collection, Multi-Thread etc
 *
 * ◆package book2General // 以下「～」と略す
 * @class execute: BattleGame.java (this file)
 *
 * ◆package ～.corps
 * @super AbstractCorps  // corps: 軍団
 * @interface Ratable // betrayal: 利敵行為 -> rat:(俗語)裏切り者
 *
 * @class OdaCorps extends AbstractCorps
 * //織田軍団 8 division(23,000) 織田10,柴田8,明智6(8)-R(3),木下秀吉6,池田3,佐久間2-R(4),
 *                               (予備)丹羽5,安藤4
 *
 * @class TokugawaCorps extends AbstractCorps
 * //徳川軍団 3 division(6,000) 徳川7-R(1),本多10,榊原9
 *
 * @class AsakuraCorps extends AbstractCorps
 * //朝倉軍団 4 dividion (10,000) 景健2-R(4),真壁7,景紀5,景鏡4-R(7)
 *
 * @class AzaiCorps extends AbstractCorps
 * //浅井軍団 3 division(8,000) 浅井6,磯野7,宮部4-R(8)
 *
 * @class Division implements Ratable
 * //備(そなえ)= division:師団 -> 各備はDivisionのインスタンス
 * //上記 R(ratable):実装クラス, ratable:謀反係数
 *
 * ◆package ～.logic
 * @class moveLogic     //移動・位置関係
 * @class battleLogic   //戦闘計算
 * @class betrayLogic   //裏切りロジック
 * @class eventLogic    //歴史イベント 榊原側面突撃, 朝倉単独撤退
 *
 * @author Oshika
 * @date since 2020-09-14-1400 / last 2020-09-
 */
/*
【RDD 要件定義】
■下巻総合課題　提出期限：研修期間最終日の17：30まで
「総合課題２_名前」というフォルダを作成して、下記の要件を満たす自作プログラムを格納し、
　圧縮ファイル(.zip)にしてメールに添付して送信してください。

　【作法】
　＊プログラム読解を助けるための字下げ・コメント文を必ず使用すること。
　＊パッケージ、クラス、フィールド、メソッド、変数などの命名は意味のあるものにすること。

　【必須条件】
　　・自作クラスの宣言及びインスタンスを生成して利用する
　　・自作コンストラクタの利用（自動生成されるデフォルトコンストラクタのみの使用は不可）
　　・継承を行い複数のクラスを使い分ける（親＆子 または 複数のサブクラスの併用など）
　　　　＊サブクラスだけではなくスーパークラスもインスタンス生成を行って使用するという意味
　　・複数ファイル構成のプログラムにする（最低でも3ファイル以上）
　　　　＊最小構成例：スーパークラス・サブクラス・実行クラス
　　・自作のパッケージを宣言し、すべてのファイルを無名以外のパッケージに所属させる。
　　　　＊実行クラス(mainメソッドのあるクラス)に関しては無名パッケージでも可
　　・コレクションの使用

　【追加チャレンジ】
　　・自作インタフェースの宣言と実装
　　・マルチスレッドの使用

条件およびコメント等の作法が守れていないものは評価対象外となりますので注意してください。
 */

package book2General;

public class BattleGame {

    public static void main(String[] args) {


    }//main()

}//class
