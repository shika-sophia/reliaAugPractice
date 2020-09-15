
■タイトル: BattleGame「浅井長政の野望 ～姉川の戦い～」
@author Oshika
@date since: 2020-09-14-1400 / last update: 2020-09-29

■概要
「BattleGame」と言いつつ、今回はプレイヤーの関与する場面はないです。
まずは戦闘シミュレーションを作って、ゲーム化するのは更に先になります。

「戦闘経過をリアルに再現できるか」というＡＩを作っている感じです。
なので戦闘の様子を、ただ じっと見守っている感じの"ゲーム"です。


■【RDD 要件定義】
◆下巻総合課題  提出期限：研修期間最終日の17:30まで
    「総合課題２_名前」というフォルダを作成して、下記の要件を満たす自作プログラムを格納し、
    圧縮ファイル(.zip)にしてメールに添付して送信してください。

＊作法
    ・プログラム読解を助けるための字下げ・コメント文を必ず使用すること。
    ・パッケージ、クラス、フィールド、メソッド、変数などの命名は意味のあるものにすること。

＊必須条件
    ・自作クラスの宣言及びインスタンスを生成して利用する
    ・自作コンストラクタの利用（自動生成されるデフォルトコンストラクタのみの使用は不可）
    ・継承を行い複数のクラスを使い分ける（親＆子 または 複数のサブクラスの併用など）
        -> サブクラスだけではなくスーパークラスもインスタンス生成を行って使用するという意味
    ・複数ファイル構成のプログラムにする（最低でも3ファイル以上）
        -> 最小構成例：スーパークラス・サブクラス・実行クラス
    ・自作のパッケージを宣言し、すべてのファイルを無名以外のパッケージに所属させる。
        -> 実行クラス(mainメソッドのあるクラス)に関しては無名パッケージでも可
    ・コレクションの使用

＊追加チャレンジ
    ・自作インタフェースの宣言と実装
    ・マルチスレッドの使用

条件およびコメント等の作法が守れていないものは評価対象外となりますので注意してください。


■【クラス設計】
◆[Control, View] package book2General // 以下「～」と略す
@execute class: BattleGame.java / main()


◆[DataBase] package ～.corps
@super AbstractCorps  // corps: 軍団
@super Division       // division:師団 -> 戦国風に言うと「備(そなえ)」
@interface Eventable
    //(オプション) まずは普通の軍団編成と戦闘計算ができてから考える。
    //イベント発生する特殊クラスに実装 [榊原,景健,(←まずは２つ。他候補は 丹羽, 宮部)]

@class OdaCorps extends AbstractCorps
    //織田軍団 9 division(23,000) / ◎織田10, 〇柴田8, 明智8, 木下秀吉6, 池田3, 佐久間2,
                                   (予備 〇丹羽5ev, 安藤4, 氏家5)

@class TokugawaCorps extends AbstractCorps
    //徳川軍団 4 division(6,000) / ◎徳川7, 〇本多10, 〇榊原9ev, 酒井6

@class AsakuraCorps extends AbstractCorps
    //朝倉軍団 5 dividion (10,000) / ◎景健2ev, 〇景紀3, 真壁7, 前波6, 景鏡4

@class AzaiCorps extends AbstractCorps
    //浅井軍団 4 division(8,000) / ◎浅井6, 〇磯野7, 阿閉(あつじ)5, 宮部4ev

@class Division
    //将の名前のついた部隊のこと。このゲームでは「備(そなえ)」と呼ぶ。
    //各備はDivisionクラスのインスタンス。
    //フィールドは以下の通り。
    //---- General Parameter ----
    private String belong;    //所属軍団
    private final String name;//侍大将の名前
    private int general;      //侍大将の戦闘力 0～100

    //---- Division Parameter ----
    private int power;        //兵力 0～5000
    private int moral;        //士気 0～1000
//  private String direction; //正面方向 (HEX移動機能のときに利用)
    private int energy;       //活性 -1000 ～ +1000
    private String condition;
    //状態 excite(興奮),normal(通常), confuse(混乱), chaos(大混乱), escape(潰走)


@class DivisionXxxxx extends Division implements Eventable
    //(オプション) まずは普通の軍団編成と戦闘計算ができてから考える。
    //イベントが発生する可能性のある特殊なDivisionで、クラスとして独自に定義。
    //Xxxxx: 各将の名前が入る。例 DivisionSakakibara (榊原)


◆[Logical, Calculate] package ～.logic
@class formationLogic
    //移動はせず固定陣形。両軍を当てて前線から戦闘計算。

@class battleLogic
    //戦闘計算 浅井 vs 織田
               朝倉 vs 徳川
      マルチスレッドは上下の戦闘の両方で戦況が刻々と変化する表示に利用。

@class eventLogic
    //(オプション) まずは普通の軍団編成と戦闘計算ができてから考える。
    //イベント発生判定 榊原側面突撃, 朝倉潰走or撤退


◆[資料] package ～.reference
・ReadMe: 要件定義, クラス設計, 歴史背景など 〔= This File〕
・images: 画像資料, 陣形図, 地図



■制作日誌
◆初日 2020-09-14
・クラス設計
・package作成

◆２日目 2020-09-15
・設計見直し。
    ・HEX移動方式の廃止。-> 固定陣形・固定対戦方式にする。
    ・Ratable(寝返り)インターフェイスの廃止。
    ・Eventableインターフェイス設置。(未記入)
・Divisionクラス作成
・AzaiCorpsクラスを作成 -> Divisionクラスのインスタンスを格納するListを作成。
・それに合わせて AbstractCorpsを修正。
・「ReadMe.txt」を作成。「BattleGame.java」の java_docsを分離して ReadMeへ転記。

・【考察】
super, 抽象クラスをあまりうまく使えていない。
具体的な子クラスに合わせて抽象クラスのほうを書き換えているし、あまり役に立っていない。
フィールドもインスタンスするからsuperより子クラスに置いておいたほうが使いやすいし・・。

オプションにしたイベント実装DivisionXxxxとなったら、親のDivisionからフィールド引き継いで
継承の意味は出てくると思う。てか、オプションしないと要件定義を満たせないから、ここまではやろう。

でも２日目で、だいぶ概要ができてきた。
当初は HEX(六角形のマス)の移動方式を考えていたけど、
戦闘には正面方向や包囲・隣接状況がとても影響するので大事な要素なのだが、
これは いずれやることにして、まずは戦闘計算ＡＩを作ってみよう。


