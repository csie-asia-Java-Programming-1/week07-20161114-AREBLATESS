package ex;
/*
 * Date: 2016/11/14
 * Author: 105021008 ��ڭ�{
 */
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int n2=scn.nextInt();
		float data[][]=new float[n][n2];
		double sigama=0;
		double sum=0;
		for(int i1=0;i1<n;i1++){
			for(int i2=0;i2<n2;i2++){
				data[i1][i2]=scn.nextInt();
			}
		}

	}

}
