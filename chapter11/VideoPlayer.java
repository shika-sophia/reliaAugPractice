/**
 * @title chapter11 / Additional Quest / Q11_2 -> new VideoPlayer
 * @see VideoCounter
 * @author Oshika
 * @date 2020-08-25 / 1030-1400
 */
package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class VideoPlayer {

    public static void main(String[] args) {
        //---- video decision ----
        VideoCounter video = choseVideo();

        //String title = "七人の侍";
        //String id = "KUROSAWA-1954";
        //double wholeTime = 207.0d;

        //---- instance of VideoCounter ----
        //同時にコンストラクター経由でフィールドにセット
        //VideoCounter video = new VideoCounter(title, id, wholeTime);

        //---- initial set useTime, restTime ----
        double useTime = 0d;
        video.setUseTime(useTime);
        video.setRestTime(useTime);

        //---- print videoInfo ----
        printVideo(video);

        //---- 早送り ----
        feedFoward(video);
        printVideo(video);

        //---- 巻き戻し ----
        revese(video);
        printVideo(video);

    }//main()

    private static VideoCounter choseVideo() {
        //---- video List ----
        List<String> titleList = new ArrayList<>(
            Arrays.asList("七人の侍","風と共に去りぬ","ローマの休日","独裁者"));
        List<String> idList = new ArrayList<>(
                Arrays.asList("KUROSAWA-1954","MARGALET-1936","HEPBIRN-1965","CHAPLIN-1941"));
        List<Double> wholeTimeList = new ArrayList<>(
                Arrays.asList(207d, 356d, 72d, 124d));

        //---- choice video ----
        Random random = new Random();
        int choice = random.nextInt(titleList.size());

        //コンストラクター経由でフィールドにセット
        VideoCounter video = new VideoCounter(
            titleList.get(choice), idList.get(choice), wholeTimeList.get(choice));

        return video;
    }//choseVideo()


    private static void printVideo(VideoCounter video) {
        StringBuilder builder = new StringBuilder();
          builder.append(String.format("タイトル: %s \n", video.getTitle()));
          builder.append(String.format("商品番号: %s \n", video.getId()));
          builder.append(String.format("収録時間: %5.1f 分 \n", video.getWholeTime()));
          builder.append(String.format("現在時間: %5.1f 分 \n", video.getUseTime()));
          builder.append(String.format("残り時間: %5.1f 分 \n", video.getRestTime()));

        String videoInfo = builder.toString();
        System.out.println(videoInfo);
    }//printVideo()

    private static void feedFoward(VideoCounter video) {
        double wholeTime = video.getWholeTime();
        double useTime = video.getUseTime();

        Random random = new Random();
        double feedTime = random.nextDouble() * (wholeTime - useTime);

        System.out.printf("%.1f分 早送りします。\n\n", feedTime);

        video.setUseTime(useTime + feedTime);
        video.setRestTime(useTime + feedTime);

    }//feedFoward()


    private static void revese(VideoCounter video) {
        video.setUseTime(0);
        video.setRestTime(0);
        System.out.println("返却用に最初まで巻き戻します。\n");
    }//reverse()

}//class

/*
//====== Result ======
タイトル: 七人の侍
商品番号: KUROSAWA-1954
収録時間: 207.0 分
現在時間:   0.0 分
残り時間: 207.0 分

57.6分 早送りします。

タイトル: 七人の侍
商品番号: KUROSAWA-1954
収録時間: 207.0 分
現在時間:  57.6 分
残り時間: 149.4 分

返却用に最初まで巻き戻します。

タイトル: 七人の侍
商品番号: KUROSAWA-1954
収録時間: 207.0 分
現在時間:   0.0 分
残り時間: 207.0 分

----

タイトル: 風と共に去りぬ
商品番号: MARGALET-1936
収録時間: 356.0 分
現在時間:   0.0 分
残り時間: 356.0 分

200.3分 早送りします。

タイトル: 風と共に去りぬ
商品番号: MARGALET-1936
収録時間: 356.0 分
現在時間: 200.3 分
残り時間: 155.7 分

返却用に最初まで巻き戻します。

タイトル: 風と共に去りぬ
商品番号: MARGALET-1936
収録時間: 356.0 分
現在時間:   0.0 分
残り時間: 356.0 分

【考察】
今回は ちゃんとgetter, setter, フィールド, コンストラクターを使えた。
Listは choseVideo()内のローカルでしか使ってない。
あとは一度やったvideoインスタンスをたらい回しにして
フィールドにsetして他でフィールドからget。
なんか、こっちのが気持ちいい。

私の映画のチョイスに年代を感じる・・いやそんな歳じゃないです。
古典の名作だからね。ちなみに七人の侍は大好きです。
 */
