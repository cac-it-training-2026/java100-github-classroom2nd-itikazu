/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		int sit = 30;
		int syo = 30;
		int pis = 30;

		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		System.out.println("本日のおすすめ商品です。");

		System.out.println("シトロン　\\250・・・残り" + sit + "個");
		System.out.println("ショコラ　\\280・・・残り" + syo + "個");
		System.out.println("ピスタージュ　\\320・・・残り" + pis + "個");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("それぞれ何個ずつ買いますか？（最大30個まで）");

		System.out.print("シトロン      >");
		String citronBuyCountStr = br.readLine();
		double citronBuyCount = Double.parseDouble(citronBuyCountStr);

		System.out.print("ショコラ      >");
		String chocolatBuyCountStr = br.readLine();
		double chocolatBuyCount = Double.parseDouble(chocolatBuyCountStr);

		System.out.print("ピスターシュ  >");
		String pistacheBuyCountStr = br.readLine();
		double pistacheBuyCount = Double.parseDouble(pistacheBuyCountStr);

		System.out.println("シトロン     " + citronBuyCount + "個");
		System.out.println("ショコラ     " + chocolatBuyCount + "個");
		System.out.println("ピスターシュ " + pistacheBuyCount + "個");

		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");

		double total = citronBuyCount + chocolatBuyCount + pistacheBuyCount;
		int sum = (int) ((250 * citronBuyCount) + (280 * chocolatBuyCount) + (320 * pistacheBuyCount));

		System.out.println("合計個数　　" + total + "個");
		System.out.println("合計金額　　" + sum + "円");
		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");

		System.out.println("本日のおすすめ商品です。");

		System.out.println("シトロン　\\250・・・残り" + (int) (sit - citronBuyCount) + "個");
		System.out.println("ショコラ　\\280・・・残り" + (int) (syo - chocolatBuyCount) + "個");
		System.out.println("ピスタージュ　\\320・・・残り" + (int) (pis - pistacheBuyCount) + "個");

	}

}
