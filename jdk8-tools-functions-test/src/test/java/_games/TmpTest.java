package _games;

//import java.common.util.ArrayList;

import java.util.Scanner;
//import java.common.util.*;
//import java.math.*;
import java.io.*;

public class TmpTest {


    public static void main(String[] args) {
//		int[] color ={1,2,3,4};
//		int[] cards={1,2,3,4,5,6,7,8,9,10,11,12,13};
//		int cnt=0;
//		int cnt1=0;
//		for (int i = 0; i < cards.length; i++) {//第一张牌
//            for (int color1 = 0; color1 < 4; color1++) {//第一张牌的花色
//                for (int j = 0; j < cards.length; j++) {//第二张牌
//                    for (int color2 = 0; color2 < 4; color2++) {//第二张牌的花色
//                        for (int k = 0; k < cards.length; k++) {//第三张牌
//                            for(int color3 = 0; color3 < 4; color3++) {//第三张牌的花色
//                                for (int l = 0; l < cards.length; l++) {//第四章牌
//                                    for(int color4 = 0; color4 < 4; color4++) {//第四章牌的花色
//
//                                        if(color1 == color2 && i==j){
//                                            continue;
//                                        }else if(color1 == color3 && i==k){
//                                            continue;
//                                        }else if(color1 == color4 && i==l){
//                                            continue;
//                                        }else if(color2 == color3 && j==k){
//                                            continue;
//                                        }else if(color2 == color4 && j==l){
//                                            continue;
//                                        }else if(color3 == color4 && k==l){
//                                            continue;
//                                        }
//                                        if (cards[i] + cards[j] + cards[k] + cards[l] == 24) {
//                                            cnt++;
//                                        }//计算出和为24的次数
//                                        if (cards[i] + cards[j] + cards[k] + cards[l] == 52) {
//                                            cnt1++;
//                                        }//计算出重复的次数
//                                    }
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
//		System.out.print("得到和为24的选牌次数为"+cnt/cnt1);


//		Scanner keyboard = new Scanner(System.in);
//        int x[] = {1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,7,
//        		8,8,8,8,9,9,9,9,10,10,10,10,11,11,11,11,12,12,12,12,13,13,13,13};
//        int times = 0;
//        for(int i = 0; i < x.length; ++i)
//            for(int j = i + 1; j < x.length; ++j)
//                for(int k = j + 1; k < x.length; ++k)
//                    for(int l = k + 1; l < x.length; ++l)
//                        if(x[i] + x[j] + x[k] + x[l] == 24)
//                            times++;
//        System.out.println(times);
//        keyboard.close();

//		int[] cards = new int[52];
//
//		int count = 0;
//
//		for(int i = 0; i < 52; i++)
//			cards[i] = i;

//		//取四张牌，假设牌的顺序是固定的
//		//每次取完一张牌，下一张牌将从它的后面的牌中去，防止重复的情况发生
//		for(int i = 0; i <= 48; i++) { // 取第一张牌
//			for(int j = i + 1; j <= 49; j++) { // 取第二张牌
//				for(int m = j + 1; m <= 50; m++) { // 去第三张牌
//					for(int n = m + 1; n <= 51; n++) { // 取第四张牌
//						if((cards[i] % 13 + 1) + (cards[j] % 13 + 1)
//								+ (cards[m] % 13 + 1) + (cards[n] % 13 + 1) == 24)
//							count++;
//					}
//				}
//			}
//		}
//
//		System.out.println(count);

//		int [] array=new int[13];
//		int flag1=0,flag2=0,flag3=0,flag4=0,flag5=0,flag6=0,temp1=0,temp2=0;
//		int t1=0;
//		double flag;
//		double temp;
//		for(int i=0;i<13;i++){
//			array[i]=i;
//		}
//		/*先计算4个数字都不同的情况*/
//		for(int i=1;i<=4;i++){
//			temp=(24-i)/3;
//			if(temp%1==0){
//				temp=(int)temp+2;
//			}
//			else{
//				temp=temp+1;
//			}
//			while(temp<(24-i-(i+1)*2)&&temp<=13){
//			flag=((24-(i+temp))/2);
//			if(temp-flag>flag-i){
//				flag1=flag1+(int)(flag)-i-1;
//			}
//			else{
//				flag1=flag1+(int)temp-(int)(flag);
//			}
//			temp++;
//			t1++;
//			}/*根据i的取值来限定4个数中的上界。然后判断并实施加法*/
//			/*4个花色*/
//			t1++;
//		}
//		/*计算只有2个数字相同的情况*/
//		for(int i=1;i<=10;i++){
//			temp1=24-2*i;
//			temp1=temp1/2;
//			if(24-2*i>13){
//				if(2*temp1-i>temp1&&2*temp1-i<13){
//					flag2=flag2+13-temp1-1;
//				}
//				else{
//					flag2=flag2+13-temp1;
//				}
//			}
//			if(24-2*i<13){
//				temp2=24-2*i-1;
//				flag2+=(temp2-temp1);
//			}
//			t1++;
//		}
//			flag2=flag2-1;/*因为在循环中有一次是7755这是不符合的所以要去掉*/
//			/*计算有3个数字相同的情况*/
//			for(int i=4;i<=7;i++)
//				for(int j=1;j<13;j++){
//					if(3*i+j==24&&i!=6){
//						flag3++;
//						t1++;
//					}
//				}
//			/*计算有2对数字相同*/
//			for(int i=1;i<6;i++)
//				for(int j=1;j<13;j++){
//					if(2*i+2*j==24&&i!=6){
//						flag4++;
//						t1++;
//					}
//				}
//			/*4个数字相同*/
//			flag5=1;
//			/*计算总的次数*/
//			flag6=flag1*256+flag2*96+flag3*16+flag4*36+1;
//		System.out.println("四张牌都不同的排列有:"+flag1);
//		System.out.println("只有两张牌相同的排列有:"+flag2);
//		System.out.println("三张牌相同的排列有:"+flag3);
//		System.out.println("两队牌相同的排列有:"+flag4);
//		System.out.println("四张牌都相同的排列有:"+flag5);
//		System.out.println("总排列有:"+flag6);
//		System.out.println("总运算次数："+t1);

//		int[][] num=new int[4][13];
//		int flag1=0,sum,f1,t=0,flag2=0,flag3=0,flag4=0,flag5=0;
//		int a,b,c,d;
//		for(int i=0;i<13;i++)
//		{
//			num[0][i]=i+1;
//			num[1][i]=i+1;
//			num[2][i]=i+1;
//			num[3][i]=i+1;
//		}
//		//相同花色
//		for( a=0;a<10;a=a+1)
//			for( b=a+1;b<11;b+=1)
//				for( c=b+1;c<12;c+=1)
//					for( d=c+1;d<13;d+=1)
//					{
//						sum=num[0][a]+num[0][b]+num[0][c]+num[0][d];
//						if(sum==24)
//							flag1++;
//					}
//
//		//两个花色相同
//		for( a=0;a<12;a=a+1)
//			for( b=0;b<12;b+=1)
//				for( c=a+1;c<13;c+=1)
//					for( d=b+1;d<13;d+=1)
//					{
//						sum=num[0][a]+num[0][b]+num[0][c]+num[0][d];
//						if(sum==24)
//							flag2++;
//
//					}
//		for( a=0;a<11;a=a+1)
//			for( b=a+1;b<12;b+=1)
//				for( c=b+1;c<13;c+=1)
//					for( d=0;d<13;d+=1)
//					{
//						sum=num[0][a]+num[0][b]+num[0][c]+num[0][d];
//						if(sum==24)
//							flag5++;
//
//					}
//		//三个花色
//		for( a=0;a<12;a=a+1)
//			for( b=0;b<13;b+=1)
//				for( c=a+1;c<13;c+=1)
//					for( d=0;d<13;d+=1)
//					{
//						sum=num[0][a]+num[0][b]+num[0][c]+num[0][d];
//						if(sum==24)
//							flag3++;
//
//					}
//		//四个花色
//		for( a=0;a<13;a=a+1)
//			for( b=0;b<13;b+=1)
//				for( c=0;c<13;c+=1)
//					for( d=0;d<13;d+=1)
//					{
//						sum=num[0][a]+num[0][b]+num[0][c]+num[0][d];
//						if(sum==24)
//							flag4++;
//					}
//			f1=flag1*4+flag2*6+flag3*3*4+flag4+flag5*6*2;
//			System.out.println(f1);


//		int count = 0, same;
//		for(int i=1; i<=13; i++){
//			for(int j=1;j<=13; j++){
//				for(int k=1;k<=13; k++){
//					for(int l=1;l<=13; l++){
//						same = 0;
//						//i,j,k,l 不递减且和为24
//						if(i<=j && j<=k && k<=l && i+j+k+l == 24){
//							if(i==j) same++;
//							if(j==k) same++;
//							if(k==l) same++;
//							if(same == 0) count += 4*4*4*4;
//							else if(same == 1) count += 4*4*6;
//							else if(same == 2){
//								if(i==j && k==l) count += 6*6;
//								else count += 4*4;
//							}
//							else if(same == 3) count++;
//						}
//					}
//				}
//			}
//		}
//		System.out.println(count);

        Scanner fin = new Scanner(System.in);
        PrintStream fout = new PrintStream(System.out);
        long[] C = new long[]{1, 4, 6, 4, 1}; //组合数 C(i，4)
        long Ans = 0; // 结果
        int[] cot = new int[4]; // 四张牌的点数
        int all = 24;  // 总点数
        for (cot[0] = 1; cot[0] <= 13; cot[0]++)
            for (cot[1] = cot[0]; cot[1] <= 13; cot[1]++)
                for (cot[2] = cot[1]; cot[2] <= 13; cot[2]++) {
                    //枚举前三张牌的点数
                    cot[3] = all - (cot[0] + cot[1] + cot[2]);//第四张牌的点数
                    if (cot[1] + cot[0] + cot[2] >= all) continue;
                    if (cot[3] < cot[2]) continue;
                    if (cot[3] > 13 || cot[3] < 1) continue;
                    //不合法的情况ontinue
                    int flag = 1;
                    long ga = 1;
                    for (int i = 1; i < 4; i++) //统计每张牌的数目
                    {
                        if (cot[i] != cot[i - 1]) {
                            ga *= C[flag]; //处理当前情况的数目
                            flag = 1;
                        } else flag++;
                    }
                    ga *= C[flag];
                    Ans += ga;//当前情况加入结果
                    fout.printf("%d %d %d %d %d\n", cot[0], cot[1], cot[2], cot[3], ga);
                    //fout.print(C[flag]+"\n");
                    //fout.print(Ans);
                }
        fout.print(Ans);
        fin.close();

    }


}
